package CM2;

import java.util.Scanner;

public class MainPesanan07 {
    public static void main(String[] args) {
        Scanner fawas = new Scanner(System.in);

       DoubleLLAntrian07 antrian = new DoubleLLAntrian07();
        DoubleLLPesanan07 pesanan = new DoubleLLPesanan07();

        int pilih;

        do {
            System.out.println("================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = fawas.nextInt();
            fawas.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = fawas.nextLine();
                    System.out.print("No HP: ");
                    String hp = fawas.nextLine();
                    antrian.tambahAntrian(nama, hp);
                    break;

                case 2:
                    antrian.cetakAntrian();
                    break;

                case 3:
                    Pembeli07 p = antrian.hapusAntrian();
                    if (p != null) {

                        System.out.print("Kode Pesanan: ");
                        int kode = fawas.nextInt();
                        fawas.nextLine();

                        System.out.print("Nama Pesanan: ");
                        String np = fawas.nextLine();

                        System.out.print("Harga: ");
                        int harga = fawas.nextInt();

                        pesanan.tambahPesanan(new Pesanan07(kode, np, harga));

                        System.out.println(p.nama07 + " telah memesan " + np);
                    }
                    break;

                case 4:
                    pesanan.tampilPesanan();
                    break;

                case 0:
                    
                    break;

                default:
                    System.out.println("Pilihan salah!");
            }

        } while (pilih != 0);
    }
}
