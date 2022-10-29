package enhaceForLoop;

public class Enhence {
    public static void main(String[] args) {
        int a[][][] = new int[4][4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    a[i][j][k] = i + j + k;
                }
            }
        }

        for (int i[][] : a) {
            for (int j[] : i) {
                for (int k : j) {
                    System.out.print(" " + k);
                }
            }
        }
    }
}
