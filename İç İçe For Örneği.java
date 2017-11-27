package icicefor;
public class İciceFor {
    public static void main(String[] args) {
        for (int satir = 0; satir < 4; satir++) 
        {
            for (int yildiz = 0; yildiz < 5; yildiz ++)
                System.out.print('*'); System.out.println();
        }       
                //Dış döngünün bir defa yürütülmesine karşılık,
                // iç döngü 5 defa çalıştırılır.
    }
    
}
