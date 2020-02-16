package com.example.springbatch.batch;

import com.example.springbatch.model.Employee;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<Employee,Employee> {

    @Override
    public Employee process(Employee employee) throws Exception {
        System.out.println("Inserting Employee info: " + employee);
        return employee;
    }
}