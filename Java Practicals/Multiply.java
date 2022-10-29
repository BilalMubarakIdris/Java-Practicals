public class Multiply {
    public static void main(String[] args) {
        int arg0;
        int arg1;
        int result;
        String resultString;

        try{
            arg0 = Integer.parseInt(args[0]);
            arg1 = Integer.parseInt(args[1]);
            result = arg0 * arg1;
            resultString = Integer.toString(result);
            System.out.println("The product of "+args[0] +" and " + args[1]+ " is " + resultString);
        }catch(NumberFormatException e){
            System.out.println("Both arguments must be Integer");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Two Integer are required");
        }
    }
}
