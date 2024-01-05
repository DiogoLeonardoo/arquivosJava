import java.util.Scanner; 
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class informationFile {

        public static void main (String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a folder path: ");
            String strPath = sc.nextLine();

            File path = new File(strPath);
            System.out.println("GETNAME: " + path.getName());
            System.out.println("GETPARENT: " + path.getParent());
            System.out.println("GETPATH: " + path.getPath());
            System.out.println("GETABSOLUTEPATH: " + path.getAbsolutePath());
            System.out.println("GETTOTALSPACE: " + path.getTotalSpace());
            System.out.println("GETFREESPACE: " + path.getFreeSpace());
            System.out.println("GETUSABLESPACE: " + path.getUsableSpace());



            sc.close();

            
        }
    
}
