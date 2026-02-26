package Praktikum03;
import java.util.Scanner;
public class MataKuliahDemo07 {
    public static void main(String[] args) {
        Scanner fawas = new Scanner (System.in);
        MataKuliah07[] arrayOfmataKuliah = new MataKuliah07[3];
        String kode,nama,dummy;
        int sks,jumlahJam;

        for (int i = 0; i < 3; i++) {
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

            arrayOfmataKuliah[i] = new MataKuliah07(kode, nama, sks, jumlahJam);

        }
    }
}
