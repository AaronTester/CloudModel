package com.aaron.controller;

import org.aaron.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    private final String REST_URL = "http://CLOUDBASIC-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/dept/all")
    public List<Dept> queryDeptList() {
        return (List<Dept>) restTemplate.getForObject(REST_URL+"/dept/all", List.class);
    }
}
