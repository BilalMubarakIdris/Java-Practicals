package LabeledBreak;

// import java.lang.*;

public class LabeleBreak {
    public static void main(String[] args) {

        bilal: for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {

                if (i == 3) {
                    break bilal;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
