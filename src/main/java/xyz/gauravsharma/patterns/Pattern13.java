package xyz.gauravsharma.patterns;

public class Pattern13 {
    public static void main(String[] args) {
        int rows = 5;
        int count=0;
        for (int i = 0; i <rows; i++) {
            for (int j =0; j<=i; j++) {
                System.out.print(++count +" ");
            }
            System.out.println();
        }
    }
}
