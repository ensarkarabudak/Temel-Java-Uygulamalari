package diziortalamaenkucukbuyuk;
import java.util.Scanner;
public class DiziOrtalamaEnKucukBuyuk {
    public static void main(String[] args) {
      Scanner klavye=new Scanner(System.in);
      int[] sayilar=new int[10];
      int top=0;
        for (int i = 0; i <sayilar.length; i++) {
            System.out.println((i+1)+".Elemanı Gir: ");
            sayilar[i]=klavye.nextInt();
            top=top+sayilar[i];
 
        }
        double ort=top/10.0;
        int eb=sayilar[0],ek=sayilar[0];
        int sayac=0;
        for (int j = 0; j <sayilar.length; j++) {
            if(sayilar[j]>eb) eb=sayilar[j];
            if(sayilar[j]<ek) ek=sayilar[j];
            if(sayilar[j]>ort) sayac++;
                
        }
        System.out.println("En Büyük Sayı="+eb+"\nEn Küçük Sayı="+ek+"\nOrtalama Üstündeki Sayı Adedi="+sayac);
    }
    
}
