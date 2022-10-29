public class NestedTryException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] c = new int[2];

        try{
            c[3] = 2;
            try{
                System.out.println(a/b);
            }catch(ArithmeticException e){
                System.out.println(e);
                System.out.println("divide " + a + " by " + b + " is not possible");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("the index you try to insert does't exit");
        }
    }
}
