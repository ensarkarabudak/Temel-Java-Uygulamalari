
package ebob;
import java.util.Scanner;
public class EBOB{ 
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in); 
        System.out.println("Birinci sayıyı girin: "); 
        int sayi1=klavye.nextInt(); 
        System.out.println("İkinci sayıyı giriniz: "); 
        int sayi2=klavye.nextInt(); 
        int enbbolen=1,k=2; 
        while(k<=sayi1 && k<=sayi2)          
        { 
         if(sayi1%k==0 && sayi2%k==0) 
         enbbolen=k; k++; 
        } 
        System.out.println("En büyük ortak Bölen = " + enbbolen);   
    }
}