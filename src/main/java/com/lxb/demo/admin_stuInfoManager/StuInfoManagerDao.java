package com.lxb.demo.admin_stuInfoManager;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 业务名:
 * 功能说明: 数据库操作映射
 * 编写日期: 0016 2024/1/16
 * 作者:  李相斌
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */

@Repository
@Mapper
public interface StuInfoManagerDao {
    List<StudentInfoBean> queryAllInfo(String token, String mun, String page);

    StudentInfoBean queryStuInfo(String token, int stuNo);

    int deleteStuAtStuNo(String token, int stuNo);

    int modifyStuInfo(String token, int id, String stuNo, String stuName, String sex, String nation, String birthday, String phone, String address, String speciality, String classes, String dorm, String tuition, String register);

    int addStuInfo(String token, String stuNo, String stuName, String sex, String nation, String birthday, String phone, String address, String speciality, String classes, String dorm, String tuition, String register);

}
