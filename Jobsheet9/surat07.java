package Jobsheet9;

public class surat07 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // S atau I
    int durasi;

    public surat07(String id, String nama, String kelas, char jenis, int durasi) {
        this.idSurat = id;
        this.namaMahasiswa = nama;
        this.kelas = kelas;
        this.jenisIzin = jenis;
        this.durasi = durasi;
    }
}
