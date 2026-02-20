package P1;
public class fungsi {
    public static void main(String[] args) {

        int[][] data = {
            {10,5,15,7},
            {6,11,9,12},
            {2,10,10,5},
            {5,7,12,9}
        };

        for(int i=0;i<data.length;i++){
            int hasil = hitungPendapatan(
                data[i][0],
                data[i][1],
                data[i][2],
                data[i][3]
            );

            System.out.println("Cabang " + (i+1));
            System.out.println("Pendapatan: " + hasil);
            statusCabang(hasil);
            System.out.println();
        }
    }

    static int hitungPendapatan(int a, int k, int al, int m){
        int hargaA = 75000;
        int hargaK = 50000;
        int hargaAl = 60000;
        int hargaM = 10000;

        return (a*hargaA)+(k*hargaK)+(al*hargaAl)+(m*hargaM);
    }

    static void statusCabang(int pendapatan){
        if(pendapatan > 1500000){
            System.out.println("Status: Sangat Baik");
        }else if(pendapatan >= 500000){
            System.out.println("Status: Baik");
        }else{
            System.out.println("Status: Perlu Evaluasi");
        }
    }

}
