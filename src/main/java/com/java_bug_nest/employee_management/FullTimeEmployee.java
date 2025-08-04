package com.java_bug_nest.employee_management;

public class FullTimeEmployee extends Employee {
  public double monthlySalary;

  public FullTimeEmployee(int employeeId, String employeeName, double monthlySalary) {
    super(employeeId, employeeName);
    this.monthlySalary = monthlySalary;
  }

  @Override
  public double calculatePay() {
    return monthlySalary;
  }
}
