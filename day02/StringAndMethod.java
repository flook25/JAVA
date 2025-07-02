package day02;

public class StringAndMethod {
    
    public static void main(String[] args) {
        String str = "Hello, World";


        // String Length
        System.out.println(str.length());

        // Case conversion
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());


        // String manipulation
        System.out.println(str.replace("Hello", "Hi👋🏻" ));
        System.out.println(str.substring(0, 5));

        // Search operations
        System.out.println(str.indexOf("World"));
        System.out.println(str.contains("Hello"));

        // String properties
        System.out.println(str.isEmpty());
        System.out.println(str.trim()); // trimming for white space
 


    }
}
