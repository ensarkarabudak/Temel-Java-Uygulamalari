
package diziler.ile.toplama;
import java.util.Scanner;
public class DizilerIleToplama {
    public static void main(String[] args) {
        
        Scanner klavye=new Scanner(System.in);
        int [] dizi=new int[5];
        int top=0;
        for (int i = 0; i <dizi.length;i++) {
            System.out.println((i+1)+".Elemanı Girin.");
            dizi[i]=klavye.nextInt();
            top=top+dizi[i];      
        }
        System.out.println(top); 
    }
    
}
