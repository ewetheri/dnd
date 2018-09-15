package items;

import dnd.DamageType;
import dnd.Dice;

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
	
	private boolean sameKeywords(Weapon other)
	{
		WeaponKeyword[] otherKeywords = other.keywords();
		
		for (int i = 0; i < keywords.length; i++)
		{
			if (!other.has(keywords[i]))
			{
				return false;
			}
		}
		
		for (int i = 0; i < otherKeywords.length; i++)
		{
			if (!this.has(otherKeywords[i]))
			{
				return false;
			}
		}
		
		return true;
	}
	
	public boolean equals(Weapon other)
	{
		if (	super.equals(other) &&
				this.damage().equals(other.damage()) &&
				this.damageType().shorthand().equals(other.damageType().shorthand()) &&
				this.sameKeywords(other) &&
				this.range() == other.range() &&
				this.maxRange() == other.maxRange())	//todo ranges
		{
			return true;
		}
		
		return false;
	}
	
	
}
