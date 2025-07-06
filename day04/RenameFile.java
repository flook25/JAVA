package day04;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class RenameFile {
    
    public static void main(String[] args){
        File file = new File("test.txt");

        if (file.exists()) {
            file.renameTo(new File("test2.txt"));
            System.out.println("File renamed to test2.txt");
        } else {
        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write("Hello World!");
            writer.close();

            System.out.println("File renamed to test2.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

}
