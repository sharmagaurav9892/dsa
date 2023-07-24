package xyz.gauravsharma.patterns;

public class Pattern11 {
    public static void main(String[] args) {
        int rows = 5;
        boolean startFlag = true;
        for (int i = 0; i < rows; i++) {
            boolean innerFlag = startFlag;
            for (int j = 0; j <= i; j++) {
                System.out.print(innerFlag == true ? "1 " : "0 ");
                innerFlag = !innerFlag;
            }
            startFlag = !startFlag;
            System.out.println();
        }
    }
}
