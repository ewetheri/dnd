package dnd;

public class Weapon extends Equipment {
	
	private Dice damage;
	private DamageType damageType;
	private WeaponKeyword[] keywords;
	private int range;
	private int maxRange;
	
	Weapon(String name, String type, double weight, Money cost, String description, Dice damage, DamageType damageType, WeaponKeyword[] keywords, int range, int maxRange)
	{
		super(name,  type, weight, cost, description);
		this.damage = damage;
		this.damageType = damageType;
		this.keywords = keywords;
		this.range = range;
		this.maxRange = maxRange;
	}
	
	public Dice damage()
	{
		return damage;
	}
	
	public DamageType damageType()
	{
		return damageType;
	}
	
	public WeaponKeyword[] keywords()
	{
		return keywords;
	}
	
	public String attack()
	{
		return damage.roll().result() + " " + damageType.longhand();
	}
	
	public boolean has(WeaponKeyword keyword)
	{
		boolean has = false;
		for (int i = 0; i < keywords.length; i++)
		{
			if (keywords[i] == keyword)
			{
				has = true;
			}
		}
		
		return has;
	}
	
	public int range()
	{
		return range;
	}
	
	public int maxRange()
	{
		return maxRange;
	}
	
	
}
