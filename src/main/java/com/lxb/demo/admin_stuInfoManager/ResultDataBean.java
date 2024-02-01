package com.lxb.demo.admin_stuInfoManager;

/**
 * 业务名:
 * 功能说明:根据业务返回具体数据结果
 * 编写日期: 0017 2024/1/17.
 * 作者: 李相斌
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */
public class ResultDataBean<T> {
    public int resultCode = 1;//返回码
    public String resultMsg = null;//提示信息
    public T resultData;//返回数据
}
