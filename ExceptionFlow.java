public class ExceptionFlow {
    public static void main(String [] args) {
        
    System.out.println("A");
    try {
        System.out.println("B");
        int x = Integer.parseInt(input);
        System.out.println("C");
    } catch(NumberFormatException e) {
        System.out.println("D");
    } finally {
        System.out.println("E");
    }
    System.out.println("F");
    }
}
