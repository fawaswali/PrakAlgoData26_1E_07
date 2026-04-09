package CM1;

import java.util.Scanner;

public class MainPinjam {
    public static void main(String[] args) {
        Scanner fawas = new Scanner(System.in);
        int pilih;

        // data mahasiswa
        Mahasiswa07[] mhs = {
            new Mahasiswa07("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa07("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa07("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // data buku
        Buku07[] buku = {
            new Buku07("B001", "Algoritma", 2020),
            new Buku07("B002", "Basis Data", 2019),
            new Buku07("B003", "Pemrograman", 2021),
            new Buku07("B004", "Fisika", 2024)
        };

        // data peminjaman
        Peminjaman07[] pinjam = {
            new Peminjaman07(mhs[0], buku[0], 7),
            new Peminjaman07(mhs[1], buku[1], 3),
            new Peminjaman07(mhs[2], buku[2], 10),
            new Peminjaman07(mhs[2], buku[3], 6),
            new Peminjaman07(mhs[0], buku[1], 4)
        };

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan berdasarkan Denda");
            System.out.println("5. Cari berdasarkan NIM (Binary Search)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = fawas.nextInt();
            fawas.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for (Mahasiswa07 m : mhs) {
                        m.tampilMahasiswa();
                    }
                    break;
                case 2:

                    System.out.println("\nDaftar Buku:");
                    for (Buku07 b : buku) {
                        b.tampilbuku();
                    }
                    break;

                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (Peminjaman07 p : pinjam) {
                        p.tampil();
                    }
                    break;

                case 4:
                    // Insertion Sort (descending denda)
                   
                    for (int i = 1; i < pinjam.length; i++) {
                        Peminjaman07 temp = pinjam[i];
                        int j = i - 1;

                        while (j >= 0 && pinjam[j].denda07 < temp.denda07) {
                            pinjam[j + 1] = pinjam[j];
                            j--;
                        }
                        pinjam[j + 1] = temp;
                    }

                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    for (Peminjaman07 p : pinjam) {
                        p.tampil();
                    }
                    break;

                case 5:
                    //  diurutkan berdasarkan NIM untuk Binary Search
                    for (int i = 0; i < pinjam.length - 1; i++) {
                        for (int j = i + 1; j < pinjam.length; j++) {
                            if (pinjam[i].mhs.nim07.compareTo(pinjam[j].mhs.nim07) > 0) {
                                Peminjaman07 temp = pinjam[i];
                                pinjam[i] = pinjam[j];
                                pinjam[j] = temp;
                            }
                        }
                    }

                    System.out.print("Masukkan NIM: ");
                    String cari = fawas.nextLine();

                    int left = 0, right = pinjam.length - 1;
                    boolean ketemu = false;

                    while (left <= right) {
                        int mid = (left + right) / 2;

                        if (pinjam[mid].mhs.nim07.equals(cari)) {
                            pinjam[mid].tampil();
                            ketemu = true;
                            break;
                        } else if (pinjam[mid].mhs.nim07.compareTo(cari) < 0) {
                            left = mid + 1;
                        } else {
                            right = mid - 1;
                        }
                    }

                    if (!ketemu) {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 5);
    }
}