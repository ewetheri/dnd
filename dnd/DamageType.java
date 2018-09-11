package dnd;

public enum DamageType {
	
	SLASHING		("slashing"),
	BLUDGEONING		("bludgeoning"),
	PIERCING		("piercing"),
	ACID			("acid"),
	COLD			("cold"),
	FIRE			("fire"),
	FORCE			("force"),
	LIGHTING		("lightning"),
	NECROTIC		("necrotic"),
	POISON			("poison"),
	PSYCHIC			("psychic"),
	RADIANT			("radiant"),
	THUNDER			("thunder"),
	NONE			("none");
	
	
	private final String name;
	
	
	DamageType(String name)
	{
		this.name = name;
	}
	
	public String shorthand()
	{
		return name;
	}
	
	public String longhand()
	{
		return name + " damage";
	}
	
}
