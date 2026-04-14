/* tawarin mau daftar member / ga, klo iya isi data diri. klo sudah lanjut belanja
klo ga brrti langsung lanjut belanja
belanja -> diskon
aturan awal member
aturan akhir belanja
Inimaret adalah sebuah usaha retail yang menjual berbagai kebutuhan pokok.
Selain harganya yang lebih terjangkau, Inimaret juga menawarkan berbagai
keuntungan diskon melalui batas nominal belanja dan membership. Jika
pelanggan mendaftarkan membership, maka pelanggan cukup mengisi
identitas umum, seperti nama, alamat, dan nomor hp. Keuntungan diskon
berlaku bagi pelanggan member maupun non member. Beberapa ketentuannya adalah:

Belanja > 100.000, diskon 5%
Belanja > 300.000, diskon 10%
Terdaftar member, diskon 2%

misal member+ belanja 350k brrti dpt diskon 2%

Dari ketentuan di atas, Inimaret membutuhkan sebuah program sederhana
untuk memasukkan data belanja pelanggan serta menghitung total sekaligus
diskon yang diterima. Program tersebut harus memiliki fitur untuk input bebas
melalui keyboard dan memiliki struktur percabangan yang sesuai. */
import java.util.Scanner;
public class latihanpercabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //daftar member (nama alamat no hp) hanya utk daftar member
        String NamaMember="", AlamatMember="", NoHp="";
        String jawab = "";

        //transaksi belanja
        String namaBarang="";
        double Harga=0.0, Jumlah=0.0, Total=0.0, Diskon=0.0, GrandTotal=0.0;
        double PersenDiskon = 0.0;
        //ditanyakan dulu mau daftar member atau tidak. sdh masuk kondiai percabangan
        //berikan teks input
        System.out.print ("Apakah ingin mendaftar member? (Y/T): ");
        jawab = scanner.nextLine();

        // cek jawaban user, apakah jawabannya Y atau T menggunakan IF. jwb adlh variabel yg hrs diisi
        //equals = case sensitive (perhatikan kapital/tdknya)
        //equalsIgnoreCase= case non sensitive spy both kapital dan non kapital
        
        if (jawab.equalsIgnoreCase("y")) { //cek string = equals/equalsignorecase
            //alternatif: if (jawab.equals(anObject: "Y" || jawab.equals))
            //true / jwb Y
            System.out.print("nama anda: ");
            NamaMember = scanner.nextLine();
            System.out.print("alamat anda: ");
            AlamatMember = scanner.nextLine();
            System.out.print("no hp anda: ");
            NoHp = scanner.nextLine();

            System.out.print("ingin lanjut berbelanja? (Y/T): ");
            jawab = scanner.nextLine();

            if (jawab.equalsIgnoreCase("y")) {
                System.out.print("nama barang: ");
                namaBarang = scanner.nextLine();
                System.out.print(" harga: ");
                Harga = scanner.nextDouble();
                System.out.print("jumlah: ");
                Jumlah = scanner.nextDouble();
                
                System.out.println();
                Total = Harga * Jumlah;

            //hitung diskon
            if (Total > 300000.0) {
                PersenDiskon = 0.10 * 0.02;   
            } else if (Total > 100000.0) {
                PersenDiskon = 0.05;
            } else {
                PersenDiskon = 0.0; 
            }

            Diskon = Total * PersenDiskon;
            GrandTotal = Total - Diskon;

            System.out.println ("struk pembayaran");
            System.out.println("Nama barang: " + namaBarang);
            System.out.println("Total belanja: Rp " + Total);
            System.out.println("+Persen diskon: " + (PersenDiskon * 100) + "%");
            System.out.println("Diskon: " + Diskon);
            System.out.println("Grand Total: " + GrandTotal);

        } else {
            System.out.println("selamat berbelanja");
        }
    }

    scanner.close();
}
}
