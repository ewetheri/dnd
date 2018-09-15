package classes;

import dnd.Attribute;
import dnd.Die;
import dnd.Skill;
import items.DefaultEquipment;
import items.Inventory;

public class Ranger extends CharacterClass {

	
	Ranger()
	{
		super(	//name
				"Ranger",
				//description
				"A warrior who combats threats on the edges of civilization.",
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
					.add(Inventory.allItemsOfType("martial ranged")),
				//saving throws
				new Attribute[] {Attribute.STRENGTH, Attribute.DEXTERITY},
				//number of skills to choose
				3,
				//list of skills to choose from
				new Skill[] {Skill.ANIMAL_HANDLING, Skill.ATHLETICS, Skill.INSIGHT, Skill.INVESTIGATION, Skill.NATURE, Skill.PERCEPTION, Skill.STEALTH, Skill.SURVIVAL},
				//name of specializations
				"Ranger Conclave",
				//specializations to choose from
				Specialization.type("ranger"),
				//class features
				ClassFeature.type("ranger"),
				//spelltable
				new SpellTable().setSpellsKnown(new int[] {0,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11})
				.setSpellTable(new int[][] {{0,	0,	0,	0,	0,	0,	0,	0,	0},
											{2,	0,	0,	0,	0,	0,	0,	0,	0},
											{3,	0,	0,	0,	0,	0,	0,	0,	0},
											{3,	0,	0,	0,	0,	0,	0,	0,	0},
											{4,	2,	0,	0,	0,	0,	0,	0,	0},
											{4,	2,	0,	0,	0,	0,	0,	0,	0},
											{4,	3,	0,	0,	0,	0,	0,	0,	0},
											{4,	3,	0,	0,	0,	0,	0,	0,	0},
											{4,	3,	2,	0,	0,	0,	0,	0,	0},
											{4,	3,	2,	0,	0,	0,	0,	0,	0},
											{4,	3,	3,	0,	0,	0,	0,	0,	0},
											{4,	3,	3,	0,	0,	0,	0,	0,	0},
											{4,	3,	3,	1,	0,	0,	0,	0,	0},
											{4,	3,	3,	1,	0,	0,	0,	0,	0},
											{4,	3,	3,	2,	0,	0,	0,	0,	0},
											{4,	3,	3,	2,	0,	0,	0,	0,	0},
											{4,	3,	3,	3,	1,	0,	0,	0,	0},
											{4,	3,	3,	3,	1,	0,	0,	0,	0},
											{4,	3,	3,	3,	2,	0,	0,	0,	0},
											{4,	3,	3,	3,	2,	0,	0,	0,	0}})
				
				);
	}
}
