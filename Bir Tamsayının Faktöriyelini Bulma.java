
package faktoriyel;
import java.util.Scanner;
public class Faktoriyel {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int sayi,fak=1;
        System.out.println("Bir Sayı Giriniz: ");
        sayi=klavye.nextInt();
        double sonuc=0;
        for (int i=1;i<=sayi;i++)
        {
            fak=i*fak;
        }
        System.out.println(sayi +"!="+fak);
    }
    
}
