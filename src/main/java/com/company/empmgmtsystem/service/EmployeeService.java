package com.company.empmgmtsystem.service;

import com.company.empmgmtsystem.model.Employee;
import com.company.empmgmtsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployee(){
        return employeeRepository.findAll();
    }
    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id).orElse(null);
    }
    public Employee updateEmployeeById(Long id,Employee employeeDetails){
        Employee employee = employeeRepository.getReferenceById(id);
        if(employee != null){
            employee.setEmail(employeeDetails.getEmail());
            employee.setName(employeeDetails.getName());
            employee.setSalary(employeeDetails.getSalary());
            employee.setPosition(employeeDetails.getPosition());

            return employeeRepository.save(employee);
        }
        else{
            return null;
        }
    }

    public void deleteEmployeeById(Long id){
        employeeRepository.deleteById(id);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


}
