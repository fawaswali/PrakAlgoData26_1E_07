package Praktikum05;

public class Mahasiswa07 {
    String nim07;
    String nama07;
    String kelas07;
    double ipk07;

    //Konstruktor default
    Mahasiswa07(){}

    //Konstruktor berparameter (dibuat ada yang nama var parameter inputnya sama ada yang tidak)
    Mahasiswa07(String nm,String name, String kls, double ip){
        nim07=nm;
        nama07=name;
        ipk07=ip;
        kelas07=kls;

    }

    void tampilInformasi(){
        System.out.println("Nama: " + nama07);
        System.out.println("NIM: " + nim07);
        System.out.println("Kelas: " + kelas07);
        System.out.println("IPK: " + ipk07);

    }
}
