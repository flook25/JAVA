package day03;

public class IfElseExample {

    // example 01
    public static void main(String[] args) {

        int number = 10;

        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Zero or negative number");
        }


    // example 02
        int score = 40;
    
        if (score >= 80) {
            System.out.println("Grade A");
        } else if (score >= 70) {
            System.out.println("Grade B");
        } else if (score >= 60) {
            System.out.println("Grade C");
        } else if (score >= 50) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F😎");
        }

    // example 03
    int age = 20;
    boolean hasID = true;

    if (age >= 18 && hasID) {
        System.out.println("Acess Granted");
    } else {
        System.out.println("Acess denied");
    }

    // example 04

    String dayOfweek = "Saturday";

    if (dayOfweek.equals("Saturday") || dayOfweek.equals("Sunday")) {
        System.out.println("Weekend");
    } else {
        System.out.println("Weekday");
    }

    }
    
}
