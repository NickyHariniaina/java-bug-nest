package com.java_bug_nest.employee_management;

public class PartTimeEmployee extends Employee {
  private double hoursWorked;
  private double hourlyRate;

  public PartTimeEmployee(int employeeId, String employeeName, double hoursWorked, double hourlyRate) {
    super(employeeId, employeeName);
    this.hoursWorked = hoursWorked;
    this.hourlyRate = hourlyRate;
  }

  public double calculatePay() {
    return hoursWorked * hourlyRate;
  }
}
