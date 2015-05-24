/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vektoradd;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Esra
 */
public class VektorAdd {

    static Vector vektor = new Vector();
    public static int maaliyet =0;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int diziBoyutu;

	System.out.print("Kaç eleman eklensin = ");
	diziBoyutu = input.nextInt();
        int a[] = new int[diziBoyutu];
        for(int i = 0 ; i<diziBoyutu; i++) 
            a[i] = i;
        
        VektoreAktar(a);
        System.out.println("Maaliyet = "+ maaliyet);      
    }
    
    
    public static void VektoreAktar(int [] dizi){
        for(int i = 0; i< dizi.length; i++ ){
            vektor.add(dizi[i]);
            maaliyet+=1;
            if (vektor.capacity() == vektor.size()){
                maaliyet += vektor.size();
            }
        }
    }
    
}
