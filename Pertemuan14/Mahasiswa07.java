package Pertemuan14;

public class Mahasiswa07 {
    String nim07;
    String nama07;
    String kelas07;
    double ipk07;

    public Mahasiswa07() {

    }

    public Mahasiswa07(String nim, String nama, String kelas, double ipk) {
        this.nim07 = nim;
        this.nama07 = nama;
        this.kelas07 = kelas;
        this.ipk07 = ipk;
    }

    public void tampilInformasi() {
        System.out.println("NIM: "+this.nim07+" "+
            "Nama: "+this.nama07+" "+
            "Kelas: "+this.kelas07+" "+
            "IPK: "+this.ipk07
        );
    }
}
