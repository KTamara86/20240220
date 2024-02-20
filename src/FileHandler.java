import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandler {
    Scanner sc;
    public void readFile(){
        try {
            tryreadFile();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! A fájl nem található");
            System.err.println(e.getMessage());
        }
    }

    public void tryreadFile() throws FileNotFoundException{
            File file = new File("fembt.txt");
            sc = new Scanner(file);
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }    
        
    }
}
