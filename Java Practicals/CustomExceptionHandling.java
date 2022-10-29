public class CustomExceptionHandling {
    public static void main(String[] args) {
        int age = 15;

        try{
            if(age < 18){
                throw new NotAnAdultException();
            }
        }catch(NotAnAdultException e){
            System.out.println(e);
        }
    }
}
