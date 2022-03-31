package ir.maktab.service;

import ir.maktab.model.Employee;
import ir.maktab.repository.EmployeeRepository;

public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService() {
        this.employeeRepository = new EmployeeRepository();
    }

    public void save(Employee employee){
        employeeRepository.save(employee);
    }

    public Employee findById(long id){
        return employeeRepository.findById(id);
    }
}
