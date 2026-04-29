package Jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo07 {
    public static void main(String[] args) {
        StackTugasMahasiswa07 stack = new StackTugasMahasiswa07(5);
        Scanner fawas = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas terbawah");
            System.out.println("6. Jumlah Tugas");
            System.out.println("0. keluar");
            System.out.print("Pilih: ");
            pilih = fawas.nextInt();
            fawas.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = fawas.nextLine();
                    System.out.print("NIM: ");
                    String nim = fawas.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = fawas.nextLine();
                    Mahasiswa07 mhs = new Mahasiswa07(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama07);
                    break;
                case 2:
                    Mahasiswa07 dinilai = stack.pop();
                    if (dinilai !=null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama07);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = fawas.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama07, nilai);
                        String biner = stack.konversiDesimalkeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa07 lihat = stack.peek();
                    if (lihat !=null) {
                        System.out.println("Tugas teralhir dikumpulkan oleh " + lihat.nama07);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                
                case 5:
                    Mahasiswa07 bawah = stack.lihatTerbawah();
                    if (bawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + bawah.nama07);
                    }
                    break;

                case 6:
                    System.out.println("Jumlah tugas saat ini: " + stack.jumlah());
                    break;
                
                default:
                System.out.println("Pilihan tidak valid.");

            }
            
        } while (pilih !=0);
    }
}
