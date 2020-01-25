package loopStatements;

public class PrintPattern {
    public static void main(String[] args) {
        System.out.println("the pattern a is: ");
        System.out.println(nestedLoop1());
        System.out.println("\nthe pattern b is: ");
        System.out.println(nestedLoop2());

    }
    private static StringBuilder nestedLoop1() {
        StringBuilder total = new StringBuilder();
        for (int i = 1; i <= 8; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                row.append("# ");
            }
            total.append("\n").append(row);
        }
        return total;
    }
    private static StringBuilder nestedLoop2() {
        StringBuilder total = new StringBuilder();
        for (int i = 1; i <= 8; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = i; j <= 8; j++) {
                row.append("# ");
            }
            total.append("\n").append(row);
        }
        return total;
    }
}
