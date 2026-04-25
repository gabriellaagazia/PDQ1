import java.util.Scanner;

public class latihanarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();
        int[] angka = new int[jumlah];

         for (int i = 0; i < jumlah; i++) {
            System.out.print("angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        int pilihan = 0;
        while (pilihan != 4) {
            System.out.println("1. Cari nilai tertinggi");
            System.out.println("2. Cari angka");
            System.out.println("3. tampilkan reverse");
            System.out.println("4. Keluar");
            System.out.println("pilih menu (1-4): ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                int tertinggi = angka[0];
                for (int i = 1; i < angka.length; i++) {
                    if (angka[i] > tertinggi) tertinggi = angka[i];
                }
                System.out.println("hasil nilai tertinggi adalah" + tertinggi);

            } else if (pilihan == 2) {
                System.out.print("masukkan angka yang dicari: ");
                int cari = input.nextInt();
                boolean ditemukan = false;
                for (int x : angka) {
                    if (x == cari) {
                        ditemukan = true;
                        break;
                    }
                }
                System.out.println("Hasil angka " + cari + (ditemukan ? "ditemukan" : "tidak ditemukan"));

            } else if (pilihan == 3) {
                System.out.print("hasil terbaik: ");
                for (int i = angka.length - 1; i>=0; i--) {
                    System.out.print(angka[i] + " ");
                }
                System.out.println();

            } else if (pilihan == 4) {
                System.out.println("terima kasih! program.");
        
            } else {
            System.out.println("pilihan tidak valid, silahkan coba lagi");
            }
        }
    input.close(); 
    }
    
}