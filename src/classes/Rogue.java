package classes;

import dnd.Attribute;
import dnd.Dice;
import dnd.Die;
import dnd.Skill;
import items.DefaultEquipment;
import items.Inventory;

public class Rogue extends CharacterClass {

	private Dice[] sneakAttack;
	
	Rogue()
	{
		super(	//name
				"Rogue",
				//description
				"A scoundrel who uses stealth and trickery to overcome obstacles and enemies.",
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
					.add(DefaultEquipment.SHORTSWORD.get())
					.add(DefaultEquipment.THIEVES_TOOLS.get()),
				//saving throws
				new Attribute[] {Attribute.DEXTERITY, Attribute.INTELLIGENCE},
				//number of skills to choose
				4,
				//list of skills to choose from
				new Skill[] {Skill.ACROBATICS, Skill.ATHLETICS, Skill.DECEPTION, Skill.INSIGHT, Skill.INTIMIDATION, Skill.INVESTIGATION, Skill.PERCEPTION, Skill.PERFORMANCE, Skill.PERSUASION, Skill.SLEIGHT_OF_HAND, Skill.STEALTH},
				//name of specializations
				"Roguish Archetype",
				//specializations to choose from
				Specialization.type("rogue"),
				//class features
				ClassFeature.type("rogue"),				
				//spelltable
				new SpellTable()
				
				);
		
		this.sneakAttack = new Dice[] {new Dice(Die.D6),
										new Dice(Die.D6),
										new Dice(Die.D6).addDie(Die.D6),
										new Dice(Die.D6).addDie(Die.D6),
										new Dice(Die.D6).addDie(Die.D6).addDie(Die.D6),
										new Dice(Die.D6).addDie(Die.D6).addDie(Die.D6),
										new Dice(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6),
										new Dice(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6),
										new Dice(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6),
										new Dice(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6),
										new Dice(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6),
										new Dice(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6),
										new Dice(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6),
										new Dice(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6),
										new Dice(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6),
										new Dice(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6),
										new Dice(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6),
										new Dice(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6),
										new Dice(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6),
										new Dice(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6).addDie(Die.D6)};
	}
	
	public Dice sneakAttack(int level)
	{
		return sneakAttack[level];
	}
}
