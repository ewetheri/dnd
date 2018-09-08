package dnd;

public enum RaceAbility {
	
	DWARVEN_RESILIENCE				("Dwarven Resilience", "You have advantage on saving throws against poison, and you have resistance against poison damage"),
	DWARVEN_COMBAT_TRAINING			("Dwarven Combat Training", "You have proficiency with the battleaxe, handaxe, throwing hammer, and warhammer."),
	TOOL_PROFICIENCY				("Tool Proficiency", "You gain proficiency with the artisan’s tools of your choice: smith’s tools, brewer’s supplies, or m ason’s tools."),
	STONECUNNING					("Stonecunning", "Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your norm al proficiency bonus."),
	DWARVEN_TOUGHNESS				("Dwarven Toughness", "Your hit point maximum increases by 1, and it increases by 1 every time you gain a level."),
	DWARVEN_ARMOR_TRAINING			("Dwarven Armor Training", "You have proficiency with light and medium armor"),
	KEEN_SENSES						("Keen Senses", "You have proficiency in the Perception skill."),
	FEY_ANCESTRY					("Fey Ancestry", "You have advantage on saving throws against being charmed, and magic can’t put you to sleep"),
	TRANCE							("Trance", "Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is \"trance.\") While meditating, you can dream after a fashion; such dreams are actually mental exercises that have become reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep."),
	ELF_WEAPON_TRAINING				("Elf Weapon Training", "You have proficiency with the longsword, shortsword, shortbow, and longbow"),
	CANTRIP							("Cantrip", "You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it."),
	EXTRA_LANGUAGE					("Extra Language", "You can speak, read, and write one extra language of your choice."),
	FLEET_OF_FOOT					("Fleet of Foot", "Your base walking speed increases to 35 feet."),
	MASK_OF_THE_WILD				("Mask of the Wild", "You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow, mist, and other natural phenomena."),
	SUNLIGHT_SENSITIVITY			("Sunlight Sensitivity", "You have disadvantage on attack rolls and on Wisdom (Perception) checks that rely on sight when you, the target of your attack, or whatever you are trying to perceive is in direct sunlight"),
	DROW_MAGIC						("Drow Magic", "You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells."),
	DROW_WEAPON_TRAINING			("Drow Weapon Training", "You have proficiency with rapiers, shortswords, and hand crossbows."),
	LUCKY							("Lucky", "When you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll."),
	BRAVE							("Brave", "You have advantage on saving throws against being frightened."),
	HALFLING_NIMBLENESS				("Halfling Nimbleness", "You can move through the space of any creature that is of a size larger than yours"),
	NATURALLY_STEALTHY				("Naturally Stealthy", "You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you."),
	STOUT_RESILIENCE				("Stout Resilience", "You have advantage on saving throws against poison, and you have resistance against poison damage."),
	HUMAN_ABILITY_SCORE_INCREASE	("Ability Score Increase", "Two different ability scores of your choice increase by 1."),
	SKILL							("Bonus Skill", "You gain proficiency in one skill of your choice."),
	FEAT							("Bonus Feat", "You gain one feat of your choice."),
	DRACONIC_ANCESTRY_BLACK			("Dragon Ancestry", "You are descended from black dragons. You have resistance to acid damage."),
	DRACONIC_ANCESTRY_BLUE			("Dragon Ancestry", "You are descended from blue dragons. You have resistance to lightning damage."),
	DRACONIC_ANCESTRY_BRASS			("Dragon Ancestry", "You are descended from brass dragons. You have resistance to fire damage."),
	DRACONIC_ANCESTRY_BRONZE		("Dragon Ancestry", "You are descended from bronze dragons. You have resistance to lightning damage."),
	DRACONIC_ANCESTRY_COPPER		("Dragon Ancestry", "You are descended from copper dragons. You have resistance to acid damage."),
	DRACONIC_ANCESTRY_GOLD			("Dragon Ancestry", "You are descended from gold dragons. You have resistance to fire damage."),
	DRACONIC_ANCESTRY_GREEN			("Dragon Ancestry", "You are descended from green dragons. You have resistance to poison damage."),
	DRACONIC_ANCESTRY_RED			("Dragon Ancestry", "You are descended from red dragons. You have resistance to fire damage."),
	DRACONIC_ANCESTRY_SILVER		("Dragon Ancestry", "You are descended from silver dragons. You have resistance to cold damage."),
	DRACONIC_ANCESTRY_WHITE			("Dragon Ancestry", "You are descended from white dragons. You have resistance to aold damage."),
	BREATH_WEAPON_BLACK				("Breath Weapon", "You can use your action to exhale acid in a 5 x 30 ft. line. When you use your breath weapon, each creature in the area of the exhalation must make a dexterity saving throw. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	BREATH_WEAPON_BLUE				("Breath Weapon", "You can use your action to exhale lightning in a 5 x 30 ft. line. When you use your breath weapon, each creature in the area of the exhalation must make a dexterity saving throw. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	BREATH_WEAPON_BRASS				("Breath Weapon", "You can use your action to exhale fire in a 5 x 30 ft. line. When you use your breath weapon, each creature in the area of the exhalation must make a dexterity saving throw. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	BREATH_WEAPON_BRONZE			("Breath Weapon", "You can use your action to exhale lightning in a 5 x 30 ft. line. When you use your breath weapon, each creature in the area of the exhalation must make a dexterity saving throw. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	BREATH_WEAPON_COPPER			("Breath Weapon", "You can use your action to exhale acid in a 5 x 30 ft. line. When you use your breath weapon, each creature in the area of the exhalation must make a dexterity saving throw. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	BREATH_WEAPON_GOLD				("Breath Weapon", "You can use your action to exhale fire in a 15 ft. cone. When you use your breath weapon, each creature in the area of the exhalation must make a dexterity saving throw. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	BREATH_WEAPON_GREEN				("Breath Weapon", "You can use your action to exhale poison in a 15 ft. cone. When you use your breath weapon, each creature in the area of the exhalation must make a constitution saving throw. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	BREATH_WEAPON_RED				("Breath Weapon", "You can use your action to exhale fire in a 15 ft. cone. When you use your breath weapon, each creature in the area of the exhalation must make a dexterity saving throw. The DC for this saving throw equals 8 +your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	BREATH_WEAPON_SILVER			("Breath Weapon", "You can use your action to exhale cold in a 15 ft. cone. When you use your breath weapon, each creature in the area of the exhalation must make a constitution saving throw. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	BREATH_WEAPON_WHITE				("Breath Weapon", "You can use your action to exhale cold in a 15 ft. cone. When you use your breath weapon, each creature in the area of the exhalation must make a constitution saving throw. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	GNOME_CUNNING					("Breath Weapon", "You have advantage on all Intelligence, Wisdom , and Charisma saving throws against magic."),
	NATURAL_ILLUSIONIST				("Breath Weapon", "You know the minor illusion cantrip. Intelligence is your spellcasting ability for it"),
	SPEAK_WITH_SMALL_BEASTS			("Speak with Small Beasts", "Through sounds and gestures, you can communicate simple ideas with small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, woodpeckers, and other creatures as beloved pets."),
	ARTIFICERS_LORE					("Artificer's Lore", "Whenever you make an Intelligence (History) check related to magic items, alchemical objects, or technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply."),
	TINKER							("Tinker", "You have proficiency with artisan’s tools (tinker’s tools). Using those tools, you can spend 1 hour and 10 gp worth of materials to construct a Tiny clockwork device (AC 5, 1 hp). The device ceases to function after 24 hours (unless you spend 1 hour repairing it to keep the device functioning), or when you use your action to dismantle it; at that time, you can reclaim the materials used to create it. You can have up to three such devices active at a time. When you create a device, choose one of the following options: \n\nClockwork Toy. This toy is a clockwork animal, monster, or person, such as a frog, mouse, bird, dragon, or soldier. When placed on the ground, the toy moves 5 feet across the ground on each of your turns in a random direction. It makes noises as appropriate to the creature it represents. \n\nFire Starter. The device produces a miniature flame, which you can use to light a candle, torch, or campfire. Using the device requires your action. \n\nMusic Box: When opened, this music box plays a single song at a moderate volume. The box stops playing when it reaches the song’s end or when it is closed."),
	SKILL_VERSATILITY				("Skill Versatility", "You gain proficiency in two skills of your choice."),
	MENACING						("Menacing", "You gain proficiency in the Intimidation skill."),
	RELENTLESS_ENDURANCE			("Relentless Endurance", "When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest."),
	SAVAGE_ATTACKS					("Savage Attacks", "When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit."),
	HELLISH_RESISTANCE				("Hellish Resistance", "You have resistance to fire damage."),
	INFERNAL_LEGACY					("Infernal Legacy", "You know the thaumaturgy cantrip. Once you reach 3rd level, you can cast the hellish rebuke spell once per day as a 2nd-level spell. Once you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells."),
	HALF_ELF_ABILITY_SCORE_INCREASE	("Ability Score Increase", "Two different ability scores of your choice besides Charisma increase by 1.")
	
	
	
	;
	
	private final String name;
	private final String description;
	
	RaceAbility(String name, String description)
	{
		this.name = name;
		this.description = description;
	}
	
	public String abilityName()
	{
		return name;
	}
	
	public String description()
	{
		return description;
	}
	
}
