
package a.b.arasındaki.asal.sayıları.yazdırma;

import java.util.Scanner;

public class ABArasındakiAsalSayılarıYazdırma {

    public static void main(String[] args) {
       Scanner klavye=new Scanner(System.in);
        System.out.println("1. Sayıyı Girin: ");
        int a=klavye.nextInt();
        System.out.println("2. Sayıyı Girin: ");
        int b=klavye.nextInt();
               
        for (int i =a; i <= b; i++)             
        {
            boolean asal=true;
            for(int j=2;j<=(i/2)+1;j++)
                
            if(i%j==0)
            {
                asal=false;
                break;
            }
             if(asal)
                System.out.println(i+"\t");
           
        }
           
    }
    
}
