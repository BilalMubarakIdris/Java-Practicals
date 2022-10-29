package ExceptionHandling;

public class HandlingException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("can't be divide by zero");
        }
    }
    
}
