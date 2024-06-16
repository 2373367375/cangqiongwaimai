package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    PageResult QueryPage(EmployeePageQueryDTO employeePageQueryDTO);

    void insertEmp(EmployeeDTO employeeDTO);

    void EnorDisable(Integer status, Long id);
}
