package dnd;

import classes.CharacterClass;
import items.Equipment;
import items.Inventory;
import items.Money;

public class Character extends Creature {

	private Race race;
	private Attributes attributes;
	private Skill[] skills;
	private CharacterClass[] classes;
	private int[] levels;
	private Inventory inventory;
	private Money money;
	
	Character(String name, String description, double weight, Size size, int speed, Race race)
	{
		super(name, description, weight, size, speed);
		this.race = race;
		this.attributes = null;
		this.skills = new Skill[0];
		this.classes = new CharacterClass[0];
		this.levels = new int[0];
		this.inventory = new Inventory();
		this.money = new Money();
	}
	
	public boolean ready()
	{
		if (attributes == null || skills.length == 0 || classes.length == 0 || levels.length == 0)
		{
			return false;
		}
		
		return true;
	}
	
	public Race race()
	{
		return race;
	}
	
	public void changeRace(Race race)
	{
		this.race = race;
	}

	public Attributes attributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public Skill[] skills() {
		return skills;
	}
	
	public boolean hasSkill(Skill skill)
	{
		for (int i = 0; i < skills.length; i++)
		{
			if (skills[i].shorthand().equals(skill.shorthand()))
			{
				return true;
			}
		}
		
		return false;
	}

	public boolean addSkill(Skill skill)
	{
	
		if (!this.hasSkill(skill))
		{
			Skill[] newSkills = new Skill[skills.length + 1];
			for (int i = 0; i < skills.length; i++)
			{
				newSkills[i] = skills[i];
			}
			
			newSkills[newSkills.length-1] = skill;
			
			skills = newSkills;
			
			return true;
		}
		
		return false;
		
		
	}

	public CharacterClass[] classes() {
		return classes;
	}
	
	public boolean hasClass(CharacterClass c)
	{
		for (int i = 0; i < classes.length; i++)
		{
			if (classes[i].shorthand().equals(c.shorthand()))
			{
				return true;
			}
		}
		
		return false;
	}

	public boolean addClass(CharacterClass c)
	{
		if (!this.hasClass(c))
		{
			CharacterClass[] newClasses = new CharacterClass[classes.length + 1];
			int[] newLevels = new int[newClasses.length];
			
			for (int i = 0; i < classes.length; i++)
			{
				newClasses[i] = classes[i];
				newLevels[i] = levels[i];
			}
			
			newClasses[newClasses.length-1] = c;
			newLevels[newLevels.length-1] = 1;
			
			classes = newClasses;
			
			return true;
		}
		
		return false;
	}
	
	public int classLevel(CharacterClass c)
	{
		
		for (int i = 0; i < classes.length; i++)
		{
			if (classes[i].shorthand().equals(c.shorthand()))
			{
				return levels[i];
			}
		}
		
		return -1;
	}
	
	public boolean levelUp(CharacterClass c)
	{
		for (int i = 0; i < classes.length; i++)
		{
			if (classes[i].shorthand().equals(c.shorthand()))
			{
				levels[i]++;
				return true;
			}
		}
		
		return false;
	}
	
	public boolean levelDown(CharacterClass c)
	{
		for (int i = 0; i < classes.length; i++)
		{
			if (classes[i].shorthand().equals(c.shorthand()))
			{
				levels[i]--;
				return true;
			}
		}
		
		return false;
	}
	
	public int[] levels() {
		return levels;
	}
	
	public int numClasses()
	{
		return classes.length;
	}
	
	public int level()
	{
		int total = 0;
		for (int i = 0; i < levels.length; i++)
		{
			total += levels[i];
		}
		
		return total; 
	}
	
	public Inventory inventory()
	{
		return inventory;
	}
	
	public void addInventory(Inventory i)
	{
		inventory.add(i);
	}
	
	public void addItem(Equipment e)
	{
		inventory.add(e);
	}
	
	public Money money()
	{
		return money;
	}
	
	public void gainMoney(Money value)
	{
		money.gain(value);
	}
	
	public void spendMoney(Money value)
	{
		money.spend(value);
	}
	
}
