package com.edu.test;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/hello2")	// web.xml에서 했던 <servlet>과 <servlet-mapping> 사이의 소스와 중복.
public class FirstServlet extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException{
		
		System.out.println("init() 실행됨!");
		// 클라이언트로부터 최초로 서블릿 요청이 있을 때 실행하며 실행 횟수는 1 (초기화 작업)
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException{
		
		System.out.println("service() 실행됨!");
		// 클라이언트로부터 요청이 있을 때마다 실행 실행 횟수는 n (실제 서블릿이 처리해야 하는 작업)
	}
}
