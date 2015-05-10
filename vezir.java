package vezirproblemi;
import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import java.beans.EventHandler;
import java.util.Random;

public class VezirProblemi {

    
    public static void main(String[] args) {
        int[][] satrancTablosu = new int[8][8];
       
        create(satrancTablosu);
        test(satrancTablosu);
        generate(satrancTablosu);
        
    }
    
    
    public static void create(int [][] satrancTablosu){
        int random ;
        Random r = new Random();
                for ( int j = 0; j < 8; j++) {
                    random = r.nextInt(7);
                    satrancTablosu[random][j]=1;                   
                }
        
        for (int i = 0; i <= 7; i++) {
            for ( int j = 0; j <= 7; j++) {
                System.out.print(satrancTablosu[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void test(int [][] vezir){
        int cakismaSayisi = 0;
        int eklenicekCakismaSayisi = 0;
        
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                if(vezir[i][j]==1){
                    eklenicekCakismaSayisi=eklenicekCakismaSayisi + 1;
                }
                
            }
            
            if(eklenicekCakismaSayisi == 1){
                eklenicekCakismaSayisi = 0;
            }
            
            cakismaSayisi = eklenicekCakismaSayisi+ cakismaSayisi;
            eklenicekCakismaSayisi = 0 ;
        }
        System.out.println("Çakışma sayısı = " + cakismaSayisi);
        
        
        if(cakismaSayisi==0){
            for (int i = 0; i <= 7; i++) {
                for ( int j = 0; j <= 7; j++) {
                    System.out.print(vezir[i][j] + " ");
                }
            System.out.println();
            }
            System.out.println("Çakışma sayısı = 0" );
        }
        
    }
    
    public static void generate(int [][] olasiliklar){
        for ( int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {
                if(olasiliklar[i][j]==1){
                    
                    for(int k = 0; k<8 ; k++){
                        olasiliklar[i][j]=0;
                        i = k%7;
                        olasiliklar[i][j]=1;
                    }
                    
                }
                
            }
        }
        test(olasiliklar);
    }
    
    
    
}
