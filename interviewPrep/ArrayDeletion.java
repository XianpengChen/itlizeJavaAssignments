package interviewPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        if (length > 1000) {
            length = 1000;
        }
        scanner.close();
        List<Integer> list = new ArrayList<>();
        for (int i =0; i < length; i++) {
            list.add(i);
        }
        int curr = 0;
        while (list.size() > 1) {
            curr = (curr + 2) % list.size();
            list.remove(curr);
        }
        System.out.println(list.get(0));
    }
}
