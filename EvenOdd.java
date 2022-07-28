package com.techouts.staticApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=100;i++)
		{
			list.add(i);
		}

		List<Integer> evenList=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even numbers:\n"+evenList);
		List<Integer> oddList=list.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println("Odd numbers:\n"+oddList);
	}

}
