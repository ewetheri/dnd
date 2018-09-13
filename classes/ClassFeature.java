package dnd;

public enum ClassFeature {
	
	ASI4					("Ability Score Improvement", 4, "When you reach 4th level, you can increase one ability score of your choice by 2, or you can increase two ability scores of your choice by 1. As normal, you can’t increase an ability score above 20 using this feature."),
	ASI8					("Ability Score Improvement", 8, "When you reach 8th level, you can increase one ability score of your choice by 2, or you can increase two ability scores of your choice by 1. As normal, you can’t increase an ability score above 20 using this feature."),
	ASI12					("Ability Score Improvement", 12, "When you reach 12th level, you can increase one ability score of your choice by 2, or you can increase two ability scores of your choice by 1. As normal, you can’t increase an ability score above 20 using this feature."),
	ASI16					("Ability Score Improvement", 16, "When you reach 16th level, you can increase one ability score of your choice by 2, or you can increase two ability scores of your choice by 1. As normal, you can’t increase an ability score above 20 using this feature."),
	ASI18					("Ability Score Improvement", 18, "When you reach 18th level, you can increase one ability score of your choice by 2, or you can increase two ability scores of your choice by 1. As normal, you can’t increase an ability score above 20 using this feature."),
	ASI19					("Ability Score Improvement", 19, "When you reach 19th level, you can increase one ability score of your choice by 2, or you can increase two ability scores of your choice by 1. As normal, you can’t increase an ability score above 20 using this feature."),
	RAGE					("Rage", 1, "In battle, you fight with primal ferocity. On your turn, you can enter a rage as a bonus action. While raging, you gain the following benefits if you aren’t wearing heavy armor:\n• You have advantage on Strength checks and Strength saving throws.\n• When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian.\n• You have resistance to bludgeoning, piercing, and slashing damage.\n• If you are able to cast spells, you can’t cast them or concentrate on them while raging.\nYour rage lasts for 1 minute. It ends early if you are knocked unconscious or if your turn ends and you haven’t attacked a hostile creature since your last turn or taken damage since then. You can also end your rage on your turn as a bonus action.\nYou can only rage a certain number of times between each long rest, determined by your Barbarian level."),
	UNARMORED_DEFENSE		("Unarmored Defense", 1, "While you are not wearing any armor, your Armor Class equals 10 + your Dexterity modifier + your Constitution modifier. You can use a shield and still gain this benefit"),
	RECKLESS_ATTACK			("Reckless Attack", 2, "Starting at 2nd level, you can throw aside all concern for defense to attack with fierce desperation. When you make your first attack on your turn, you can decide to attack recklessly. Doing so gives you advantage on melee weapon attack rolls using Strength during this turn, but attack rolls against you have advantage until your next turn."),
	DANGER_SENSE			("Danger Sense", 2, "At 2nd level, you gain an uncanny sense of when things nearby aren’t as they should be, giving you an edge when you dodge away from danger. You have advantage on Dexterity saving throws against effects that you can see, such as traps and spells. To gain this benefit, you can’t be blinded, deafened, or incapacitated."),
	PRIMAL_PATH				("Primal Path", 3, "At 3rd level, you choose a path that shapes the nature of your rage. Your choice grants you features at 3rd level and again at 6th, 10th, and 14th levels."),
	EXTRA_ATTACK			("Extra Attack", 5, "Beginning at 5th level, you can attack twice, instead of once, whenever you take the Attack action on your turn."),
	FAST_MOVEMENT			("Fast Movement", 5, "Starting at 5th level, your speed increases by 10 feet while you aren’t wearing heavy armor."),
	FERAL_INSTINCT			("Feral Instinct", 7, "By 7th level, your instincts are so honed that you have advantage on initiative rolls. Additionally, if you are surprised at the beginning of combat and aren’t incapacitated, you can act normally on your first turn, but only if you enter your rage before doing anything else on that turn."),
	BRUTAL_CRITICAL			("Brutal Critical", 9, "Beginning at 9th level, you can roll one additional weapon damage die when determining the extra damage for a critical hit with a melee attack. This increases to two additional dice at 13th level and three additional dice at 17th level."),
	RELENTLESS_RAGE			("Relentless Rage", 11, "Starting at 11th level, your rage can keep you fighting despite grievous wounds. If you drop to 0 hit points while you’re raging and don’t die outright, you can make a DC 10 Constitution saving throw. If you succeed, you drop to 1 hit point instead. sEach time you use this feature after the first, the DC increases by 5. When you finish a short or long rest, the DC resets to 10."),
	PERSISTENT_RAGE			("Persistent Rage", 15, "Beginning at 15th level, your rage is so fierce that it ends early only if you fall unconscious or if you choose to end it."),
	INDOMITABLE_MIGHT		("Indomitable Might", 18, "Beginning at 18th level, if your total for a Strength check is less than your Strength score, you can use that score in place of the total."),
	PRIMAL_CHAMPION			("Primal Chamption", 20, "At 20th level, you embody the power of the wilds. Your Strength and Constitution scores increase by 4. Your maximum for those scores is now 24."),
	FRENZY					("Frenzy", 3, "Starting when you choose this path at 3rd level, you can go into a frenzy when you rage. If you do so, for the duration of your rage you can make a single melee weapon attack as a bonus action on each of your turns after this one. When your rage ends, you suffer one level of exhaustion"),
	MINDLESS_RAGE			("Mindless Rage", 6, "Beginning at 6th level, you can’t be charmed or frightened while raging. If you are charmed or frightened when you enter your rage, the effect is suspended for the duration of the rage."),
	INTIMIDATING_PRESENCE	("Intimidating Presence", 10, "Beginning at 10th level, you can use your action to frighten someone with your menacing presence. When you do so, choose one creature that you can see within 30 feet of you. If the creature can see or hear you, it must succeed on a Wisdom saving throw (DC equal to 8 + your proficiency bonus + your Charisma modifier) or be frightened of you until the end of your next turn. On subsequent turns, you can use your action to extend the duration of this effect on the frightened creature until the end of your next turn. This effect ends if the creature ends its turn out of line of sight or more than 60 feet away from you. If the creature succeeds on its saving throw, you can't use this feature on that creature again for 24 hours."),
	RETALIATION				("Retaliation", 14, "Starting at 14th level, when you take damage from a creature that is within 5 feet of you. you can use your reaction to make a melee weapon attack against that creature."),
	SPIRIT_SEEKER			("Spirit Seeker", 3, "Yours is a path that seeks attunement with the natural world, giving you a kinship with beasts. At 3rd level when you adopt this path, you gain the ability to cast the beast sense and speak with animals spells, but only as rituals."),
	TOTEM_SPIRIT			("Totem Spirit", 3, "At 3rd level, when you adopt this path, you choose a totem spirit and gain its feature. You must make or acquire a physical totem object- an amulet or similar adornment—that incorporates fur or feathers, claws,	teeth, or bones of the totem animal. At your option, you also gain minor physical attributes that are reminiscent of your totem spirit. For example, if you have a bear totem spirit, you might be unusually hairy and thickskinned, or if your totem is the eagle, your eyes turn bright yellow.\nYour totem animal might be an animal related to those listed here but more appropriate to your homeland. For example, you could choose a hawk or vulture in place of an eagle.\nBear: While raging, you have resistance to all damage except psychic damage. The spirit of the bear makes you tough enough to stand up to any punishment.\nEagle: While you're raging and aren’t wearing heavy armor, other creatures have disadvantage on opportunity attack rolls against you, and you can use the Dash action as a bonus action on your turn. The spirit of the eagle makes you into a predator who can weave through the fray with ease.\nWolf: While you're raging, your friends have advantage on melee attack rolls against any creature within 5 feet of you that is hostile to you. The spirit of the wolf makes you a leader of hunters."),
	ASPECT_OF_THE_BEAST		("Aspect of the Beast", 6, "At 6th level, you gain a m agical benefit based on the totem animal of your choice. You can choose the same animal you selected at 3rd level or a different one.\nBear: You gain the might of a bear. Your carrying capacity (including maximum load and maximum lift) is doubled, and you have advantage on Strength checks made to push, pull, lift, or break objects.\nEagle: You gain the eyesight of an eagle. You can see up to 1 mile away with no difficulty, able to discern even fine details as though looking at something no more than 100 feet away from you. Additionally, dim light doesn't impose disadvantage on your Wisdom (Perception) checks.\nWolf: You gain the hunting sensibilities of a wolf. You can track other creatures while traveling at a fast pace, and you can move stealthily while traveling at a normal pace."),
	SPIRIT_WALKER			("Spirit Walker", 10, "At 10th level, you can cast the commune with nature spell, but only as a ritual. When you do so, a spiritual version of one of the animals you chose for Totem Spirit or Aspect of the Beast appears to you to convey the information you seek."),
	TOTEMIC_ATTUNEMENT		("Totemic Attunement", 14, "At 14th level, you gain a magical benefit based on a totem animal of your choice. You can choose the same animal you selected previously or a different one.\nBear: While you’re raging, any creature within 5 feet of you that’s hostile to you has disadvantage on attack rolls against targets other than you or another character with this feature. An enemy is immune to this effect if it can’t see or hear you or if it can’t be frightened.\nEagle: While raging, you have a flying speed equal to your current walking speed. This benefit works only in short bursts; you fall if you end your turn in the air and nothing else is holding you aloft.\nWolf: While you’re raging, you can use a bonus action on your turn to knock a Large or smaller creature prone when you hit it with m elee weapon attack."),
	
	
	
	
	
	
	
	;
	
	
	private final String name;
	private final int level;
	private final String description;
	
	ClassFeature (String name, int level, String description)
	{
		this.name = name;
		this.level = level;
		this.description = description;
	}
	
	public String shorthand()
	{
		return name;
	}
	
	public int level()
	{
		return level;
	}
	
	public String description()
	{
		return description;
	}
	
	public String longhand()
	{
		return name + ": " + description;
	}
	
}
