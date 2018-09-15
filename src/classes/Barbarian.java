package classes;

import dnd.Attribute;
import dnd.Die;
import dnd.Skill;
import items.DefaultEquipment;
import items.Inventory;

public class Barbarian extends CharacterClass{

	private int[] rages;
	private int[] rageDamage;
	
	Barbarian()
	{
		super(	//name
				"Barbarian",
				//description
				"A fierce warrior of primitive background who can enter a battle rage.",
				//hit die
				Die.D12,
				//proficiencies
				new Inventory()
					.add(Inventory.allItemsOfType("light armor"))
					.add(Inventory.allItemsOfType("medium armor"))
					.add(Inventory.allItemsOfType("shield"))
					.add(Inventory.allItemsOfType("simple melee"))
					.add(Inventory.allItemsOfType("simple ranged"))
					.add(Inventory.allItemsOfType("martial melee"))
					.add(Inventory.allItemsOfType("martial ranged")),
				//saving throws
				new Attribute[] {Attribute.STRENGTH, Attribute.CONSTITUTION},
				//number of skills to choose
				2,
				//list of skills to choose from
				new Skill[] {Skill.ANIMAL_HANDLING, Skill.ATHLETICS, Skill.INTIMIDATION, Skill.NATURE, Skill.PERCEPTION, Skill.SURVIVAL},
				//name of specializations
				"Primal Path",
				//specializations to choose from
				Specialization.type("barbarian"),
				//class features
				ClassFeature.type("barbarian"),				
				//spelltable
				new SpellTable()
				
				);
		
		this.rages = new int[] {2,2,3,3,3,4,4,4,4,4,4,5,5,5,5,5,6,6,6,Integer.MAX_VALUE};
		this.rageDamage = new int[] {2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,4,4,4,4,4};
	}
	
	public int rages(int level)
	{
		return rages[level];
	}
	
	public int rageDamage(int level)
	{
		return rageDamage[level];
	}
	
}
