package assignment;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        System.out.println(add(num1, num2));
    }
    private static int add(int num1, int num2){
        return num1 + num2;
    }
}
