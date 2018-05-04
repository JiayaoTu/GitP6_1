package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository girlRepository;

    // 事务管理
    @Transactional
    public void insertTwo() {

        Employee girlA = new Employee();
        girlA.setName("Jane");
        girlA.setAge(18);
        girlA.setGender("woman");
        girlRepository.save(girlA);

        Employee girlB = new Employee();
        girlA.setName("Lily");
        girlA.setAge(20);
        girlA.setGender("woman");

        girlRepository.save(girlB);

    }

}
