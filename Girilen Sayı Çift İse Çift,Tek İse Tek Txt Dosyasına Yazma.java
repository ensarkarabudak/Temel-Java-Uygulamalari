//Mehmet BAYGIN
//Firat Universitesi
//Bilgisayar Muhendisligi, 2016
package sinavsoru4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class SinavSoru4 {

    public static void main(String[] args) throws FileNotFoundException {

        int sayi = 0;

        File f1 = new File("tek.txt");

        File f2 = new File("cift.txt");

        Scanner klavye = new Scanner(System.in);

        PrintWriter yazma1 = new PrintWriter(new FileOutputStream(f1));

        PrintWriter yazma2 = new PrintWriter(new FileOutputStream(f2));

        while (true) {
            System.out.println("Sayi giriniz: ");
            sayi = klavye.nextInt();
            if (sayi % 2 != 0 && sayi != 99999) { // 99999 Yazana Kadar Çalışır
                yazma1.println(sayi);
            } else if (sayi % 2 == 0 && sayi != 99999) {
                yazma2.println(sayi);
            } else {
                break;
            }
        }
        yazma1.close();
        yazma2.close();
    }
}
