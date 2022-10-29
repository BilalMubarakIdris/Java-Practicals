package Patterns;

public class Patterns {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("===============================================");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                    // System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        System.out.println("===============================================");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                int k = i + j - 1;
                if (k > 4) {
                    System.out.print(k - 4 + " ");
                } else {
                    System.out.print(k + " ");
                    // System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        System.out.println("===============================================");
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print(j + " ");
                if (j == 4) {
                    for (int k = 1; k < i; k++) {
                        System.out.print(k + " ");
                    }
                }
            }
            System.out.println(" ");
        }
        System.out.println("===============================================");
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("===============================================");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("===============================================");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }

        System.out.println("===============================================");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
