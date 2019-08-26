package com.sekrom.dubbo.web.controller;

import com.sekorm.idubbo.beans.UserBean;
import com.sekorm.idubbo.declare.UserDubbo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author noah_yang
 * @version 1.0
 * @date 2019-08-26 10:30
 */
@RestController
public class DubboController {
    @Autowired
    private UserDubbo userDubbo;

    @GetMapping("/dubbo/{name}")
    public Integer findCountByName(@PathVariable(value = "name") String userName) {
        UserBean userBean = new UserBean();
        userBean.setUserEnglishName("noah_yang");
        return userDubbo.findCountByName(userBean);
    }

}
