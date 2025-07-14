package com.vickpro.springboot_rest_crud_project.service;

import com.vickpro.springboot_rest_crud_project.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
