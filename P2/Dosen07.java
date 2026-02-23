package P2;

public class Dosen07 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampikanInformasi(){
        System.out.println("ID Dosen:"+ idDosen);
        System.out.println("Nama Dosen: "+ nama);
        System.out.println("Status Aktif "+ statusAktif);
        System.out.println("Tahun Bergabung: "+ tahunBergabung);
        System.out.println("Bidang Keahlian:"+ bidangKeahlian);


    }

    void setStatusAktif(boolean status){
        statusAktif = status;
    }

    int hitungMasaKerja(int tahunsekarang){
        return tahunsekarang - tahunBergabung;
    }

    String ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
        return bidangKeahlian;
    }
}
