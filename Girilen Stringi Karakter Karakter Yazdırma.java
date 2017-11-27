package karakteryazdırma;
import java.util.Scanner;
public class KarakterYazdırma {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("String Giriniz: ");
        String ifade=klavye.nextLine();
        for(int i=0;i<=ifade.length();i++)
        {
            System.out.println(ifade.substring(0, i));          
        }
    }    
}
