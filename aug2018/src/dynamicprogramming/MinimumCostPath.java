package dynamicprogramming;

import javax.print.DocFlavor.INPUT_STREAM;

public class MinimumCostPath {
    public static int mincostpathrec(int[][] cost,int i,int j) {
    	//base case
    	 if(i>cost.length-1 || j>cost[i].length-1) {
    		return Integer.MAX_VALUE;
    	}
    	//special case
    	if(i==cost.length-1&& j==cost[i].length-1) {
    		return cost[i][j];
    	}
    	int ans1=mincostpathrec(cost,i,j+1);
    	int ans2=mincostpathrec(cost, i+1, j+1);
    	int ans3=mincostpathrec(cost, i+1, j);
    	return Math.min(ans1, Math.min(ans2, ans3))+cost[i][j];
    }
    public static int mincostpath(int[][] cost,int i,int j,int[][] storage) {
    	//base case
   	 if(i>cost.length-1 || j>cost[i].length-1) {
   		return Integer.MAX_VALUE;
   	}
   	//special case
   	if(i==cost.length-1&& j==cost[i].length-1) {
   		storage[i][j]=cost[i][j];
   		return cost[i][j];
   		
   	}
    	
    	int ans1,ans2,ans3;
       if(storage[i][j]!=Integer.MAX_VALUE) {
    	   return storage[i][j];
       }
       else {
    	   if(storage[i][j+1]!=Integer.MAX_VALUE) {
    		   ans1=storage[i][j+1];
    	   }
    	   else {
    		   ans1=mincostpath(cost, i, j+1,storage);
    		   storage[i][j+1]=ans1;
    	   }
    	   if(storage[i+1][j+1]!=Integer.MAX_VALUE) {
    		   ans2=storage[i+1][j+1];
    	   }
    	   else {
    		   ans2=mincostpath(cost, i+1, j+1,storage);
    		   storage[i+1][j+1]=ans2;
    	   }
    	   if(storage[i+1][j]!=Integer.MAX_VALUE) {
    		   ans3=storage[i+1][j];
    	   }
    	   else {
    		   ans3=mincostpath(cost, i+1, j,storage);
    		   storage[i+1][j]=ans3;
    	   }
    	   storage[i][j]=cost[i][j]+Math.min(ans1, Math.min(ans2, ans3));
    	   return storage[i][j];
    	   
       }
       
    }
	public static void main(String[] args) {
		int input[][]= {{2,3,9},{4,16,5},{12,8,1}};
		int storage[][]=new int[input.length+1][input[0].length+1];
		for(int k=0;k<storage.length;k++) {
    		for(int h=0;h<storage[k].length;h++) {
    			storage[k][h]=Integer.MAX_VALUE;
    		}
    	}
		int cost=mincostpath(input, 0, 0, storage);
		System.out.println(cost);
	}

}
