package com.controller.tools;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class AuthenticationFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //pre-processing
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        if (request.getRequestURI().startsWith("ServletGetProfileDetails")){

            HttpSession session=request.getSession();
            if (session.getAttribute("username")==null){
                request.getRequestDispatcher("index.jsp").forward(request,servletResponse);
            }
        }
        //pos-processing
        filterChain.doFilter(request,servletResponse);

    }

    @Override
    public void destroy() {

    }
}
