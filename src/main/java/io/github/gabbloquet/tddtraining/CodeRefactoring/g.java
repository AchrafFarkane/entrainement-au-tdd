package io.github.gabbloquet.tddtraining.CodeRefactoring;
//import java.util.List;
//import java.util.ArrayList;
//public class g {
//}
//
//
//// This class violates multiple SOLID principles
//public class HugeClass {
//    private String name;
//    private double salary;
//    private List<String> tasks;
//    private String reportFormat;
//    private String department;
//    private String address;
//    private String phoneNumber;
//
//    public HugeClass(String name, double salary, List<String> tasks, String reportFormat, String department, String address, String phoneNumber) {
//        this.name = name;
//        this.salary = salary;
//        this.tasks = tasks;
//        this.reportFormat = reportFormat;
//        this.department = department;
//        this.address = address;
//        this.phoneNumber = phoneNumber;
//    }
//
//    // SRP Violation: This class handles multiple responsibilities
//    public void generateReport() {
//        if ("PDF".equals(reportFormat)) {
//            System.out.println("Generating PDF Report...");
//        } else if ("HTML".equals(reportFormat)) {
//            System.out.println("Generating HTML Report...");
//        }
//    }
//    public void sendReport(String email) {
//        System.out.println("Sending report to: " + email);
//    }
//
//    // OCP Violation: If a new employee type is added, we have to modify this method
//    public double calculateBonus(String role) {
//        if ("Manager".equals(role)) {
//            return salary * 0.2;
//        } else if ("Developer".equals(role)) {
//            return salary * 0.1;
//        } else if ("Intern".equals(role)) {
//            return salary * 0.05;
//        } else {
//            return salary * 0.03;
//        }
//    }
//
//    // LSP Violation: Not using abstraction properly
//    public void performTask() {
//        if (tasks.isEmpty()) {
//            System.out.println("No tasks assigned");
//        } else {
//            for (String task : tasks) {
//                System.out.println("Performing task: " + task);
//            }
//        }
//    }
//
//    // ISP Violation: This class is doing too many things
//    public void processSalary() {
//        System.out.println("Processing salary for: " + name);
//    }
//
//    public void saveToDatabase() {
//        System.out.println("Saving employee data to the database");
//    }
//
//    public void updateAddress(String newAddress) {
//        this.address = newAddress;
//        System.out.println("Updated address to: " + newAddress);
//    }
//
//    public void updatePhoneNumber(String newPhoneNumber) {
//        this.phoneNumber = newPhoneNumber;
//        System.out.println("Updated phone number to: " + newPhoneNumber);
//    }
//
//    public void printTasks() {
//        for (String task : tasks) {
//            System.out.println("Task: " + task);
//        }
//    }
//
//    // DIP Violation: Directly depends on concrete classes instead of abstractions
//    public void connectToDatabase() {
//        DatabaseConnection connection = new DatabaseConnection();
//        connection.connect();
//    }
//
//    // More functionality added, increasing the class complexity
//    public void requestLeave(int days) {
//        System.out.println(name + " requested " + days + " days of leave.");
//    }
//
//    public void approveLeave(String employeeName) {
//        System.out.println("Leave approved for " + employeeName);
//    }
//
//    public void rejectLeave(String employeeName) {
//        System.out.println("Leave rejected for " + employeeName);
//    }
//
//    public void conductMeeting(String topic) {
//        System.out.println("Conducting meeting on: " + topic);
//    }
//
//    public void evaluatePerformance(String employeeName, String performance) {
//        System.out.println("Performance of " + employeeName + " is: " + performance);
//    }
//
//    public void scheduleInterview(String candidateName) {
//        System.out.println("Scheduled interview with " + candidateName);
//    }
//
//    public void printEmployeeDetails() {
//        System.out.println("Employee Name: " + name);
//        System.out.println("Department: " + department);
//        System.out.println("Salary: " + salary);
//        System.out.println("Address: " + address);
//        System.out.println("Phone: " + phoneNumber);
//    }
//}

// This class should be abstracted, but is used directly, violating DIP
//class DatabaseConnection {
//    public void connect() {
//        System.out.println("Connecting to database...");
//    }
//}