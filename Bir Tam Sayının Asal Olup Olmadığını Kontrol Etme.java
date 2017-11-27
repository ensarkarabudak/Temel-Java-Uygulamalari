package asal.mı;

import java.util.Scanner;

public class AsalMı {
    public static void main(String[] args) {
       Scanner klavye=new Scanner(System.in);
        System.out.println("Bir Sayı Girin: ");
        int x=klavye.nextInt();
        boolean asal=true;
        for (int i = 2; i <= x/2; i++) {
            if(x%i==0)
            {
                asal=false;
                break;
            }
        }
            if(asal)
                System.out.println("Asaldır.");
            else
                System.out.println("Asal Değildir.");
            
        
        
    }
    
}
