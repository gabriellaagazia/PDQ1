import java.util.Scanner;

public class array1dimensi {
    public static void main(String[] args) {
        /* buatlah program seperti dibawwah ini:
        pemecahan tiker surabayazoo

        1. input kategori dan harga
        2. input jumlah beli
        3. lihat total bayar
        4. keluar program

        pada menu 1. input data, terdiri atas kategori dan
        harga dengan isian bebas dari admin menggunakan array 1 dimensi.

        Kemudian pada menu 2, mengisi jumlah tiket yang dibeli.
        
        pada menu 3, dilakukan menghitung total bayar dari jumlah tiket
        yang dibeli (sekaligus print total bayar)
         */
        Scanner sc = new Scanner (System.in);

        //deklarasi variabel
        //kategori, harga isian bebas, total, jumlah beli
        String[] kategori = new String[1];
        int[] harga = new int[1];

        int total=0, jumlahbeli=0, pilihmenu=0, jumlahkategori=0;

        //loop menu
        do {
            System.out.println("Pemesanan tiket surabaya zoo");
            System.out.println("-----------------------------");
            System.out.println("1. Input kategori dan harga");
            System.out.println("2. Input jumlah beli tiket");
            System.out.println("3. Lihat total bayar");
            System.out.println("4. Keluar program");
            System.out.println("Pilih menu: ");
            pilihmenu = sc.nextInt();

            switch (pilihmenu) {
                case 1:
                    //input kategori & harga array >> 1d
                    System.out.print("Jumlah kategori yang diisi: ");
                    jumlahkategori = sc.nextInt();
                    sc.nextLine();

                    //deklarasi ulang array utk menambhakan jumlah elemen arraynya
                    kategori = new String[jumlahkategori];
                    harga = new int[jumlahkategori];
                    
                    //input data array >> loop (for)
                    for (int i = 0; i < jumlahkategori; i ++) {
                        System.out.print("nama kategori ke- " + (i+1) + ": ");
                        kategori[i] = sc.nextLine();
                        System.out.print("harga: ");
                        harga[i] = sc.nextInt();
                        sc.nextLine();
                    }
                    System.out.println("data tersimpan!");
                    break;

                case 2:
                    if (jumlahkategori == 0) {
                        System.out.println("isi menu 1 dahulu!");
                    } else {
                    System.out.println("masukkan jumlah beli: ");
                    jumlahbeli = sc.nextInt();
                    total = harga[0] * jumlahbeli;
                    System.out.println("input jumlah beli berhasil");
                    }
                    break;

                case 3:
                    System.out.println("total bayar untuk " + jumlahbeli + "tiket: Rp " + total);
                    break;
                    //tampilan total bayar
                    
                case 4:
                    System.out.println("terima kasih! keluar dari program..");
                    break;

                default:
                    System.out.println("menu tidak tersedia");
                    break;
            }
        } while ((pilihmenu != 4));
        
        sc.close();
    }
}
    
