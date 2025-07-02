package day02; // Added package declaration

public class StringFormat {

    public static void main(String[] args) {
        String name = "John";
        int age = 20;

        // Method 1: String Concatenation
        System.out.println("Name " + name + "Age " + age);

        // Method 2: Formatted Output using printf
        System.out.printf("Name: %s, Age: %d", name, age);
    }
}
