package Datatypes_operators;

public class SquareCubes {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            String origin = String.format("%-2s", i);
            String square = String.format("%16s", i*i);
            String cube = String.format("%16s", i*i*i);
            System.out.println(origin + square + cube);
        }
    }
}
