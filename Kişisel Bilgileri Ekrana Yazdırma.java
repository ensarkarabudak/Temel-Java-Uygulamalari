package Adsoyad;
import java.util.Scanner;
public class Adsoyad {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Adınız ve Soyadınızı Giriniz:");
        String isim=klavye.nextLine();
        System.out.println("Yaşınızı Giriniz:");
        int yas=klavye.nextInt();
        System.out.println("Boyunuzu Giriniz:");
        double boy=klavye.nextDouble();
        System.out.println("Cinsiyetiniz:");
        char cinsiyet=klavye.next().charAt(0);
        System.out.println("Adı: "+isim+"\nYaşınız: "+yas+"\nBoyunuz: "+boy+
                "\nCinsiyetiniz: "+cinsiyet);
        
        
    }
    
}
