package com.imooc;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // 通过年龄来查询
    // 有可能查询到多个
    // 所以返回List
    // 方法名不能乱写
    // 有格式要求
    public List<Employee> findByAge(Integer age);

}

