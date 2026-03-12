package P4;
import java.util.Scanner;
public class LaporanKeuanganMain07 {
    public static void main(String[] args) {
         String jumlahPerusahaan,namaPerusahaan;
         double keuntungan;
         double biayaOperasional;
         double pendapatanBulanan;
         Scanner fawas = new Scanner(System.in);
         
         LaporanKeuangan07[] arrayofkeuangan07 = new LaporanKeuangan07[3];

         
           // menginput biaya operasional dan pendapatan bulanan
           
           for (int i = 0; i < 3; i++) {
            
           
              System.out.print("Masukkan nama perusahaan: ");
                namaPerusahaan = fawas.nextLine();
                System.out.println("pendapatan bulanan");
                pendapatanBulanan = fawas.nextDouble();
                System.out.println("biaya operasional");
                biayaOperasional=fawas.nextDouble();
         
                 keuntungan = pendapatanBulanan - biayaOperasional;
                
            //meghitung keuntungan,rata-rata,presentase
            double ratakeuntungan= keuntungan;
            double presentasekeuntungan= keuntungan;
           
         
            System.out.println("hitung keuntungan :" + keuntungan);
            System.out.println("presentase keuntungan :" + keuntungan );
           }

            
         
         


    }
}
