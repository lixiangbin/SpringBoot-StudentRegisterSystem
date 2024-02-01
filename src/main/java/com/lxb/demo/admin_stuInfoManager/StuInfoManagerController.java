package com.lxb.demo.admin_stuInfoManager;

import com.lxb.demo.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;





/**
 * 业务名:
 * 功能说明:
 * 编写日期: 2020-10-20.
 * 作者: 李相斌
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */
@RestController
@RequestMapping("/admin/stuInfoManager")
public class StuInfoManagerController {

    @Autowired
    StuInfoManagerService stuInfoManagerService;



    /**
     * 说明：根据学号查询学生信息
     * 地址：http://127.0.0.1:18902/admin/stuInfoManager/queryStuInfo?stuNo=10186205
     */
    @CrossOrigin
    // @ResponseBody
    @RequestMapping(path = "/queryStuInfo" /*,produces = "application/json;charset=UTF-8"*/)
    public String queryStuInfo(String token, int stuNo, HttpServletResponse httpServletResponse) {

        //todo 校验token...

        ResponseUtils responseUtils = ResponseUtils.InitInstance();


        StudentInfoBean studentInfoBean = stuInfoManagerService.queryStuInfo("1", stuNo);
        responseUtils.setResultDataBean(studentInfoBean);

        if (studentInfoBean != null) {
            responseUtils
                    //.setResultDataBean(studentInfoBean)
                    .setResultCode(1)
                    .setResultMsg("查询成功");
        } else {
            responseUtils
                    //.setResultDataBean(new StudentInfoBean())
                    .setResultCode(0)
                    .setResultMsg("未查到该学生信息！");
        }
        return responseUtils.toJson();
    }


    /**
     * 说明：查询全部学生信息列表
     * 地址：http://127.0.0.1:18902/admin/stuInfoManager/queryAllInfoTest
     */

    @CrossOrigin
//    @ResponseBody
    @RequestMapping(path = "/queryAllInfoTest" /*,produces = "application/json;charset=UTF-8"*/)
    public String queryAllInfoTest(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) {



        httpServletResponse.setStatus(200);

        try {
            httpServletResponse.addHeader("msg", URLEncoder.encode("测试","UTF-8") );
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }


        ResponseUtils responseUtils = ResponseUtils.InitInstance();


        List<StudentInfoBean> queryAllInfoBeanList = stuInfoManagerService.queryAllInfo("1", "1", "1");

        if (queryAllInfoBeanList != null && queryAllInfoBeanList.size() > 0) {
            System.out.println(queryAllInfoBeanList);

            responseUtils.setResultDataBean(queryAllInfoBeanList)
                    .setResultCode(1)
                    .setResultMsg("查询成功");
        }


        String header= httpServletRequest.getHeader("a");
        System.out.println("请求头："+header);

        return responseUtils.toJson();
    }


    /**
     * 说明：根据学号删除学生信息
     * 地址：http://127.0.0.1:18902/admin/stuInfoManager/deleteStuAtStuNo?stuNo=10186205
     */
    @CrossOrigin
    @RequestMapping(path = "/deleteStuAtStuNo" /*,produces = "application/json;charset=UTF-8"*/)
    public String deleteStuAtStuNo(String token, int stuNo, HttpServletResponse httpServletResponse) {

        //todo 校验token...

        ResponseUtils responseUtils = ResponseUtils.InitInstance();


        int resultCom = stuInfoManagerService.deleteStuAtStuNo("1", stuNo);

        if (resultCom > 0) {
            responseUtils
                    .setResultCode(1)
                    .setResultMsg("删除成功");
        } else {
            responseUtils
                    .setResultCode(0)
                    .setResultMsg("删除失败！");
        }
        return responseUtils.toJson();
    }


    /**
     * 说明：根据id修改学生信息
     * 地址：
     * http://127.0.0.1:18902/admin/stuInfoManager/modifyStuInfo?id=3&stuNo=10189&stuName=王小锤&sex=女&nation=汉&birthday=19990216&phone=16677772222&address=北京市海淀区&speciality=酒店管理&classes=3班&dorm=119&tuition=6980&register=1
     */
    @CrossOrigin
    @RequestMapping(path = "/modifyStuInfo" /*,produces = "application/json;charset=UTF-8"*/)
    public String modifyStuInfo(String token, int id, String stuNo, String stuName, String sex, String nation, String birthday, String phone, String address, String speciality, String classes, String dorm, String tuition, String register, HttpServletResponse httpServletResponse) {

        ResponseUtils responseUtils = ResponseUtils.InitInstance();


        int resultCom = stuInfoManagerService.modifyStuInfo(token, id, stuNo, stuName, sex, nation, birthday, phone, address, speciality, classes, dorm, tuition, register);

        if (resultCom > 0) {
            responseUtils
                    .setResultCode(1)
                    .setResultMsg("修改成功");
        } else {
            responseUtils
                    .setResultCode(0)
                    .setResultMsg("修改失败！");
        }
        return responseUtils.toJson();
    }

    /**
     * 说明：新增学生信息
     * 地址：
     * http://127.0.0.1:18902/admin/stuInfoManager/addStuInfo?stuNo=10210&stuName=测试名&sex=男&nation=汉&birthday=19990216&phone=16677772222&address=北京市海淀区&speciality=酒店管理&classes=3班&dorm=119&tuition=6980&register=1
     * */
    @CrossOrigin
    @RequestMapping(path = "/addStuInfo" /*,produces = "application/json;charset=UTF-8"*/)
    public String addStuInfo(String token, String stuNo, String stuName, String sex, String nation, String birthday, String phone, String address, String speciality, String classes, String dorm, String tuition, String register, HttpServletResponse httpServletResponse) {

        ResponseUtils responseUtils = ResponseUtils.InitInstance();

        int resultCom = stuInfoManagerService.addStuInfo(token, stuNo, stuName, sex, nation, birthday, phone, address, speciality, classes, dorm, tuition, register);

        if (resultCom > 0) {
            responseUtils
                    .setResultCode(1)
                    .setResultMsg("添加成功");
        } else {
            responseUtils
                    .setResultCode(0)
                    .setResultMsg("添加失败！");
        }
        return responseUtils.toJson();
    }


}
