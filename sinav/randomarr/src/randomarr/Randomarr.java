/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomarr;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author esra
 */
public class Randomarr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int elemanSayisi;

        System.out.print("Ne kadar eleman üretmek istersiniz? = ");
        elemanSayisi = input.nextInt();
        int dizi[] = new int[elemanSayisi];
        
        Random rastgele = new Random();
        for (int i = 0; i < elemanSayisi; i++) {
            dizi[i] = rastgele.nextInt(100);
        }
        
        for(int duzyaz = 0; duzyaz<dizi.length ; duzyaz++){
            System.out.println(dizi[duzyaz]);
        }
        
        for(int tersyaz = elemanSayisi-1; tersyaz>= 0 ; tersyaz--){
            System.out.println(dizi[tersyaz]);
        }
    }
    
}
