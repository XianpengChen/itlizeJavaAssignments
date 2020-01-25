package program;

public class Program {
    public static void main(String[] args) {
        System.out.println("Pattern 1 is: ");
        System.out.println(pattern1());
        System.out.println("\nPattern 2 is: ");
        System.out.println(pattern2());
        System.out.println("\nPattern 3 is: ");
        System.out.println(pattern3());
    }
    private static StringBuilder pattern1() {
        StringBuilder total = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                row.append(i).append(" ");
            }
            total.append("\n").append(row);
        }
        return total;
    }

    private static StringBuilder pattern2() {
        StringBuilder total = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 6 - i; j >= 1; j--) {
                row.append(j).append(" ");
            }
            total.append("\n").append(row);
        }
        return total;
    }

    private static StringBuilder pattern3() {
        StringBuilder total = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 5 - i; j > 1; j--) {
                row.append(" ");
            }
            for (int j=0; j<=i; j++ )
            {
                row.append("* ");
            }
            total.append("\n").append(row);
        }
        return total;
    }
}
