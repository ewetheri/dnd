package classes;

import dnd.Attribute;
import dnd.Die;
import dnd.Skill;
import items.DefaultEquipment;
import items.Inventory;

public class Bard extends CharacterClass {

	
	Bard()
	{
		super(	//name
				"Bard",
				//description
				"An inspiring magician whose power echoes the music of creation.",
				//hit die
				Die.D8,
				//proficiencies
				new Inventory()
					.add(Inventory.allItemsOfType("light armor"))
					.add(Inventory.allItemsOfType("simple melee"))
					.add(Inventory.allItemsOfType("simple ranged"))
					.add(DefaultEquipment.HAND_CROSSBOW.get())
					.add(DefaultEquipment.LONGSWORD.get())
					.add(DefaultEquipment.RAPIER.get())
					.add(DefaultEquipment.SHORTSWORD.get()),
				//saving throws
				new Attribute[] {Attribute.DEXTERITY, Attribute.CHARISMA},
				//number of skills to choose
				3,
				//list of skills to choose from
				Skill.values(),
				//name of specializations
				"College",
				//specializations to choose from
				Specialization.type("bard"),
				//class features
				ClassFeature.type("bard"),
				//spelltable
				new SpellTable()
					.setCantrips(new int[] {2,2,2,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4})
					.setSpellsKnown(new int[] {4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,22,22,22})
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
