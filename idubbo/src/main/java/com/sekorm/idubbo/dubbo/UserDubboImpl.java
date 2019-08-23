package com.sekorm.idubbo.dubbo;

import com.sekorm.dubbo.service.common.DataReturnCommon;
import com.sekorm.dubbo.service.service.DubboService;
import com.sekorm.idubbo.beans.UserBean;
import com.sekorm.idubbo.declare.UserDubbo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author noah_yang
 * @version 1.0
 * @date 2019-08-23 13:54
 */
public class UserDubboImpl implements UserDubbo {
    @Autowired
    private DubboService dubboService;

    @Override
    public Integer findCountByName(UserBean userBean) {
        DataReturnCommon dataReturnCommon=dubboService.findEmployeeByName(userBean.getUserEnglishName());
        return ((List)dataReturnCommon.getData()).size();
    }
}
