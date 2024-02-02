package com.lxb.demo.admin_accountManager;

/**
 * 业务名:
 * 功能说明:
 * 编写日期: 0003 2024/2/3.
 * 作者: 李相斌
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */
public class UserBean {

    int id;//id
    String uid;//用户id
    String userName;//用户名
    String passWord;//密码
    String type;//账号类型
    String state;//账号状态


    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", type='" + type + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
