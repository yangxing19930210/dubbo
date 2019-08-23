package com.sekorm.dubbo.service.service;

import com.sekorm.dubbo.service.common.CodeMessageCommon;
import com.sekorm.dubbo.service.common.DataReturnCommon;
import com.sekorm.dubbo.service.dao.DubboDao;
import com.sekorm.dubbo.service.vo.DubboVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * dubbo service
 *
 * @author noah_yang
 * @version 1.0
 * @date 2019-08-22 15:26
 */
@Service
public class DubboService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DubboService.class);

    @Autowired
    private DubboDao dubboDao;

    public DataReturnCommon findEmployeeByName(String name) {
        LOGGER.info("name={}", name);
        ArrayList<DubboVO> dubboVOS = (ArrayList<DubboVO>) dubboDao.findEmployeeByName(name);
        return new DataReturnCommon(CodeMessageCommon.API_STATUS_OK, dubboVOS);
    }

}
