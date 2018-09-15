package dnd;

public class Attack {
	
	private String name;
	private int range;
	private int hitMod;
	private Dice damage;
	private DamageType damageType;
	private String description;
	
	
	Attack (String name, int range, int hitMod, Dice damage, DamageType damageType, String description)
	{
		this.name = name;
		this.range = range;
		this.hitMod = hitMod;
		this.damage = damage;
		this.damageType = damageType;
		this.description = description;
	}
	
	public String name()
	{
		return name;
	}
	
	public int range()
	{
		return range;
	}
	
	public int hitMod()
	{
		return hitMod;
	}
	
	public Dice damage()
	{
		return damage;
	}
	
	public DamageType damageType()
	{
		return damageType;
	}
	
	public String description()
	{
		return description;
	}
	
	public Roll rollHit()
	{
		return new Dice(Die.D20, hitMod).roll();
	}
	
	public Roll rollDamage()
	{
		return damage.roll();
	}

}
