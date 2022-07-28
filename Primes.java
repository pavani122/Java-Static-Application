package com.techouts.staticApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Primes {

	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number:");
		 int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
		{
			list.add(i);
		}

		List<Integer> list1=list.stream().filter(Primes::primeNumbers).collect(Collectors.toList());
          System.out.println(list1);
          System.out.println("Enter the position to return the prime number");
 		 int p=sc.nextInt();
 		 System.out.println("The element at "+p+"th position is: ");
 		 System.out.println(list1.get(p-1));
 		 
 		 

          
	}
	static boolean primeNumbers(int num)
	{
		int temp;
		temp=0;
		 boolean flag =false;
		for(int i=1;i<=num;i++)
		{

			if(num%i==0)
			{
				temp++;
			}
		}
		if(temp==2)
		{
			flag=true;
		}
		return flag;
	}

}
