package org.aaron.controller;

import org.aaron.pojo.Dept;
import org.aaron.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
    private DeptService deptService;

    @GetMapping("/dept/all")
    public List<Dept> queryDeptList() {
        return deptService.queryDeptList();
    }

    @GetMapping("/dept/{id}")
    public Dept queryDeptById(@PathVariable("id")Integer id) {
        return deptService.queryDeptById(id);
    }
}
