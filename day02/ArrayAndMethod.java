package day02;

import java.util.Arrays;

public class ArrayAndMethod {

    public static void main(String[] args){
       int[] numbers = {1, 5, 2, 3, 9};
       System.out.println("Array Length" + numbers.length);
       System.out.println("Array elements" + Arrays.toString(numbers));
       Arrays.sort(numbers);

       System.out.println("Sorted arrays: " + Arrays.toString(numbers));

       int[] newArray = new int[5]; 
       Arrays.fill(newArray ,10) ;
       System.out.println("Filled array: " + Arrays.toString(newArray));

       int[] copyArray = Arrays.copyOf(numbers, numbers.length);
       System.out.println("Copied array: " + Arrays.toString(copyArray));
    }
    
}
