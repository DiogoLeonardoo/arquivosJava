import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class BufferedReaderr {

    public static void main(String[] args) {

        String path = "D:\\workspace\\teste.txt";
        

        try(BufferedReader br = new BufferedReader(new FileReader(path)))  { 
            String line = br.readLine();

            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
            }   
        }
    }

