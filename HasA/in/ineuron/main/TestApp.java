package in.ineuron.main;

import in.ineuron.bean.Account;
import in.ineuron.bean.Employee;

public class TestApp {
    public static void main(String[] args) {
        // Create Account object
        Account account = new Account("ABC123", "sachin", "Savings");

        // Inject Account into Employee (Constructor Injection)
        Employee employee = new Employee("IND10", "sachin", "MI", account);

        // Display all details
        System.out.println("----------------------------------------------");
        employee.getEmployeeDetails();
    }
}
