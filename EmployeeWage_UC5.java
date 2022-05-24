package com.company;

public class EmployeeWage_UC5 {
    public static final int Emp_Present = 1;
    public static final int Emp_Present_halfTime = 1;
    public static void main(String[] args) {
        int EmployeePerHrRate = 20;
        int EmployeeHr = 0;
        int TotalEmployeeWage = 0;
        for (int i = 0; i < 21; i++) {
            int EmpCheck = (int) Math.floor(Math.random() * 10) % 2;
            switch (EmpCheck) {
                case Emp_Present:
                    int EmployeeTime = (int) Math.floor(Math.random() * 10) % 2;
                    switch (EmployeeTime) {
                        case Emp_Present_halfTime:
                            System.out.println("Employee is present in half Time");
                            EmployeeHr = 4;
                            break;
                        default:
                            System.out.println("Employee is present in full Time");
                            EmployeeHr = 8;
                    }
                    break;
                default:
                    System.out.println("Employee is Absent");
                    EmployeeHr = 0;
            }
            int EmployeeWage = EmployeeHr * EmployeePerHrRate;
            System.out.println("Employee Wage is = " + EmployeeWage);
            TotalEmployeeWage += EmployeeWage;
        }
        System.out.println("Total Employee Wage is = "+TotalEmployeeWage);
    }
}