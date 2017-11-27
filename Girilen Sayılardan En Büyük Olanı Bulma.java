
package enbüyükbulma;
import java.util.Scanner;
public class EnbüyükBulma {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("1.Sayıyı Giriniz: ");
        int s1=klavye.nextInt();
        System.out.println("2.Sayıyı Giriniz: ");
        int s2=klavye.nextInt();
        System.out.println("3.Sayıyı Giriniz");
        int s3=klavye.nextInt();
        
        if(s1>s2 && s1>s3)
        {
            System.out.println("En Büyük Sayı = "+ s1);
        }
        if(s2>s1 && s2>s3)
        {
            System.out.println("En Büyük Sayı = "+ s2);
        }
         if(s3>s1 && s3>s2)
        {
            System.out.println("En Büyük Sayı = "+ s3);
        }
    }
    
}
