package xyz.gauravsharma.patterns;

public class Pattern12 {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            for (int j = rows ; j>i; j--) {
                System.out.print(" ");
            }
            for (int j = rows ; j>i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j>=1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
