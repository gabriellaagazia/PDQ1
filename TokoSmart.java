import java.util.Scanner;

public class TokoSmart {
    public static void main(String [] args) {
        // Inisialisasi Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Sistem Kasir Toko Smart Merr");

        // Tahap Input. value dlm nilai variabel harus diberikan nilai default. Klo koma pake double
        System.out.print("Masukkan Nama Barang : ");
        String namaBarang = input.nextLine();
        
        System.out.print("Masukkan Harga Barang : ");
        int hargaBarang = input.nextInt();

        System.out.print("Masukkan Jumlah Beli : ");
        int jumlahBeli = input.nextInt();

        //Tahap Proses (Perhitungan)
        double totalBayar = hargaBarang * jumlahBeli;

        //Tahap Output
        System.out.println("========================");
        System.out.println(" Struk Belanja Toko Smart ");
        System.out.println("========================");
        System.out.println("Nama Produk : " + namaBarang);
        System.out.println("Harga Satuan: Rp" + hargaBarang);
        System.out.println("Jumlah : " + jumlahBeli);
        System.out.println("TOTAL BAYAR : Rp " + totalBayar);
        System.out.println("Terima kasih telah berbelanja!");

        input.close(); // Menutup scanner
        
    }
}
