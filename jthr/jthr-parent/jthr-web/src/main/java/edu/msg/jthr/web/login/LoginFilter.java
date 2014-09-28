package edu.msg.jthr.web.login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class ViewPositionFilter
 */
public class LoginFilter implements Filter {

	private ArrayList<String> urlList;

	/**
	 * Default constructor.
	 */
	public LoginFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession s = req.getSession();
		HttpServletResponse resp = (HttpServletResponse) response;
		String url = req.getServletPath();
		boolean allowedRequest = false;

		System.out.println("In filter: " + req.getServletContext().getContextPath());
		req.getServletContext().log("in filter");

		if (urlList.contains(url)) {
			allowedRequest = true;
			req.getServletContext().log("url in allowed list: " + url);
			chain.doFilter(request, response);
			return;
		}

		if (s.getAttribute("user_id") != null) {
			req.getServletContext().log("in filter, user logged in with id: " + s.getAttribute("user_id"));
			allowedRequest = true;
			chain.doFilter(request, response);
			return;
		}

		req.getServletContext().log("in filter, filter: " + allowedRequest);

		if (!allowedRequest) {
			req.getServletContext().log("turning session to false");
			s.invalidate();
			req.getServletContext().log("session null, sending redirect");
			resp.sendRedirect(req.getContextPath() + "/login.jsp");
			return;
		}

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	public void init(FilterConfig config) throws ServletException {
		
		String urls = config.getInitParameter("avoid-urls");
		StringTokenizer token = new StringTokenizer(urls, ",");

		urlList = new ArrayList<String>();

		while (token.hasMoreTokens()) {
			urlList.add(token.nextToken());
		}
	}

}
