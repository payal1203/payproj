package lec6;
import java.time.Clock;
import java.time.ZoneId;
import java.util.Scanner;

public class MergeSort {
	public static void merge (int arr[], int l, int m, int r) 
    { 
        
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
       
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
       
  
        
        int i = 0, j = 0; 
  
        
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
      
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
public static void sort(int arr[], int l, int r) 
	    { 
	        if (l < r) 
	        { 
	            
	            int m = (l+r)/2; 
	  
	            
	            sort(arr, l, m); 
	            sort(arr , m+1, r); 
	  
	            
	            merge(arr, l, m, r); 
	        } 
	    } 
  
	 public static int[] Takeinput() {
			Scanner s=new Scanner(System.in);
			System.out.println("enter the number of elements\n");
			int n=s.nextInt();
			int []arr=new int[n];
			int i;
			
			for(i=0;i<n;i++) {
				
				
				arr[i]=n-i;
			}
			
			return arr;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=Takeinput();
		long startTime = System.currentTimeMillis();
		sort(arr,0,arr.length-1);
		long stopTime = System.currentTimeMillis();
		System.out.println("Elapsed time was " + (stopTime - startTime));
		
		
	
  
        
	}

}
