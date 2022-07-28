package com.techouts.staticApp;
import java.util.Scanner;

public class StaticApp {
	public static void main(String[] args) throws InvalidSelectException {

		boolean flag=true;
		BadmintonCourt b=new BadmintonCourt();
		FootBall f=new FootBall();
		Cricket c=new Cricket();
		Scanner sc=new Scanner(System.in);
		int count=1,slot = 0;int ch=0;
		String s1;
        do {
		
				System.out.println("Enter the username:");
				String name=sc.next();
				do
				{
				System.out.println("Enter the sport you like:\n1.Badminton \t 2.FootBall \t 3.Cricket");
				try {
				ch=Integer.parseInt(sc.next());
				}
				catch(Exception e)
				{
					System.out.println("Input must be number");
					flag=false;
				}
				if(flag)
				{
				switch(ch) {
				case 1:
					b.display(name);
					break;

				case 2:
					f.display(name);
					
					break;

				case 3:
					c.display(name);
					break;

				default:
					System.out.println("Please select the valid sport");
				}
				}
				System.out.println("Do you want to continue, enter y or n:");
				count++;
				s1=sc.next();
				flag=true;
				
				if(s1.equals("n"))
				{
					System.out.println(name+"\nThankYou");
				}
				}
				while(s1.equals("y"));
				System.out.println("Do you want to continue, enter y or n:");
				count++;
				s1=sc.next();
				

        }
        while(s1.equals("yes"));
        
	}

}

