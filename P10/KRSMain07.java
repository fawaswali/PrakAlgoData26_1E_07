package P10;

import java.util.Scanner;

public class KRSMain07 {
    public static void main(String[] args) {
        Scanner fawas= new Scanner(System.in);

        AntrianKRS07 antrian = new AntrianKRS07(10);

        int pilih;

        do {

            System.out.println("\n=== ANTRIAN KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Sudah Proses");
            System.out.println("8. Jumlah Belum Proses");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilih = fawas.nextInt();
            fawas.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("NIM : ");
                    String nim = fawas.nextLine();

                    System.out.print("Nama : ");
                    String nama = fawas.nextLine();

                    System.out.print("Prodi : ");
                    String prodi = fawas.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = fawas.nextLine();

                    Mahasiswa07 mhs =
                        new Mahasiswa07(nim, nama, prodi, kelas);

                    antrian.tambahAntrian(mhs);

                    break;

                case 2:
                    antrian.prosesKRS();
                    break;

                case 3:
                    antrian.lihatSemua();
                    break;

                case 4:
                    antrian.lihat2Terdepan();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    break;

                case 6:
                    System.out.println(
                        "Jumlah antrian: "
                        + antrian.getJumlahAntrian()
                    );
                    break;

                case 7:
                    System.out.println(
                        "Sudah proses KRS: "
                        + antrian.getJumlahProses()
                    );
                    break;

                case 8:
                    System.out.println(
                        "Belum proses KRS: "
                        + antrian.getBelumProses()
                    );
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak valid");
            }

        } while (pilih != 0);
    }
}
