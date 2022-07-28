package com.techouts.staticApp;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class NthPrime {

	public static void main(String[] args) {

		int i,j;
		 ArrayList<Integer> key=new ArrayList<Integer>();
		 ArrayList<Integer> value=new ArrayList<Integer>();

		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number:");
		 int n=sc.nextInt();
		 for(i=1;i<=n;i++)
		 { 
			 key.add(i);
		 }
		 for(j=1;j<=i;j++)
		 {
			 value.add(j);
		 }
		
		 
	
	 Map<List<Integer>,List<Integer>> map=new LinkedHashMap<List<Integer>,List<Integer>>();
	 map.put(key, value);
	  System.out.println(map);
  
   
     
     
	}

}
