package com.company;

import java.util.Scanner;

public class EmployeeWage_UC8 {
    public static final int Emp_Present_half_Time = 1;
    private static final int Emp_Present_full_Time = 2;
    public static final int Max_Hr_In_Month = 100;

    public static void ComputeWage(String company, int employeePerHrRate,int numOFWorkingDays) {
        int employeeHr;
        int totalEmployeeHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmployeeHrs <= Max_Hr_In_Month && totalWorkingDays < numOFWorkingDays) {
            totalWorkingDays++;
            int EmpCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (EmpCheck) {
                case Emp_Present_half_Time:
                    employeeHr = 4;
                    break;
                case Emp_Present_full_Time:
                    employeeHr = 8;
                    break;
                default:
                    employeeHr = 0;
            }
            totalEmployeeHrs += employeeHr;
            System.out.println("Today Emp Hr: " + employeeHr + "Total Employee Hr is :" + totalEmployeeHrs);
        }
        int totalEmployeeWage = totalEmployeeHrs * employeePerHrRate;
        System.out.println("Total Emp Wage For Company : " + company + " is " + totalEmployeeWage);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;
        ComputeWage("Tata Motor", 200,20);
        ComputeWage("Reliance", 170,24);
    }
}