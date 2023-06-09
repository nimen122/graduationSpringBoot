package com.example.graduationspringboot.utils;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class WebGlobalConfig implements  Filter{
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse res = (HttpServletResponse) response;
		res.addHeader("Access-Control-Allow-Credentials", "true");
		res.addHeader("Access-Control-Allow-Origin", "*");
		res.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
		res.addHeader("Access-Control-Allow-Headers", "Content-Type,Authorization,X-CAF-Authorization-Token,sessionToken,X-TOKEN");
//		res.setHeader("Access-Control-Allow-Origin", "*");
//		res.setHeader("Access-Control-Allow-Credentials", "true");
//		res.setHeader("Access-Control-Allow-Methods", "*");
//		res.setHeader("Access-Control-Allow-Headers", "Content-Type,Authorization");
//		res.setHeader("Access-Control-Expose-Headers", "*");
		if (((HttpServletRequest) request).getMethod().equals("OPTIONS")) {
			response.getWriter().println("ok");
			return;
		}
		chain.doFilter(request, response);
	}
	@Override
	public void destroy() {
	}
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}
}
