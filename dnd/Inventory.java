package dnd;

import java.util.ArrayList;
import java.util.Arrays;

public class Inventory {
	
	
	
	private ArrayList<Equipment> items;
	
	Inventory(Equipment[] items)
	{
		this.items = new ArrayList<Equipment>(Arrays.asList(items)); 
	}
	
	public int count(Equipment equipment)
	{
		int count = 0;
		for (int i = 0; i < items.size(); i++)
		{
			if (items.get(i).equals(equipment))
			{
				count++;
			}
		}
		
		return count;
	}
	
	
	public static void main (String[] args)
	{
		
	}
}
