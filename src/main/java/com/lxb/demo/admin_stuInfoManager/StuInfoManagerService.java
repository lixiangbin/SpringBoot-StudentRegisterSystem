package com.lxb.demo.admin_stuInfoManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

@Service
public class StuInfoManagerService {
    @Autowired
    StuInfoManagerDao stuInfoManagerDao;

    public List<StudentInfoBean> queryAllInfo(String token, String mun, String page) {
        return stuInfoManagerDao.queryAllInfo(token, mun, page);
    }

    public StudentInfoBean queryStuInfo(String token, int stuNo) {
        return stuInfoManagerDao.queryStuInfo(token, stuNo);
    }

    public int deleteStuAtStuNo(String token, int stuNo) {
        return stuInfoManagerDao.deleteStuAtStuNo(token, stuNo);
    }

    public int modifyStuInfo(String token, int id, String stuNo, String stuName, String sex, String nation, String birthday, String phone, String address, String speciality, String classes, String dorm, String tuition, String register) {
        return stuInfoManagerDao.modifyStuInfo(token, id, stuNo, stuName, sex, nation, birthday, phone, address, speciality, classes, dorm, tuition, register);
    }

    public int addStuInfo(String token, String stuNo, String stuName, String sex, String nation, String birthday, String phone, String address, String speciality, String classes, String dorm, String tuition, String register) {
        return stuInfoManagerDao.addStuInfo(token, stuNo, stuName, sex, nation, birthday, phone, address, speciality, classes, dorm, tuition, register);
    }

}
