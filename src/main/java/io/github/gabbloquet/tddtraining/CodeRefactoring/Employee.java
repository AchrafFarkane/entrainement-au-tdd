package io.github.gabbloquet.tddtraining.CodeRefactoring;
import java.util.List;

public class Employee implements SalaryProcessor, DataSaver, AddressUpdater, PhoneNumberUpdater, TaskPrinter {
    private String name;
    private double salary;
    private List<String> tasks;
    private String reportFormat;
    private String department;
    private String address;
    private String phoneNumber;

    public Employee(String name, double salary, List<String> tasks, String reportFormat, String department, String address, String phoneNumber) {
        this.name = name;
        this.salary = salary;
        this.tasks = tasks;
        this.reportFormat = reportFormat;
        this.department = department;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Implement SalaryProcessor


    // Implement DataSaver
    @Override
    public void saveToDatabase() {
        System.out.println("Saving employee data to the database");
    }

    // Implement AddressUpdater
    @Override
    public void updateAddress(String newAddress) {
        this.address = newAddress;
        System.out.println("Updated address to: " + newAddress);
    }

    @Override
    public void updatePhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
         System.out.println("Updated phone number to: " + newPhoneNumber);

    }

    @Override
    public void printTasks() {
        for (String task : tasks) {
            System.out.println("Task: " + task);
        }

    }

    @Override
    public void processSalary() {
        System.out.println("Processing salary for: " + name);
    }
}
