/*************************************************************************
 * Compilation:  javac RoadTrip.java
 * Execution:    java RoadTrip <gallons> <mpg> <isRaining> <hasMountainPass> <numPassengers> <isWeekend>
 *
 * Estimates the maximum driving range of a car based on fuel, fuel efficiency,
 * and several trip conditions
 *
 * @author Matthew Specht
 *************************************************************************/
public class RoadTrip {

    /**
     * Parses command-line arguments, applies modifiers, and prints
     * the expected driving range in miles (rounded to one decimal place) <- may need to be changed, depends if this has been taught at this point in CS111
     *
     * @param args six command-line arguments: gallons mpg isRaining hasMountainPass numPassengers isWeekend
     */
    public static void main(String[] args) {
        double gallons = Double.parseDouble(args[0]);
        double mpg = Double.parseDouble(args[1]);
        boolean isRaining = Boolean.parseBoolean(args[2]);
        boolean hasMountainPass = Boolean.parseBoolean(args[3]);
        int numPassengers = Integer.parseInt(args[4]);
        boolean isWeekend = Boolean.parseBoolean(args[5]);

        if (isWeekend == true) {
            mpg = mpg * 0.70;
        }

        if (isRaining == true) {
            mpg = mpg * 0.85;
        }

        if (hasMountainPass == true) {
            mpg = mpg * 0.90;
        }

        if (numPassengers >= 3) {
            mpg = mpg * 1.05;
        }

        double distance = gallons * mpg;
        System.out.println(distance + " miles");
    }
}