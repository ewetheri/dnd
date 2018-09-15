package classes;

import dnd.Attribute;
import dnd.Die;
import dnd.Skill;
import items.Inventory;

public class Mystic extends CharacterClass {

	private int[] talentsKnown;
	private int[] disciplinesKnown;
	private int[] psiPoints;
	private int[] psiLimit;
	
	Mystic()
	{
		super(	//name
				"Mystic",
				//description
				"A peciliar outcast whose understanding of the self and the world allows for great mental power.",
				//hit die
				Die.D8,
				//proficiencies
				new Inventory()
					.add(Inventory.allItemsOfType("light armor"))
					.add(Inventory.allItemsOfType("simple melee"))
					.add(Inventory.allItemsOfType("simple ranged")),
				//saving throws
				new Attribute[] {Attribute.INTELLIGENCE, Attribute.WISDOM},
				//number of skills to choose
				2,
				//list of skills to choose from
				new Skill[] {Skill.ARCANA, Skill.HISTORY, Skill.INSIGHT, Skill.MEDICINE, Skill.NATURE, Skill.PERCEPTION, Skill.RELIGION},
				//name of specializations
				"Mystic Order",
				//specializations to choose from
				Specialization.type("mystic"),
				//class features
				ClassFeature.type("mystic"),				
				//spelltable
				new SpellTable()
				
				);
		
		this.talentsKnown = new int[] {1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,3,4,4,4,4};
		this.disciplinesKnown = new int[] {1,1,2,2,3,3,4,4,5,5,5,6,6,6,7,7,7,8,8,8};
		this.psiPoints = new int[] {4,6,14,17,27,32,38,44,57,64,64,64,64,64,64,64,64,71,71,71};
		this.psiLimit = new int[] {2,2,3,3,5,5,6,6,7,7,7,7,7,7,7,7,7,7,7,7};
	}
	
	public int getTalentsKnown(int level)
	{
		return this.talentsKnown[level];
	}
	
	public int getDisciplinesKnown(int level)
	{
		return this.disciplinesKnown[level];
	}
	
	public int getPsiPoint(int level)
	{
		return this.psiPoints[level];
	}
	
	public int getPsiLimit(int level)
	{
		return this.psiLimit[level];
	}
}
