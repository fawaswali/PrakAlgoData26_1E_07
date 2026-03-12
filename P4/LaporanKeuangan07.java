package P4;

public class LaporanKeuangan07 {
    String namaPerusahaan;
    double pendapatanBulanan;
    double biayaOperasional;
    double Jumlah;
    double keuntungan;

   //public hitungKeuntungan(String namaPerusahaan,double pendapatanBulanan,double biayaOperasional, double jumlah){
        //this.namaPerusahaan=namaPerusahaan;
        //this.pendapatanBulanan=pendapatanBulanan;
        //this.biayaOperasional=biayaOperasional;
        //this.Jumlah=jumlah;
   //}

   double hitungKeuntungan(){
        keuntungan = pendapatanBulanan - biayaOperasional;
        
   }

    void printData(){
        System.out.println("Nama Perusahaan " + namaPerusahaan);
        System.out.println("Pendapatan Bulanan " + pendapatanBulanan);
        System.out.println("Biaya operasional" + biayaOperasional);
    }
}
