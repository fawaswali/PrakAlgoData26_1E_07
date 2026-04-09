package Praktikum05;

import java.util.Scanner;

public class DosenDemo07 {
    public static void main(String[] args) {
        Scanner fawas = new Scanner(System.in);
        DataDosen07 list = new DataDosen07();

        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Termuda → Tertua)");
            System.out.println("4. Sorting DSC (Tertua → Termuda)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = fawas.nextInt();
            fawas.nextLine();

            switch(pilih){
                case 1:
                    System.out.print("Kode: ");
                    String kd = fawas.nextLine();
                    System.out.print("Nama: ");
                    String nama = fawas.nextLine();
                    System.out.print("Jenis Kelamin (true=L / false=P): ");
                    String inputJK = fawas.nextLine();
                    boolean jk;
                    if (inputJK.equalsIgnoreCase("L")) {
                        jk = true;
                    } else {
                        jk = false;
                    }
                    System.out.print("Usia: ");
                    int usia = fawas.nextInt();
                    fawas.nextLine();

                    Dosen07 d = new Dosen07(kd, nama, jk, usia);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("Data setelah sorting ASC:");
                    list.tampil();
                    break;

                case 4:
                    list.sortingDSC(); 
                    System.out.println("Data setelah sorting DSC:");
                    list.tampil();
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while(pilih != 0);


        do {System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan Denda ");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            switch (pilih) {
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;

                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    break;
                
            
                default:
                    break;
            }
            
        } while ( );
    }
}
