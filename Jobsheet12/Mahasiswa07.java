package Jobsheet12;

public class Mahasiswa07 {
    String nim07;
    String nama07;
    String kelas07;
    double ipk07;

    public Mahasiswa07(String nim,String nama, String kelas, double ipk) {
        this.nim07 = nim;
        this.nama07 = nama;
        this.kelas07 = kelas;
        this.ipk07 = ipk;
    }

    public void tampil(){
        System.out.println(
            "NIM    : " + nim07 +
            "\nNama : " + nama07 +
            "\nKelas: " + kelas07 +
            "\nIPK  : " + ipk07
        );
    }
}
