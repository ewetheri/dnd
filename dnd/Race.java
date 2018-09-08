package dnd;

public enum Race {
	
	HILL_DWARF			(	//Base Race
							"Dwarf",
							//Full Race
							"Hill Dwarf",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(0,0,2,0,1,0),
							//speed
							25,
							//vision
							Vision.DARKVISION,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.DWARVEN_RESILIENCE, RaceAbility.DWARVEN_COMBAT_TRAINING, RaceAbility.TOOL_PROFICIENCY, RaceAbility.STONECUNNING, RaceAbility.DWARVEN_TOUGHNESS},
							//Proficiencies
							new String[]{"battleaxe", "handaxe", "throwing hammer", "warhammer"},
							//Languages
							new Language[]{Language.DWARVISH, Language.COMMON}),
	
	MOUNTAIN_DWARF		(	//Base Race
							"Dwarf",
							//Full Race
							"Mountain Dwarf",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(2,0,2,0,0,0),
							//speed
							25,
							//vision
							Vision.DARKVISION,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.DWARVEN_RESILIENCE, RaceAbility.DWARVEN_COMBAT_TRAINING, RaceAbility.TOOL_PROFICIENCY, RaceAbility.STONECUNNING, RaceAbility.DWARVEN_ARMOR_TRAINING},
							//Proficiencies
							new String[]{"battleaxe", "handaxe", "throwing hammer", "warhammer"},
							//Languages
							new Language[]{Language.DWARVISH, Language.COMMON}),
	
	HIGH_ELF			(	//Base Race
							"Elf",
							//Full Race
							"High Elf",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(0,2,0,1,0,0),
							//speed
							30,
							//vision
							Vision.DARKVISION,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.KEEN_SENSES, RaceAbility.FEY_ANCESTRY, RaceAbility.TRANCE, RaceAbility.ELF_WEAPON_TRAINING, RaceAbility.CANTRIP, RaceAbility.EXTRA_LANGUAGE},
							//Proficiencies
							new String[]{"longsword", "shortsword", "shortbow", "longbow"},
							//Languages
							new Language[]{Language.ELVISH, Language.COMMON}),
	
	WOOD_ELF			(	//Base Race
							"Elf",
							//Full Race
							"Wood Elf",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(0,2,0,0,1,0),
							//speed
							35,
							//vision
							Vision.DARKVISION,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.KEEN_SENSES, RaceAbility.FEY_ANCESTRY, RaceAbility.TRANCE, RaceAbility.ELF_WEAPON_TRAINING, RaceAbility.FLEET_OF_FOOT, RaceAbility.MASK_OF_THE_WILD},
							//Proficiencies
							new String[]{"longsword", "shortsword", "shortbow", "longbow"},
							//Languages
							new Language[]{Language.ELVISH, Language.COMMON}),
	
	DROW			(	//Base Race
							"Elf",
							//Full Race
							"Drow",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(0,2,0,0,0,1),
							//speed
							30,
							//vision
							Vision.SUPERIOR_DARKVISION,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.KEEN_SENSES, RaceAbility.FEY_ANCESTRY, RaceAbility.TRANCE, RaceAbility.SUNLIGHT_SENSITIVITY, RaceAbility.DROW_MAGIC, RaceAbility.DROW_WEAPON_TRAINING},
							//Proficiencies
							new String[]{"rapier", "shortsword", "hand crossbow"},
							//Languages
							new Language[]{Language.ELVISH, Language.COMMON}),
	
	LIGHTFOOT_HALFLING	(	//Base Race
							"Halfling",
							//Full Race
							"Lightfoot Halfling",
							//Size
							Size.SMALL,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(0,2,0,0,0,1),
							//speed
							25,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.LUCKY, RaceAbility.BRAVE, RaceAbility.HALFLING_NIMBLENESS, RaceAbility.NATURALLY_STEALTHY},
							//Proficiencies
							new String[]{""},
							//Languages
							new Language[]{Language.HALFLING, Language.COMMON}),
	
	STOUT_HALFLING	(	//Base Race
							"Halfling",
							//Full Race
							"Stout Halfling",
							//Size
							Size.SMALL,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(0,2,1,0,0,0),
							//speed
							25,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.LUCKY, RaceAbility.BRAVE, RaceAbility.HALFLING_NIMBLENESS, RaceAbility.STOUT_RESILIENCE},
							//Proficiencies
							new String[]{""},
							//Languages
							new Language[]{Language.HALFLING, Language.COMMON}),
	
	HUMAN				(	//Base Race
							"Human",
							//Full Race
							"Human",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(1,1,1,1,1,1),
							//speed
							30,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.EXTRA_LANGUAGE},
							//Proficiencies
							new String[]{""},
							//Languages
							new Language[]{Language.COMMON}),
	
	VARIANT_HUMAN		(	//Base Race
							"Human",
							//Full Race
							"Human (Variant)",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(0,0,0,0,0,0),
							//speed
							30,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.HUMAN_ABILITY_SCORE_INCREASE, RaceAbility.SKILL, RaceAbility.FEAT, RaceAbility.EXTRA_LANGUAGE},
							//Proficiencies
							new String[]{""},
							//Languages
							new Language[]{Language.COMMON}),
	
	BLACK_DRAGONBORN			(	//Base Race
							"Dragonborn",
							//Full Race
							"Black Dragonborn",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(2,0,0,0,0,1),
							//speed
							30,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.DRACONIC_ANCESTRY_BLACK, RaceAbility.BREATH_WEAPON_BLACK},
							//Proficiencies
							new String[]{""},
							//Languages
							new Language[]{Language.DRACONIC, Language.COMMON}),
	
	BLUE_DRAGONBORN	(	//Base Race
							"Dragonborn",
							//Full Race
							"Blue Dragonborn",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(2,0,0,0,0,1),
							//speed
							30,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.DRACONIC_ANCESTRY_BLUE, RaceAbility.BREATH_WEAPON_BLUE},
							//Proficiencies
							new String[]{""},
							//Languages
							new Language[]{Language.DRACONIC, Language.COMMON}),
	
	BRASS_DRAGONBORN	(	//Base Race
							"Dragonborn",
							//Full Race
							"Brass Dragonborn",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(2,0,0,0,0,1),
							//speed
							30,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.DRACONIC_ANCESTRY_BRASS, RaceAbility.BREATH_WEAPON_BRASS},
							//Proficiencies
							new String[]{""},
							//Languages
							new Language[]{Language.DRACONIC, Language.COMMON}),
	
	BRONZE_DRAGONBORN	(	//Base Race
							"Dragonborn",
							//Full Race
							"Bronze Dragonborn",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(2,0,0,0,0,1),
							//speed
							30,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.DRACONIC_ANCESTRY_BRONZE, RaceAbility.BREATH_WEAPON_BRONZE},
							//Proficiencies
							new String[]{""},
							//Languages
							new Language[]{Language.DRACONIC, Language.COMMON}),
	
	COPPER_DRAGONBORN	(	//Base Race
							"Dragonborn",
							//Full Race
							"Copper Dragonborn",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(2,0,0,0,0,1),
							//speed
							30,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.DRACONIC_ANCESTRY_COPPER, RaceAbility.BREATH_WEAPON_COPPER},
							//Proficiencies
							new String[]{""},
							//Languages
							new Language[]{Language.DRACONIC, Language.COMMON}),
	
	GOLD_DRAGONBORN	(	//Base Race
							"Dragonborn",
							//Full Race
							"Gold Dragonborn",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(2,0,0,0,0,1),
							//speed
							30,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.DRACONIC_ANCESTRY_GOLD, RaceAbility.BREATH_WEAPON_GOLD},
							//Proficiencies
							new String[]{""},
							//Languages
							new Language[]{Language.DRACONIC, Language.COMMON}),
	
	GREEN_DRAGONBORN	(	//Base Race
							"Dragonborn",
							//Full Race
							"Green Dragonborn",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(2,0,0,0,0,1),
							//speed
							30,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.DRACONIC_ANCESTRY_GREEN, RaceAbility.BREATH_WEAPON_GREEN},
							//Proficiencies
							new String[]{""},
							//Languages
							new Language[]{Language.DRACONIC, Language.COMMON}),
	
	RED_DRAGONBORN	(	//Base Race
							"Dragonborn",
							//Full Race
							"Red Dragonborn",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(2,0,0,0,0,1),
							//speed
							30,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.DRACONIC_ANCESTRY_RED, RaceAbility.BREATH_WEAPON_RED},
							//Proficiencies
							new String[]{""},
							//Languages
							new Language[]{Language.DRACONIC, Language.COMMON}),
	
	SILVER_DRAGONBORN	(	//Base Race
							"Dragonborn",
							//Full Race
							"Silver Dragonborn",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(2,0,0,0,0,1),
							//speed
							30,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.DRACONIC_ANCESTRY_SILVER, RaceAbility.BREATH_WEAPON_SILVER},
							//Proficiencies
							new String[]{""},
							//Languages
							new Language[]{Language.DRACONIC, Language.COMMON}),
	
	WHITE_DRAGONBORN	(	//Base Race
							"Dragonborn",
							//Full Race
							"White Dragonborn",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(2,0,0,0,0,1),
							//speed
							30,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.DRACONIC_ANCESTRY_WHITE, RaceAbility.BREATH_WEAPON_WHITE},
							//Proficiencies
							new String[]{""},
							//Languages
							new Language[]{Language.DRACONIC, Language.COMMON}),
	
	FOREST_GNOME		(	//Base Race
							"Gnome",
							//Full Race
							"Forest Gnome",
							//Size
							Size.SMALL,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(0,1,0,2,0,0),
							//speed
							25,
							//vision
							Vision.DARKVISION,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.GNOME_CUNNING, RaceAbility.NATURAL_ILLUSIONIST, RaceAbility.SPEAK_WITH_SMALL_BEASTS},
							//Proficiencies
							new String[]{""},
							//Languages
							new Language[]{Language.GNOMISH, Language.COMMON}),
	
	ROCK_GNOME		(	//Base Race
							"Gnome",
							//Full Race
							"Rock Gnome",
							//Size
							Size.SMALL,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(0,0,1,2,0,0),
							//speed
							25,
							//vision
							Vision.DARKVISION,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.GNOME_CUNNING, RaceAbility.ARTIFICERS_LORE, RaceAbility.TINKER},
							//Proficiencies
							new String[]{""},
							//Languages
							new Language[]{Language.GNOMISH, Language.COMMON}),
	
	HALF_ELF			(	//Base Race
							"Half-Elf",
							//Full Race
							"Half-Elf",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(0,0,0,0,0,2),
							//speed
							30,
							//vision
							Vision.DARKVISION,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.HALF_ELF_ABILITY_SCORE_INCREASE, RaceAbility.FEY_ANCESTRY, RaceAbility.SKILL_VERSATILITY, RaceAbility.EXTRA_LANGUAGE},
							//Proficiencies
							new String[]{""},
							//Languages
							new Language[]{Language.ELVISH, Language.COMMON}),
	
	HALF_ORC			(	//Base Race
							"Half-Orc",
							//Full Race
							"Half-Orc",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(2,0,1,0,0,0),
							//speed
							30,
							//vision
							Vision.DARKVISION,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.MENACING, RaceAbility.RELENTLESS_ENDURANCE, RaceAbility.SAVAGE_ATTACKS},
							//Proficiencies
							new String[]{""},
							//Languages
							new Language[]{Language.ORC, Language.COMMON}),
	
	TIEFLING			(	//Base Race
							"Tiefling",
							//Full Race
							"Tiefling",
							//Size
							Size.MEDIUM,
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(0,0,0,1,0,2),
							//speed
							30,
							//vision
							Vision.DARKVISION,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.HELLISH_RESISTANCE, RaceAbility.INFERNAL_LEGACY},
							//Proficiencies
							new String[]{""},
							//Languages
							new Language[]{Language.INFERNAL, Language.COMMON});
	
	private final String baseName;
	private final String name;
	private final Size size;
	private final Attributes attributes; //racial attribute modifiers
	private final int speed;
	private final Vision vision;
	private final RaceAbility[] abilities;
	private final String[] proficiencies;
	private final Language[] languages;
	
	
	Race(String baseName, String name, Size size, Attributes attributes, int speed, Vision vision, RaceAbility[] abilities, String[] proficiencies, Language[] languages)
	{
		this.baseName = baseName;
		this.name = name;
		this.size = size;
		this.attributes = attributes;
		this.speed = speed;
		this.vision = vision;
		this.abilities = abilities;
		this.proficiencies = proficiencies;
		this.languages = languages;
	}
	
	public String baseName()
	{
		return baseName;
	}
	
	public String fullName()
	{
		return name;
	}
	
	public Size size()
	{
		return size;
	}
	
	public Attributes attributes()
	{
		return attributes;
	}
	
	public int speed()
	{
		return speed;
	}
	
	public Vision vision()
	{
		return vision;
	}
	
	public RaceAbility[] abilities()
	{
		return abilities;
	}
	
	public String[] proficiencies()
	{
		return proficiencies;
	}
	
	public Language[] languages()
	{
		return languages;
	}

}
