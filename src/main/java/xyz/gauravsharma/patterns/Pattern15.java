package xyz.gauravsharma.patterns;

public class Pattern15 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i>0; i--) {
            char start = 'A';
            for (int j =0; j<i; j++) {
                System.out.print(start++);
            }
            System.out.println();
        }
    }
}
