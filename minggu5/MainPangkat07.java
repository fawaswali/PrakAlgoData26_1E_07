package minggu5;
import java.util.Scanner;
public class MainPangkat07 {
    public static void main(String[] args) {
        Scanner fawas = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = fawas.nextInt();

        Pangkat07[] png = new Pangkat07[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-"+(i+1)+": ");
            int basis = fawas.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = fawas.nextInt();
            png[i] = new Pangkat07(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (Pangkat07 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai,p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (Pangkat07 p : png){
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai,p.pangkat));
        }

    }
}
