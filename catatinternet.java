/* 
tolong buatkan program java dari soal 3 yang memeiliki ketentuan:
array 1 dimensi, percabangan if/switch (menyesuaikan soal), loop for
soal 3:
buatlah sebuah program untuk mencatat penggunaan internet harian. User perlu
mengisi jumlah hari pemakaian terlebih dahulu yang disimpan dalam sebuah variabel (minimal 7 hari)
selanjutnya untuk nama hari dan jumlah pemakaian (dalam satuan GB) diisi dan disimpan dalam
array 1 dimensi. program harus mengkategorikan jumlah pemakaian per hari, sesuai dengan ketentuan berikut:
- jika pemakaian >= 15 GB, maka berada pada kategori "tinggi"
- jika pemakaian >= 8 GB, maka berada pada kategori "sedang"
- jika pemakaian < 8 GB, maka berada pada kategori "rendah"
*/

import java.util.Scanner;

public class catatinternet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahhari;
        do {
            System.out.print("input jumlah hari pemakaian internet (minimal 7): ");
            jumlahhari = sc.nextInt();
            if (jumlahhari < 7) {
                System.out.println("input hari hanya bisa dilakukan minimal 7 hari. silahkan coba lagi");
            }
        } while (jumlahhari < 7);

        String[] namahari = new String[jumlahhari];
        double[] pemakaianGB = new double[jumlahhari];

        for (int i = 0; i < jumlahhari; i++) {
            System.out.println("dataa hari ke-" + (i + 1));
            System.out.println("nama hari: ");
            namahari[i] = sc.next();
            System.out.println("masukkan jumlah pemakaian (GB): ");
            pemakaianGB[i] = sc.nextDouble();

        }

        System.out.println("rangkuman penggunaan internet");
        System.out.println("hari\t\tpemakaian (GB)\tkategori");

        for (int i = 0; i < jumlahhari; i++) {
            String kategori;

            if (pemakaianGB[i] >= 15) {
                kategori = "tinggi";
            } else if (pemakaianGB[i] >= 8) {
                kategori = "sedang";
            } else {
                kategori = "rendah";
            }

            System.out.println(namahari[i] + "\t\t" + pemakaianGB[i] + "\t\t" + kategori);
        }

        sc.close();

    }
}
