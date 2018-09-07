package dnd;

public enum Attribute {

	STRENGTH		(0, "STR"),
	DEXTERITY		(1, "DEX"),
	CONSTITUTION	(2, "CON"),
	INTELLIGENCE	(3, "INT"),
	WISDOM			(4, "WIS"),
	CHARISMA		(5, "CHA");
	
	private final int index;
	private final String shorthand;	//shorthand for the attribute
	
	Attribute(int index, String shorthand)
	{
		this.index = index;
		this.shorthand = shorthand;
	}
	
	public String shorthand()
	{
		return shorthand;
	}
	
	public int index()
	{
		return index;
	}
	
	public static String longhand(String shorthand)
	{
		if (shorthand == STRENGTH.shorthand())
			return "STRENGTH";
		else if (shorthand == DEXTERITY.shorthand())
			return "DEXTERITY";
		else if (shorthand == CONSTITUTION.shorthand())
			return "CONSTITUTION";
		else if (shorthand == INTELLIGENCE.shorthand())
			return "INTELLIGENCE";
		else if (shorthand == WISDOM.shorthand())
			return "WISDOM";
		else if (shorthand == CHARISMA.shorthand())
			return "CHARISMA";
		else
			throw new IllegalArgumentException("Not a valid shorthand");
	}
	
	public static String longhand(int index)
	{
		if (index == STRENGTH.index())
			return "STRENGTH";
		else if (index == DEXTERITY.index())
			return "DEXTERITY";
		else if (index == CONSTITUTION.index())
			return "CONSTITUTION";
		else if (index == INTELLIGENCE.index())
			return "INTELLIGENCE";
		else if (index == WISDOM.index())
			return "WISDOM";
		else if (index == CHARISMA.index())
			return "CHARISMA";
		else
			throw new IllegalArgumentException("Not a valid index");
	}
}
