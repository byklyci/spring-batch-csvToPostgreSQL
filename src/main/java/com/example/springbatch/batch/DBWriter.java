package com.example.springbatch.batch;

import com.example.springbatch.model.Employee;
import com.example.springbatch.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.batch.item.ItemWriter;


import java.util.List;

@Component
public class DBWriter implements ItemWriter<Employee> {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void write(List<? extends Employee> employees) throws Exception {

        System.out.println("Data Saved for Users: " + employees);
        employeeRepository.saveAll(employees);
    }

}