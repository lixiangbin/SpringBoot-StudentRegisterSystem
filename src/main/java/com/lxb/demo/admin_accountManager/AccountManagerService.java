package com.lxb.demo.admin_accountManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务名: 账号管理
 * 功能说明:
 * 编写日期: 0003 2024/2/3.
 * 作者: 李相斌
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */

@Service
class AccountManagerService {
    @Autowired
    AccountManagerDao accountManagerDao;

    //系统管理员登录
    public UserBean sysAdminLogin(String userName, String passWord) {
        return accountManagerDao.sysAdminLogin(userName, passWord);
    }

    //学生登录
    public int studentLogin(String userName, String passWord) {
        return accountManagerDao.studentLogin(userName, passWord);
    }
}
