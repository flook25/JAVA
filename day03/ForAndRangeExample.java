package day03;

import java.util.Arrays;

public class ForAndRangeExample {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));

        for (int num : numbers){
            System.out.println(num);
        }



    }
}
