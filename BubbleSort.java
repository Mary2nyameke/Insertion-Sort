/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble.sort;

/**
 *
 * @author MADAM
 */
public class BubbleSort {

    
   public static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int m=0; m < n; m++){  
                 for(int j=1; j < (n-m); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int arr[] ={10,40,3,50,70,5};  
                 
                System.out.println(" Before Bubble Sort"); 
                for(int m=0; m < arr.length; m++){  
                        System.out.print(arr[m] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);
             //sorting array elements using bubble sort  
                 
                System.out.println(" After Bubble Sort");  
                for(int m=0; m < arr.length; m++){  
                        System.out.print(arr[m] + " ");  
                }  
   
        }  
}  