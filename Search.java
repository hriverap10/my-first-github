public class Search {

    public static void main(String[] args) {
        int[] array = {-7, 8, -11, 43, 76, 32, 1, -8};
        int index = linearSearch(array, 32);
        System.out.println("32 was found at " + index);
    }

    /** Finds a target element in an array using linear search.
     * @param a The array to search.
     * @param target The element we're looking for.
     * @return The index of the element, or -1 if not found.
     */
    public static int linearSearch(int[] a, int target) {
        int index = -1;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }

}
