package FlowControlsPatterns;

import java.util.Scanner;

//3. Write a program that generates two integers under 100
//and prompts the user to enter the sum of these two integers. The program then
//reports true if the answer is correct, false otherwise.
public class GenerateIntegers {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        System.out.print("Please enter the sum of " + a + " and " + b + ": ");
        Scanner scanner = new Scanner(System.in);
        int inputAnswer = scanner.nextInt();
        String report = "Your answer is ";
        if (inputAnswer == a+b) {
            report += "true.";
        }
        else {
            report += "false.";
        }
        System.out.println(report);


    }
}
