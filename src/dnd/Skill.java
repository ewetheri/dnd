package dnd;

public enum Skill {
	
	ATHLETICS			("Athletics", Attribute.STRENGTH),
	ACROBATICS			("Acrobatics", Attribute.DEXTERITY),
	SLEIGHT_OF_HAND		("Sleight of Hand", Attribute.DEXTERITY),
	STEALTH				("Stealth", Attribute.DEXTERITY),
	ARCANA				("Arcana", Attribute.INTELLIGENCE),
	ENGINEERING			("Engineering", Attribute.INTELLIGENCE),
	HISTORY				("History", Attribute.INTELLIGENCE),
	INVESTIGATION		("Investigation", Attribute.INTELLIGENCE),
	NATURE				("Nature", Attribute.INTELLIGENCE),
	RELIGION			("Religion", Attribute.INTELLIGENCE),
	ANIMAL_HANDLING		("Animal Handling", Attribute.WISDOM),
	INSIGHT				("Insight", Attribute.WISDOM),
	MEDICINE			("Medicine", Attribute.WISDOM),
	PERCEPTION			("Perception", Attribute.WISDOM),
	SURVIVAL			("Survival", Attribute.WISDOM),
	DECEPTION			("Deception", Attribute.CHARISMA),
	INTIMIDATION		("Intimidation", Attribute.CHARISMA),
	PERFORMANCE			("Performance", Attribute.CHARISMA),
	PERSUASION			("Persuasion", Attribute.CHARISMA);
	
	
	private final String name;
	private final Attribute attribute;
	
	Skill (String name, Attribute attribute)
	{
		this.name = name;
		this.attribute = attribute;
	}
	
	public String shorthand()
	{
		return name;
	}
	
	public Attribute attribute()
	{
		return attribute;
	}
	
}
