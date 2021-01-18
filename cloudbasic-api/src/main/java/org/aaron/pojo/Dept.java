package org.aaron.pojo;

import java.io.Serializable;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/12/26
 */
public class Dept implements Serializable {

    private Integer deptId;
    private String deptName;
    private String dataSource;

    /**
     * 报错时加无参构造器
     * feign nested exception is com.fasterxml.jackson.databind.exc.InvalidDefinitionException:
     */
    public Dept() {
    }

    public Dept(Integer deptId, String deptName, String dataSource) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.dataSource = dataSource;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", dataSource='" + dataSource + '\'' +
                '}';
    }
}
