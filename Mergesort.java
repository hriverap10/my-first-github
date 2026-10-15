import java.util.Arrays;

public class Mergesort
{
    public static void mergesort(int[] a) {
        if(a.length < 2)
            return;
        int mid = a.length / 2;
        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);
        mergesort(left);
        mergesort(right);
        merge(left, right, a);
    }

    public static void merge(int[] left, int[] right, int[] a) {
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length) {
            if(left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }
        // Copy whatever is left in the left array
        while(i < left.length) { a[k] = left[i];  i++; k++; }
        // Copy whatever is left in the right array
        while(j < right.length) { a[k] = right[j]; j++; k++; }
    }

    public static void main(String[] args)
    {
        int[] array = {-4, -100, 9, 8, 34, 56, 3, 2, 9, 9};
        System.out.println(Arrays.toString(array));
        mergesort(array);
        System.out.println(Arrays.toString(array));
    }

}
