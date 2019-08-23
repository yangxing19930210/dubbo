package com.sekorm.dubbo.service.service;

import com.sekorm.dubbo.service.DubboServiceApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;

import static org.junit.Assert.*;

public class DubboServiceTest extends DubboServiceApplicationTests {
    @Autowired
    private DubboService dubboService;

    @Test
    public void findEmployeeByName() {
        assertNotNull(dubboService.findEmployeeByName("杨星"));
    }
}