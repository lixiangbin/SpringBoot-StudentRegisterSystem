package com.lxb.demo.base;

import cn.dev33.satoken.stp.StpUtil;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * 业务名:鉴权拦截器
 * 功能说明:对接口的 token 等进行校验
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
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {



     /*   boolean isEnableRequest = false;//是否放行此次请求 todo...暂时不校验

        //检查是否登录
        String userId = getRequestParamsMap(httpServletRequest).get("userId");
        if (StpUtil.isLogin(userId)) {
            //已登录
            isEnableRequest = true;
        } else {
            //未登录
            httpServletResponse.setCharacterEncoding("UTF-8");
            httpServletResponse.sendError(401, "重新登录401");
        }

        return isEnableRequest;  */

        return true;
    }


    /**
     * 作者：
     * 创建时期：0002 2024/2/2
     * 方法说明：获取请求体参数集合
     */
    private Map<String, String> RequestParamsMap;//请求体参数集合

    protected Map<String, String> getRequestParamsMap(HttpServletRequest httpServletRequest) {
        RequestParamsMap = new HashMap<>();
        httpServletRequest.getParameterMap().forEach((k, v) -> {
            RequestParamsMap.put(k, v[0]);
            System.out.println("请求体参数名称：" + k + "=" + v[0]);
        });

        return RequestParamsMap;
    }

}
