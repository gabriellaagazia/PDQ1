import java.util.Scanner;
public class latihanLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 
        1. Entri Data
        2. Print Data

        Harus hitung total belanja, dimana menu bisa > 5
        */
       // variabel diatas do kek integer dll
       int menu, total = 0, harga = 0, jumlah = 0, iterasi = 0;
       String namabarang="", jwb="";

        // menu bisa diulang while/do while

        do {
            System.out.println("1. Entri data");
            System.out.println("2, Print  data");
            System.out.println("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            //percabangan menu>> switch case. // break ada jeda antara case 1 & 2
            switch (menu) {
                case 1:
                    System.out.println("===Entri Data===");
                    while (!jwb.equals("n")) {
                    System.out.print("nama barang: ");
                    namabarang = sc.nextLine();
                    iterasi = sc.nextInt();
                    sc.nextLine();
                    for (int i = 1; i iterasi i++) {
                        //input
                        System.out.println("Data ke -"+i);
                        System.out.println("Nama barang: ");
                        namabarang = sc.nextLine();

                    }
                    break;

                case 2:

                    break;
                
                default:
                    //memberhentikan program
                    System.exit(0);
                    break;
                    
            }
            
        } while (true);
    }
}