package classes;

import dnd.Attribute;
import dnd.Die;
import dnd.Skill;
import items.DefaultEquipment;
import items.Inventory;

public class Wizard extends CharacterClass {

	
	Wizard()
	{
		super(	//name
				"Wizard",
				//description
				"A scholarly magic-user capable of manipulating the structures of reality.",
				//hit die
				Die.D6,
				//proficiencies
				new Inventory()
					.add(DefaultEquipment.DAGGER.get())
					.add(DefaultEquipment.DART.get())
					.add(DefaultEquipment.SLING.get())
					.add(DefaultEquipment.QUARTERSTAFF.get())
					.add(DefaultEquipment.LIGHT_CROSSBOW.get()),
				//saving throws
				new Attribute[] {Attribute.INTELLIGENCE, Attribute.WISDOM},
				//number of skills to choose
				2,
				//list of skills to choose from
				new Skill[] {Skill.ARCANA, Skill.HISTORY, Skill.INSIGHT, Skill.INVESTIGATION, Skill.MEDICINE, Skill.RELIGION},
				//name of specializations
				"Arcane Tradition",
				//specializations to choose from
				Specialization.type("wizard"),
				//class features
				ClassFeature.type("wizard"),
				//spelltable
				new SpellTable()
					.setCantrips(new int[] {3,3,3,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,5,5})
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
