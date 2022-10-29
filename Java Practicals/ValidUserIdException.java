/*
 * Practice Example 10: User Id Validation Using Exception Handling
Practice example 10:exception handling

Invalid user id exception



Write a program to accept a user_id value from the user.

If the user_id entered by the user is not equal to “1234”, the program should throw an InvalidUserIdException.

InvalidUserIdException is a custom created exception which will be created by us.

The InvalidUserIdException should return an exception message which says: Invalid user id entered
*/
import java.util.Scanner;

public class ValidUserIdException {
    public static void main(String[] args) {

        String userId = "1234";
        
        Scanner user = new Scanner(System.in);
        System.out.println("Enter Your ID: ");
        String newUserId = user.nextLine();

        try{
            if(!userId.equals(newUserId)){
                throw new InvalidUserIdException();
            }else{
                System.out.println("Welcome back");
            }
            user.close();
        }catch(InvalidUserIdException e){
            System.out.println(e);
        }
    }
}

class InvalidUserIdException extends Exception{
    public String toString(){
        return ("Wrong ID please try again");
    }
} 
