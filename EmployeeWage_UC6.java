package com.company;

public class EmployeeWage_UC6 {
    public static final int Emp_Present_half_Time = 1;
    private static final int Emp_Present_full_Time = 2;
    public static final int Employee_Per_Hr_Rate = 10;
    public static final int Num_of_Working_Days = 20;
    public static final int Max_Hr_In_Month = 100;

    public static void main(String[] args) {
        int EmployeeHr = 0;
        int TotalEmployeeWage = 0;
        int TotalEmployeeHrs = 0;
        int TotalWorkingDays = 0;
        while (TotalEmployeeHrs <= Max_Hr_In_Month && TotalWorkingDays < Num_of_Working_Days) {
            TotalWorkingDays++;
            int EmpCheck = (int) Math.floor(Math.random() * 10) % 3;
                    switch (EmpCheck) {
                        case Emp_Present_half_Time:
                            EmployeeHr = 4;
                            break;
                        case Emp_Present_full_Time:
                            EmployeeHr = 8;
                            break;
                        default:
                            EmployeeHr = 0;
                    }
                    TotalEmployeeHrs += EmployeeHr;
                    System.out.println("Today Emp Hr: "+EmployeeHr+ "Total Employee Hr is :"+TotalEmployeeHrs);
        }
            TotalEmployeeWage = TotalEmployeeHrs * Employee_Per_Hr_Rate;
            System.out.println("Total Emp Wage: " +TotalEmployeeWage);
    }
}