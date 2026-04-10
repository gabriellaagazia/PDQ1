import java.util.Scanner;

public class InimaretKasir {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //array hanya utk 5 barang
        String[]  namabarang = {null, null, null, null, null};
        int[] harga = {0, 0, 0, 0, 0};
        int[] jumlah  = {0, 0, 0, 0, 0};
        int[] subtotal = {0, 0, 0, 0, 0};

        int totalbelanja = 0;
        int jumlahterisi = 0; //pencatat jumlah input
        
        System.out.println("sistem penjualan INIMARET (max 5 barang)");

        //5 perulangan for (proses input)
        for (int i = 0; i < namabarang.length; i++) {
            System.out.println("barang ke-: " + (i+1) + "---");
            
            System.out.print("masukkan nama barang: ");
            namabarang[i] = input.next();
            
            System.out.print("masukkan harga: ");
            harga[i] = input.nextInt();

            System.out.print("masukkan jumlah: ");
            jumlah[i] = input.nextInt();
            
            //hitung subtotal per barang
            subtotal[i] = harga[i]*jumlah[i];
            totalbelanja += subtotal[i];
            jumlahterisi++; //barang berhasil diinput
            
            //cek jika sudah mencapai batas maks 5 barang
            if (i==4) {
                System.out.println("[SISTEM: Kapasitas Penuh!!]");
                break;
            }
            
            //fitur break pilihan berhenti di bawah 5 barang
            System.out.print("Tambah barang lagi? (y/n): ");
            String lagi = input.next();
            if (lagi.equalsIgnoreCase("n"))
                 break; // keluar dari loop jika user selesa
                
        }
    

    System.out.println("---------------------");
    System.out.println("STRUK PEMBAYARAN");
    System.out.println("---------------------");
    System.out.println("Item/subtotal");

    for (int j = 0; j < jumlahterisi; j++) {
    System.out.println(namabarang[j] + "\t" + jumlah [j] + "Rp" + subtotal[j]);
    }
    System.out.println("-----------------");
    System.out.println("Total belanja: Rp" + totalbelanja);
    System.out.println("-----------------");

    input.close();

    }
}


    

