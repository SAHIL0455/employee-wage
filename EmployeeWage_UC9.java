package com.company;

public class EmployeeWage_UC9 {
    public static final int Emp_Present_half_Time = 1;
    public static final int Emp_Present_full_Time = 2;
    public final String company;
    public final int employeePerHrRate;
    public final int numOFWorkingDays;
    public final int maxHrsInMonth;

    public EmployeeWage_UC9(String company, int employeePerHrRate, int numOFWorkingDays, int maxHrsInMonth) {
        this.company = company;
        this.employeePerHrRate = employeePerHrRate;
        this.numOFWorkingDays = numOFWorkingDays;
        this.maxHrsInMonth = maxHrsInMonth;
    }
    public void computeWage(){
        int employeeHr;
        int totalEmployeeHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmployeeHrs <= maxHrsInMonth && totalWorkingDays < numOFWorkingDays) {
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

    @Override
    public String toString() {
        return "EmployeeWage_UC9{" +
                "company='" + company + '\'' +
                ", employeePerHrRate=" + employeePerHrRate +
                ", numOFWorkingDays=" + numOFWorkingDays +
                ", maxHrsInMonth=" + maxHrsInMonth +
                '}';
    }

    public static void main(String[] args) {
        EmployeeWage_UC9 tcs = new EmployeeWage_UC9("tcs",500,20,160);
        EmployeeWage_UC9 reliance = new EmployeeWage_UC9("Reliance",400,24,200);
        tcs.computeWage();
        reliance.computeWage();
    }
}
