package dnd;

public class Inventory {
	
	private Equipment[] items;
	private int[] count;
	private final static int STARTING_SIZE = 10;
	//private final static String SORT_TYPE = "simple";
	
	Inventory()
	{
		this.items = new Equipment[STARTING_SIZE];
		this.count = new int[STARTING_SIZE];
	}
	
	Inventory(Equipment item)
	{
		this();
		this.add(item);
	}
	
	Inventory(Equipment[] items)
	{
		this();
		for (int i = 0; i < items.length; i++)
		{
			this.add(items[i]);
		}
	}
	
	public Equipment get(int index)
	{
		if (index < 0 || index >= this.size())
		{
			throw new ArrayIndexOutOfBoundsException("Not a valid item index. use .size() to find current length of array.");
		}
		
		return items[index];
	}
	
	public int size()
	{
		if (this.full())
		{
			this.expand();
		}
		
		for (int i = 0; i < items.length; i++)
		{
			if (items[i] == null)
			{
				return i;
			}
		}
		
		//should never be reached, something has gone wrong.
		return -1;
	}
	
	public int count(Equipment equipment)
	{
		for (int i = 0; i < this.size(); i++)
		{
			if (items[i].equals(equipment))
			{
				return count[i];
			}
		}
		
		return 0;
	}
	
	public int count()
	{
		int total = 0;
		for (int i =0; i < this.size(); i++)
		{
			total += count[i];
		}
		
		return total;
	}
	
	public void add(Equipment item)
	{
		int index = this.find(item);
		
		//.find() will return a positive index if items[] already has a copy. We'll just increase the count.
		if (index > 0)
		{
			count[index]++;
		}
		
		//.find() will return -1 if there's no copy. We need to find the first empty spot in items[] to insert this new item.
		else
		{
			//.size() will automatically expand the array, if it isn't big enough
			int pointer = this.size();
			items[pointer] = item;
			count[pointer] = 1;
		}
	}
	
	public void add(Inventory other)
	{
		for (int i = 0; i < other.size(); i++)
		{
			this.add(other.get(i));
		}
	}
	
	public int find(Equipment item)
	{
		for (int i = 0; i < items.length; i++)
		{
			if (items[i].equals(item))
			{
				return i;
			}
		}
		
		return -1;
	}
	
	private void expand()
	{
		Equipment[] newItems = new Equipment[items.length * 2];
		int[] newCount = new int[newItems.length];
		
		for(int i = 0; i < items.length; i++)
		{
			newItems[i] = items[i];
			newCount[i] = count[i];
		}
		
		items = newItems;
		count = newCount;
	}
	
	private boolean full()
	{
		if (items[items.length-1] == null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public int countType(String type)
	{
		int total = 0;
		for(int i = 0; i < this.size(); i++)
		{
			if (items[i].type().equals(type))
			{
				total += count[i];
			}
		}
		
		return total;
	}
	
	public double weightOfType(String type)
	{
		double total = 0;
		for(int i = 0; i < this.size(); i++)
		{
			if (items[i].type().equals(type))
			{
				total += count[i] * items[i].weight();
			}
		}
		
		return total;
	}
	
	public Money costOfType(String type)
	{
		Money total = new Money(0);
		for(int i = 0; i < this.size(); i++)
		{
			if (items[i].type().equals(type))
			{
				total.add(items[i].cost());
			}
		}
		
		return total;
	}
	
	public double totalWeight()
	{
		double total = 0;
		
		for(int i = 0; i < this.size(); i++)
		{
			total += count[i] * items[i].weight();
		}
		
		return total;
	}
	
	public Money totalCost()
	{
		Money total = new Money(0);
		
		for(int i = 0; i < this.size(); i++)
		{
			total.add(items[i].cost());
		}
		
		return total;
	}
	
	public Inventory itemsOfType(String type)
	{
		Inventory results = new Inventory();
		for (int i = 0; i < this.size(); i++)
		{
			if (items[i].type().equals(type))
			{
				results.add(items[i]);
			}
		}
		
		return results;
	}
	
	public Equipment[] uniques()
	{
		Equipment[] uniques = new Equipment[this.size()];
		
		for(int i = 0; i < this.size(); i++)
		{
			uniques[i] = items[i];
		}
		
		return uniques;
	}
	
	public static Inventory allItems()
	{
		DefaultEquipment[] all = DefaultEquipment.values();
		Inventory result = new Inventory();
		
		for (int i = 0; i < all.length; i++)
		{
			result.add(all[i].get());
		}
		
		return result;
	}
	
	public static Inventory allItemsOfType(String type)
	{
		DefaultEquipment[] all = DefaultEquipment.values();
		Inventory result = new Inventory();
		
		for (int i = 0; i < all.length; i++)
		{
			Equipment current = all[i].get();
			if (current.type().equals(type))
			{
				result.add(current);
			}
		}
		
		return result;
	}
	
	public static void main (String[] args)
	{
		
	}
}
