/* Input Data Pelamar Kerja sistem rekrutmen meminta
HR memasukkan data pelamar kerja. Setelah setiap input,
sistem menanyakan apakah masih ada pelamar lain yang ingin
dimasukkan dengan pilihan 'Y' atau 'T'. Setelah proses selesai,
program menampilkan jumlah pelamar yang telah didaftarkan.
*/

import java.util.Scanner; //supaya program dapat membaca input pengguna

public class PelamarKerja2 {
    public static void main(String[] args) { //pintu pembuka

        Scanner input = new Scanner(System.in); // membuat objek baru bernama input

        //variabel
        int jumlahpelamar = 0; //menghitung berapa banyak pelamar yang perlu dimasukkan, int karena dia nilainya bulat
        String nama, email, posisi, jwb; //teks/simbol
        int pengalaman; //int karena angka bulat

        System.out.println("==Sistem input data pelamar==");

        do { //batasnya unlimited tidak seperti for yang sudah diketahui dari awal
            System.out.println("Data pelamar ke-" + (jumlahpelamar+1));
            System.out.print("Masukkan nama lengkap: ");
            nama = input.nextLine(); //mengambil teks input lengkap

            System.out.print("masukkan nama email: ");
            email = input.nextLine();

            System.out.print("masukkan posisi yang ingin dilamar: ");
            posisi = input.nextLine();

            System.out.print("Tahun pengalaman kerja: ");
            pengalaman = input.nextInt();

            input.nextLine(); //untuk menghilangkan error nama dan email bergabung

            jumlahpelamar++; // dari jumlahpelamar + 1

            System.out.println ("--------------------------");
            System.out.println ("Nama pelamar: " + nama);
            System.out.println ("Email pelamar: " + email);
            System.out.println ("Posisi yang diinginkan oleh pelamar: " + posisi);
            System.out.println ("Pengalaman berapa tahun: " + pengalaman + " tahun");
            System.out.println ("--------------------------");

            System.out.print("Apakah masih ada pelamar lain yang ingin dimasukkan? (Y/T): ");
            jwb = input.nextLine(); //spy dapat menangkap jwbn pengguna

        } while (jwb.equalsIgnoreCase("Y"));

        System.out.println("------------------------");
        System.out.println ("total pelamar terdaftar: " + jumlahpelamar + " orang");
        System.out.println ("-----------------------");

        input.close();

    }
    
}
