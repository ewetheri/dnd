package classes;

import dnd.Attribute;
import dnd.Die;
import dnd.Skill;
import items.Inventory;

public class CharacterClass {
	
	private String name;
	private String description;
	private Die hitDie;
	private Inventory proficiencies;
	private Attribute[] savingThrows;
	private int numSkills;
	private Skill[] skills;
	private String specName;
	private Specialization[] specChoices;
	private Specialization spec;
	private ClassFeature[] features;
	private SpellTable spellTable;
	
	
	CharacterClass(String name, String description, Die hitDie, Inventory proficiencies, Attribute[] savingThrows, int numSkills, Skill[] skills, String specName, Specialization[] specChoices, ClassFeature[] features, SpellTable spellTable)
	{
		this.name = name;
		this.description = description;
		this.hitDie = hitDie;
		this.proficiencies = proficiencies;
		this.savingThrows = savingThrows;
		this.numSkills = numSkills;
		this.skills = skills;
		this.specName = specName;
		this.specChoices = specChoices;
		this.spec = null;
		this.features = features;
		this.spellTable = spellTable;
	}
	
	public String shorthand()
	{
		return name;
	}
	
	public String longhand()
	{
		return name + ": " + description;
	}
	
	public String description()
	{
		return description;
	}
	
	public Die hitDie()
	{
		return hitDie();
	}
	
	public Inventory proficiencies()
	{
		return proficiencies;
	}
	
	public int numSkills()
	{
		return numSkills;
	}
	
	public Skill[] skills()
	{
		return skills;
	}
	
	public String specName()
	{
		return specName;
	}
	
	public Specialization[] specChoices()
	{
		return specChoices;
	}
	
	public ClassFeature[] features()
	{
		return features;
	}
	
	public int hitPointLevelUpRandom()
	{
		return hitDie.roll().result();
	}
	
	public int hitPointLevelUpSet()
	{
		return hitDie.sides()/2 + 1;
	}
	
	public void chooseSpec(Specialization spec)
	{
		this.spec = spec;
	}
	
	public SpellTable spellTable()
	{
		return spellTable;
	}
}
