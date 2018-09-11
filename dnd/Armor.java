package dnd;

public class Armor extends Equipment {
	
	private final int AC;
	private final int requiredStrength;
	private final boolean stealthDisadvantage;
	
	
	Armor (String name, String type, double weight, Money cost, String description, int AC, int requiredStrength, boolean stealthDisadvantage)
	{
		super(name,  type, weight, cost, description);
		this.AC = AC;
		this.requiredStrength = requiredStrength;
		this.stealthDisadvantage = stealthDisadvantage;
	}
	
	public String longhand()
	{
		return super.shorthand() + " armor";
	}
	
	public int AC()
	{
		return AC;
	}
	
	public boolean addDex()
	{
		return (super.type() == "light" || super.type() == "medium");
	}
	
	public boolean limitDex()
	{
		return (super.type() == "medium");
	}
	
	public int requiredStrength()
	{
		return requiredStrength;
	}

	public boolean stealthDisadvantage()
	{
		return stealthDisadvantage;
	}
	
	public boolean equals(Armor other)
	{
		return true;
	}
}
