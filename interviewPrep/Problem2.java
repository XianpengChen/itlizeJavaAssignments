package interviewPrep;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip1 = scanner.next();
        String ip2 = scanner.next();
        String ip3 = scanner.next();
        String ip4 = scanner.next();
        scanner.close();
        int num1 = ipToNum(ip1);
        int num2 = ipToNum(ip2);
        int num3 = ipToNum(ip3);
        int num4 = ipToNum(ip4);
        if (num3 > num2 || num4 < num1) {
            System.out.println("No Overlap IP");
        }
        else {
            System.out.println("Overlap IP");
        }

    }
    private static int ipToNum(String str) {
        String[] ip = str.split(".");
        return Integer.parseInt(ip[3]) + Integer.parseInt(ip[2]) * 256 + Integer.parseInt(ip[1]) * 256 * 256
        + Integer.parseInt(ip[0]) * 256 * 256 * 256;
    }
}
