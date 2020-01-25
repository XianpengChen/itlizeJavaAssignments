package Datatypes_operators;

public class MathCalculator {
    public static void main(String[] args) {
        double X = 5, Y = 6, Z = 7;
        System.out.println("5 - 6 equals " + twoVariablesCal(5, 6, "Sub"));
        System.out.println("5 - 6 + 7 equals " + threeVariablesCal(5, 6, 7, "Sub", "Add"));

    }

    /**
     * @param var1 variable 1
     * @param var2 variable 2
     * @param operation "Add", "Sub", "Mul" or "Div"
     * @return the result after applying the operation with the two variables.
     */
    private static double twoVariablesCal(double var1, double var2, String operation) {
        switch (operation) {
            case "Add": return var1 + var2;
            case "Sub": return var1 - var2;
            case "Mul": return var1 * var2;
            case "Div": return var1 / var2;
            default:
                System.out.println("Operation not supported!");
                return 0;
        }
    }
    private static double threeVariablesCal(double var1, double var2, double var3, String operation1, String operation2) {
        double result1 = twoVariablesCal(var1, var2, operation1);
        return twoVariablesCal(result1, var3, operation2);
    }
}

