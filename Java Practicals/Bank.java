import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("balance.txt"));
        int current_balance = sc.nextInt();
        System.out.println(current_balance);

    //create a new scanner for system input i.e to accept user input
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter amount to be deposited");
        int deposit_amount = sc1.nextInt();

        current_balance+=deposit_amount;

        System.out.println("Updated balance is: "+current_balance);
        //writing or updating new balance to the file
        FileOutputStream f = new FileOutputStream("balance.txt");
        int bal = current_balance;
        String s = Integer.toString(bal);
        byte b[] = s.getBytes();
        f.write(b);
        f.close();
        sc1.close();
    }
}
