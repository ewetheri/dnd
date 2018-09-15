package classes;

import dnd.Attribute;
import dnd.Die;
import dnd.Skill;
import items.DefaultEquipment;
import items.Inventory;

public class Sorcerer extends CharacterClass {

	private int[] sorceryPoints;
	
	Sorcerer()
	{
		super(	//name
				"Sorcerer",
				//description
				"A spellcaster who draws on inherent magic from a gift or bloodline.",
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
				new Attribute[] {Attribute.CONSTITUTION, Attribute.CHARISMA},
				//number of skills to choose
				2,
				//list of skills to choose from
				new Skill[] {Skill.ARCANA, Skill.DECEPTION, Skill.INSIGHT, Skill.INTIMIDATION, Skill.PERSUASION, Skill.RELIGION},
				//name of specializations
				"Sorcerous Origin",
				//specializations to choose from
				Specialization.type("sorcerer"),
				//class features
				ClassFeature.type("sorcerer"),
				//spelltable
				new SpellTable()
					.setCantrips(new int[] {4,4,4,5,5,5,5,5,5,6,6,6,6,6,6,6,6,6,6,6})
					.setSpellsKnown(new int[] {2,3,4,5,6,7,8,9,10,11,12,12,13,13,14,14,15,15,15,15})
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
		
		this.sorceryPoints = new int[] {0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	}
	
	public int sorceryPoints(int level)
	{
		return this.sorceryPoints[level];
	}
}
