package classes;

import dnd.Attribute;
import dnd.Die;
import dnd.Skill;
import items.Inventory;

public class Cleric extends CharacterClass {

	
	
	Cleric()
	{
		super(	//name
				"Cleric",
				//description
				"A priestly champion who wields divine magic in service of a higher power.",
				//hit die
				Die.D8,
				//proficiencies
				new Inventory()
					.add(Inventory.allItemsOfType("light armor"))
					.add(Inventory.allItemsOfType("medium armor"))
					.add(Inventory.allItemsOfType("shield"))
					.add(Inventory.allItemsOfType("simple melee"))
					.add(Inventory.allItemsOfType("simple ranged")),
				//saving throws
				new Attribute[] {Attribute.WISDOM, Attribute.CHARISMA},
				//number of skills to choose
				2,
				//list of skills to choose from
				new Skill[] {Skill.HISTORY, Skill.INSIGHT, Skill.MEDICINE, Skill.PERSUASION, Skill.RELIGION},
				//name of specializations
				"Domain",
				//specializations to choose from
				Specialization.type("cleric"),
				//class features
				ClassFeature.type("cleric"),
				//spelltable
				new SpellTable()
					.setCantrips(new int[] {3,3,3,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,5,})
					.setSpellTable(new int[][] {{2,	0,	0,	0,	0,	0,	0,	0,	0},
												{3,	0,	0,	0,	0,	0,	0,	0,	0},
												{4,	2,	0,	0,	0,	0,	0,	0,	0},
												{4,	3,	0,	0,	0,	0,	0,	0,	0},
												{4,	3,	2,	0,	0,	0,	0,	0,	0},
												{4,	3,	3,	0,	0,	0,	0,	0,	0},
												{4,	3,	3,	1,	0,	0,	0,	0,	0},
												{4,	3,	3,	2,	0,	0,	0,	0,	0},
												{4,	3,	3,	3,	1,	0,	0,	0,	0},
												{4,	3,	3,	3,	2,	0,	0,	0,	0},
												{4,	3,	3,	3,	2,	1,	0,	0,	0},
												{4,	3,	3,	3,	2,	1,	0,	0,	0},
												{4,	3,	3,	3,	2,	1,	1,	0,	0},
												{4,	3,	3,	3,	2,	1,	1,	0,	0},
												{4,	3,	3,	3,	2,	1,	1,	1,	0},
												{4,	3,	3,	3,	2,	1,	1,	1,	0},
												{4,	3,	3,	3,	2,	1,	1,	1,	1},
												{4,	3,	3,	3,	3,	1,	1,	1,	1},
												{4,	3,	3,	3,	3,	2,	1,	1,	1},
												{4,	3,	3,	3,	3,	2,	2,	1,	1}})
				
				
				);
	}
	
}
