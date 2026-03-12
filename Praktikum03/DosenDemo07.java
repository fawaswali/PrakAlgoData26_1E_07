package Praktikum03;
import java.util.Scanner;

public class DosenDemo07 {
    public static void main(String[] args) {
        Scanner fawas = new Scanner (System.in);
        String jenis, dummy;
        boolean jenisKelamin;

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = Integer.parseInt(fawas.nextLine());

        Dosen07[] arrayOfDosen = new Dosen07[jumlah];

       
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Dosen ke-" + (i+1));

            System.out.print("Kode : ");
            String kode = fawas.nextLine();

            System.out.print("Nama : ");
            String nama = fawas.nextLine();

            System.out.print("Jenis Kelamin : ");
            jenis = fawas.nextLine();
            if (jenis.equalsIgnoreCase("pria")) {
                jenisKelamin = true;
            } else {
                jenisKelamin = false;
            }

            System.out.print("Usia : ");
            int usia = Integer.parseInt(fawas.nextLine());

            arrayOfDosen[i] = new Dosen07(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n=== DATA DOSEN ===");

        
        for (Dosen07 d : arrayOfDosen) {
            d.cetakInfo();
        }


        DataDosen07 data = new DataDosen07();

        data.jumlahDosenPerJenisKelamin(arrayOfDosen);
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        data.infoDosenPalingTua(arrayOfDosen);
        data.infoDosenPalingMuda(arrayOfDosen);
    }
}
