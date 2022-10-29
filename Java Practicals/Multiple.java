public class Multiple {
    public static void main(String[] args) {
        int arg1, arg2, result;
        arg1 = Integer.parseInt(args[0]);
        arg2 = Integer.parseInt(args[1]);
        result = arg1 + arg2;
        String resultString = Integer.toString(result);

        System.out.println("The Product of " + arg1 + " and " + " is: " + resultString);
    }
}
