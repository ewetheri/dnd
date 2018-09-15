package dnd;

public class Attributes {

	private int[] values;
	
	Attributes (int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma)
	{
		this.values[0] = strength;
		this.values[1] = dexterity;
		this.values[2] = constitution;
		this.values[3] = intelligence;
		this.values[4] = wisdom;
		this.values[5] = charisma;
	}
	
	public int score(Attribute attribute)
	{
		return values[attribute.index()];
	}
	
	public int mod(Attribute attribute)
	{
		return (values[attribute.index()]/2) - 10;
	}
	
	public int modifier(Attribute attribute)
	{
		return this.mod(attribute);
	}
	
	public void set(Attribute attribute, int value)
	{
		values[attribute.index()] = value;
	}
	
	public void increase(Attribute attribute, int increase)
	{
		values[attribute.index()] += increase;
	}
	
	public void add(Attributes other)
	{
		this.increase(Attribute.STRENGTH, other.score(Attribute.STRENGTH));
		this.increase(Attribute.DEXTERITY, other.score(Attribute.DEXTERITY));
		this.increase(Attribute.CONSTITUTION, other.score(Attribute.CONSTITUTION));
		this.increase(Attribute.INTELLIGENCE, other.score(Attribute.INTELLIGENCE));
		this.increase(Attribute.WISDOM, other.score(Attribute.WISDOM));
		this.increase(Attribute.CHARISMA, other.score(Attribute.CHARISMA));
	}
}
