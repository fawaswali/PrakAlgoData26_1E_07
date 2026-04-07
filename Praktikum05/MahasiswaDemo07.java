package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo07 {
    public static void main(String[] args) {
        Scanner fawas = new Scanner(System.in);
        MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07();

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));

            System.out.print("NIM: ");
            String nim = fawas.nextLine();

            System.out.print("Nama: ");
            String nama = fawas.nextLine();

            System.out.print("Kelas: ");
            String kelas = fawas.nextLine();

            System.out.print("IPK: ");
            double ipk = fawas.nextDouble();
            fawas.nextLine(); 

            Mahasiswa07 m = new Mahasiswa07(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data sebelum sorting:");
        list.tampil();

        list.bubbleSort();

        System.out.println("Data setelah sorting (DESC):");
        list.tampil();

        System.out.println("Data yang sudah terurut menggunkan SELECTION SORT (ASC)");
        list.SelectionSort();
        list.tampil();
    }
}