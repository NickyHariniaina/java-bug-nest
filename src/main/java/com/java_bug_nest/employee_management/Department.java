package com.java_bug_nest.employee_management;

import java.util.ArrayList;

/**
 * TODO : a department is a collection of employees. It has a name and a set of
 * employees in it.
 */
public class Department {
  /**
   *
   * TODO : for our HR officer, give a function to show all details about
   * employees, including
   * their pay.
   */
  private String departmentName;
  private ArrayList<Employee> employeesList;

  public Department(String departmentName) {
    this.departmentName = departmentName;
    this.employeesList = new ArrayList<>();
  }

  public boolean addNewEmployee(Employee newEmployee) {
    if (employeeExist(newEmployee)) {
      return false;
    }
    this.employeesList.add(newEmployee);
    return true;
  }

  public boolean employeeExist(Employee employee) {
    for (Employee e : this.employeesList) {
      if (e.equals(employee)) {
        return true;
      }
    }
    return false;
  }

  public String showAllEmployeesAbout() {
    String info = "Employees information: \n";
    if (this.employeesList.size() == 0) {
      return "There are no employees here.";
    }
    for (Employee e : this.employeesList) {
      info += e.showSensitiveInfo(this);
      info += "\n";
    }
    return info;
  }
}
