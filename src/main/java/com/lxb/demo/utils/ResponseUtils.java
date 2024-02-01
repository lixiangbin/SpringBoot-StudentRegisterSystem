package com.lxb.demo.utils;

import com.google.gson.Gson;
import com.lxb.demo.admin_stuInfoManager.ResultDataBean;
import com.lxb.demo.base.ResponseBean;

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
    static ResponseBean responseBean;

    public static ResponseUtils InitInstance() {
        responseBean = new ResponseBean();
        return responseUtils;
    }

    public ResponseUtils setServerCode(int serverCode) {
        responseBean.serverCode = serverCode;
        return this;
    }

    public ResponseUtils setServerMsg(String serverMsg) {
        responseBean.serverMsg = serverMsg;
        return this;
    }


    public <T> ResponseUtils setResultDataBean(T resultDataBeanT) {
        ResultDataBean<T> rdb = new ResultDataBean<>();
        rdb.resultData = resultDataBeanT;
        responseBean.data = rdb;
        return this;
    }


    public ResponseUtils setResultCode(int resultCode) {
        if(responseBean.data==null){
            responseBean.data = new ResultDataBean<>();
        }
        responseBean.data.resultCode = resultCode;
        return this;
    }

    public ResponseUtils setResultMsg(String resultMsg) {
        if(responseBean.data==null){
            responseBean.data = new ResultDataBean<>();
        }
        responseBean.data.resultMsg = resultMsg;
        return this;
    }


    public String toJson() {
        return new Gson().toJson(responseBean);
    }


}
