import java.util.Scanner;

public class Exercise {
    public static void main(String [] args) {
        String [][] grades = {
            {"Maria", "95"}, {"Carlos", "88"}, {"Aisha", "97"},
            {"Diego", "73"}, {"Wei", "91"}, {"Priya", "99"}
        };

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a student name: ");
        String name = scnr.nextLine();

        //Exercise: Find and print the grade for the given student.
        // Also, display a message if the student cannot be found. 
        boolean found = false;
        for(String[] row: grades) {
            if(row[0].equalsIgnoreCase(name)) {
                System.out.println("The grade for " + row[0] + " is " + row[1]);
                found = true;
            }
        }
        if(!found) {
            System.out.print(name + " not found");
        }
    }
}
