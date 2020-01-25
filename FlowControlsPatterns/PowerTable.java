package FlowControlsPatterns;
//1. (Print a table) Write a program that displays the following table:
//a b pow(a, b)
public class PowerTable {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " " + (i+1) + " " + (int)Math.pow(i, i+1));
        }
    }
}
