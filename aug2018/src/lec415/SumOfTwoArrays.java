package lec415;

public class SumOfTwoArrays {
    public static int[] Sumofarrays(int[] arr1, int[] arr2) {
    	int size=returnsize(arr1, arr2);
    	int[] result=new int[size];
    	
    	int carry=0;
		int sum=0;
        int index1=arr1.length-1;
        int index2=arr2.length-1;
        int i=result.length-1;
        int small;
        if(index1>=index2) {
        small=index2;
        
        }
        else {
        	small=index1;
        	
        }
    	while(small>=0) {
    		sum=0;
    		
	    	sum=arr1[index1]+arr2[index2]+carry;
	    		
	    			result[i]=sum%10;
	    			carry=sum/10;
	    			
	    		
	    		index1--;
	    		index2--;
	    		
	    		small--;
	    		i--;
	    	}
    	if(index1>index2) {
    		while(index1>=0) {
    			sum=arr1[index1]+carry;
    			result[i]=sum%10;
    			carry=sum/10;
                index1--;
                i--;
                
    		}
    			
    	}
    	else {
    		while(index2>=0) {
    			sum=arr2[index2]+carry;
    			result[i]=sum%10;
    			carry=sum/10;
    			index2--;
    			i--;
    	}}
    	
    	result[0]=carry;
    	
    	return result;
    }
    public static int returnsize(int[] arr1,int[] arr2) {
    	int n=arr1.length+1;
    	int m=arr2.length+1;
    	if(arr1.length>=arr2.length) {
    		return  n;
    	}
    	else {
    		return m;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {8,5,2};
		int[] arr2= {1,3};
		int[] result=Sumofarrays(arr1, arr2);
for(int i=0;i<result.length;i++) {
	System.out.print(result[i]+" ");
}
	}

}
