public class ThrowException {
    public static void main(String[] args) {
        int age = 15;

        try{
            if(age < 18){
                throw new ArithmeticException("You are not an Adult");
            }
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
