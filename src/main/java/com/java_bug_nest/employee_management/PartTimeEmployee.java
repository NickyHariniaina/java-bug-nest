package com.java_bug_nest.employee_management;

public class PartTimeEmployee extends Employee {
  private double hoursWorked;
  private double hourlyRate;

  public PartTimeEmployee(String employeeName, double hoursWorked, double hourlyRate) {
    super(employeeName);
    this.hoursWorked = hoursWorked;
    this.hourlyRate = hourlyRate;
  }

  public PartTimeEmployee(int employeeId, String employeeName, double hoursWorked, double hourlyRate) {
    super(employeeId, employeeName);
    this.hoursWorked = hoursWorked;
    this.hourlyRate = hourlyRate;
  }

  public double calculatePay() {
    return hoursWorked * hourlyRate;
  }

  @Override
  public String toString() {
    return "PartTimeEmployee [employeeId=" + employeeId + ", hoursWorked=" + hoursWorked + ", employeeName="
        + employeeName + "]";
  }

  @Override
  public String showSensitiveInfo(Department department) {
    String info = "";
    if (department.employeeExist(this)) {
      info += this.toString();
      info += " -  hourlyRate= " + this.hourlyRate;
    } else {
      info += this.toString();
    }
    return info;
  }
}
