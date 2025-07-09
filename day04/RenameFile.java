package day04;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class RenameFile {
    
    public static void main(String[] args){
        File file = new File("test.txt");

        if (file.exists()) {
            // run another time  will do at this point
            file.renameTo(new File("test2.txt"));
            System.out.println("File renamed to test2.txt");
        } else {
            // run the fist time becaue file never have it before
        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write("Hello World!");
            writer.close();

            file.renameTo(new File("test2.txt"));

            System.out.println("File renamed to test2.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

}
