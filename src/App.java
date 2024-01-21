import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String userInputOne = "", userInputTwo = "";
        double math = 1;
        double mathDouble;
        double result = 1;
        int mathType = 0; // 1 = addition, 2 = subtraction. 3 = multiplication, 4 = division

        Scanner scanner = new Scanner(System.in);
        System.out.println("This program can be used to convert different units measurement to their counterparts");
        System.out.println("If you would like to exit the program, type 'exit'");
        System.out.println(); // spacer
        while (true) {
            System.out.println("What are you converting from (Type exit to cancel)");
            userInputOne = scanner.nextLine().toLowerCase();
            switch (userInputOne) {
                case "miles", "mile" -> {
                    System.out.println("Miles to Kilometers Selected");
                    math = 1.6;
                    mathType = 3;
                }
                case "gram", "grams" -> {
                    System.out.println("Grams to Kilograms Selected");
                    math = .001;
                    mathType = 3;
                }
                case "centimeter", "centimeters" -> {
                    System.out.println("Centimeters to Meters Selected");
                    math = .1;
                    mathType = 3;
                }
                case "pounds", "pound", "lb", "lbs" -> {
                    System.out.println("Pounds to Kilograms Selected");
                    math = .45;
                    mathType = 3;
                }
                case "exit" -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("Please enter one of the specified measurements in the readme");
                    continue; // Restarts the while loop
                }
            }

            System.out.println("How many " + userInputOne + "(s)");
            userInputTwo = scanner.nextLine();
            if (!userInputTwo.matches("^[0-9]+$")) { // Checks for any non-number
                System.out.println("Please enter a number");
                continue;
            } else {
                mathDouble = Double.parseDouble(userInputTwo); // converts the user inputted string to a double
            }


            if (mathType == 0) {
                System.out.println("something terrible has happened");
            }
            if (mathType == 3) {
                result = mathDouble * math;
            }
            System.out.println("The result is " + result);

        }

    }
}
