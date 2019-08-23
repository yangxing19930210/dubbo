package com.sekorm.dubbo.service.vo;

/**
 * @author noah_yang
 * @version 1.0
 * @date 2019-08-22 15:19
 */
public class DubboVO {

    /** 中文名 */
    private String employeeChineseName;
    /** 工号 */
    private String employeeNumber;
    /** 部门 */
    private String employeeDept;
    /** 英文名 */
    private String employeeEnglishName;

    public String getEmployeeChineseName() {
        return employeeChineseName;
    }

    public void setEmployeeChineseName(String employeeChineseName) {
        this.employeeChineseName = employeeChineseName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeDept() {
        return employeeDept;
    }

    public void setEmployeeDept(String employeeDept) {
        this.employeeDept = employeeDept;
    }

    public String getEmployeeEnglishName() {
        return employeeEnglishName;
    }

    public void setEmployeeEnglishName(String employeeEnglishName) {
        this.employeeEnglishName = employeeEnglishName;
    }
}
