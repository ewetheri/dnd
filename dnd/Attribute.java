package dnd;

public enum Attribute {

	STRENGTH		(0, "Strength", "STR", false),
	DEXTERITY		(1, "Dexterity", "DEX", false),
	CONSTITUTION	(2, "Constitution", "CON", false),
	INTELLIGENCE	(3, "Intelligence", "INT", false),
	WISDOM			(4, "Wisdom", "WIS", false),
	CHARISMA		(5, "Charisma", "CHA", false),
	STR				(0, "Strength", "STR", true),
	DEX				(1, "Dexterity", "DEX", true),
	CON				(2, "Constitution", "CON", true),
	INT				(3, "Intelligence", "INT", true),
	WIS				(4, "Wisdom", "WIS", true),
	CHA				(5, "Charisma", "CHA", true);
	
	private final int index;
	private final String longhand;
	private final String shorthand;
	private final boolean modifier;
	
	Attribute(int index, String longhand, String shorthand, boolean modifier)
	{
		this.index = index;
		this.longhand = longhand;
		this.shorthand = shorthand;
		this.modifier = modifier;
	}
	
	public String shorthand()
	{
		return shorthand;
	}
	
	public String longhand()
	{
		return longhand;
	}
	
	public int index()
	{
		return index;
	}
	
	public boolean isMod()
	{
		return modifier;
	}
	
	public boolean isModifier()
	{
		return this.isMod();
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
	
	public static String shorthand(String longhand)
	{
		if (longhand == STRENGTH.longhand())
			return "STR";
		else if (longhand == DEXTERITY.longhand())
			return "DEX";
		else if (longhand == CONSTITUTION.longhand())
			return "CON";
		else if (longhand == INTELLIGENCE.longhand())
			return "INT";
		else if (longhand == WISDOM.longhand())
			return "WIS";
		else if (longhand == CHARISMA.longhand())
			return "CHA";
		else
			throw new IllegalArgumentException("Not a valid longhand");
	}
}
