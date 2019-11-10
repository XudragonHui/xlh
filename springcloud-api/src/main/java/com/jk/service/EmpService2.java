package com.jk.service;

import com.jk.model.EmpBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * author:xyy
 * createtime:2019/11/8
 * email:
 * tel:
 */
@FeignClient(value = "provider")
public interface EmpService2 {

    @GetMapping("xyist")
    List<EmpBean> findEmpList(@SpringQueryMap EmpBean empBean);
}
