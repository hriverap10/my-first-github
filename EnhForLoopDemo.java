// public class EnhForLoopDemo {
//     public static void main(String [] args) {
//         int [] array = {-7, 10, 42, 80};

//         int sum = 0;
//         for(int element : array) {
//             sum += element;
//         }
//         System.out.println("The sum is " + sum);


//         for(int element : array) {
//             element *= 2;
//         }

//         int counter = 1;
//         for(int element : array) {
//             System.out.println("Item " + counter + ": " + element);
//             counter++;
//         }
//     }
// }


// public class EnhForLoopDemo {
//     public static void main(String [] args) {
//         int [] data = {4, 7, 2, 9};
//         int sum = 0;

//         for(int n : data) {
//             sum += data[n];
//         }
//         System.out.println("Sum: " + sum);
//     }
// }



// public class EnhForLoopDemo {
//     public static void main(String [] args) {
//         int [][] array = {{81,78}, {87, 91}, {100, 65}};
    //     //Print the entire array
    //     //This outer loop goes through all the rows
    //     for (int i = 0; i < array.length; i++) {
    //        // This inner lopp goes through all the columns 
    //        for(int j = 0; j < array[0].length; j++) {
    //         System.out.print(array[i][j]+ " ");
    //        }
    //        //After printing an entire row, display a newline
    //        System.out.println();
    //     }
    // }
    // Alternative: Use enhanced for loops to go through
    // the 2D array

    //Step 1: Outer loop extracts each 1D array (a row)
//     for (int[] row : array) {
//         // Step 2: Inner loop extracts each value in the row 
//         for (int value : row) {
//             System.out.print(value + " ");
//         }
//         System.out.println();
//     }
// }
// }


public class EnhForLoopDemo {
    public static void main(String [] args) {
        int[][] matrix = {
            {40, -87, 21},
            {100, 9, -7},
            {102, 98, -200}
        };
        //Find the maximum value in the array
        //Exercise: Convert this nested loop into two
        int max = matrix[0][0];
        for(int[] row : matrix) {
            for( int value : row) {
                if(value > max) {
                    max = value;
                }
            }
        }
        System.out.println("The max is: " + max);
    }
}
