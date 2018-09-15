package items;

import java.util.Arrays;

public enum DefaultInventory {
	
	ALL					("all", Inventory.allItems()),
	
	LIGHT_ARMOR			("light armor", Inventory.allItemsOfType("light armor")),
	
	MEDIUM_ARMOR		("medium armor", Inventory.allItemsOfType("medium armor")),
	
	HEAVY_ARMOR			("heavy armor", Inventory.allItemsOfType("heavy armor")),
	
	SIMPLE_MELEE		("simple melee", Inventory.allItemsOfType("simple melee")),
	
	MARTIAL_MELEE		("martial melee", Inventory.allItemsOfType("martial melee")),
	
	SIMPLE_RANGED		("simple ranged", Inventory.allItemsOfType("simple ranged")),
	
	MARTIAL_RANGED		("martial ranged", Inventory.allItemsOfType("martial ranged")),
	
	TOOLS				("tools", Inventory.allItemsOfType("tool")),
	
	MISCELLANEOUS		("miscellaneous", Inventory.allItemsOfType("miscellaneous")),
	
	CONSUMABLES			("consumables", Inventory.allItemsOfType("consumable")),
	
	AMMUNITION			("ammunition", Inventory.allItemsOfType("ammunition")),
	
	CONTAINERS			("containers", Inventory.allItemsOfType("container")),
	
	CLOTHES				("clothes", Inventory.allItemsOfType("clothes")),
	
	ARCANE_FOCI			("arcane foci", Inventory.allItemsOfType("arcane focus")),
	
	DRUIDIC_FOCI		("druidic foci", Inventory.allItemsOfType("druidic focus")),
	
	HOLY_SYMBOLS		("holy symbols", Inventory.allItemsOfType("holy symbol")),
	
	INSTRUMENTS			("instruments", Inventory.allItemsOfType("instrument")),
	
	;
	
	private final String name;
	private final Inventory contents;
	
	DefaultInventory(String name, Inventory contents)
	{
		this.name = name;
		this.contents = contents;
	}
	
	public String shorthand()
	{
		return name;
	}
	
	public String longhand()
	{
		return name + ": " + contents.count();
	}
	
	public Inventory get()
	{
		return contents;
	}
}
