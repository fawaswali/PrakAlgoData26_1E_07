package P11;

import java.util.Scanner;

public class SLLMain07 {
    public static void main(String[] args) {

        Scanner fawas = new Scanner(System.in);
        

        SingleLinkedList07 sll = new SingleLinkedList07();

        for (int i = 0; i < 4; i++) {

            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM    : ");
            String nim = fawas.nextLine();

            System.out.print("Nama   : ");
            String nama = fawas.nextLine();

            System.out.print("Kelas  : ");
            String kelas = fawas.nextLine();

            System.out.print("IPK    : ");
            double ipk = fawas.nextDouble();
            fawas.nextLine();

            Mahasiswa07 mhs = new Mahasiswa07(nim, nama, kelas, ipk);

            sll.addLast(mhs);
        }

        System.out.println("\nData Linked List Mahasiswa");
        sll.print();
    }
}
