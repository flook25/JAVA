package day03;

public class LoopSumNumber {

    public static void main(String[] args){
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum += i;
        }

        System.out.println("Sum of numbers from 1 to 100 is: " + sum);
    }
    
}
