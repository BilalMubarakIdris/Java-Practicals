import java.io.FileInputStream;
import java.io.IOException;

public class ReadData{
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("demo.txt");

        try {
            int result = file.read();
            while(result != -1){
                System.out.print((char)result);
                result = file.read();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        file.close();
    }
}