package com.lxb.demo.admin_accountManager;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 业务名: 账户管理
 * 功能说明: 登录注销修改账户信息等
 * 编写日期: 0003 2024/2/3.
 * 作者: 李相斌
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */

@Repository
@Mapper
interface AccountManagerDao {

    //系统管理员登录
    UserBean sysAdminLogin(String userName, String passWord);

    //学生登录
    int studentLogin(String userName, String passWord);
}
