package xyz.gauravsharma.patterns;

public class Pattern16 {
    public static void main(String[] args) {
        int rows = 5;
        char start = 'A';
        for (int i = 0; i <rows; i++) {
            for (int j =0; j<=i; j++) {
                System.out.print(start);
            }
            start++;
            System.out.println();
        }
    }
}
