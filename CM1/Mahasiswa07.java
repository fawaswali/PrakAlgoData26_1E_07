package CM1;

public class Mahasiswa07 {
    String nim07;
    String nama07;
    String prodi07;

    Mahasiswa07(String nim, String nama, String prodi){
        this.nim07=nim;
        this.nama07=nama;
        this.prodi07=prodi;

       
    }

    void tampilMahasiswa(){
        System.out.println("NIM: " + nim07 + " | Nama: " + nama07 + " | Prodi: " + prodi07);
    
    }
}
