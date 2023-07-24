package xyz.gauravsharma.patterns;

public class Pattern19 {
    public static void main(String[] args) {
        int rows = 10;
        int r = rows / 2;
        for (int i = 0; i < r; i++) {

            for (int j = r; j > i; j--) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = r; j > i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }


        for (int i = 0; i < r; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < r - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < r - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
