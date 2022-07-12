package com.techouts.staticApp;
import java.util.Scanner;

public class StaticApp {
	public static void main(String[] args) {

		BadmintonCourt b=new BadmintonCourt();
		FootBall f=new FootBall();
		Cricket c=new Cricket();
		Scanner sc=new Scanner(System.in);
		int count=1,slot;
		String s1;
		//while(s.equalsIgnoreCase("yes")) {
        do {
			if(count<=2) {
				System.out.println("Enter the username:");
				String name=sc.next();
				System.out.println("Enter the sport you like:\n1.Badminton \t 2.FootBall \t 3.Cricket");
				int ch=sc.nextInt();
				switch(ch) {
				case 1:
					b.display();
					System.out.println("Select anyone slot from above available slots");
					slot=sc.nextInt();
					b.slotAvailable(name,slot);
					break;

				case 2:
					f.display();
					System.out.println("Select anyone slot from above available slots");
					slot=sc.nextInt();
					f.slotAvailable(name,slot);
					break;

				case 3:
					c.display();
					System.out.println("Select anyone slot from above available slots");
					slot=sc.nextInt();
					c.slotAvailable(name,slot);
					break;

				default:
					System.out.println("Please select the valid sport");
				}
				System.out.println("Do you want to continue, enter yes or no:");
				count++;
				s1=sc.next();
			}
			else 
			{
				System.out.println("Sorry, all the slots are booked.");
				break;
			}
        }
        while(s1.equals("yes"));
		}
	}



