package Jobsheet16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class MainNilai {

    public static void main(String[] args) {

        Scanner fawas = new Scanner(System.in);

        ArrayList<Mahasiswa07> daftarMhs = new ArrayList<>();
        ArrayList<MataKuliah07> daftarMK = new ArrayList<>();
        ArrayList<Nilai07> daftarNilai = new ArrayList<>();
        

        daftarMhs.add(new Mahasiswa07("20001", "Thalhah", "021xxx"));
        daftarMhs.add(new Mahasiswa07("20002", "Zubair", "021xxx"));
        daftarMhs.add(new Mahasiswa07("20003", "Abdur-Rahman", "021xxx"));
        daftarMhs.add(new Mahasiswa07("20004", "Sa'ad", "021xxx"));
        daftarMhs.add(new Mahasiswa07("20005", "Sa'id", "021xxx"));
        daftarMhs.add(new Mahasiswa07("20006", "Ubaidah", "021xxx"));

        daftarMK.add(new MataKuliah07("00001", "Internet of Things", 3));
        daftarMK.add(new MataKuliah07("00002", "Algoritma dan Struktur Data", 2));
        daftarMK.add(new MataKuliah07("00003", "Algoritma dan Pemrograman", 2));
        daftarMK.add(new MataKuliah07("00004", "Praktikum Algoritma dan Struktur Data", 3));
        daftarMK.add(new MataKuliah07("00005", "Praktikum Algoritma dan Pemrograman", 3));

        Queue<Mahasiswa07> antrianHapus = new LinkedList<>();

        for(Mahasiswa07 m : daftarMhs){
        antrianHapus.add(m);
}

        int pilih;

        do {

            System.out.println("****************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("****************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Mahasiswa");
            System.out.println("6. Keluar");
            System.out.println("****************");

            System.out.print("Pilih : ");
            pilih = fawas.nextInt();

            switch (pilih) {

                case 1:

                    System.out.println("Masukkan data");

                    System.out.print("Kode : ");
                    String kode = fawas.next();

                    System.out.print("Nilai : ");
                    double nilaiAngka = fawas.nextDouble();

                    System.out.println("\nDAFTAR MAHASISWA");
                    System.out.println("****************");

                    for (Mahasiswa07 m : daftarMhs) {
                        System.out.printf("%s\t%s\t%s\n",
                                m.nim07, m.nama07, m.notelp07);
                    }

                    System.out.print("Pilih mahasiswa by nim : ");
                    String nim = fawas.next();

                    Mahasiswa07 pilihMhs = null;

                    for (Mahasiswa07 m : daftarMhs) {
                        if (m.nim07.equals(nim)) {
                            pilihMhs = m;
                            break;
                        }
                    }

                    System.out.println("\nDAFTAR MATA KULIAH");
                    System.out.println("****************");

                    for (MataKuliah07 mk : daftarMK) {
                        System.out.printf("%s\t%s\t%d\n",
                                mk.kodeMK07,
                                mk.namaMK07,
                                mk.sks07);
                    }

                    System.out.print("Pilih MK by kode : ");
                    String kodeMK = fawas.next();

                    MataKuliah07 pilihMK = null;

                    for (MataKuliah07 mk : daftarMK) {
                        if (mk.kodeMK07.equals(kodeMK)) {
                            pilihMK = mk;
                            break;
                        }
                    }

                    daftarNilai.add(
                            new Nilai07(
                                    pilihMhs,
                                    pilihMK,
                                    nilaiAngka
                            )
                    );

                    break;

                case 2:

                    System.out.println("\nDAFTAR NILAI MAHASISWA");
                    System.out.println("****************");

                    System.out.printf("%-10s %-15s %-40s %-5s %-10s\n",
                            "NIM",
                            "Nama",
                            "Mata Kuliah",
                            "SKS",
                            "Nilai");

                    for (Nilai07 n : daftarNilai) {

                        System.out.printf("%-10s %-15s %-40s %-5d %-10.2f\n",
                                n.mhs.nim07,
                                n.mhs.nama07,
                                n.mk.namaMK07,
                                n.mk.sks07,
                                n.nilai);
                    }

                    break;

                case 3:

                    System.out.println("\nDAFTAR NILAI MAHASISWA");
                    System.out.println("****************");

                    for (Nilai07 n : daftarNilai) {

                        System.out.printf("%-10s %-15s %-40s %-5d %-10.2f\n",
                                n.mhs.nim07,
                                n.mhs.nama07,
                                n.mk.namaMK07,
                                n.mk.sks07,
                                n.nilai);
                    }

                    System.out.print("\nMasukkan data mahasiswa[nim] : ");
                    String cariNim = fawas.next();

                    int totalSKS = 0;

                    for (Nilai07 n : daftarNilai) {

                        if (n.mhs.nim07.equals(cariNim)) {

                            System.out.println("\nData ditemukan");
                            System.out.printf("%-10s %-15s %-40s %-5d %-10.2f\n",
                                    n.mhs.nim07,
                                    n.mhs.nama07,
                                    n.mk.namaMK07,
                                    n.mk.sks07,
                                    n.nilai);

                            totalSKS += n.mk.sks07;
                        }
                    }

                    System.out.println("Total SKS "
                            + totalSKS
                            + " telah diambil.");

                    break;

                case 4:

                    Collections.sort(daftarNilai,
                            Comparator.comparingDouble(n -> n.nilai));

                    System.out.println("\nDAFTAR NILAI MAHASISWA");
                    System.out.println("****************");

                    System.out.printf("%-10s %-15s %-40s %-5s %-10s\n",
                            "NIM",
                            "Nama",
                            "Mata Kuliah",
                            "SKS",
                            "Nilai");

                    for (Nilai07 n : daftarNilai) {

                        System.out.printf("%-10s %-15s %-40s %-5d %-10.2f\n",
                                n.mhs.nim07,
                                n.mhs.nama07,
                                n.mk.namaMK07,
                                n.mk.sks07,
                                n.nilai);
                    }

                    break;

                case 5:

                    if(!antrianHapus.isEmpty()){

                        Mahasiswa07 hapus = antrianHapus.poll();

                        daftarMhs.removeIf(m ->
                                m.nim07.equals(hapus.nim07));

                        System.out.println("Data mahasiswa terhapus:");
                        System.out.println(hapus.nim07 + " - " + hapus.nama07);

                    } else {

                        System.out.println("Queue kosong");
                    }

                    break;

                case 6:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia");
            }

        } while (pilih != 6);

    }
}