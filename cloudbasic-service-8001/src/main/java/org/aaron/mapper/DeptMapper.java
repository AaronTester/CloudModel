package org.aaron.mapper;

import org.aaron.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/12/26
 */
@Mapper
public interface DeptMapper {

    List<Dept> queryDeptList();

    Dept queryDeptById(Integer id);
}
