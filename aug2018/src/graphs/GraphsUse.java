package graphs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GraphsUse {
public static void PrintDfS(HashMap<Integer, ArrayList<Integer>> adjacencyList) {
	HashMap<Integer, Boolean> visited=new HashMap<>();
	for(int key:adjacencyList.keySet()) {
		if(!visited.containsKey(key)) {
			DFSHelper(adjacencyList,key, visited);
		}
	}
}
public static void DFSHelper(HashMap<Integer, ArrayList<Integer>> adjacencyList,int source,HashMap<Integer, Boolean> visited) {
	System.out.print(source+" ");
	visited.put(source, true);
	for(int adjacentVertex:adjacencyList.get(source)) {
		if(!visited.containsKey(adjacentVertex)) {
			DFSHelper(adjacencyList, adjacentVertex, visited);
		}
		}
}
public static boolean isconnected(HashMap<Integer, ArrayList<Integer>> adjacencyList) {
	HashMap<Integer, Boolean> visited =new HashMap<>();
	DFSHelper(adjacencyList, 1, visited);
	if(adjacencyList.size()==visited.size()) {
		return true;
	}
	else {
		return false;
	}
	//return visited.size()==adjacencyList.size();
}
public static boolean Haspath(HashMap<Integer, ArrayList<Integer>> adjacencyList) {
	HashMap<Integer, Boolean> visited=new HashMap<>();
	DFSHelper(adjacencyList, 1, visited);
	return true;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int numV=s.nextInt();
		int numE=s.nextInt();
		HashMap<Integer,ArrayList<Integer>> adjacencyList =new HashMap<>();
		int count=1;
		for(int i=0;i<numV;i++) {
			adjacencyList.put(i, new ArrayList<>());
		}
		 while(count<=numE ){
			 int source=s.nextInt();
			 int destination=s.nextInt();
			 adjacencyList.get(source).add(destination); 
			 adjacencyList.get(destination).add(source); 
			 /*if(!adjacencyList.containsKey(source)) {
				 ArrayList<Integer> list=new ArrayList<>();
				 list.add(destination);
				 adjacencyList.put(source, list);
			 }
			 else {
				adjacencyList.get(source).add(destination); 
			 }
			 if(!adjacencyList.containsKey(destination)) {
				 ArrayList<Integer> list=new ArrayList<>();
				 list.add(source);
				 adjacencyList.put(destination, list);
			 }
			 else {
				adjacencyList.get(destination).add(source); 
			 }*/
			 count++;
		 }
         PrintDfS(adjacencyList);
         System.out.println("connected :");
         System.out.println(isconnected(adjacencyList));
         
	}

}
