package com.lxb.demo.admin_stuInfoManager;

/**
 * 业务名: 查询所有学生信息实体类
 * 功能说明:
 * 编写日期: 0016 2024/1/16
 * 作者:  李相斌
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */

public class StudentInfoBean {
    Integer id;
    String stuName;//学生姓名
    String stuNo;//学号
    String sex;//性别
    String nation;//民族
    String birthday;//生日
    String phone;//手机号
    String address;//地址
    String speciality;//专业
    String classes;//班级
    String dorm;//宿舍
    String tuition;//学费
    String register;//是否注册

    @Override
    public String toString() {
        return "StudentInfoBean{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", stuNo='" + stuNo + '\'' +
                ", sex='" + sex + '\'' +
                ", nation='" + nation + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", speciality='" + speciality + '\'' +
                ", classes='" + classes + '\'' +
                ", dorm='" + dorm + '\'' +
                ", tuition='" + tuition + '\'' +
                ", register='" + register + '\'' +
                '}';
    }
}
