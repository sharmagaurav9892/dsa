package xyz.gauravsharma.patterns;

public class Pattern18 {
    public static void main(String[] args) {
        int rows = 5;
        char start = (char) (65+rows-1);
        for (int i = 0; i <rows; i++) {
            char ic = start;
            for (int j =0; j<=i; j++) {
                System.out.print(ic++ + " ");
            }
            start--;
            System.out.println();
        }
    }
}
