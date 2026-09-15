import java.util.Scanner;

public class StepPractice {
    public static double stepsToMiles(int steps) {
        if(steps < 0) {
            throw new IllegalArgumentException("Steps cannot be negative");
        }
        return steps / 2000.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your step count: ");
        String text = input.nextLine();
        try {
        int steps = Integer.parseInt(text);
        double miles = stepsToMiles(steps);
        System.out.println("Miles: " + miles);
        } catch(NumberFormatException e) {
            System.out.println("Error: not a number");
        } catch(IllegalArgumentException e) {
            System.out.println("Error: steps cannot be negative");
        }
        
    }
}
