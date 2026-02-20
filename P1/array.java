package P1;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner fawas = new Scanner(System.in);
         String[] namaMK = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking and Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktek Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2,2,2,3,2,3,2,2};

        double[] nilai = new double[namaMK.length];
        String[] huruf = new String[namaMK.length];
        double[] bobot = new double[namaMK.length];

        double totalNilai = 0;
        int totalSks = 0;

        for (int i = 0; i < namaMK.length; i++) {

            System.out.println("\nNilai MK: " + namaMK[i]);
            System.out.print("Masukkan Nilai Angka: ");
            nilai[i] = fawas.nextDouble();

            if (nilai[i] > 80) {
                huruf[i] = "A"; bobot[i] = 4;
            }
            else if (nilai[i] > 73) {
                huruf[i] = "B+"; bobot[i] = 3.5;
            }
            else if (nilai[i] > 65) {
                huruf[i] = "B"; bobot[i] = 3;
            }
            else if (nilai[i] > 60) {
                huruf[i] = "C+"; bobot[i] = 2.5;
            }
            else if (nilai[i] > 50) {
                huruf[i] = "C"; bobot[i] = 2;
            }
            else if (nilai[i] > 39) {
                huruf[i] = "D"; bobot[i] = 1;
            }
            else {
                huruf[i] = "E"; bobot[i] = 0;
            }

            totalNilai += bobot[i] * sks[i];
            totalSks += sks[i];
        }

        double ip = totalNilai / totalSks;

        System.out.println("\n==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");

        System.out.printf("%-35s %-5s %-12s %-5s\n",
                "MK", "SKS", "Nilai Huruf", "Bobot");

        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("%-35s %-5d %-12s %-5.2f\n",
                    namaMK[i], sks[i], huruf[i], bobot[i]);
        }

        System.out.println("==============================================");
        System.out.printf("IP Semester : %.2f\n", ip);
    }
}
