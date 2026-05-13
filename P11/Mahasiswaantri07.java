package P11;

public class Mahasiswaantri07 {
    String nim, nama, kelas;

    public Mahasiswaantri07(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public void tampil() {
        System.out.println(nim + " | " + nama + " | " + kelas);
    }
}
