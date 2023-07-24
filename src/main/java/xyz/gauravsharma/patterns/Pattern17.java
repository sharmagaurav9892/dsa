package xyz.gauravsharma.patterns;

public class Pattern17 {
    public static void main(String[] args) {
        int rows = 4;
        char start = 'A';
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i -1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j <= i-1) {
                    System.out.print(start++);
                } else {
                    System.out.print(start--);
                }
            }
            start = 'A';
            System.out.println();
        }
    }
}
