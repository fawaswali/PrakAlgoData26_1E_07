package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo07 {
    public static void main(String[] args) {
        Scanner fawas = new Scanner(System.in);
        MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07();
        int jumMhs=5;

        for (int i = 0; i < jumMhs; i++) { //modif jobsheet 6 praktikum 1
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));

            System.out.print("NIM: ");
            String nim07 = fawas.nextLine();

            System.out.print("Nama: ");
            String nama07 = fawas.nextLine();

            System.out.print("Kelas: ");
            String kelas07 = fawas.nextLine();

            System.out.print("IPK: ");
            String ip = fawas.nextLine();
            double ipk07 = Double.parseDouble(ip);
            System.out.println("---------------------------------");

            Mahasiswa07 m = new Mahasiswa07(nim07, nama07, kelas07, ipk07);
            list.tambah(m);
        }

        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("----------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang ingin dicari: ");
        System.out.println("IPK: ");
        double cari = Double.parseDouble(fawas.nextLine());

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss= (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);



        //System.out.println("Data sebelum sorting:");
        //list.tampil();

        //list.bubbleSort();

        //System.out.println("Data setelah sorting (DESC):");
        //list.tampil();

        //System.out.println("Data yang sudah terurut menggunkan SELECTION SORT (ASC)");
        //list.SelectionSort();
        //list.tampil();

        //System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        //list.insertionSort();
        //list.tampil();

    }
}