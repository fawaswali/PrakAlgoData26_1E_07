package CM1;

public class Buku07 {
    String kodebuku07;
    String judul07;
    int tahunterbit07;

    Buku07(String kodebuku, String judul, int tahunterbit){
        this.kodebuku07=kodebuku;
        this.judul07=judul;
        this.tahunterbit07=tahunterbit;

    }

    void tampilbuku(){
        System.out.println("Kode: " + kodebuku07 + " | Judul: " + judul07 + " | Tahun: " + tahunterbit07);
    }
}
