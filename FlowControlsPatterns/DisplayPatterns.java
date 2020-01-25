package FlowControlsPatterns;

public class DisplayPatterns {
    public static void main(String[] args) {
        System.out.println("\nPattern A");
        System.out.println(patternA());
        System.out.println("\nPattern B");
        System.out.println(patternB());
        System.out.println("\nPattern C");
        System.out.println(patternC());
        System.out.println("\nPattern D");
        System.out.println(patternD());


    }

    private static StringBuilder patternA() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 6; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j<= i; j++) {
                row.append(j).append(" ");
            }
            for (int k = i+1; k<=6; k++) {
                row.append("  ");
            }
            result.append("\n").append(row);
        }
        return result;
    }
    private static StringBuilder patternB() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 6; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j<= 7-i; j++) {
                row.append(j).append(" ");
            }
            for (int k = 8-i; k<=6; k++) {
                row.append("  ");
            }
            result.append("\n").append(row);
        }
        return result;
    }
    private static StringBuilder patternC() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 6; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j<= 6-i; j++) {
                row.append("  ");
            }
            for (int k = i; k>=1; k--) {
                row.append(k).append(" ");
            }
            result.append("\n").append(row);
        }
        return result;
    }

    private static StringBuilder patternD() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 6; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j< i; j++) {
                row.append("  ");
            }
            for (int k = 1; k<= 7 - i; k++) {
                row.append(k).append(" ");
            }
            result.append("\n").append(row);
        }
        return result;
    }



}
