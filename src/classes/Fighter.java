package classes;

import dnd.Attribute;
import dnd.Die;
import dnd.Skill;
import items.Inventory;

public class Fighter extends CharacterClass {

	Fighter()
	{
		super(	//name
				"Fighter",
				//description
				"A master of martial combat, skilled with a variety of weapons and armor.",
				//hit die
				Die.D10,
				//proficiencies
				new Inventory()
					.add(Inventory.allItemsOfType("light armor"))
					.add(Inventory.allItemsOfType("medium armor"))
					.add(Inventory.allItemsOfType("heavy armor"))
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
				new Skill[] {Skill.ACROBATICS, Skill.ANIMAL_HANDLING, Skill.ATHLETICS, Skill.HISTORY, Skill.INSIGHT, Skill.INTIMIDATION, Skill.PERCEPTION, Skill.SURVIVAL},
				//name of specializations
				"Martial Archetype",
				//specializations to choose from
				Specialization.type("fighter"),
				//class features
				ClassFeature.type("fighter"),				
				//spelltable
				new SpellTable()
				
				);
	}
	
}
