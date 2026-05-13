package P11;

import java.util.Scanner;

public class MainQueue07 {
    


    public static void main(String[] args) {
        Scanner fawas = new Scanner(System.in);
        QueueLL07 q = new QueueLL07();
        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Lihat Terdepan & Terakhir");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = fawas.nextInt();
            fawas.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = fawas.nextLine();
                    System.out.print("Nama: ");
                    String nama = fawas.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = fawas.nextLine();

                    Mahasiswaantri07 mhs = new Mahasiswaantri07(nim, nama, kelas);
                    q.enqueue(mhs);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.print();
                    break;

                case 4:
                    q.peekFront();
                    q.peekRear();
                    break;

                case 5:
                    q.jumlah();
                    break;

                case 6:
                    q.clear();
                    break;
            }
        } while (pilih != 0);
    }

}
