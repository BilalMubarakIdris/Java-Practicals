import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteData {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("demo.txt");
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(input);

        System.out.println("Write something to the file: ");
        String text = read.readLine();
        // String text = "this is message";
        byte[] convetToByte = text.getBytes();
        output.write(convetToByte);
        output.close();
    }
}
