/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.zerorisk.controller;

import com.assignment.zerorisk.model.Employee;
import com.assignment.zerorisk.model.foodModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Nfizah
 */
@Controller
public class EmployeeController {
    
@GetMapping("/employees")
@ResponseBody
public List<Employee> getEmployees () {

    List<Employee> emp = getDummyEmployee ();

    return emp;
}

@GetMapping("/viewEmployee")
public String viewFoods () {
    return "employees-listing";
}
    
    
    public List<Employee> getDummyEmployee () {

    Employee emp1 = new Employee(1,"Syahmi", "Male", "98111", "Malaysian", "Seremban", "0123", "Manager");
    Employee emp2 = new Employee(2, "Husna", "Female", "98123", "Malaysian", "KL", "03929", "Cashier");
    Employee emp3 = new Employee(3, "Nabila", "Female", "98738", "Malaysian", "Nilai", "01273", "Cashier");
    Employee emp4 = new Employee(4, "Sharashini", "Female", "980736", "Malaysian", "Johor", "02371", "Cooker");
    Employee emp5 = new Employee(5, "Hafizah", "Female", "983728", "Malaysian", "Sg Buloh", "02992", "Cooker");

    List<Employee> employee = new ArrayList<>();
    employee.add(emp1);
    employee.add(emp2);
    employee.add(emp3);
    employee.add(emp4);
    employee.add(emp5);

    return employee;
}
}
