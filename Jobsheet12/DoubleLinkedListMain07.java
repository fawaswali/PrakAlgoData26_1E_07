package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain07 {

    public static Mahasiswa07 inputMahasiswa(Scanner fawas) {
        System.out.print("NIM   : ");
        String nim = fawas.nextLine();

        System.out.print("Nama  : ");
        String nama =fawas.nextLine();

        System.out.print("Kelas : ");
        String kelas =fawas.nextLine();

        System.out.print("IPK   : ");
        double ipk =fawas.nextDouble();
       fawas.nextLine(); 
        return new Mahasiswa07(nim, nama, kelas, ipk);
    }
    public static void main(String[] args) {
        Scanner fawas = new Scanner(System.in);
        DoubleLinkedList07 list = new DoubleLinkedList07();
        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah setelah NIM");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = fawas.nextInt();
            fawas.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa07 mhsAwal = inputMahasiswa(fawas);
                    list.addFirst(mhsAwal);
                    break;

                case 2:
                    Mahasiswa07 mhsAkhir = inputMahasiswa(fawas);
                    list.addLast(mhsAkhir);
                    break;

                case 3:
                   System.out.print("Masukkan NIM yang dicari : ");
                   String keyNim = fawas.nextLine();
                   System.out.println("Masukkan data baru: ");
                   Mahasiswa07 dataBaru = inputMahasiswa(fawas);
                   list.insertAfter(keyNim, dataBaru); 
                   break;

                    
                case 4:
                    list.removeFirst();
                    break;

                case 5:
                    list.removeLast();
                    break;
                
                case 6:
                    list.print();
                    break;

                case 0:
                    System.out.println("program selesai.");
                    break;

                default:
                    System.out.println();
            }

        } while (pilihan != 0);
        fawas.close();
    }
}
