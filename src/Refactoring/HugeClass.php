<?php

namespace App\Refactoring;

use App\Refactoring\Generator\Report\ReportContext;
use App\Refactoring\Generator\Report\Strategy\HTMLReportStrategy;
use App\Refactoring\Generator\Report\Strategy\PDFReportStrategy;
use Exception;

class HugeClass
{
    private string $name;
    private float $salary;
    private array $tasks;
    private string $reportFormat;
    private string $department;
    private string $address;
    private string $phoneNumber;

    private ReportContext $reportContext;

    /**
     * @throws Exception
     */
    public function __construct($name, $salary, $tasks, $reportFormat, $department, $address, $phoneNumber)
    {
        $this->name = $name;
        $this->salary = $salary;
        $this->tasks = $tasks;
        $this->reportFormat = $reportFormat;
        $this->department = $department;
        $this->address = $address;
        $this->phoneNumber = $phoneNumber;

        // Initialize the report context
        $this->reportContext = new ReportContext();
    }

    // Refactored method using Strategy Pattern

    /**
     * @throws Exception
     */
    public function generateReport(): void
    {
        // Set the appropriate strategy based on reportFormat
        $this->reportContext->setReportStrategy($this->reportFormat);

        $this->reportContext->generateReport();
    }

    // Rest of the methods remain the same as in the original class
    public function sendReport($email): void
    {
        echo "Sending report to: " . $email . "\n";
    }

    // OCP Violation: If a new employee type is added, we have to modify this method
    public function calculateBonus($role)
    {
        if ($role == "Manager") return $this->salary * 0.2;
        if ($role == "Developer") return $this->salary * 0.1;
        if ($role == "Intern") return $this->salary * 0.05;
        return $this->salary * 0.03;
    }

    // LSP Violation: Not using abstraction properly
    public function performTask()
    {
        if (count($this->tasks) == 0) {
            echo "No tasks assigned\n";
        } else {
            foreach ($this->tasks as $task) {
                echo "Performing task: " . $task . "\n";
            }
        }
    }

    // ISP Violation: This class is doing too many things
    public function processSalary()
    {
        echo "Processing salary for: " . $this->name . "\n";
    }

    public function saveToDatabase()
    {
        echo "Saving employee data to the database\n";
    }

    public function updateAddress($newAddress)
    {
        $this->address = $newAddress;
        echo "Updated address to: " . $newAddress . "\n";
    }

    public function updatePhoneNumber($newPhoneNumber)
    {
        $this->phoneNumber = $newPhoneNumber;
        echo "Updated phone number to: " . $newPhoneNumber . "\n";
    }

    public function printTasks()
    {
        foreach ($this->tasks as $task) {
            echo "Task: " . $task . "\n";
        }
    }

    // DIP Violation: Directly depends on concrete classes instead of abstractions
    public function connectToDatabase()
    {
        $connection = new DatabaseConnection();
        $connection->connect();
    }

    // More functionality added, increasing the class complexity
    public function requestLeave($days)
    {
        echo $this->name . " requested " . $days . " days of leave.\n";
    }

    public function approveLeave($employeeName)
    {
        echo "Leave approved for " . $employeeName . "\n";
    }

    public function rejectLeave($employeeName)
    {
        echo "Leave rejected for " . $employeeName . "\n";
    }

    public function conductMeeting($topic)
    {
        echo "Conducting meeting on: " . $topic . "\n";
    }

    public function evaluatePerformance($employeeName, $performance)
    {
        echo "Performance of " . $employeeName . " is: " . $performance . "\n";
    }

    public function scheduleInterview($candidateName)
    {
        echo "Scheduled interview with " . $candidateName . "\n";
    }

    public function printEmployeeDetails()
    {
        echo "Employee Name: " . $this->name . "\n";
        echo "Department: " . $this->department . "\n";
        echo "Salary: " . $this->salary . "\n";
        echo "Address: " . $this->address . "\n";
        echo "Phone: " . $this->phoneNumber . "\n";
    }
}
