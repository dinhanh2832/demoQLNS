package com.company.model;

public class Employee extends Person {
    private String department;

    public Employee(String name, double id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public Employee() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "tên : " +
                super.getName() +
                "id : " + super.getId() +
                " mức lương: " + super.getSalary() +
                "department='" + department + '\'' +
                '}';
    }
}
