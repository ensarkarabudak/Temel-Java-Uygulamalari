package kacbasamaklısayı;
import java.util.Scanner;
public class KacBasamaklıSayı {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int sayi=0;
        System.out.println("Pozitif Bir Sayı Giriniz: ");
        int x=klavye.nextInt();
        while (x>0){
            x=x/10;
            sayi++;
        }
        System.out.println("Basamak Sayısı= "+ sayi);       
    } 
}