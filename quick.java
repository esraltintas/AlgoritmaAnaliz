/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Random;

/**
 *
 * @author Esra
 */
public class QuickSort {

    static int maaliyet = 0;

    public static void main(String[] args) {
        long ortalama=0;
        for (int diziKapArttir = 3; diziKapArttir < 6; diziKapArttir++) {  //10**3, 10**4, 10**5

            for(int tekrarlama = 0; tekrarlama<10;tekrarlama++){
            
            double diziKapasitesi = Math.pow((double) 10, (double) diziKapArttir);

            int[] x = new int[(int) diziKapasitesi];
            Random r = new Random();
            for (int i = 0; i < (int)diziKapasitesi; i++) {
                x[i] = r.nextInt((int)diziKapasitesi);
            }

//            for (int i = 0; i < x.length; i++) {
//                System.out.print(x[i] + " ");
//            }
//            System.out.println("");

            int low = 0;
            int high = x.length - 1;

            quickSort(x, low, high);
//            for (int i = 0; i < x.length; i++) {
//                System.out.print(x[i] + " ");
//            }
//            System.out.println("");

            System.out.println(tekrarlama+1 + ") " + x.length + " elemanlı dizi için maaliyet = " + maaliyet);
            ortalama=ortalama+maaliyet;
            maaliyet = 0;
            }
            System.out.println("         Ortalama = " + ortalama / 10);
            System.out.println("");
            ortalama = 0;
        }
    }

    public static void quickSort(int[] arr, int low, int high) {

        if (arr == null || arr.length == 0) {
            System.out.println("Boş dizi");
            return;
        }
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
                maaliyet++;
            }
            while (arr[j] > pivot) {
                j--;
                maaliyet++;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
                maaliyet++;
            }
        }

        if (low < j) {
            quickSort(arr, low, j);
        }

        if (high > i) {
            quickSort(arr, i, high);
        }
    }

}
