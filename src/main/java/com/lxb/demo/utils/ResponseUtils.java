package com.lxb.demo.utils;

import com.google.gson.Gson;
import com.lxb.demo.admin_stuInfoManager.ResultDataBean;

/**
 * 业务名:
 * 功能说明:响应体工具封装
 * 编写日期: 0017 2024/1/17.
 * 作者: 李相斌
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */
public class ResponseUtils {

    static ResponseUtils responseUtils = new ResponseUtils();

   static ResultDataBean resultDataBean = new ResultDataBean<>();

    public static ResponseUtils InitInstance() {
        resultDataBean = new ResultDataBean<>();
        return responseUtils;
    }





    public <T> ResponseUtils setResultDataBean(T resultDataBeanT) {
        resultDataBean.resultData = resultDataBeanT;
        return this;
    }


    public ResponseUtils setResultCode(int resultCode) {
        resultDataBean.resultCode = resultCode;
        return this;
    }

    public ResponseUtils setResultMsg(String resultMsg) {
        resultDataBean.resultMsg = resultMsg;
        return this;
    }


    public String toJson() {
        return new Gson().toJson(resultDataBean);
    }


}
