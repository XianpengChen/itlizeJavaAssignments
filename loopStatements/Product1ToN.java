package loopStatements;

public class Product1ToN {
    public static void main(String[] args) {
        System.out.println("the product from 1 to 10 is " + timesFrom1ToN(10));
        System.out.println("the product from 1 to 11 is " + timesFrom1ToN(11));
        System.out.println("the product from 1 to 12 is " + timesFrom1ToN(12));
        System.out.println("the product from 1 to 13 is " + timesFrom1ToN(13));
        System.out.println("the product from 1 to 14 is " + timesFrom1ToN(14));
    }
    private static long timesFrom1ToN(int number) {
        long temp = 1;
        for (int i = 1; i <= number; i++) {
            temp = temp * i;
        }
        return temp;
    }
}
