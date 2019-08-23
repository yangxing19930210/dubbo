package com.sekorm.dubbo.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sekorm.dubbo.service.vo.DubboVO;

/**
 * @author noah_yang
 * @version 1.0
 * @date 2019-08-22 15:22
 */
@Repository
public interface DubboDao {

    /**
     * 根据人名模糊查询
     * 
     * @param name
     * @return
     */
    List<DubboVO> findEmployeeByName(@Param(value = "name") String name);
}
