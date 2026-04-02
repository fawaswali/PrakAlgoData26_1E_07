package Praktikum03;
import java.util.Scanner;
public class MataKuliahDemo07 {
    public static void main(String[] args) {
        Scanner fawas = new Scanner (System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = Integer.parseInt(fawas.nextLine());
        MataKuliah07[] arrayOfmataKuliah = new MataKuliah07[jumlah];
        String kode,nama,dummy;
        int sks,jumlahJam;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-"+ (i+1));
            System.out.print("Kode :");
            kode = fawas.nextLine();
            System.out.print("Nama : ");
            nama = fawas.nextLine();
            System.out.print("Sks :");
            dummy = fawas.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam :");
            dummy = fawas.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------------------");

           
            
            arrayOfmataKuliah[i] = new MataKuliah07("", "", 0, 0);
            arrayOfmataKuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

       

       for (int i = 0; i < jumlah; i++) {
       System.out.println("Data Mata Kuliah ke-" + (i+1));
       arrayOfmataKuliah[i].cetakInfo();
}
    }
}
