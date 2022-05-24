package com.company;

public class EmployeeWage_UC2 {
    public static void main(String[] args) {
        int EmployeeIsPresent = 1;
        int EmployeePerHrRate = 20;
        int EmployeeTotalHr = 8;
        double EmpCheck = Math.floor(Math.random()*10)%2;
        if (EmpCheck == EmployeeIsPresent){
            System.out.println("Employee is Present");
            int EmployeeWage = EmployeeTotalHr*EmployeePerHrRate;
            System.out.println("Daily Employee Wage is = "+EmployeeWage);
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}