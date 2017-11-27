
package dairealanhesaplama;
import java.util.Scanner;
public class DaireAlanHesaplama {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("YarıÇapı Giriniz = ");
        double cap=klavye.nextDouble();
        double alan= cap*cap*3.14;
        System.out.println("DAİRENİN ALANI= " + alan);
    }
    
}
