/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package selection;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BM
 */
public class Selection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, c, d, swap;
        int i, j, minIndex, tmp;
    int s=0;
    int comp = 0;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Input number of integers to sort");
    n = in.nextInt();
 
    int arr[] = new int[n];
 
    System.out.println("Enter " + n + " integers");
    
      for (c = 0; c < n; c++) {
       int rnd = new Random().nextInt(n);
       arr[c] = rnd;
   }
    for (i = 0; i < n - 1; i++) {
            minIndex = i;
            comp++;
            for (j = i + 1; j < n; j++)
                  if (arr[j] < arr[minIndex])
                        minIndex = j;
            if (minIndex != i) {
                  tmp = arr[i];
                  arr[i] = arr[minIndex];
                  arr[minIndex] = tmp;
                  s++;
            }
      }
     System.out.println("Sorted list of numbers");
    System.out.println("swap =" +s +" comp ="+ comp);
 
    for (c = 0; c < n; c++) 
      System.out.println(arr[c]);
    }
 
   
  }
   
    

