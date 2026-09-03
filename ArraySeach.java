import java.util.Scanner;

public class ArraySearch {
  public static void main(String [] args) {
    String [][] seasons = { 
      {"January", "Winter"},
      {"February", "Winter"},
      {"March", "Spring"},
      {"Abril", "Spring"},
      {"May", "Spring"},
      {"June", "Summer"},
      {"July", "Summer"},
      {"August", "Summer"},
      {"September", "Fall"},
      {"October", "Fall"},
      {"November", "Winter"},
      {"December", "Winter"}
    };
    Scanner scnr = new Scanner(System.in);
    System.out.print("Enter a month: ");
    String month = scnr.nextLine();
    //Search the 2D array for the month in the first column,
    //If found, display the value in the column
    boolean found = false;  // <== FLAG
    for(String [] row : seasons) { // "For each row in seasons ..."
        if(row[0].equalsIgnoreCase(month)) {
          System.out.println(row[0] + " is in " + row[1]);
          found = true;
        }
    }
    if(!found) {
        System.out.println("Month not found");
    }
  }
}
                                   
