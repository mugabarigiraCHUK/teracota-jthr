package edu.msg.jthr.web.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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

import edu.msg.jthr.backend.model.Role;

/**
 * Servlet Filter implementation class ViewerFilter
 */
public class ViewerFilter implements Filter {

	private ArrayList<String> urlList;

	/**
	 * Default constructor.
	 */
	public ViewerFilter() {
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

		List<Role> userRoles = (List<Role>) s.getAttribute("user_roles");
		
		for (Role r : userRoles) {
			if (r.getRoleName().equals("General-Director")){
				chain.doFilter(request, response);
				return;
			}
		}		
	}

	public void init(FilterConfig config) throws ServletException {

		String urls = config.getInitParameter("allow-urls");
		StringTokenizer token = new StringTokenizer(urls, ",");

		urlList = new ArrayList<String>();

		while (token.hasMoreTokens()) {
			urlList.add(token.nextToken());
		}
	}

}
