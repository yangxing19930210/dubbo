package com.sekorm.idubbo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sekorm.dubbo.service.common.DataReturnCommon;
import com.sekorm.dubbo.service.service.DubboService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IdubboApplicationTests {
    @Autowired
    private DubboService dubboService;

    @Test
    public void contextLoads() {
        DataReturnCommon arrayList=dubboService.findEmployeeByName("noah_yang");
        System.out.print(arrayList.getData());
    }

}
