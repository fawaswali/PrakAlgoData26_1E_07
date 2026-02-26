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

       for (int i = 0; i < 3; i++) {
        System.out.println("Data Mahasiswa ke-" + (i+1));
        System.out.println("NIM : " + arrayOfMahasiswa07[i].nim);
        System.out.println("Nama : " + arrayOfMahasiswa07[i].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa07[i].kelas);
        System.out.println("IPK : " + arrayOfMahasiswa07[i].ipk);
        System.out.println("--------------------------------------");
        
       }
        

    }
}
