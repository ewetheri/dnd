package dnd;

public class Attributes {

	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	
	Attributes (int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma)
	{
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public void increaseStrength(int increase)
	{
		this.strength += increase;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	
	public void increaseDexterity(int increase)
	{
		this.dexterity += increase;
	}

	public int getConstitution() {
		return constitution;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}
	
	public void increaseConstitution(int increase)
	{
		this.constitution += increase;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public void increaseIntelligence(int increase)
	{
		this.intelligence += increase;
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}
	
	public void increaseWisdom(int increase)
	{
		this.wisdom += increase;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}
	
	public void increaseCharisma(int increase)
	{
		this.charisma += increase;
	}
	
	public void add(Attributes other)
	{
		this.setStrength(this.getStrength() + other.getStrength());
		this.setDexterity(this.getDexterity() + other.getDexterity());
		this.setConstitution(this.getConstitution() + other.getConstitution());
		this.setIntelligence(this.getIntelligence() + other.getIntelligence());
		this.setWisdom(this.getWisdom() + other.getWisdom());
		this.setCharisma(this.getCharisma() + other.getCharisma());
	}
}
