package com.lxb.demo.base;

import com.lxb.demo.admin_accountManager.ResponseUtilsA;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 业务名: Controller 基类
 * 功能说明:
 * 编写日期: 0002 2024/2/2.
 * 作者:
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */
public class BaseController {

  protected ResponseUtilsA responseUtilsA = ResponseUtilsA.InitInstance();


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
        });

        return RequestParamsMap;
    }
}
