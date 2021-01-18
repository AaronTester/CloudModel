package org.aaron.service;

import feign.hystrix.FallbackFactory;
import org.aaron.pojo.Dept;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/12/27
 */
@Component
public class DeptClientServiceHystrix implements FallbackFactory<DeptClientSerice> {
    @Override
    public DeptClientSerice create(Throwable throwable) {
        return new DeptClientSerice() {
            @Override
            public List<Dept> queryDeptList() {
                return null;
            }

            @Override
            public Dept queryDeptById(Integer id) {
                return new Dept(0, "服务暂时不可用", "服务暂时不可用");
            }


        };
    }
}
