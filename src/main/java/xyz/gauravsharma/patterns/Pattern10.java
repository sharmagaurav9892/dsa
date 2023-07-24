package xyz.gauravsharma.patterns;

public class Pattern10 {
    public static void main(String[] args) {
        int dr = 11;
        int rows = dr / 2;
        boolean odd = false;
        if (dr % 2 == 1) {
            odd = true;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (!(odd == true && i == rows))
                    System.out.print("*");
            }
            if (!(odd == true && i == rows))
                System.out.println();
        }
    }
}
