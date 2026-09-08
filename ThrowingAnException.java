public class ThrowingAnException {
    public static void main(String [] args) {

    }
    public static double average(double sum, double howMany) {
        if(howMany == 0) {
            // Cannot divide by zero! Let's throw an expection
            throw new RuntimeException("Cannot divide by zero.");
        }
        return sum / howMany;
    }
}
