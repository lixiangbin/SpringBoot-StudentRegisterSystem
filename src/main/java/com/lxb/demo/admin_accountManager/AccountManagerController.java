package com.lxb.demo.admin_accountManager;

import cn.dev33.satoken.stp.StpUtil;
import com.lxb.demo.base.BaseController;
import com.lxb.demo.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 业务名:账号管理模块
 * 功能说明:登录、退出、注销、修改账号信息等
 * 编写日期: 0003 2024/2/3.
 * 作者: 李相斌
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */

@RestController
@RequestMapping("/admin/accountManager")
public class AccountManagerController extends BaseController {
    @Autowired
    AccountManagerService accountManagerService;

    /**
     * 作者：李相斌
     * 创建时期：0002 2024/2/2
     * 方法说明：系统管理员登录
     */
    @CrossOrigin
    @RequestMapping(path = "/login/sysAdminLogin" /*,produces = "application/json;charset=UTF-8"*/)
    public String sysAdminLogin(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        String userName = getRequestParamsMap(httpServletRequest).get("userName");
        String passWord = getRequestParamsMap(httpServletRequest).get("passWord");

        //查询数据库
        UserBean userBean = accountManagerService.sysAdminLogin(userName, passWord);

        //校验账号信息
        if (userBean != null) {
            if ("1".equals(userBean.state)) {//检查账号状态
                responseUtilsA
                        .init()
                        .setResultCode(1)
                        .setResultMsg("登录成功");
                //生成登录状态
                StpUtil.login(userBean.uid);
            } else {
                responseUtilsA
                        .init()
                        .setResultCode(0)
                        .setResultMsg("当前账号状态异常，请联系管理员！");
            }

        } else {
            responseUtilsA
                    .init()
                    .setResultCode(0)
                    .setResultMsg("失败");
        }

        return responseUtilsA.toJson();
    }

    /**
     * 作者：李相斌
     * 创建时期：0003 2024/2/3
     * 方法说明：学生登录
     */
    @CrossOrigin
    @RequestMapping(path = "/login/stuLogin" /*,produces = "application/json;charset=UTF-8"*/)
    public String stuLogin(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {


        return "todo...";
    }


    /**
     * 作者：李相斌
     * 创建时期：0003 2024/2/3
     * 方法说明：系统管理员退出
     */
    @CrossOrigin
    @RequestMapping(path = "/logout/sysAdminLogout" /*,produces = "application/json;charset=UTF-8"*/)
    public String sysAdminLogout(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        String uid = getRequestParamsMap(httpServletRequest).get("uid");
        StpUtil.logout(uid);
        return "用户" + uid + " 退出已执行";
    }

    /**
     * 作者：李相斌
     * 创建时期：0003 2024/2/3
     * 方法说明：学生退出
     */
    @CrossOrigin
    @RequestMapping(path = "/logout/stuLogout" /*,produces = "application/json;charset=UTF-8"*/)
    public String stuLogout(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        String uid = getRequestParamsMap(httpServletRequest).get("uid");
        StpUtil.logout(uid);
        return "用户" + uid + " 退出已执行";
    }


    /**
     * 作者：李相斌
     * 创建时期：0003 2024/2/3
     * 方法说明：检查 uid 登录状态
     */
    @CrossOrigin
    @RequestMapping(path = "/checkLogin" /*,produces = "application/json;charset=UTF-8"*/)
    public String checkLogin(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        String uid = getRequestParamsMap(httpServletRequest).get("uid");
        return StpUtil.isLogin(uid) ? "用户" + uid + " 已登录" : "用户" + uid + " 未登录";
    }
}
