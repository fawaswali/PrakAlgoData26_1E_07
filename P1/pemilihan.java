package P1;
import java.util.Scanner;

public class pemilihan {

    public static void main(String[] args) {
        Scanner fawas = new Scanner(System.in);

        double ntugas,nkuis,nuts,nuas;
        String huruf;
        String keterangan;
        double nakhir;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas :");
        ntugas = fawas.nextDouble();
        System.out.print("Masukkan Nilai Kuis :");
        nkuis = fawas.nextDouble();
        System.out.print("Masukkan Nilai UTS :");
        nuts = fawas.nextDouble();
        System.out.print("Masukkan Nilai UAS :");
        nuas = fawas.nextDouble();


       if (ntugas < 0 || ntugas > 100 ||
        nkuis < 0 || nkuis > 100 ||
        nuts < 0 || nuts > 100 ||
        nuas < 0 || nuas > 100) {
        System.out.println("Nilai tidak valid");
        } else {
    
        }

        nakhir = (0.2 * ntugas) + (0.2 * nkuis) + (0.3 * nuts) + (0.4 * nuas);

        if (nakhir > 80) {
            huruf = "A";
        } else if (nakhir > 73) {
            huruf = "B+";
        } else if (nakhir > 65) {
            huruf = "B";
        } else if (nakhir > 60) {
            huruf = "C+";
        } else if (nakhir > 50) {
            huruf = "C";
        } else if (nakhir > 39) {
            huruf = "D";
        } else {
            huruf = "E";
        }

        if (nakhir > 50) {
            keterangan = "SELAMAT ANDA LULUS";
            
        } else {
            keterangan = "TIDAK LULUS";
        }

        System.out.println("=========================================");
        System.out.println("=========================================");
        System.out.println("nilai akhir : " + nakhir);
        System.out.println("Nilai Huruf : " + huruf);
        System.out.println("=========================================");
        System.out.println("=========================================");
        System.out.print(keterangan);







    }
}