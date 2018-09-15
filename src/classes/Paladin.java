package classes;

import dnd.Attribute;
import dnd.Die;
import dnd.Skill;
import items.DefaultEquipment;
import items.Inventory;

public class Paladin extends CharacterClass {

	
	Paladin()
	{
		super(	//name
				"Paladin",
				//description
				"A holy warrior bound to a sacred oath.",
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
				new Attribute[] {Attribute.WISDOM, Attribute.CHARISMA},
				//number of skills to choose
				2,
				//list of skills to choose from
				new Skill[] {Skill.ATHLETICS, Skill.INSIGHT, Skill.INTIMIDATION, Skill.MEDICINE, Skill.PERSUASION, Skill.RELIGION},
				//name of specializations
				"Sacred Oath",
				//specializations to choose from
				Specialization.type("paladin"),
				//class features
				ClassFeature.type("paladin"),
				//spelltable
				new SpellTable()
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
