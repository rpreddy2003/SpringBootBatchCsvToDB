package com.test.processor;

import com.test.model.Employee;

import org.springframework.batch.item.ItemProcessor;

public class EmployeeProcessor implements ItemProcessor<Employee, Employee> {

    @Override
    public Employee process(final Employee employee) throws Exception {
       

        return employee;
    }

}
