package dnd;

public enum RaceAbility {
	
	DWARVEN_RESILIENCE				("You have advantage on saving throws against poison, and you have resistance against poison damage"),
	DWARVEN_COMBAT_TRAINING			("You have proficiency with the battleaxe, handaxe, throwing hammer, and warhammer."),
	TOOL_PROFICIENCY				("You gain proficiency with the artisan’s tools of your choice: smith’s tools, brewer’s supplies, or m ason’s tools."),
	STONECUNNING					("Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your norm al proficiency bonus."),
	DWARVEN_TOUGHNESS				("Your hit point maximum increases by 1, and it increases by 1 every time you gain a level."),
	DWARVEN_ARMOR_TRAINING			("You have proficiency with light and medium armor"),
	KEEN_SENSES						("You have proficiency in the Perception skill."),
	FEY_ANCESTRY					("You have advantage on saving throws against being charmed, and magic can’t put you to sleep"),
	TRANCE							("Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is \"trance.\") While meditating, you can dream after a fashion; such dreams are actually mental exercises that have become reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep."),
	ELF_WEAPON_TRAINING				("You have proficiency with the longsword, shortsword, shortbow, and longbow"),
	CANTRIP							("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it."),
	EXTRA_LANGUAGE					("You can speak, read, and write one extra language of your choice."),
	FLEET_OF_FOOT					("Your base walking speed increases to 35 feet."),
	MASK_OF_THE_WILD				("You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow, mist, and other natural phenomena."),
	SUNLIGHT_SENSITIVITY			("You have disadvantage on attack rolls and on Wisdom (Perception) checks that rely on sight when you, the target of your attack, or whatever you are trying to perceive is in direct sunlight"),
	DROW_MAGIC						("You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells."),
	DROW_WEAPON_TRAINING			("You have proficiency with rapiers, shortswords, and hand crossbows."),
	LUCKY							("When you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll."),
	BRAVE							("You have advantage on saving throws against being frightened."),
	HALFLING_NIMBLENESS				("You can move through the space of any creature that is of a size larger than yours"),
	NATURALLY_STEALTHY				("You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you."),
	STOUT_RESILIENCE				("You have advantage on saving throws against poison, and you have resistance against poison damage."),
	HUMAN_ABILITY_SCORE_INCREASE	("Two different ability scores of your choice increase by 1."),
	SKILL							("You gain proficiency in one skill of your choice."),
	FEAT							("You gain one feat of your choice."),
	DRACONIC_ANCESTRY_BLACK			("You are descended from black dragons. You have resistance to acid damage."),
	DRACONIC_ANCESTRY_BLUE			("You are descended from blue dragons. You have resistance to lightning damage."),
	DRACONIC_ANCESTRY_BRASS			("You are descended from brass dragons. You have resistance to fire damage."),
	DRACONIC_ANCESTRY_BRONZE		("You are descended from bronze dragons. You have resistance to lightning damage."),
	DRACONIC_ANCESTRY_COPPER		("You are descended from copper dragons. You have resistance to acid damage."),
	DRACONIC_ANCESTRY_GOLD			("You are descended from gold dragons. You have resistance to fire damage."),
	DRACONIC_ANCESTRY_GREEN			("You are descended from green dragons. You have resistance to poison damage."),
	DRACONIC_ANCESTRY_RED			("You are descended from red dragons. You have resistance to fire damage."),
	DRACONIC_ANCESTRY_SILVER		("You are descended from silver dragons. You have resistance to cold damage."),
	DRACONIC_ANCESTRY_WHITE			("You are descended from white dragons. You have resistance to aold damage."),
	BREATH_WEAPON_BLACK				("You can use your action to exhale acid in a 5 x 30 ft. line. When you use your breath weapon, each creature in the area of the exhalation must make a dexterity saving throw. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	BREATH_WEAPON_BLUE				("You can use your action to exhale lightning in a 5 x 30 ft. line. When you use your breath weapon, each creature in the area of the exhalation must make a dexterity saving throw. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	BREATH_WEAPON_BRASS				("You can use your action to exhale fire in a 5 x 30 ft. line. When you use your breath weapon, each creature in the area of the exhalation must make a dexterity saving throw. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	BREATH_WEAPON_BRONZE			("You can use your action to exhale lightning in a 5 x 30 ft. line. When you use your breath weapon, each creature in the area of the exhalation must make a dexterity saving throw. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	BREATH_WEAPON_COPPER			("You can use your action to exhale acid in a 5 x 30 ft. line. When you use your breath weapon, each creature in the area of the exhalation must make a dexterity saving throw. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	BREATH_WEAPON_GOLD				("You can use your action to exhale fire in a 15 ft. cone. When you use your breath weapon, each creature in the area of the exhalation must make a dexterity saving throw. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	BREATH_WEAPON_GREEN				("You can use your action to exhale poison in a 15 ft. cone. When you use your breath weapon, each creature in the area of the exhalation must make a constitution saving throw. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	BREATH_WEAPON_RED				("You can use your action to exhale fire in a 15 ft. cone. When you use your breath weapon, each creature in the area of the exhalation must make a dexterity saving throw. The DC for this saving throw equals 8 +your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	BREATH_WEAPON_SILVER			("You can use your action to exhale cold in a 15 ft. cone. When you use your breath weapon, each creature in the area of the exhalation must make a constitution saving throw. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	BREATH_WEAPON_WHITE				("You can use your action to exhale cold in a 15 ft. cone. When you use your breath weapon, each creature in the area of the exhalation must make a constitution saving throw. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest."),
	
	;
	
	
	private final String description;
	
	RaceAbility(String description)
	{
		this.description = description;
	}
	
	public String description()
	{
		return description;
	}
	
}
