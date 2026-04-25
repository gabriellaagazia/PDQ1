public class TotalPendapatan {
    public static void main (String[] args) {
        int jumlahhari = 3;
        int transaksiperhari = 3;
        int hargapertransaksi = 50000;
        int totalpendapatansemua = 0;

        //outer loop untuk hari
        for (int i = 1; i <= jumlahhari; i++) {
            System.out.println("hari " + i);
            int totalharian = 0;

            //inner loop untuk transaksi per hari
            for (int j = 1; j <= transaksiperhari; j++) {
                System.out.println("transaksi " + j + " = " + hargapertransaksi);
                totalharian += hargapertransaksi;
            }

            System.out.println("total " + totalharian);
            totalpendapatansemua += totalharian;

            System.out.println("---------------------");
        }

        System.out.println("total pendapatan 3 hari: " + totalpendapatansemua);
    }
}