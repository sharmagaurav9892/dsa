package xyz.gauravsharma.patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int rows =5;
        for(int i=rows;i>0;i--) {
            for(int j=0; j<rows-i;j++) {
                System.out.print(" ");
            }
            for(int j=0; j<2*i - 1 ;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
