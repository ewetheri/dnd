package classes;

import dnd.Attribute;
import dnd.Die;
import dnd.Skill;
import items.DefaultEquipment;
import items.Inventory;

public class Artificer extends CharacterClass {
	
	
	
	Artificer()
	{
		super(	//name
				"Artificer",
				//description
				"A clever inventor whose analytical mind allows for complex magical-mechanical creations.",
				//hit die
				Die.D8,
				//proficiencies
				new Inventory()
					.add(Inventory.allItemsOfType("light armor"))
					.add(Inventory.allItemsOfType("medium armor"))
					.add(Inventory.allItemsOfType("simple melee"))
					.add(Inventory.allItemsOfType("simple ranged"))
					.add(DefaultEquipment.THIEVES_TOOLS.get()),
				//saving throws
				new Attribute[] {Attribute.CONSTITUTION, Attribute.INTELLIGENCE},
				//number of skills to choose
				3,
				//list of skills to choose from
				new Skill[] {Skill.ARCANA, Skill.DECEPTION, Skill.HISTORY, Skill.INVESTIGATION, Skill.MEDICINE, Skill.NATURE, Skill.RELIGION, Skill.SLEIGHT_OF_HAND},
				//name of specializations
				"Specialization",
				//specializations to choose from
				Specialization.type("artificer"),
				//class features
				ClassFeature.type("artificer"),
				//spelltable
				new SpellTable().setSpellsKnown(new int[] {0,0,3,4,4,4,5,6,6,7,8,8,9,10,10,11,11,11,12,13})
					.setSpellTable(new int[][] {{0,	0,	0,	0,	0,	0,	0,	0,	0},
												{0,	0,	0,	0,	0,	0,	0,	0,	0},
												{2,	0,	0,	0,	0,	0,	0,	0,	0},
												{3,	0,	0,	0,	0,	0,	0,	0,	0},
												{3,	0,	0,	0,	0,	0,	0,	0,	0},
												{3,	0,	0,	0,	0,	0,	0,	0,	0},
												{4,	2,	0,	0,	0,	0,	0,	0,	0},
												{4,	2,	0,	0,	0,	0,	0,	0,	0},
												{4,	2,	0,	0,	0,	0,	0,	0,	0},
												{4,	3,	0,	0,	0,	0,	0,	0,	0},
												{4,	3,	0,	0,	0,	0,	0,	0,	0},
												{4,	3,	0,	0,	0,	0,	0,	0,	0},
												{4,	3,	2,	0,	0,	0,	0,	0,	0},
												{4,	3,	2,	0,	0,	0,	0,	0,	0},
												{4,	3,	2,	0,	0,	0,	0,	0,	0},
												{4,	3,	3,	0,	0,	0,	0,	0,	0},
												{4,	3,	3,	0,	0,	0,	0,	0,	0},
												{4,	3,	3,	0,	0,	0,	0,	0,	0},
												{4,	3,	3,	1,	0,	0,	0,	0,	0},
												{4,	3,	3,	1,	0,	0,	0,	0,	0}})
				
				);
	}

}
