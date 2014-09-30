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
 * Servlet Filter implementation class AdministratorFilter
 */
public class AdministratorFilter implements Filter {

	private ArrayList<String> urlList;

	/**
	 * Default constructor.
	 */
	public AdministratorFilter() {
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
		boolean hasAdminRole = false;

		if (urlList.contains(url)) {
			List<Role> userRoles = (List<Role>) s.getAttribute("user_roles");
			req.getServletContext().log("nr of roles in session: " + userRoles.size());
			for (Role r : userRoles) {
				req.getServletContext().log("admin role filter, role name: " + r.getRoleName());
				if (r.getRoleName().equals("Application-Admin") || r.getRoleName().equals("General-Director")) {
					req.getServletContext().log("admin role filter, id equals with 5");
					hasAdminRole = true;
					break;
				}
			}

			if (hasAdminRole == false) {
				req.getServletContext().log("sending redirect");
				resp.sendRedirect(req.getContextPath() + "/home");
				return;
			}

		}

		req.getServletContext().log("url not in avoid list or has admin role should be true: " + hasAdminRole);
		chain.doFilter(request, response);
		return;
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
