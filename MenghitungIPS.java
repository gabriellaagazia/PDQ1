// Buatlah program untuk menghitung IP
/*semester mahasiswa (lihat buku pedoman akademik)
dan tentukan jumlah SKS maksimal yang harus dipenuhi
oleh mahasiswa dari IP yang didapatkan.

Berikut aturan jumlah SKS dari IP tertentu:
IPS         |   Beban Belajar Maksimal (Satuan Kredit Semester)
>= 3,50     |   24
3,00-3,49   |   22
2,00 - 2,99 |   20
< 2,00      |   18

Catatan: push hasil pekerjaan anda di repository github
yang sudah dibuat di kelas, dan upload link repo github
anda di assignment ini (maks. pukul 13:00)
public class Menghitung IP Smster*/

/*switch case klo nilai tetap, klo berubah pakai if*/
import java.util.Scanner;

public class MenghitungIPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("``Klasifikasi IPS Mahasiswa``");

        //INPUT nama, nim, semester, IPS
        System.out.print("Masukkan nama Mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();

        System.out.print("Masukkan NIM: ");
        String NIM = scanner.nextLine();

        System.out.print("Masukkan Semester: ");
        Integer Semester = scanner.nextInt();

        System.out.print("Masukkan IPS: ");
        double IPS = scanner.nextDouble();

        //PROSES IF ELSE
        Integer bebanMaksimal;
        String predikat;

        int poinUtama = (int) IPS;

        switch (poinUtama) {
            case 4:
            bebanMaksimal = 24;
            predikat = "Sangat Baik";
            break;

            case 3:
            //menggunakan IF dlm case
            if (IPS>=3.50) {
                bebanMaksimal = 24;
                predikat = "Sangat Baik";
            } else {
                bebanMaksimal = 22;
                predikat = "Baik";
            }
            break;

        case 2:
            bebanMaksimal = 20;
            predikat = "Cukup";
            break;
        
        default:
            //dibawah ips 2.00
            bebanMaksimal = 18;
            predikat = "Kurang";
            break;
    }

    System.out.println("===================");
    System.out.println("KARTU HASIL STUDI");
    System.out.println("===================");
    System.out.println("Nama Mahasiswa: " + namaMahasiswa);
    System.out.println("NIM Mahasiswa: " + NIM);
    System.out.println("semester: " + Semester);
    System.out.println("IPS: " + IPS);
    System.out.println("-===================");
    System.out.println("Predikat: "+ predikat);
    System.out.println("Max beban SKS: " + bebanMaksimal + "SKS");
    System.out.println("===================");

    //Close scanner
    scanner.close();
    }
}


