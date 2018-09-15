package classes;

import dnd.Attribute;
import dnd.Die;
import dnd.Skill;
import items.DefaultEquipment;
import items.Inventory;

public class BloodHunter extends CharacterClass {

	
	BloodHunter()
	{
		super(	//name
				"Blood Hunter",
				//description
				"A fanatical slayer that embraces dark knowledge to destroy evil.",
				//hit die
				Die.D10,
				//proficiencies
				new Inventory()
					.add(Inventory.allItemsOfType("light armor"))
					.add(Inventory.allItemsOfType("medium armor"))
					.add(Inventory.allItemsOfType("shield"))
					.add(Inventory.allItemsOfType("simple melee"))
					.add(Inventory.allItemsOfType("simple ranged"))
					.add(Inventory.allItemsOfType("martial melee"))
					.add(Inventory.allItemsOfType("martial ranged"))
					.add(DefaultEquipment.ALCHEMISTS_SUPPLIES.get()),
				//saving throws
				new Attribute[] {Attribute.STRENGTH, Attribute.WISDOM},
				//number of skills to choose
				2,
				//list of skills to choose from
				new Skill[] {Skill.ATHLETICS, Skill.ACROBATICS, Skill.ARCANA, Skill.INSIGHT, Skill.INVESTIGATION, Skill.SURVIVAL},
				//name of specializations
				"Order",
				//specializations to choose from
				Specialization.type("blood hunter"),
				//class features
				ClassFeature.type("blood hunter"),
				//spelltable
				new SpellTable()
				
				);
	}
}
