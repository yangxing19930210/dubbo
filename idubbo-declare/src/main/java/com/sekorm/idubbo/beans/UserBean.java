package com.sekorm.idubbo.beans;

import java.io.Serializable;

/**
 * @author noah_yang
 * @version 1.0
 * @date 2019-08-23 11:59
 */
public class UserBean implements Serializable {
    private static final long serialVersionUID = -7615711658400684542L;

    /** 名称 */
    private String userName;
    /** 英文名 */
    private String userEnglishName;
    /** 部门 */
    private String userDept;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEnglishName() {
        return userEnglishName;
    }

    public void setUserEnglishName(String userEnglishName) {
        this.userEnglishName = userEnglishName;
    }

    public String getUserDept() {
        return userDept;
    }

    public void setUserDept(String userDept) {
        this.userDept = userDept;
    }
}
