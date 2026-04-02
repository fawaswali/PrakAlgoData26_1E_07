package Praktikum03;
import java.util.Scanner;
public class MahasiswaDemo07 {
    public static void main(String[] args) {
        Scanner fawas = new Scanner(System.in);
        Mahasiswa07[] arrayOfMahasiswa07 = new Mahasiswa07[3];
        String dummy;

       for (int i = 0; i < 3 ; i++) {
        arrayOfMahasiswa07[i] = new Mahasiswa07();

        System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
        System.out.print("NIM :");
        arrayOfMahasiswa07[i].nim = fawas.nextLine();
        System.out.print("Nama :");
        arrayOfMahasiswa07[i].nama = fawas.nextLine();
        System.out.print("Kelas :");
        arrayOfMahasiswa07[i].kelas = fawas.nextLine();
        System.out.print("IPK :");
        dummy = fawas.nextLine();
        arrayOfMahasiswa07[i].ipk = Float.parseFloat(dummy);
        System.out.println("--------------------------------");
       }

       
       int i = 1;
        for (Mahasiswa07 mhs : arrayOfMahasiswa07) {
            System.out.println("Data Mahasiswa ke-" + i++);
            mhs.cetakInfo();
            System.out.println("--------------------------------------");
        }
        
      

    }
     
}
