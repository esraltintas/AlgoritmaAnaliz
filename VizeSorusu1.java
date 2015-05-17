// 100-1000 arası sayıların basamaklarının küplerinin toplamı kendisine eşit olan sayı

package vizesorusu1;


public class VizeSorusu1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sayac = 0 ;
        for(int sayi = 100 ; sayi<1000; sayi++){
            int birlerBas = sayi%10;
            int onlarBas = (sayi/10)%10;
            int yuzlerBas = sayi/100;
            
            
            int kontrol = (int) (Math.pow(birlerBas, 3) + Math.pow(onlarBas, 3) + Math.pow(yuzlerBas, 3));
            if( kontrol == sayi){
                sayac++;
                System.out.println(sayac + ". sayı = " + sayi);
            }
        }
        
    }
    
   
}
