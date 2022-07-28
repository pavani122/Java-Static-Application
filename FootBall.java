package com.techouts.staticApp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FootBall 
{
	Map<Integer,String> map=new LinkedHashMap<Integer,String>();
	Scanner sc=new Scanner(System.in);
	boolean flag=true;
	int slot;int n=2;
	FootBall()
	{
	int count=8;
	for(int i=11;i<=30;i++)
	{
		map.put(i,toString(count)+":00-"+toString(count)+":30");
		map.put(++i,toString(count)+":30-"+toString(++count)+":00");

	}
	}

	public int toString(int count) {
		return count;
	}

	public void display(String name)
	{
		System.out.println(".......FOOTBALL.......\nAvailable Slots are:");
		 for(Map.Entry me : map.entrySet()){  
				System.out.print("slot "+me.getKey()+" , "+me.getValue()+"\n");

		 }
		  flag = true;
			System.out.println("Select anyone slot from above available slots");
			try
			{
			slot=Integer.parseInt(sc.next());
			}
			catch(Exception e)
			{
				System.out.println("Input must be a number");n--;
				if(n==1) {
				display(name);}
				flag=false;

			}		
			if(flag) {
			slotAvailable(name,slot);}
	}

	public void slotAvailable(String name,int slot) 
	{
		if(slot>=11 && slot<=30)
		{
			if(map.containsKey(slot)){
		System.out.println("Your slot is successfully booked.");
		map.remove(slot);
		System.out.println("Name: "+name+"\nBooked slot: "+slot+" in FootBall");
		    }
		   else
		  {
			System.out.println("Slot "+slot+" already booked");
		   }
		}
		else
		{
			System.out.println("please select the slot from available slots");
		}
	}

}
