package interviewPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个位数不大于5的整数：");
        int inputInteger = scanner.nextInt();
        if(inputInteger < -99999 || inputInteger > 99999) {
            System.out.println("输入数字位数大于5！");
            return;
        }
        int flag = 1;
        if (inputInteger < 0) {
            flag = -1;
        }
        int numberOfDigits = 1;
        List<Integer> digits = new ArrayList<>();
        List<Integer> reverse = new ArrayList<>();
        int temp = inputInteger * flag;
        while (temp / 10 >= 1) {
            numberOfDigits++;
            temp = temp / 10;
        }
        int temp2 = inputInteger * flag;
        int currentDigits = numberOfDigits;
        while (currentDigits >= 1) {
            int curruentDigit = (int) (temp2 / Math.pow(10, (currentDigits - 1)));
            digits.add(curruentDigit);
            temp2 = (int) (temp2 % Math.pow(10, (currentDigits - 1)));
            currentDigits--;
        }
        for (int i = numberOfDigits - 1; i>= 0; i--) {
            reverse.add(digits.get(i));
        }
        System.out.println("它是一个" + numberOfDigits + "位数。");
        System.out.print("顺序输出每一个数字:");
        if (flag == -1) {
            System.out.print("-");
        }
        for (int p: digits) {
            System.out.print(p +" ");
        }
        System.out.print("\n逆序输出每一个数字:");
        for (int p: reverse) {
            System.out.print(" " + p);
        }
        if (flag == -1) {
            System.out.print("-");
        }
    }
}