package Jobsheet16;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMahasiswa07 {

    public static void main(String[] args) {

        Queue<Mahasiswa07> antrian = new LinkedList<>();

        antrian.add(new Mahasiswa07("20001", "Thalhah", "021xxx"));
        antrian.add(new Mahasiswa07("20002", "Zubair", "021xxx"));
        antrian.add(new Mahasiswa07("20003", "Abdur-Rahman", "021xxx"));

        System.out.println("Sebelum dihapus");
        for (Mahasiswa07 m : antrian) {
            System.out.println(m.nim07 + " " + m.nama07);
        }

        Mahasiswa07 hapus = antrian.poll();

        System.out.println("\nData terhapus:");
        System.out.println(hapus.nim07 + " " + hapus.nama07);

        System.out.println("\nSetelah dihapus");
        for (Mahasiswa07 m : antrian) {
            System.out.println(m.nim07 + " " + m.nama07);
        }
    }
}