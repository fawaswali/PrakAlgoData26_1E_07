package Praktikum05;

public class Sorting07 {
    
    int [] data07;
    int jumData07;

    Sorting07 (int Data07[], int jmlDat07){
        jumData07=jmlDat07;
        data07=new int[jmlDat07];
        for (int i=0; i<jumData07;i++){
            data07[i]=Data07[i];
        }
    }

    void bubbleSort(){
        int temp=0;
        for (int i = 0; i < jumData07-1; i++) {
            for (int j = 1; j < jumData07-i; j++) {
                if (data07[j-1]>data07[j]) {
                    temp=data07[j];
                    data07[j]=data07[j-1];
                    data07[j-1]=temp;
                    
                }
            }
        }
    }

    void tampil(){
        for (int i = 0; i < jumData07; i++) {
            System.out.print(data07[i]+" ");
        }
        System.out.println();
    }
}
