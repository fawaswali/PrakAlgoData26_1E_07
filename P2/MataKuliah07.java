package P2;

public class MataKuliah07 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi(){
        System.out.println("Kode Mata Kuliah: " + kodeMK );
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS:" + sks);
        System.out.println("Jumlah Jam: "+ jumlahJam);
    }

    void ubahsks(int sksBaru){
        sks = sksBaru;
    }

    void tambahJam(int jam){
        jumlahJam = jumlahJam + jam;
    }

    void kurangiJam(int jam){
        jumlahJam = jumlahJam - jam;
    }
}
