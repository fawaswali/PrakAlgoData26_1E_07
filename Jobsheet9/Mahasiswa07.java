package Jobsheet9;

public class Mahasiswa07 {
    String nim07;
    String nama07;
    String kelas07;
    int nilai07;

    Mahasiswa07(String nama, String nim, String kelas){
        this.nama07 = nama;
        this.nim07 = nim;
        this.kelas07 = kelas;
        nilai07 = -1;

        
    }

    void tugasDinilai(int nilai){
        this.nilai07 = nilai;
    }
}
