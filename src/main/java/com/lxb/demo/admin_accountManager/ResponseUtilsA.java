package com.lxb.demo.admin_accountManager;

import com.google.gson.Gson;
import com.lxb.demo.base.ResultDataBean;

/**
 * 业务名: ResponseUtilsA 工具类第二种
 * 功能说明:响应体工具封装 第二种方式
 * 编写日期: 0017 2024/1/17.
 * 作者: 李相斌
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */
public class ResponseUtilsA {


    static ResultDataBean resultDataBean;
    static ResultDataUtils resultDataUtils;

    public static ResponseUtilsA InitInstance() {
        resultDataUtils = new ResultDataUtils();
        return new ResponseUtilsA();
    }

    //初始化
    public ResultDataUtils init() {
        resultDataBean = new ResultDataBean<>();
        return resultDataUtils;
    }


    //转换为Json
    public String toJson() {
        return new Gson().toJson(resultDataBean);
    }


    //给 ResultDataUtils 实体类设置数据 工具
    public static class ResultDataUtils {


        public <T> ResultDataUtils setResultDataBean(T resultDataBeanT) {
            resultDataBean.resultData = resultDataBeanT;
            return this;
        }


        public ResultDataUtils setResultCode(int resultCode) {
            resultDataBean.resultCode = resultCode;
            return this;
        }

        public ResultDataUtils setResultMsg(String resultMsg) {
            resultDataBean.resultMsg = resultMsg;
            return this;
        }


    }


}
