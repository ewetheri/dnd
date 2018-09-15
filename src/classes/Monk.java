package classes;

import dnd.Attribute;
import dnd.Die;
import dnd.Skill;
import items.DefaultEquipment;
import items.Inventory;

public class Monk extends CharacterClass {

	
	private Die[] martialArts;
	private int[] kiPoints;
	private int[] unarmoredMovement;
	
	Monk()
	{
		super(	//name
				"Monk",
				//description
				"A master of martial arts, harnessing the power of the body in pursuit of physical and spiritual perfection.",
				//hit die
				Die.D8,
				//proficiencies
				new Inventory()
					.add(Inventory.allItemsOfType("simple melee"))
					.add(Inventory.allItemsOfType("simple ranged"))
					.add(DefaultEquipment.SHORTSWORD.get()),
				//saving throws
				new Attribute[] {Attribute.STRENGTH, Attribute.DEXTERITY},
				//number of skills to choose
				2,
				//list of skills to choose from
				new Skill[] {Skill.ACROBATICS, Skill.ATHLETICS, Skill.HISTORY, Skill.INSIGHT, Skill.RELIGION, Skill.STEALTH},
				//name of specializations
				"Monastic Tradition",
				//specializations to choose from
				Specialization.type("monk"),
				//class features
				ClassFeature.type("monk"),				
				//spelltable
				new SpellTable()
				
				);
		
		this.martialArts = new Die[] {Die.D4,Die.D4,Die.D4,Die.D4,Die.D6,Die.D6,Die.D6,Die.D6,Die.D6,Die.D6,Die.D8,Die.D8,Die.D8,Die.D8,Die.D8,Die.D8,Die.D10,Die.D10,Die.D10,Die.D10};
		this.kiPoints = new int[] {0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		this.unarmoredMovement = new int[] {0,10,10,10,10,15,15,15,15,20,20,20,20,25,25,25,25,30,30,30};
	}
	
	public Die martialArts(int level)
	{
		return this.martialArts[level];
	}
	
	public int kiPoints(int level)
	{
		return this.kiPoints[level];
	}
	
	public int unarmoredMovement(int level)
	{
		return this.unarmoredMovement[level];
	}
	
}
