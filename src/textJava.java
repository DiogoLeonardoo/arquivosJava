import java.io.File;
import java.util.Scanner;

public class textJava {

    public static void main(String[] args) {


    // Creating a new file
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // Listing the folders inside the path
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        // Listing the files inside the path
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        // Creating a new directory inside the path
        System.out.println("Enter a directory name");
        String subdir = sc.nextLine();
        boolean success = new File(strPath + "\\" + subdir).mkdir();
        System.out.println("Directory created successfully: " + success);

    }
}
