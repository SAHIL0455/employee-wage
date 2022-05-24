package com.company;

public class EmployeeWage_UC3 {
    public static void main(String[] args) {
        int EmployeeIsPresent = 1;
        int EmployeePerHrRate = 20;
        int EmployeeHr = 0;
        double EmpCheck = Math.floor(Math.random()*10)%2;
        if (EmpCheck == EmployeeIsPresent){
            double EmployeeTime = Math.floor(Math.random()*10)%2;
            if (EmployeeTime == 1){
            System.out.println("Employee is Present in Full Time");
            EmployeeHr = 8;
            }
            else {
                System.out.println("Employee is Present in Half Time");
                EmployeeHr = 4;
            }
            }
        else {
            System.out.println("Employee is Absent");
            EmployeeHr = 0;
        }
        int EmployeeWage = EmployeePerHrRate * EmployeeHr;
        System.out.println("Employee wage is = "+EmployeeWage);
    }
}