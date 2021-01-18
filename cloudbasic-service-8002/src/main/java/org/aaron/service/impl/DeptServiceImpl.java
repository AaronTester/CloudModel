package org.aaron.service.impl;

import org.aaron.mapper.DeptMapper;
import org.aaron.pojo.Dept;
import org.aaron.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/12/26
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> queryDeptList() {
        return deptMapper.queryDeptList();
    }
}
