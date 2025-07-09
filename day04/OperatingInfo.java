package day04;

public class OperatingInfo {
    
    public static void main(String[] args) {
        System.out.println("Operating Systems: " + System.getProperty("os.name"));
        System.out.println("Operating System Version: " + System.getProperty("os.version"));
        System.out.println("Operating System Architecture: " + System.getProperty("os.arch"));
        System.out.println("User Name: " + System.getProperty("user.name"));
        System.out.println("User Home: " + System.getProperty("user.home"));
        System.out.println("User Directory: " + System.getProperty("user.dir"));
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));

    }
}
