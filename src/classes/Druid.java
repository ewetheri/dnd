package classes;

import dnd.Attribute;
import dnd.Die;
import dnd.Skill;
import items.DefaultEquipment;
import items.Inventory;

public class Druid extends CharacterClass {
	
	Druid()
	{
		super(	//name
				"Druid",
				//description
				"A priest of the Old Faith, wielding the powers of nature and adopting animal forms.",
				//hit die
				Die.D8,
				//proficiencies
				new Inventory()
					.add(Inventory.allItemsOfType("light armor"))
					.add(Inventory.allItemsOfType("medium armor"))
					.add(Inventory.allItemsOfType("shield"))
					.add(DefaultEquipment.CLUB.get())
					.add(DefaultEquipment.DAGGER.get())
					.add(DefaultEquipment.DART.get())
					.add(DefaultEquipment.JAVELIN.get())
					.add(DefaultEquipment.MACE.get())
					.add(DefaultEquipment.QUARTERSTAFF.get())
					.add(DefaultEquipment.SCIMITAR.get())
					.add(DefaultEquipment.SICKLE.get())
					.add(DefaultEquipment.SLING.get())
					.add(DefaultEquipment.SPEAR.get())
					.add(DefaultEquipment.HERBALISTM_KIT.get()),
				//saving throws
				new Attribute[] {Attribute.INTELLIGENCE, Attribute.WISDOM},
				//number of skills to choose
				2,
				//list of skills to choose from
				new Skill[] {Skill.ARCANA, Skill.ANIMAL_HANDLING, Skill.INSIGHT, Skill.MEDICINE, Skill.NATURE, Skill.PERCEPTION, Skill.RELIGION, Skill.SURVIVAL},
				//name of specializations
				"Circle",
				//specializations to choose from
				Specialization.type("druid"),
				//class features
				ClassFeature.type("druid"),
				//spelltable
				new SpellTable()
					.setCantrips(new int[] {2,2,2,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4})
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
