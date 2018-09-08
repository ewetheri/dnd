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
			return "Strength";
		else if (shorthand == DEXTERITY.shorthand())
			return "Dexterity";
		else if (shorthand == CONSTITUTION.shorthand())
			return "Constitution";
		else if (shorthand == INTELLIGENCE.shorthand())
			return "Intelligence";
		else if (shorthand == WISDOM.shorthand())
			return "Wisdom";
		else if (shorthand == CHARISMA.shorthand())
			return "Charisma";
		else
			throw new IllegalArgumentException("Not a valid shorthand");
	}
	
	public static String longhand(int index)
	{
		if (index == STRENGTH.index())
			return "Strength";
		else if (index == DEXTERITY.index())
			return "Dexterity";
		else if (index == CONSTITUTION.index())
			return "Constitution";
		else if (index == INTELLIGENCE.index())
			return "Intelligence";
		else if (index == WISDOM.index())
			return "Wisdom";
		else if (index == CHARISMA.index())
			return "Charisma";
		else
			throw new IllegalArgumentException("Not a valid index");
	}
}
