package Praktikum05;

public class MahasiswaBerprestasi07 {
    Mahasiswa07 [] listMhs= new Mahasiswa07[5];
    int idx;
    
    void tambah (Mahasiswa07 m){
        if (idx<listMhs.length) {
            listMhs[idx]=m;
            idx++;
        }else{
            System.out.println("data sudah penuh");
        }
    }

    void tampil (){
        for (Mahasiswa07 m:listMhs){
            m.tampilInformasi();
            System.out.println("------------------------------");

        }
    }

    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk07>listMhs[j-1].ipk07) {
                    Mahasiswa07 tmp = listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }

    void SelectionSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin=i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk07<listMhs[idxMin].ipk07) {
                    idxMin=j;
                }
            }
            Mahasiswa07 tmp = listMhs[idxMin];
            listMhs[idxMin]=listMhs[i];
            listMhs[i]=tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa07 temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk07<temp.ipk07) {
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }

    //findBinarySearch
    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right>=left) {
            mid =(left+right)/2;
            if (cari ==listMhs[mid].ipk07) {
                return (mid);
            }
            else if (listMhs[mid].ipk07>cari){
                return findBinarySearch(cari, left, mid-1);
            }
            else{
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }


    //sequentialsearching
    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk07==cari) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }
    //tampil posisi
    void tampilPosisi(double x, int pos){
        if (pos!=-1) {
            System.out.println("data mahasiswa dengan IPK :" +x+ " ditemukan pada indeks " +pos );
        }
        else{
            System.out.println("data " +x+ "tidak ditemukan");
        }
    }

    //tampildatasearch
    void tampilDataSearch(double x, int pos){
        if (pos !=-1) {
            System.out.println("nim\t : "+listMhs[pos].nim07);
            System.out.println("nama\t : "+listMhs[pos].nama07);
            System.out.println("kelas\t : "+listMhs[pos].kelas07);
            System.out.println("ipk\t : "+x);
        }
        else{
            System.out.println("Data mahaiswa dengan IPK " +x+ " tidak ditemukan");
        }
    }
}
