package Jobsheet16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


public class ListMahasiswa07 {
    List<Mahasiswa07> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa07... mahasiwa){
        mahasiswas.addAll(Arrays.asList(mahasiwa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa07 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    public void sortAscending() {
        mahasiswas.sort((m1, m2) -> m1.nim07.compareTo(m2.nim07));
    }

    public void sortDescending() {
        mahasiswas.sort((m1, m2) -> m2.nim07.compareTo(m1.nim07));
    }

    // int linierSearch(String nim) {
    //     for (int i= 0; i < mahasiswas.size(); i++) {
    //         if (nim.equals(mahasiswas.get(i).nim07)) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    int binarySearch(String nim) {
    Collections.sort(mahasiswas, Comparator.comparing(m -> m.nim07));
    return Collections.binarySearch(mahasiswas, new Mahasiswa07(nim, "", ""),//binary
            Comparator.comparing(m -> m.nim07));
            
    }
    

    public static void main(String[] args) {
        ListMahasiswa07 lm = new ListMahasiswa07();
        Mahasiswa07 m = new Mahasiswa07("201234","Noureen", "021xx1");
        Mahasiswa07 m1 = new Mahasiswa07("201235","Akhleema", "021xx2");
        Mahasiswa07 m2 = new Mahasiswa07("201236","Shannum", "021xx3");


        lm.tambah(m, m1, m2);

        System.out.println("Data awal:");
        lm.tampil();
        // SORTING ASC
        System.out.println("\nSetelah sorting ASC:");
        lm.sortAscending();
        lm.tampil();

        // SORTING DESC
        System.out.println("\nSetelah sorting DESC:");
        lm.sortDescending();
        lm.tampil();

        
        //menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        //menampilkan list mahasiswa
        lm.tampil();
        //update mahasiswa
        lm.update(lm.binarySearch("201235"), new Mahasiswa07("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
}
