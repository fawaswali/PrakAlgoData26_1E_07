package Jobsheet9;

import java.util.Scanner;

public class SuratDemo07 {
    public static void main(String[] args) {
        Scanner fawas = new Scanner(System.in);
        StackSurat07 stack = new StackSurat07(5);

        int pilih;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = fawas.nextInt();
            fawas.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = fawas.nextLine();
                    System.out.print("Nama: ");
                    String nama = fawas.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = fawas.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = fawas.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = fawas.nextInt();

                    stack.push(new surat07(id, nama, kelas, jenis, durasi));
                    System.out.println("Surat berhasil ditambahkan!");
                    break;

                case 2:
                    surat07 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat:");
                        System.out.println(proses.namaMahasiswa + " - " + proses.jenisIzin);
                    }
                    break;

                case 3:
                    surat07 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir:");
                        System.out.println(lihat.namaMahasiswa + " - " + lihat.jenisIzin);
                    } else {
                        System.out.println("Belum ada surat.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = fawas.nextLine();

                    if (stack.cari(cari)) {
                        System.out.println("Surat ditemukan!");
                    } else {
                        System.out.println("Surat tidak ditemukan.");
                    }
                    break;

                case 0:
                    System.out.println("Keluar program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);
    }
}
