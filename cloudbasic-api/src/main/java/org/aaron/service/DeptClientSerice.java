package org.aaron.service;

import org.aaron.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/12/27
 */
@FeignClient(value = "cloudbasic-service",fallbackFactory = DeptClientServiceHystrix.class)
@Component
public interface DeptClientSerice {

    @GetMapping("/dept/all")
    public List<Dept> queryDeptList();
    @GetMapping("/dept/{id}")
    Dept queryDeptById(@PathVariable("id") Integer id);
}
