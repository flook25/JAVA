package day04;
import java.io.File;


public class RemoveFile {
    
    public static void main(String[] args){
        try {
            File file = new File("test2.txt");
            
            if(file.exists()){
                file.delete();
                System.out.println("File deleteted");
            } else {
                System.out.println("File does not exist");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
