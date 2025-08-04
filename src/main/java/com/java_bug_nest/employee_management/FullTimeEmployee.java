package com.java_bug_nest.employee_management;

public class FullTimeEmployee extends Employee {
  private double monthlySalary;

  public FullTimeEmployee(int employeeId, String employeeName, double monthlySalary) {
    super(employeeId, employeeName);
    this.monthlySalary = monthlySalary;
  }

  @Override
  public double calculatePay() {
    return monthlySalary;
  }

  @Override
  public String toString() {
    return "FullTimeEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
  }

  @Override
  public String showSensitiveInfo(Department department) {
    String info = "";
    if (department.employeeExist(this)) {
      info += this.toString();
      info += " -  monthlySalary= " + this.monthlySalary;
    } else {
      info += this.toString();
    }
    return info;
  }
}
