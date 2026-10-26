/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;
 import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author NGUYEN THANH TAM
 */
public class EmployeeServiceImpl implements EmployeeService {

    private List<Employee> list = new ArrayList<>();

    @Override
    public boolean add(Employee e) {
        // Kiểm tra ID đã tồn tại
        if (findById(e.getId()) != null) {
            return false;
        }

        list.add(e);
        return true;
    }

    @Override
    public Employee findById(String id) {
        for (Employee e : list) {
            if (e.getId().equalsIgnoreCase(id)) {
                return e;
            }
        }

        return null;
    }

    @Override
    public List<Employee> getAll() {
        return list;
    }

    @Override
    public double getTotalSalary() {
        double total = 0;

        for (Employee e : list) {
            total += e.getSalary();
        }

        return total;
    }
}
