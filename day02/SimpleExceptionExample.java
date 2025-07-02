package day02;

public class SimpleExceptionExample {
    
    public static void main(String[] args){

        try {
            int result = 10/0 ;
            System.out.println("output: " + result);
        } catch (Exception e) { // Corrected: ArithmeticException
            System.out.println("error : " + e.getMessage());
        }

        int[] numbers = {1,2,3};
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error: " + e.getMessage());
        }

    }
}