package ir.maktab;

import ir.maktab.model.Employee;
import ir.maktab.service.EmployeeService;

public class Main {
    public static void main(String[] args) {

        EmployeeService employeeService=new EmployeeService();

//        Employee employee=createEmployee();
//        employeeService.save(employee);

        Employee testEmployee=employeeService.findById(1);
        System.out.println(testEmployee.getName());
        testEmployee=employeeService.findById(1);
        System.out.println(testEmployee.getName());
    }

    private static Employee createEmployee() {
        return Employee.builder()
                .setSalary(123)
                .setName("ali")
                .build();
    }
}
