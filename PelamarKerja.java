/* Input Data Pelamar Kerja
Sistem rekrutmen meminta HR memasukkan data pelamar kerja.
Setelah setiap input, sistem menanyakan apakah masih ada pelamar lain
yang ingin dimasukkan dengan pilihan 'Y' atau 'T'. Setelah proses selesai,
program menampilkan jumlah pelamar yang telah didaftarkan.

*/

import java.util.Scanner; //masukkan kelas spy program membaca input pengguna dari keyboard (System.in)

public class PelamarKerja { //nama kelas harus sm seperti nama file
    public static void main(String[] args) { //pintu masuk program sbg pembuka sblm alur proses
        
        Scanner input = new Scanner(System.in); //Membuat objek baru bernama input u menjalankan fungsi scanner yang sudah dimsukkan
        // input data pelamar kerja/variabel

        int jumlahpelamar = 0; //mulai dari 0 u menghitung brp banyak pelamar. int krn angka bulat
        String nama, email, posisi, jwb; //string krn bentukannya teks/simbol
        int pengalaman; //agnka bulat tahun pengalaman

        System.out.println("==sistem input data pelamar==");
        
        do { //pake do while krn sistem minimal berjalan 1x sebelum mengecek apakah pengguna ingin mengulang atau tidak.
            System.out.println("Data pelamar ke-" + (jumlahpelamar+1)); //Setiap satu putaran selesai, angka pelamar bertambah satu.
            System.out.print("Masukkan nama lengkap: ");
            nama = input.nextLine(); //Mengambil input teks lengkap (termasuk spasi).

            System.out.print("Masukkan alamat email: ");
            email = input.nextLine();

            System.out.print("Masukkan posisi yang dilamar: ");
            posisi = input.nextLine();

            System.out.print("Tahun pengalaman kerja: ");
            pengalaman = input.nextInt();

            input.nextLine(); //klo tidak ada setelah pemilihan pelamar lain ingin dimasukkan atau tidak, akan error

            jumlahpelamar++; //dari jumlahpelamar = jumlahpelamar + 1 

            System.out.println ("----------------------------");
            System.out.println ("Nama: " + nama);
            System.out.println ("Email: " + email);
            System.out.println ("Posisi: " + posisi);
            System.out.println ("Pengalaman berapa tahun: " + pengalaman + " tahun");
            System.out.println ("----------------------------");

            System.out.print("Apakah masih ada pelamar lain yang ingin dimasukkan? (Y/T): ");
            jwb = input.nextLine(); //Menangkap jawaban pengguna (Y/T).

        } while (jwb.equalsIgnoreCase("Y")); //jika jwb y maka balik ke do
        
        System.out.println("-----------------------------");
        System.out.println("Total pelamar terdaftar: " + jumlahpelamar + " orang");
        System.out.println("-----------------------------");

        input.close(); //menutup scanner
        
    }
}