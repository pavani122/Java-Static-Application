package com.techouts.staticApp;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int i,j,n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		n=sc.nextInt();
		System.out.println("Prime numbers upto "+n+" are: ");
		for(i=1;i<=n;i++)
		{
			int count=i;
			temp=0;
			for(j=1;j<=count;j++)
			{
				if(count%j==0)
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
