package classes;

import dnd.Attribute;
import dnd.Die;
import dnd.Skill;
import items.DefaultEquipment;
import items.Inventory;

public class Warlock extends CharacterClass {

	
	private int[] invocationsKnown;
	
	Warlock()
	{
		super(	//name
				"Warlock",
				//description
				"A wielder of magic that is derived from a bargain with an extraplanar entity.",
				//hit die
				Die.D8,
				//proficiencies
				new Inventory()
					.add(Inventory.allItemsOfType("light armor"))
					.add(Inventory.allItemsOfType("simple melee"))
					.add(Inventory.allItemsOfType("simple ranged")),
				//saving throws
				new Attribute[] {Attribute.WISDOM, Attribute.CHARISMA},
				//number of skills to choose
				2,
				//list of skills to choose from
				new Skill[] {Skill.ARCANA, Skill.DECEPTION, Skill.HISTORY, Skill.INTIMIDATION, Skill.INVESTIGATION, Skill.NATURE, Skill.RELIGION},
				//name of specializations
				"Otherworldly Patron",
				//specializations to choose from
				Specialization.type("warlock"),
				//class features
				ClassFeature.type("warlock"),
				//spelltable
				new SpellTable()
					.setCantrips(new int[] {2,2,2,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4})
					.setSpellsKnown(new int[] {2,3,4,5,6,7,8,9,10,10,11,11,12,12,13,13,14,14,15,15})
					.setSpellTable(new int[][] {{1,	0,	0,	0,	0,	0,	0,	0,	0},
												{2,	0,	0,	0,	0,	0,	0,	0,	0},
												{0,	2,	0,	0,	0,	0,	0,	0,	0},
												{0,	2,	0,	0,	0,	0,	0,	0,	0},
												{0,	0,	2,	0,	0,	0,	0,	0,	0},
												{0,	0,	2,	0,	0,	0,	0,	0,	0},
												{0,	0,	0,	2,	0,	0,	0,	0,	0},
												{0,	0,	0,	2,	0,	0,	0,	0,	0},
												{0,	0,	0,	0,	2,	0,	0,	0,	0},
												{0,	0,	0,	0,	2,	0,	0,	0,	0},
												{0,	0,	0,	0,	3,	0,	0,	0,	0},
												{0,	0,	0,	0,	3,	0,	0,	0,	0},
												{0,	0,	0,	0,	3,	0,	0,	0,	0},
												{0,	0,	0,	0,	3,	0,	0,	0,	0},
												{0,	0,	0,	0,	3,	0,	0,	0,	0},
												{0,	0,	0,	0,	3,	0,	0,	0,	0},
												{0,	0,	0,	0,	4,	0,	0,	0,	0},
												{0,	0,	0,	0,	4,	0,	0,	0,	0},
												{0,	0,	0,	0,	4,	0,	0,	0,	0},
												{0,	0,	0,	0,	4,	0,	0,	0,	0}})
				
				);
		
		this.invocationsKnown = new int[] {0,2,2,2,3,3,4,4,5,5,5,6,6,6,7,7,7,8,8,8};
	}
	
	public int invocationsKnown(int level)
	{
		return this.invocationsKnown[level];
	}
}
