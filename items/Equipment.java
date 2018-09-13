package dnd;

public class Equipment {
	
	private final String name;
	private final String type;
	private final double weight;
	private final Money cost;
	private final String description;
	
	Equipment(String name, String type, double weight, Money cost, String description)
	{
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.cost = cost;
		this.description = description;
	}
	
	Equipment(String name, String type, double weight)
	{
		this(name, type, weight, new Money(0), "");
	}
	
	Equipment(String name, String type)
	{
		this(name, type, 0, new Money(0), "");
	}
	
	Equipment(String name, String type, double weight, String description)
	{
		this(name, type, weight, new Money(0), description);
	}
	
	Equipment(String name, String type, String description)
	{
		this(name, type, 0, new Money(0), description);
	}
	
	public String shorthand()
	{
		return name;
	}
	
	public String longhand()
	{
		return name + " " + type;
	}
	
	public String type()
	{
		return type;
	}
	
	public double weight()
	{
		return weight;
	}
	
	public Money cost()
	{
		return cost;
	}
	
	public boolean equals(Equipment other)
	{
		if (	this.getClass() == other.getClass() &&
				this.shorthand().equals(other.shorthand()) &&
				this.type().equals(other.type()) &&
				this.weight() == other.weight() &&
				this.cost().equals(other.cost()))
		{
			return true;
		}
		
		return false;
	}
	
	
}
