import java.util.Scanner;

/*
Practice Example 11: Handle Negative Bank Deposits Using Exceptions
Practice example 11: Banking system, negative not allowed exception.



Write a java program that accepts a certain amount and deposits in your bank account.

It accepts the amount you want to deposit and then adds it to the current balance.

The challenge though is that if a user enters a negative amount i.e -200 it means that even though the user has deposited the amount, -200 will deduct the amount from the main balance.

To prevent the user from entering a negative value, we will create a NegativeNotAllowed exception.



Steps:

Accept the deposit amount from the user.

Check if the accepted amount is not negative.

If negative then throw a NegativeNotAllowed exception.

If positive, add it to the current+balance.
*/ 
public class BankDepositException {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10;
        
        System.out.println("Enter the amout to deposit: ");
        int deposit = sc.nextInt();
        
        try{
            if(deposit<1){
                throw new NegativeNotAllowed();
            }else{
                balance +=deposit;
                System.out.println("Updated Balance: " + balance);
            }
        }catch(NegativeNotAllowed e){
            System.err.println(e);
        }
        sc.close();
    }
}

class NegativeNotAllowed extends Exception{
    @Override
    public String toString() {
        return ("Negagtive value is not Allow!");
    }
}
