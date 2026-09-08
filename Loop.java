import java.util.Scanner;
 
 public class Loop {
    Scanner in = new Scanner(System.in);
    int age = 0;
    boolean valid = false;
     while (!valid) {
    System.out.println("How old are you? ");
    try {
        age = Integer.parseInt(in.nextLine());
        valid = true;
        
    } catch (NumberFormatException e) {
        System.out.println("That's not a whole number. Try again.");
    }
    }

    System.out.println("Next year you'll be " + (age+1));
 }
