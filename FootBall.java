package com.techouts.staticApp;
import java.util.LinkedHashMap;
import java.util.Map;

public class FootBall 
{
	Map<Integer,String> map=new LinkedHashMap<Integer,String>();
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

	public void display()
	{
		System.out.println(".......FOOTBALL.......\nAvailable Slots are:");
		 for(Map.Entry me : map.entrySet()){  
				System.out.print("slot "+me.getKey()+" , "+me.getValue()+"\n");

		 }
	}

	public void slotAvailable(String name,int slot) 
	{
		if(map.containsKey(slot))
		{
		System.out.println("Your slot is successfully booked.");
		map.remove(slot);
		System.out.println("Name: "+name+"\nBooked slot: "+slot+" in FootBall");
		}
		else
		{
			System.out.println("Slot "+slot+" already booked");
		}
	}

}
