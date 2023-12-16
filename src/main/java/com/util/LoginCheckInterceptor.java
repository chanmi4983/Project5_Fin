package com.util;

import com.member.UserVO;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginCheckInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception{
        HttpSession session= request.getSession();
        UserVO vo = (UserVO) session.getAttribute("login");
        if(vo ==null){
            response.sendRedirect(request.getContextPath()+"/login/login");

        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception{
        System.out.println("postHandle");
//    postHandle(request, response,handler,modelAndView);
    }

}


