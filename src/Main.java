import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // Hình chữ nhật

        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // Hình tam giác:

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }


        // vẽ tam giác cân
        for (int i = 1; i <= 5; i++) {
            for (int j = 5 - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // Bảng cửu chương
        System.out.println("Multiplication Table");
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%dx%d=%-5d", j, i, j*i);

            }
            System.out.println();
        }
    }
}


