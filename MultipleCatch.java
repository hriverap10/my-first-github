import java.util.Scanner;
public class MultipleCatch {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int[] scores = {90, 85, 75};
        System.out.print("Which Score? ");
        String input = in.nextLine();
        try {
            int index = Integer.parseInt(input);
            System.out.println("Score: " + scores[index]);
        } catch(NumberFormatException e) {
            System.out.println("Not a whole number: " + input + ". " + e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("No such score: " + e.getMessage());
        }
        System.out.println("Done. ");
    }
}
