package P2;

public class DosenMain07 {
    public static void main(String[] args) {
        Dosen07 dosen = new Dosen07();
        dosen.idDosen = "D01";
        dosen.nama = "Imam Fahrur Rozi, S.T.,M.T.";
        dosen.statusAktif = true;
        dosen.tahunBergabung = 2009;
        dosen.bidangKeahlian = "Praktik Algoritma dan Struktur Data";
        
        dosen.tampikanInformasi();
        System.out.println("Masa Kerja: "+dosen.hitungMasaKerja(2026)+" tahun");
        System.out.println("Keahlian Baru: "+dosen.ubahKeahlian("Basis Data"));
        dosen.tampikanInformasi();
    }
}
