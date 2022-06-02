package com.company;
public class EmployeeWage_UC7 {
    public static final int Emp_Present_half_Time = 1;
    private static final int Emp_Present_full_Time = 2;
    public static final int Employee_Per_Hr_Rate = 10;
    public static final int Num_of_Working_Days = 20;
    public static final int Max_Hr_In_Month = 100;
    public static void ComputeEmployee(){
        int employeeHr = 0;
        int totalEmployeeWage = 0;
        int totalEmployeeHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmployeeHrs <= Max_Hr_In_Month && totalWorkingDays < Num_of_Working_Days) {
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
            System.out.println("Today Emp Hr: "+employeeHr+ "Total Employee Hr is :"+totalEmployeeHrs);
        }
        totalEmployeeWage = totalEmployeeHrs * Employee_Per_Hr_Rate;
        System.out.println("Total Emp Wage: " +totalEmployeeWage);
    }

    public static void main(String[] args) {
        ComputeEmployee();
    }
}
