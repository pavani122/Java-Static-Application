package com.techouts.staticApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int i,j,n,temp=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the value of n:");
	    n=sc.nextInt();
	   for(i=2;i<n;i++)
	   {
		   for(j=1;j<=i;j++)
		   {
			   if(i%j==0)
			   {
                 temp++;
			   }
		   }
         if(temp==2)
         {
        	 System.out.print(i+" ");
         }
	   }

	}
}