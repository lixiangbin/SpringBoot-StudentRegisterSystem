package com.lxb.demo.base;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 业务名:鉴权拦截器
 * 功能说明:对接口的token进行校验
 * 编写日期: 0024 2024/1/24.
 * 作者: 李相斌
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */
public class AuthenticationIntercept extends HandlerInterceptorAdapter {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

//todo...
        return super.preHandle(request, response, handler);
    }

}
