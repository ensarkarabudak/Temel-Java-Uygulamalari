
package pkg2sayıtoplamtahmin;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);        
        do
        {
            System.out.println("1.Sayıyı Giriniz: ");
            int x=klavye.nextInt();
            System.out.println("2.Sayıyı Giriniz: ");
            int y=klavye.nextInt();
            System.out.println(x+"+"+y+"= ?");
            int kullanici=klavye.nextInt();
            if(kullanici==(x+y))
                System.out.println("Bildiniz Tebrikler.");
            else
                System.out.println("Yanlış Tahminde Bulundunuz.");
        }     
        while(true);
    }   
}
