package VarArgs;

public class VarArgs {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.varArgs(5, 2, 6);
    }

}

class Display {

    public void varArgs(int... a) {

        for (int i : a) {
            System.out.println(i);
        }
    }
}