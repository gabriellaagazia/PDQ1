//1. import class
import java.util.Scanner;
public class latihanScanner {
     public static void main(String [] args) {
          //2. Deklarasi scanner
          Scanner ac = new Scanner(System.in);

          //3. Input deklarasi variabel
          // value dlm variabel harus diberikan nilai default
          String namaBarang ="";
          int harga = 0, jumlahBeli = 0, total = 0;

          // teks input
          System.out.print( "Nama Barang : ");
          namaBarang = ac.nextLine();
          System.out.println( "Harga : ");
          harga = ac.nextInt(); //nextint utk integer
          System.out.println( "Jumlah Beli : ");
          jumlahBeli = ac.nextInt();

          System.out.println(); //utk jarak baris baru kosong

          //4. Output
          total = harga*jumlahBeli;
          System.out.println("Total : " + total);

          //5. Close Scanner
          ac.close();
     }
}
