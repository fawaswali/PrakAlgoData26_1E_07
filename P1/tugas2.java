package P1;
import java.util.Scanner;
public class tugas2 {
     static Scanner fawas = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Jumlah jadwal: ");
        int n = fawas.nextInt();
        fawas.nextLine();

        String[][] jadwal = new String[n][4];

        int pilih;

        do{
            System.out.println("\n=== MENU JADWAL ===");
            System.out.println("1. Input Jadwal");
            System.out.println("2. Tampilkan Semua");
            System.out.println("3. Cari Berdasarkan Hari");
            System.out.println("4. Cari Berdasarkan Mata Kuliah");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = fawas.nextInt();
            fawas.nextLine();

            switch(pilih){

                case 1:
                    inputJadwal(jadwal);
                    break;

                case 2:
                    tampilSemua(jadwal);
                    break;

                case 3:
                    System.out.print("Masukkan hari: ");
                    String hari = fawas.nextLine();
                    cariHari(jadwal,hari);
                    break;

                case 4:
                    System.out.print("Masukkan nama MK: ");
                    String mk = fawas.nextLine();
                    cariMK(jadwal,mk);
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

        }while(pilih!=0);
    }

    
    static void inputJadwal(String[][] data){
        for(int i=0;i<data.length;i++){
            System.out.println("\nData jadwal ke-"+(i+1));

            System.out.print("Nama MK : ");
            data[i][0]=fawas.nextLine();

            System.out.print("Ruang : ");
            data[i][1]=fawas.nextLine();

            System.out.print("Hari : ");
            data[i][2]=fawas.nextLine();

            System.out.print("Jam : ");
            data[i][3]=fawas.nextLine();
        }
    }

   
    static void tampilSemua(String[][] data){
        System.out.println("\n=== TABEL JADWAL ===");

        System.out.printf("%-25s %-20s %-10s %-15s\n",
                "Mata Kuliah","Ruang","Hari","Jam");

        for(int i=0;i<data.length;i++){
            System.out.printf("%-25s %-20s %-10s %-15s\n",
                    data[i][0],
                    data[i][1],
                    data[i][2],
                    data[i][3]);
        }
    }

   
    static void cariHari(String[][] data,String hari){
        boolean ada=false;

        for(int i=0;i<data.length;i++){
            if(data[i][2].equalsIgnoreCase(hari)){
                System.out.println(data[i][0]+" | "+data[i][1]+" | "+data[i][3]);
                ada=true;
            }
        }

        if(!ada)
            System.out.println("Tidak ada jadwal di hari tersebut.");
    }

    
    static void cariMK(String[][] data,String mk){
        boolean ada=false;

        for(int i=0;i<data.length;i++){
            if(data[i][0].equalsIgnoreCase(mk)){
                System.out.println("Ruang: "+data[i][1]+" Hari: "+data[i][2]+" Jam: "+data[i][3]);
                ada=true;
            }
        }

        if(!ada)
            System.out.println("Mata kuliah tidak ditemukan.");
    
    }
}
