import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class studyFile {
    
    public static void main(String[] args) throws IOException {

        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

        String path = "D:\\workspace\\teste3.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter (path, true))) {
            for (String Line: lines) {
                bw.write(Line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
