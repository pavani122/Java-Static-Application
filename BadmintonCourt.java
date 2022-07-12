package com.techouts.staticApp;
import java.util.*;

public class BadmintonCourt {
			
	Map<Integer,String> map=new LinkedHashMap<Integer,String>();
	BadmintonCourt()
	{
	int count=8;
	for(int i=1;i<=10;i++)
	{
		map.put(i,toString(count)+":00-"+toString(++count)+":00");
	}
	}

	public int toString(int count) {
		return count;
	}

	public void display()
	{
		System.out.println(".......BADMINTON.......\nAvailable Slots are:");
		 for(Map.Entry me : map.entrySet()){  
				System.out.print("slot "+me.getKey()+" , "+me.getValue()+"\n");

		 }
	}

	public void slotAvailable(String name,int slot) 
	{
		if(map.containsKey(slot)) {
		System.out.println("Your slot is successfully booked.");
		map.remove(slot);
		System.out.println("Name: "+name+"\nBooked slot: "+slot+" in Badminton");
		}
		else
		{
			System.out.println("Slot "+slot+" already booked");
		}
	}
}