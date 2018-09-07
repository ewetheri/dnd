package dnd;

import java.util.ArrayList;

public enum Race {
	
	HILL_DWARF			(	//Base Race
							"Dwarf",
							//Full Race
							"Hill Dwarf",
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
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(0,2,0,0,0,1),
							//speed
							25,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.LUCKY, RaceAbility.BRAVE, RaceAbility.HALFLING_NIMBLENESS, RaceAbility.NATURALLY_STEALTHY},
							//Proficiencies
							new String[]{},
							//Languages
							new Language[]{Language.HALFLING, Language.COMMON}),
	
	STOUT_HALFLING	(	//Base Race
							"Halfling",
							//Full Race
							"Stout Halfling",
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(0,2,1,0,0,0),
							//speed
							25,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.LUCKY, RaceAbility.BRAVE, RaceAbility.HALFLING_NIMBLENESS, RaceAbility.STOUT_RESILIENCE},
							//Proficiencies
							new String[]{},
							//Languages
							new Language[]{Language.HALFLING, Language.COMMON}),
	
	HUMAN				(	//Base Race
							"Human",
							//Full Race
							"Human",
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(1,1,1,1,1,1),
							//speed
							30,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.EXTRA_LANGUAGE},
							//Proficiencies
							new String[]{},
							//Languages
							new Language[]{Language.COMMON}),
	
	VARIANT_HUMAN		(	//Base Race
							"Human",
							//Full Race
							"Human (Variant)",
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(0,0,0,0,0,0),
							//speed
							30,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{RaceAbility.HUMAN_ABILITY_SCORE_INCREASE, RaceAbility.SKILL, RaceAbility.FEAT, RaceAbility.EXTRA_LANGUAGE},
							//Proficiencies
							new String[]{},
							//Languages
							new Language[]{Language.COMMON}),
	
	BLACK_DRAGONBORN			(	//Base Race
							"Dragonborn",
							//Full Race
							"Black Dragonborn",
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(2,0,0,0,0,1),
							//speed
							30,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{},
							//Proficiencies
							new String[]{},
							//Languages
							new Language[]{Language.DRACONIC, Language.COMMON}),
	
	GNOME				(	//Base Race
							"Elf",
							//Full Race
							"High Elf",
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(0,0,0,0,0,0),
							//speed
							30,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{},
							//Proficiencies
							new String[]{},
							//Languages
							new Language[]{Language.ELVISH, Language.COMMON}),
	
	HALF_ELF			(	//Base Race
							"Elf",
							//Full Race
							"High Elf",
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(0,0,0,0,0,0),
							//speed
							30,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{},
							//Proficiencies
							new String[]{},
							//Languages
							new Language[]{Language.ELVISH, Language.COMMON}),
	
	HALF_ORC			(	//Base Race
							"Elf",
							//Full Race
							"High Elf",
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(0,0,0,0,0,0),
							//speed
							30,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{},
							//Proficiencies
							new String[]{},
							//Languages
							new Language[]{Language.ELVISH, Language.COMMON}),
	
	TIEFLING			(	//Base Race
							"Elf",
							//Full Race
							"High Elf",
							//attributes (STR, DEX, CON, INT, WIS, CHA)
							new Attributes(0,0,0,0,0,0),
							//speed
							30,
							//vision
							Vision.NORMAL,
							//Racial Abilities
							new RaceAbility[]{},
							//Proficiencies
							new String[]{},
							//Languages
							new Language[]{Language.ELVISH, Language.COMMON});
	
	private final Attributes attributes; //racial attribute modifiers
	private final int speed;
	private final Vision vision;
	private final String[] abilities;
	private final String[] proficiencies;
	private final String[] languages;
	
	
	Race(String baseName, String name, Attributes attributes, int speed, Vision vision, RaceAbility[] abilities, String[] proficiences, Language[] languages)
	{
		this.attributes = attributes;
		this.speed = speed;
		this.vision = vision;
		this.abilities = abilities;
		this.proficiencies = proficiencies;
		this.languages = languages;
	}

}
