package assignment;

public class populationProjection {
    public static void main(String[] args) {
        int currentPopulation = 312032486;
        for (int i = 1; i < 6; i++) {
            int totalPopulation = populationIn(i, currentPopulation, 7, 13, 45);
            System.out.println("The population in " + i + " year is :" + totalPopulation);
        }
    }
    private static int populationIn(int numberOfYears, int currentPopulation, double birthRate, double deathRate, double immigrantRate) {

        double periodOfTime = 365 * 24 * 60 * 60 * numberOfYears;
        double populationAdded = periodOfTime / birthRate + periodOfTime / immigrantRate - periodOfTime / deathRate;
        return (int) (currentPopulation + populationAdded);
    }

}
