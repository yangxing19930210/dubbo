package com.sekorm.idubbo.declare;

import com.sekorm.idubbo.beans.UserBean;

/**
 * @author noah_yang
 * @version 1.0
 * @date 2019-08-23 12:01
 */
public interface UserDubbo {
    /**
     * 根据人名查询数量
     * @param userBean
     * @return
     */
    Integer findCountByName(UserBean userBean);
}
