package in.ineuron.bean;

public class Employee {
    private String empId;
    private String empName;
    private String empDept;
    private Account account; // Has-A relationship

    // Constructor Injection
    public Employee(String empId, String empName, String empDept, Account account) {
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
        this.account = account;
    }

    // Method to display employee + account details
    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department: " + empDept);
        System.out.println("Account Details: " + account.getAccountDetails());
    }
}