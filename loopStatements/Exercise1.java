package loopStatements;

public class Exercise1 {
    public static void main(String[] args) {
        StringBuilder total = new StringBuilder();
        for (int i = 1; i <= 7; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                row.append(j);
                }
            for (int k = i + 1; k <= 7; k++) {
                row.append("*");
            }
            total.append("\n").append(row);
        }
        System.out.println(total);
    }
}
