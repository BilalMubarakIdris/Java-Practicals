package terminalProgram;
public class Terminal {
    public static void main(String[] args){
        String toString;
        int arg1;
        int arg2;
        int result;
        arg1 = Integer.parseInt(args[0]);
        arg2 = Integer.parseInt(args[1]);
        result = arg1 + arg2;
        toString = Integer.toString(result);

        System.out.println("The sum of " + arg1 + " and " + arg2 + " is " + toString);
    }
}
