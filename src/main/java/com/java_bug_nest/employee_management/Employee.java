package com.java_bug_nest.employee_management;

public abstract class Employee {
  protected int employeeId;
  protected String employeeName;

  public Employee(int employeeId, String employeeName) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
  }

  public abstract double calculatePay();
}
