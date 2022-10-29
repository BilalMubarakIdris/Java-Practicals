import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamBuffer {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        System.out.println("Type something here");
        try {
            String sentence = reader.readLine();
            System.out.println(sentence);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Concise code 

// BufferedReader reader = new BufferedReader(new InputStreamReader(System.in);



// int x = Integer.parseInt(reader.readLine());

// String s = reader.readLine();
