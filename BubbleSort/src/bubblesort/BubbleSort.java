/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bubblesort;

/**
 *
 * @author BM
 */
import java.util.Random;
import java.util.Scanner;
 
class BubbleSort {
    public static int getRandom(int n, int[] array) {
    int rnd = new Random().nextInt(n);
    return array[rnd];
}
    
  public static void main(String []args) {
    int n, c, d, swap;
    int s=0;
    int comp = 0;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Input number of integers to sort");
    n = in.nextInt();
 
    int array[] = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
   for (c = 0; c < n; c++) {
       int rnd = new Random().nextInt(n);
       array[c] = rnd;
   }
     
    
    
    for (c = 0; c < ( n - 1 ); c++) {
      for (d = 0; d < n - c - 1; d++) {
        comp++;
        if (array[d] > array[d+1]) /* For descending order use < */
        {
          swap       = array[d];
          array[d]   = array[d+1];
          array[d+1] = swap;
          s++;
        }
      }
    }
 
    System.out.println("Sorted list of numbers");
    System.out.println("swap =" +s +" comp ="+ comp);
 
    for (c = 0; c < n; c++) 
      System.out.println(array[c]);
  }
}
