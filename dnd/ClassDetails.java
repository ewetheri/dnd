package dnd;

public enum Class {
	
	ARTIFICER		(	//Name
						"Artificer",
						//Description
						"A clever inventor whose analytical mind allows for complex magical-mechanical creations.",
						//Hit Dice Size
						Die.D8,
						//proficiencies
						new String[] {"light armor", "medium armor", "simple weapons"},
						//saving throws
						new Attribute[] {},
						//number of skills they can choose from list
						0,
						//list of skills they can choose from
						new Skill[] {},
						//name of their specializations
						"",
						//list of specializations they can choose from
						new Specialization[] {},
						//list of class features
						new ClassFeature[] {}
						),
	
	BARBARIAN		(	//Name
						"Barbarian",
						//description
						"A fierce warrior of primitive background who can enter a battle rage.",
						//Hit Dice Size
						Die.D12,
						//proficiencies
						new String[] {"light armor", "medium armor", "shields", "simple weapons", "martial weapons"},
						//saving throws
						new Attribute[] {Attribute.STRENGTH, Attribute.CONSTITUTION},
						//number of skills they can choose from the following list
						2,
						//list of skills they can choose from
						new Skill[] {Skill.ANIMAL_HANDLING, Skill.ATHLETICS, Skill.INTIMIDATION, Skill.NATURE, Skill.PERCEPTION, Skill.SURVIVAL},
						//name of their specializations
						"Path",
						//list of specializations they can choose from
						new Specialization[] {Specialization.BERSERKER, Specialization.TOTEM_WARRIOR},
						//list of features the class gets
						new ClassFeature[] {ClassFeature.RAGE, ClassFeature.UNARMORED_DEFENSE, ClassFeature.RECKLESS_ATTACK, ClassFeature.DANGER_SENSE, ClassFeature.PRIMAL_PATH, ClassFeature.ASI4, ClassFeature.EXTRA_ATTACK, ClassFeature.FAST_MOVEMENT, ClassFeature.FERAL_INSTINCT, ClassFeature.ASI8, ClassFeature.BRUTAL_CRITICAL, ClassFeature.RELENTLESS_RAGE, ClassFeature.ASI12, ClassFeature.PERSISTENT_RAGE, ClassFeature.ASI16, ClassFeature.INDOMITABLE_MIGHT, ClassFeature.ASI19, ClassFeature.PRIMAL_CHAMPION}
						),
	
	BARD			(	//Name
						"Bard",
						//Description
						"An inspiring magician whose power echoes the music of creation.",
						//Hit Dice Size
						Die.D8,
						//proficiencies
						new String[] {},
						//saving throws
						new Attribute[] {},
						//number of skills they can choose from list
						0,
						//list of skills they can choose from
						new Skill[] {},
						//name of their specializations
						"",
						//list of specializations they can choose from
						new Specialization[] {},
						//list of class features
						new ClassFeature[] {}
						),
	
	BLOOD_HUNTER	(	//Name
						"Blood Hunter",
						//Description
						"A fanatical slayer that embraces dark knowledge to destroy evil.",
						//Hit Dice Size
						Die.D10,
						//proficiencies
						new String[] {},
						//saving throws
						new Attribute[] {},
						//number of skills they can choose from list
						0,
						//list of skills they can choose from
						new Skill[] {},
						//name of their specializations
						"",
						//list of specializations they can choose from
						new Specialization[] {},
						//list of class features
						new ClassFeature[] {}
						),
	
	CLERIC			(	//Name
						"Cleric",
						//Description
						"A priestly champion who wields divine magic in service of a higher power.",
						//Hit Dice Size
						Die.D8,
						//proficiencies
						new String[] {},
						//saving throws
						new Attribute[] {},
						//number of skills they can choose from list
						0,
						//list of skills they can choose from
						new Skill[] {},
						//name of their specializations
						"",
						//list of specializations they can choose from
						new Specialization[] {},
						//list of class features
						new ClassFeature[] {}
						),
	
	DRUID			(	//Name
						"Druid",
						//Description
						"A priest of the Old Faith, wielding the powers of nature and adopting animal forms.",
						//Hit Dice Size
						Die.D8,
						//proficiencies
						new String[] {},
						//saving throws
						new Attribute[] {},
						//number of skills they can choose from list
						0,
						//list of skills they can choose from
						new Skill[] {},
						//name of their specializations
						"",
						//list of specializations they can choose from
						new Specialization[] {},
						//list of class features
						new ClassFeature[] {}
						),
	
	FIGHTER			(	//Name
						"Fighter",
						//Description
						"A master of martial combat, skilled with a variety of weapons and armor.",
						//Hit Dice Size
						Die.D10,
						//proficiencies
						new String[] {},
						//saving throws
						new Attribute[] {},
						//number of skills they can choose from list
						0,
						//list of skills they can choose from
						new Skill[] {},
						//name of their specializations
						"",
						//list of specializations they can choose from
						new Specialization[] {},
						//list of class features
						new ClassFeature[] {}
						),
	
	MONK			(	//Name
						"Monk",
						//Description
						"A master of martial arts, harnessing the power of the body in pursuit of physical and spiritual perfection.",
						//Hit Dice Size
						Die.D8,
						//proficiencies
						new String[] {},
						//saving throws
						new Attribute[] {},
						//number of skills they can choose from list
						0,
						//list of skills they can choose from
						new Skill[] {},
						//name of their specializations
						"",
						//list of specializations they can choose from
						new Specialization[] {},
						//list of class features
						new ClassFeature[] {}
						),
	
	MYSTIC			(	//Name
						"Mystic",
						//Description
						"A peciliar outcast whose understanding of the self and the world allows for great mental power.",
						//Hit Dice Size
						Die.D8,
						//proficiencies
						new String[] {},
						//saving throws
						new Attribute[] {},
						//number of skills they can choose from list
						0,
						//list of skills they can choose from
						new Skill[] {},
						//name of their specializations
						"",
						//list of specializations they can choose from
						new Specialization[] {},
						//list of class features
						new ClassFeature[] {}
						),
	
	PALADIN			(	//Name
						"Paladin",
						//Description
						"A holy warrior bound to a sacred oath.",
						//Hit Dice Size
						Die.D10,
						//proficiencies
						new String[] {},
						//saving throws
						new Attribute[] {},
						//number of skills they can choose from list
						0,
						//list of skills they can choose from
						new Skill[] {},
						//name of their specializations
						"",
						//list of specializations they can choose from
						new Specialization[] {},
						//list of class features
						new ClassFeature[] {}
						),
	
	RANGER			(	//Name
						"Ranger",
						//Description
						"A warrior who combats threats on the edges of civilization.",
						//Hit Dice Size
						Die.D10,
						//proficiencies
						new String[] {},
						//saving throws
						new Attribute[] {},
						//number of skills they can choose from list
						0,
						//list of skills they can choose from
						new Skill[] {},
						//name of their specializations
						"",
						//list of specializations they can choose from
						new Specialization[] {},
						//list of class features
						new ClassFeature[] {}
						),
	
	ROGUE			(	//Name
						"Rogue",
						//Description
						"A scoundrel who uses stealth and trickery to overcome obstacles and enemies.",
						//Hit Dice Size
						Die.D8,
						//proficiencies
						new String[] {},
						//saving throws
						new Attribute[] {},
						//number of skills they can choose from list
						0,
						//list of skills they can choose from
						new Skill[] {},
						//name of their specializations
						"",
						//list of specializations they can choose from
						new Specialization[] {},
						//list of class features
						new ClassFeature[] {}
						),
	
	SORCERER		(	//Name
						"Sorcerer",
						//Description
						"A spellcaster who draws on inherent magic from a gift or bloodline.",
						//Hit Dice Size
						Die.D6,
						//proficiencies
						new String[] {},
						//saving throws
						new Attribute[] {},
						//number of skills they can choose from list
						0,
						//list of skills they can choose from
						new Skill[] {},
						//name of their specializations
						"",
						//list of specializations they can choose from
						new Specialization[] {},
						//list of class features
						new ClassFeature[] {}
						),
	
	WARLOCK			(	//Name
						"Warlock",
						//Description
						"A wielder of magic that is derived from a bargain with an extraplanar entity.",
						//Hit Dice Size
						Die.D8,
						//proficiencies
						new String[] {},
						//saving throws
						new Attribute[] {},
						//number of skills they can choose from list
						0,
						//list of skills they can choose from
						new Skill[] {},
						//name of their specializations
						"",
						//list of specializations they can choose from
						new Specialization[] {},
						//list of class features
						new ClassFeature[] {}
						),
	
	WIZARD			(	//Name
						"Wizard",
						//Description
						"A scholarly magic-user capable of manipulating the structures of reality.",
						//Hit Dice Size
						Die.D6,
						//proficiencies
						new String[] {},
						//saving throws
						new Attribute[] {},
						//number of skills they can choose from list
						0,
						//list of skills they can choose from
						new Skill[] {},
						//name of their specializations
						"",
						//list of specializations they can choose from
						new Specialization[] {},
						//list of class features
						new ClassFeature[] {}
						);
	
	private final String name;
	private final String description;
	private final Die hitDie;
	private final String[] proficiencies;
	private final Attribute[] savingThrows;
	private final int numSkills;
	private final Skill[] skills;
	private final String specializationName;
	private final Specialization[] specializations;
	private final ClassFeature[] features;
	
	Class (String name, String description, Die hitDie, String[] proficiencies, Attribute[] savingThrows, int numSkills, Skill[] skills, String specializationName, Specialization[] specializations, ClassFeature[] features)
	{
		this.name = name;
		this.description = description;
		this.hitDie = hitDie;
		this.proficiencies = proficiencies;
		this.savingThrows = savingThrows;
		this.numSkills = numSkills;
		this.skills = skills;
		this.specializationName = specializationName;
		this.specializations = specializations;
		this.features = features;
	}
	
	public String shorthand()
	{
		return name;
	}
	
	public String longhand()
	{
		return name + ": " + description;
	}
	
	public int hitPointLevelUpRandom()
	{
		return hitDie.roll();
	}
	
	public int hitPointLevelUpSet()
	{
		return hitDie.sides()/2 + 1;
	}
	
	public String[] proficiencies()
	{
		return proficiencies;
	}
	
	public Attribute[] savingThrows()
	{
		return savingThrows;
	}
	
	public int numSkills()
	{
		return numSkills;
	}
	
	public Skill[] skillChoices()
	{
		return skills;
	}
	
	public String specializationName()
	{
		return specializationName;
	}
	
}
