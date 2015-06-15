/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziencoksifir;

/**
 *
 * @author esra
 */
public class Diziencoksifir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* int Arr2 = {};
         int Arr = {0,1,0,0};
         int s=1;
         int encoksifir;

         for (int i=0; i < Arr.length; i++ ) {
         if (Arr[i] == "0") {
         for(int j=i; j< Arr.length; j++) {
         if(Arr[j+1] == "0") {
         s=s+1;
         }
         else {
         Arr2.push(s);
         }
         if((j=Arr[Arr.length]) && (Arr[j+1] == "0")) {
         Arr2.push(s);
         }
         }


         }


         }

         for(int i=0; i<Arr2.length; i++) {
         t = encoksifir;
         encoksifir = Arr2[i];
         if(t < encoksifir) {
         t = encoksifir;
         }
         encoksifir = t;

         }

         printf(t);
         */
        int dizi1[] = {0,0,0,1,1,0,0,0,0,0,1,1,1,1,0,0,0};
        int dizi2[];
        int s = 1;
        int encoksifir = 0;

        for (int i = 0; i < dizi1.length; i++) {
            if (dizi1[i] == 0) {
                for (int j = i; j < dizi1.length; j++) {
                    if (j == dizi1.length - 1) {

                        if (encoksifir < s) {
                            encoksifir = s;

                        }
                        s = 0;
                    } else if (dizi1[j + 1] == 0) {
                        s = s + 1;
                    } else {

                        if (encoksifir < s) {
                            encoksifir = s;

                        }
                        s = 0;

                    }

                }

            }
        }
        System.out.println(encoksifir);

    }

}
