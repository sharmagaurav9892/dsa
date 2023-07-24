package xyz.gauravsharma.patterns;

public class Pattern9 {
    public static void main(String[] args) {
        int dr = 10;
        int rows = dr / 2;
        boolean odd = false;
        if (dr % 2 == 1) {
            odd = true;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < rows - i; j++) {
                if (!(odd == true && i == rows))
                    System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                if (!(odd == true && i == rows))
                    System.out.print("*");
            }
            if (!(odd == true && i == rows))
                System.out.println();
        }
    }
}
