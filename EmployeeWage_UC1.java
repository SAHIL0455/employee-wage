package com.company;

public class EmployeeWage_UC1 {
    public static void main(String[] args) {
        int EmpIsPresent = 1;
        double EmpCheck = Math.floor(Math.random()*10)%2;
        if (EmpIsPresent == EmpCheck){
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}