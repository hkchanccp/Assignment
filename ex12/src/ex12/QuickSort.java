/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12;
  
  
    /*  
      arr[] = Array to be sorted, 
      left  = Starting index, 
      right = Ending index */
/**
 *
 * @author hkcha
 */
public class QuickSort {
     int partition(int arr[], int left, int right) 
    { 
        int pivot = arr[right];  
        int index = (left-1); // index of smaller element 
        for (int j= left; j<right; j++) 
        { 
            // If current element is smaller than or equal to pivot 
            if (arr[j] <= pivot) 
            { 
                index++; 
                // swap arr[index] and arr[j] 
                int temp = arr[index]; 
                arr[index] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        // swap arr[i+1] and arr[high] 
        int temp = arr[index+1]; 
        arr[index+1] = arr[right]; 
        arr[right] = temp; 
        return index+1; 
        
    } 

    void sort(int arr[], int left, int right) { 
        if (left < right) 
        { 
            /* p is partitioning index, arr[p] is now at right place */
            int p = partition(arr, left, right); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, left, p-1); 
            sort(arr, p+1, right); 
        } 
    } 
  
    public static void printsorted(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
}
