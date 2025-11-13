package com.avn.tns.arraydemo;

// Demo for multidimensional array 
public class Multidimarray {

    public static void main(String[] args) {
        // Declaration + Initialization
        // array [row][column]
        int arr[][] = { {4, 7, 6}, {5, 16, 17} };

        // Nested for loop
        for (int i = 0; i < arr.length; i++) {            // row
            for (int j = 0; j < arr[i].length; j++) {     // column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
