package com.company.service;

import com.company.model.Employee;

public class ManagerEmployee implements EmployeeGeneralService {
    private Employee[] lists = new Employee[3];
    private int size = 0;
    @Override
    public void add(Employee employee) {
        if (size < lists.length) {
            lists[size] = employee;
            size++;
        } else {
            System.out.println("chật chỗ rồi bạn eii");
        }
    }
    @Override
    public void print() {
        for (Employee employee : lists) {
            System.out.println(employee);
        }
        System.out.println("------------------------");
    }

    @Override
    public int find(int index) {
        for (int i = 0;i < size;i++){
            if(lists[i].getId() == index){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update(int index,Employee employee) {
        lists[find(index)] = employee;
    }

    @Override
    public void delete(int id) {
        lists[find(id)] = null;
    }
    public static void main(String[] args) {
        ManagerEmployee managerEmployee = new ManagerEmployee();
        Employee employee1 = new Employee("khánh ",1,2000,"roombBoss");
        Employee employee2 = new Employee("hương ",2,2000,"roombBoss");
        Employee employee3 = new Employee("như anh ",3,2000,"roombBoss");

        managerEmployee.add(employee1);
        managerEmployee.add(employee2);
        managerEmployee.add(employee3);
        managerEmployee.print();
        Employee employee4 = new Employee("ánh  ",4,10000,"roombBoss");
        managerEmployee.update(1,employee4);
        managerEmployee.print();
    }
}
