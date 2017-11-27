
package karakter;
import java.util.Scanner;
public class Karakter {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Bir Karakter Giriniz :");
        char karakter=klavye.next().charAt(0);
        
        if (karakter >='a' && karakter<='z' )      
            System.out.println("Küçük Harf");
        else if( karakter>='A' && karakter <='Z')
            System.out.println("Büyük Harf");
        else if(karakter >='0' && karakter<='9')
            System.out.println(karakter +" Bir Rakamdır.");
        else
            System.out.println("Özel Karakter");              
    }    
}
