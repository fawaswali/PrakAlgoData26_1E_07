package P11;

public class Mahasiswa07 {
    String nim07;
    String nama07;
    String kelas07;
    double ipk07;

    Mahasiswa07(){

    }

    Mahasiswa07(String nm,String name,String kls, double ip){
        nim07 = nm;
        nama07 = name;
        kelas07 = kls;
        ipk07 = ip;
    }

    void tampilInformasi(){

        System.out.println(nama07 + "\t" + nim07 + "\t" + kelas07 + "\t" + ipk07);
    }

}
