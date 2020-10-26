package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
            copy[i] = num[i];
        }
        Arrays.sort(copy);
        List<Integer> mid = new ArrayList<>();
        List<Integer> midCopy = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(num[i]!=copy[i]) {
                mid.add(num[i]);
                midCopy.add(copy[i]);
            }
        }
        Collections.reverse(midCopy);
        if(mid.equals(midCopy)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        in.close();
    }
}