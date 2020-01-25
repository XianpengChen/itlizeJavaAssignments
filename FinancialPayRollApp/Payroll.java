package FinancialPayRollApp;

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = scanner.next();
        System.out.print("Enter number of hours worked in a wee: ");
        double hours = scanner.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = scanner.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = scanner.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = scanner.nextDouble();
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross Pay: $" + payRate * hours);
        System.out.println("Deduction: ");
        System.out.println("Federal Withholding (" +federalTaxRate*100+"%): $" + federalTaxRate * payRate * hours);
        System.out.println("State Withholding (" +stateTaxRate*100+"%): $" + stateTaxRate * payRate * hours);
        System.out.println("Total Deduction: $" + (federalTaxRate + stateTaxRate)*payRate *hours);
        System.out.println("Net Pay: $" + (1 - federalTaxRate - stateTaxRate)*payRate*hours);
    }
}
