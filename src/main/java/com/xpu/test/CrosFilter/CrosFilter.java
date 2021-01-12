package com.xpu.test.CrosFilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * …Ë÷√øÁ”Ú«Î«Ûsession
 * @author Administrator
 *
 */
@WebFilter
public class CrosFilter  implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
	System.out.println("========filter=========");	
	HttpServletResponse resp=(HttpServletResponse) response;
	resp.setHeader("Access-Control-Allow-Headers", "X-Requested-With, accept, content-type, xxxx");
	resp.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS, PATCH");
	resp.setHeader("Access-Control-Allow-Origin", "http://localhost:8020"); 
	resp.setHeader("Access-Control-Allow-Credentials", "true"); 
	
	
	chain.doFilter(request, resp);
		
	}

}
