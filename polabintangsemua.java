import java.util.Scanner;

public class polabintangsemua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan input kolom: ");
        int n = sc.nextInt();

        // no 1
        System.out.println("output nomor 1: ");
         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        // no 2
        System.out.println("output nomor 2: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        
        }
        //no 3
        System.out.println("output nomor 3: ");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        //no 4
        System.out.println("output nomor 4: ");
        for (int i = 1; i <= n; i++) {
            //loop spasi
            for (int j = 1;j <= n -i; j++) {
                System.out.print(" ");
            }
            //loop bintang
            for (int k = 1;k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

            sc.close();
        }
    }            
}
