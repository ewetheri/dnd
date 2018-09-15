package dnd;

public class Monster extends Creature {
	
	private String type;			//e.g. undead, machine, fey, god
	private String[] attackNames;
	private Attack[] attacks;
	private int AC;
	
	Monster(String name, String type, double weight, Size size, int speed)
	{
		super(name, weight, size, speed);
		this.type = type;
		attacks = new Attack[0];
		AC = 0;
	}
	
	Monster(String name, double weight, Size size, int speed)
	{
		this(name, "", weight, size, speed);
	}
	
	public int indexOfAttack(Attack attack)
	{
		return this.indexOfAttack(attack.name());
	}
	
	public int indexOfAttack(String name)
	{
		for (int i = 0; i < attacks.length; i++)
		{
			if (attacks[i].name().equals(name()))
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public Attack getAttack(int index)
	{
		return attacks[index];
	}
	
	public boolean addAttack(Attack attack)
	{
		if (this.indexOfAttack(attack) == -1)
		{
			Attack[] newAttacks = new Attack[attacks.length + 1];
			
			for (int i = 0; i < attacks.length; i++)
			{
				newAttacks[i] = attacks[i];
			}
			
			newAttacks[newAttacks.length-1] = attack;
			
			return true;
		}
		
		return false;
		
	}
	
	
}
