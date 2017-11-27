
package quiz4;
public class Quiz4 {
    public static void main(String[] args) {
        int altcizgi,i,j;
        System.out.println("      1 2 3 4 5 6 7 8 9");
        for (altcizgi = 1; altcizgi < 70; altcizgi++) 
        {   
            System.out.print("_");       
        }
        System.out.println();
        for (i = 0;i<= 10;i++) 
        {
            System.out.print(i+"|  "); 
            for (j = 0; j <= 10; j++) 
            {
                System.out.print(i*j+" ");
                
            }
            System.out.println();
        }
    }
    
}
