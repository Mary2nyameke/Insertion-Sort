/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author MADAM
 */
public class SelectionSort {

  
   public static void main(String args[]){
      int array[] = {23, 14, 56, 70, 39};
      int size = array.length;

      for (int m= 0 ;m< size-1; m++){
         int min = m;

         for (int j = m+1; j<size; j++){
            if (array[j] < array[min]){
            min = j;
            }
         }
         int temp = array[min];
         array[min] = array[m];
         array[m] = temp;
      }

      for (int m = 0 ;m< size; m++){
         System.out.print(" "+array[m]);
      }
   }  
}

