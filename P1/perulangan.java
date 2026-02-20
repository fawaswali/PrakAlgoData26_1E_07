package P1;
import java.util.Scanner;

public class perulangan{
    public static void main(String[] args) {
        Scanner fawas = new Scanner (System.in);

        
        int n;
        String nim;

        System.out.print("input NIM : ");
        nim = fawas.nextLine();

        n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n+= 10;
            
        }

        System.out.println("n : " + n);

        for (int i = 1; i<= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i+ " ");
                
            } else {
                System.out.print("* ");
            }

            
        }




    }
}