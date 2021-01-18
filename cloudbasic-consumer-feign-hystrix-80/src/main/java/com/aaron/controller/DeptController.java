package com.aaron.controller;

import com.netflix.discovery.converters.Auto;
import org.aaron.pojo.Dept;
import org.aaron.service.DeptClientSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/12/26
 */
@RestController
public class DeptController {

    @Autowired
   private DeptClientSerice deptClientSerice;

    @RequestMapping("/dept/all")
    public List<Dept> queryDeptList() {
        return deptClientSerice.queryDeptList();
    }

    @GetMapping("/dept/{id}")
    public Dept queryDeptById(@PathVariable("id")Integer id) {
        return deptClientSerice.queryDeptById(id);
    }
}
