package classes;

public enum ClassFeature {
	
	ASI4					("Ability Score Improvement", 4, "", "When you reach 4th level, you can increase one ability score of your choice by 2, or you can increase two ability scores of your choice by 1. As normal, you can’t increase an ability score above 20 using this feature."),
	ASI8					("Ability Score Improvement", 8, "", "When you reach 8th level, you can increase one ability score of your choice by 2, or you can increase two ability scores of your choice by 1. As normal, you can’t increase an ability score above 20 using this feature."),
	ASI12					("Ability Score Improvement", 12, "", "When you reach 12th level, you can increase one ability score of your choice by 2, or you can increase two ability scores of your choice by 1. As normal, you can’t increase an ability score above 20 using this feature."),
	ASI16					("Ability Score Improvement", 16, "", "When you reach 16th level, you can increase one ability score of your choice by 2, or you can increase two ability scores of your choice by 1. As normal, you can’t increase an ability score above 20 using this feature."),
	ASI18					("Ability Score Improvement", 18, "", "When you reach 18th level, you can increase one ability score of your choice by 2, or you can increase two ability scores of your choice by 1. As normal, you can’t increase an ability score above 20 using this feature."),
	ASI19					("Ability Score Improvement", 19, "", "When you reach 19th level, you can increase one ability score of your choice by 2, or you can increase two ability scores of your choice by 1. As normal, you can’t increase an ability score above 20 using this feature."),
	ARTIFICER_SPECIALIST	("Artificer Specialist", 1, "artificer", "At 1st level, you choose the type of Artificer Specialist you are. Your choice grants you features at 1st level and again at 3rd, 9th, 14th, and 17th level."),
	MAGIC_ITEM_ANALYSIS		("Magic Item Analysis", 1, "artificer", "Starting at 1st level, you know the artificer spells Detect Magic and Identify, and you can cast them as rituals. You don't need to provide a material component when casting identify with this class feature. "),
	TOOL_EXPERTISE			("Tool Expertise", 2, "artificer", "Starting at 2nd level, your proficiency bonus is doubled for any ability check you make that uses any of the tool proficiencies you gain from this class."),
	WONDROUS_INVENTION		("Wondrous Invention", 2, "artificer", "At 2nd level, you gain the use of a magic item that you have crafted. Choose the item from the list of 2nd-level items below.\r\n" + 
			"\r\n" + 
			"You get another item of your choice when you reach certain levels in this class: 5th, 10th, 15th, and 20th level.\r\n" + 
			"\r\n" + 
			"The item you choose must be on the list for your current artificer level or a lower level.\r\n" + 
			"\r\n" + 
			"2nd Level:\r\n" + 
			"Bag of Holding\r\n" + 
			"Cap of Water breathing\r\n" + 
			"Driftglobe\r\n" + 
			"Goggles of Night\r\n" + 
			"Sending stones\r\n" + 
			"\r\n" +
			"5th Level:\r\n" + 
			"Alchemy Jug\r\n" + 
			"Helm of Comprehending Languages\r\n" + 
			"Lantern of Revealing\r\n" + 
			"Ring of Swimming\r\n" + 
			"Robe of Useful Items\r\n" + 
			"Rope of Climbing\r\n" + 
			"Wand of Magic Detection\r\n" + 
			"Wand of Secrets\r\n" + 
			"\r\n" +
			"10th Level:\r\n" + 
			"Bag of Beans\r\n" + 
			"Chime of Opening\r\n" + 
			"Decanter of Endless Water\r\n" + 
			"Eyes of Minute Seeing\r\n" + 
			"Folding boat\r\n" + 
			"Heward's Handy Haversack\r\n" + 
			"\r\n" +
			"15th Level:\r\n" + 
			"Boots of Striding and Springing\r\n" + 
			"Bracers of Archery\r\n" + 
			"Brooch of Shielding\r\n" + 
			"Broom of Flying\r\n" + 
			"Hat of Disguise\r\n" + 
			"Slippers of Spider Climbing\r\n" + 
			"\r\n" +
			"20th Level:\r\n" + 
			"Eyes of the Eagle\r\n" + 
			"Gem of Brightness\r\n" + 
			"Gloves of Missile Snaring\r\n" + 
			"Gloves of Swimming and Climbing\r\n" + 
			"Ring of Jumping\r\n" + 
			"Ring of Mind Shielding\r\n" + 
			"Wings of Flying"),
	ARTIFICER_SPELLCASTING	("Spellcasting", 3, "artificer", "You gain the ability to cast spells at 3rd level.\r\n" + 
			"\r\n" + 
			"Spell Slots\r\n" + 
			"The Artificer table shows how many spell slots you have to cast your spells of 1st level and higher. To cast one of these spells, you must expend a slot of the spell's level or higher. You regain all expended spell slots when you finish a long rest.\r\n" + 
			"\r\n" + 
			"Spells Known of 1st Level and Higher\r\n" + 
			"You know three 1st-level spells of your choice from the artificer spell list.\r\n" + 
			"\r\n" + 
			"The Spells Known column of the Artificer table shows when you learn more artificer spells of your choice from this feature. Each of these spells must be of a level for which you have spell slots on the Artificer table.\r\n" + 
			"\r\n" + 
			"Additionally, when you gain a level in this class, you can choose one of the artificer spells you know from this feature and replace it with another spell from the artificer spell list. The new spell must also be of a level for which you have spell slots on the Artificer table.\r\n" + 
			"\r\n" + 
			"Spellcasting Ability\r\n" + 
			"Intelligence is your spellcasting ability for your artificer spells. You use your Intelligence whenever an artificer spell refers to your spellcasting ability. In addition, you use your Intelligence modifier when setting the saving throw DC for an artificer spell you cast and when making an attack roll with one.\r\n" + 
			"\r\n" + 
			"Spell save DC = 8 + your proficiency bonus + your Intelligence modifier\r\n" + 
			"\r\n" + 
			"Spell attack modifier = your proficiency bonus + your Intelligence modifier"),
	INFUSE_MAGIC			("Infuse Magic", 4, "artificer", "Starting at 4th level, when you cast an artificer spell with a casting time of 1 action, you can increase its casting time to 1 minute. If you do so and hold a nonmagical item throughout the casting, you expend a spell slot, but none of the spell's effects occur. Instead, the spell transfers into that item for later use if the item doesn't already contain a spell from this feature.\r\n" + 
			"\r\n" + 
			"Any creature holding the item thereafter can use an action to activate the spell if the creature has an Intelligence score of at least 6. The spell is cast using your spellcasting ability, targeting the creature that activates the item. If the spell targets more than one creature, the creature that activates the item selects the additional targets. If the spell has an area of effect, it is centered on the item. If the spell's range is self, it targets the creature that activates the item.\r\n" + 
			"\r\n" + 
			"When you infuse a spell in this way, it must be used within 8 hours. After that time, its magic fades and is wasted.\r\n" + 
			"\r\n" + 
			"You can have a limited number of infused spells at the same time. The number equals your Intelligence modifier."),
	SUPERIOR_ATTUNEMENT		("Superior Attunement", 5, "artificer", "At 5th level, you can now attune to up to four, rather than three, magic items at a time. At 15th level, this limit increases to five magic items."),
	MECHANICAL_SERVANT		("Mechanical Servant", 6, "artificer", "At 6th level, you can produce a mechanical servant. The servant is a construct that obeys your commands without hesitation and functions in combat to protect you. Though magic fuels its creation, the servant is not magical itself.\r\n" + 
			"\r\n" + 
			"Select a Large beast with a challenge rating of 2 or less. The servant uses that beast's game statistics, but it can look however you like, as long as its form is appropriate for its statistics. It has the following modifications:\r\n" + 
			"\r\n" + 
			"It is a construct instead of a beast.\r\n" + 
			"It can't be charmed.\r\n" + 
			"It is immune to poison damage and the poisoned condition.\r\n" + 
			"It gains darkvision with a range of 60 feet if it doesn't have it already.\r\n" + 
			"It understands the languages you can speak when you create it, but it can't speak.\r\n" + 
			"If you are the target of a melee attack and the servant is within 5 feet of the attacker, you can use your reaction to command the servant to respond, using its reaction to make a melee attack against the attacker.\r\n" + 
			"The servant obeys your orders to the best of its ability. In combat, it rolls its own initiative and acts on its own.\r\n" + 
			"\r\n" + 
			"If the servant is killed, it can be returned to life via normal means, such as with the revivify spell. In addition, over the course of a long rest, you can repair a slain servant if you have access to its body. It returns to life with 1 hit point at the end of the rest. If the servant is beyond recovery, you can build a new one with one week of work (eight hours each day) and 1,000 gp of raw materials."),
	SOUL_OF_ARTIFICE		("Soul of Artifice", 20, "artificer", "At 20th level, your understanding of magic items is unmatched, allowing you to mingle your soul with items linked to you. You can attune to up to six magic items at once. In addition, you gain a +1 bonus to all saving throws per magic item you are currently attuned to."),
	ALCHEMISTS_SATCHEL	("Alchemist's Satchel", 1, "alchemist", "At 1st level, you craft an Alchemist's Satchel. The bag and its contents are both magical, and this magic allows you to pull out exactly the right materials you need for your Alchemical Formula options. After you use one of those options, the bag reclaims the materials.\n\nIf you lose this satchel, you can create a new one over the course of three days of work (eight hours each day) by expending 100 gp worth of leather, glass, and other raw materials"),
	ALCHEMICAL_FORMULA	("Alchemical Formula", 1, "alchemist", "At 1st level, you learn three Alchemical Formula options: Alchemical Fire, Alchemical Acid, and one other option of your choice. You learn an additional formula of your choice at 3rd, 9th, 14th, and 17th levels.\r\n" + 
			"\r\n" + 
			"To use any of these options, your Alchemist's Satchel must be within reach.\r\n" + 
			"\r\n" + 
			"If an Alchemical Formula option requires a saving throw, the DC is 8 + your proficiency bonus + your Intelligence modifier\r\n" + 
			"\r\n" + 
			"Alchemical Fi​re: As an action, you can reach into your Alchemist's Satchel, pull out a vial of volatile liquid, and hurl the vial at a creature, object, or surface within 30 feet of you (the vial and its contents disappear if you don't hurl the vial by the end of the current turn). On impact, the vial detonates in a 5-foot radius. Any creature in that area must succeed on a Dexterity saving throw or take 1d6 fire damage. This formula's damage increases by 1d6 when you reach certain levels in this class: 4th level (2d6), 7th level (3d6), 10th level (4d6), 13th level (5d6), 16th level (6d6), and 19th level (7d6).\r\n" + 
			"\r\n" + 
			"Alchemical Acid: As an action, you can reach into your Alchemist's Satchel, pull out a vial of acid, and hurl the vial at a creature or object within 30 feet of you (the vial and its contents disappear if you don't hurl the vial by the end of the current turn). The vial shatters on impact. A creature must succeed on a Dexterity saving throw or take 1d6 acid damage. An object automatically takes that damage, and the damage is maximized. This formula's damage increases by 1d6 when you reach certain levels in this class: 3rd level (2d6), 5th level (3d6), 7th level (4d6), 9th level (5d6), 11th level (6d6), 13th level (7d6), 15th level (8d6), 17th level (9d6), and 19th level (10d6).\r\n" + 
			"\r\n" + 
			"Healing Draught: As an action, you can reach into your Alchemist's Satchel and pull out a vial of healing liquid. A creature can drink it as an action to regain 1d8 hit points. The vial then disappears. Once a creature regains hit points from this alchemical formula, the creature can't do so again until it finishes a long rest. If not used, the vial and its contents disappear after 1 hour. While the vial exists, you can't use this formula. This formula's healing increases by 1d8 when you reach certain levels in this class: 3rd level (2d8), 5th level (3d8), 7th level (4d8), 9th level (5d8), 11th level (6d8), 13th level (7d8), 15th level (8d8), 17th level (9d8), and 19th level (10d8).\r\n" + 
			"\r\n" + 
			"Smoke Stick: As an action, you can reach into your Alchemist's Satchel and pull out a stick that produces a thick plume of smoke. You can hold on to the stick or throw it to a point up to 30 feet away as part of the action used to produce it. The area in a 10-foot radius around the stick is filled with thick smoke that blocks vision, including darkvision. The stick and smoke persist for 1 minute and then disappear. After using this formula, you can't do so again for 1 minute.\r\n" + 
			"\r\n" + 
			"Swift Step Draught: As a bonus action, you can reach into your Alchemist's Satchel and pull out a vial filled with a bubbling, brown liquid. As an action, a creature can drink it. Doing so increases the creature's speed by 20 feet for 1 minute, and the vial disappears. If not used, the vial and its contents disappear after 1 minute. After using this formula, you can't do so again for 1 minute.\r\n" + 
			"\r\n" + 
			"Tanglefoot Bag: As an action, you can reach into your Alchemist's Satchel and pull out a bag filled with writhing, sticky black tar and hurl it at a point on the ground within 30 feet of you (the bag and its contents disappear if you don't hurl the bag by the end of the current turn). The bag bursts on impact and covers the ground in a 5- foot radius with sticky goo. That area becomes difficult terrain for 1 minute, and any creature that starts its turn on the ground in that area has its speed halved for that turn. After using this formula, you can't do so again for 1 minute\r\n" + 
			"\r\n" + 
			"Thunderstone: As an action, you can reach into your Alchemist's Satchel and pull out a crystalline shard and hurl it at a creature, object, or surface within 30 feet of you (the shard disappears if you don't hurl it by the end of the current turn). The shard shatters on impact with a blast of concussive energy. Each creature within 10 feet of the point of impact must succeed on a Constitution saving throw or be knocked prone and pushed 10 feet away from that point."),
	MASTER_SMITH		("Master Smith", 1, "gunsmith", "At 1st level, you gain proficiency with smith's tools, and you learn the Mending cantrip."),
	THUNDER_CANNON		("Master Smith", 1, "gunsmith", "At 1st level, you forge a Thunder Cannon. It is a ferocious weapon that fires leaden bullets.\r\n" + 
			"\r\n" + 
			"You are proficient with the Thunder Cannon. The firearm is a two-handed ranged weapon that deals 2d6 piercing damage. Its normal range is 150 feet, and its maximum range is 500 feet. Once fired, it must be reloaded as a bonus action. If you lose your Thunder Cannon, you can create a new one over the course of three days of work (eight hours each day) by expending 100 gp worth of metal and other raw materials."),
	ARCANE_MAGAZINE		("Master Smith", 1, "gunsmith", "At 1st level, you craft a leather bag used to carry your tools and ammunition for your Thunder Cannon. Your Arcane Magazine includes the powders, lead shot, and other materials needed to keep that weapon functioning. You can use the Arcane Magazine to produce ammunition for your gun. At the end of each long rest, you can magically produce 40 rounds of ammunition with this magazine. After each short rest, you can produce 10 rounds. If you lose your Arcane Magazine, you can create a new one as part of a long rest, using 25 gp of leather and other raw materials."),
	THUNDER_MONGER		("Master Smith", 3, "gunsmith", "At 3rd level, as an action, you can make a special attack with your Thunder Cannon that deals an extra 1d6 thunder damage on a hit.\r\n" + 
			"\r\n" + 
			"This extra damage increases by 1d6 when you reach certain levels in this class: 5th level (2d6), 7th level (3d6), 9th level (4d6), 11th level (5d6), 13th level (6d6), 15th level (7d6), 17th level (8d6), and 19th level (9d6)."),
	BLAST_WAVE			("Master Smith", 9, "gunsmith", "Starting at 9th level, as an action, you can make a special attack with your Thunder Cannon. Rather than making an attack roll, you unleash force energy in a 15-foot cone from the gun. Each creature in that area must make a Strength saving throw with a DC of 8 + your proficiency bonus + your Intelligence modifier. On a failed saving throw, a target takes 2d6 force damage and is pushed 10 feet away from you.\r\n" + 
			"\r\n" + 
			"This damage increases by 1d6 when you reach certain levels in this class: 13th level (3d6) and 17th level (4d6)."),
	PIERCING_ROUND		("Master Smith", 14, "gunsmith", "Starting at 14th level, as an action, you can make a special attack with your Thunder Cannon. Rather than making an attack roll, you cause the gun to unleash a bolt of lightning, 5-feet wide and 30-feet long. Each creature in that area must make Dexterity saving throws with a DC of 8 + your proficiency bonus + your Intelligence modifier. On a failed saving throw, a target takes 4d6 lightning damage. This damage increases to 6d6 when you reach 19th level in this class."),
	EXPLOSIVE_ROUND		("Master Smith", 17, "gunsmith", "Starting at 17th level, as an action, you can make a special attack with your Thunder Cannon. Rather than making an attack roll, you launch an explosive round from the gun. The round detonates in a 30-foot radius sphere at a point within range. Each creature in that area must make a Dexterity saving throw with a DC of 8 + your proficiency bonus + your Intelligence modifier. On a failed saving throw, a target takes 4d8 fire damage."),
	
	RAGE					("Rage", 1, "barbarian", "In battle, you fight with primal ferocity. On your turn, you can enter a rage as a bonus action. While raging, you gain the following benefits if you aren’t wearing heavy armor:\n• You have advantage on Strength checks and Strength saving throws.\n• When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian.\n• You have resistance to bludgeoning, piercing, and slashing damage.\n• If you are able to cast spells, you can’t cast them or concentrate on them while raging.\nYour rage lasts for 1 minute. It ends early if you are knocked unconscious or if your turn ends and you haven’t attacked a hostile creature since your last turn or taken damage since then. You can also end your rage on your turn as a bonus action.\nYou can only rage a certain number of times between each long rest, determined by your Barbarian level."),
	UNARMORED_DEFENSE		("Unarmored Defense", 1, "barbarian", "While you are not wearing any armor, your Armor Class equals 10 + your Dexterity modifier + your Constitution modifier. You can use a shield and still gain this benefit"),
	RECKLESS_ATTACK			("Reckless Attack", 2, "barbarian", "Starting at 2nd level, you can throw aside all concern for defense to attack with fierce desperation. When you make your first attack on your turn, you can decide to attack recklessly. Doing so gives you advantage on melee weapon attack rolls using Strength during this turn, but attack rolls against you have advantage until your next turn."),
	DANGER_SENSE			("Danger Sense", 2, "barbarian", "At 2nd level, you gain an uncanny sense of when things nearby aren’t as they should be, giving you an edge when you dodge away from danger. You have advantage on Dexterity saving throws against effects that you can see, such as traps and spells. To gain this benefit, you can’t be blinded, deafened, or incapacitated."),
	PRIMAL_PATH				("Primal Path", 3, "barbarian", "At 3rd level, you choose a path that shapes the nature of your rage. Your choice grants you features at 3rd level and again at 6th, 10th, and 14th levels."),
	EXTRA_ATTACK			("Extra Attack", 5, "barbarian", "Beginning at 5th level, you can attack twice, instead of once, whenever you take the Attack action on your turn."),
	FAST_MOVEMENT			("Fast Movement", 5, "barbarian", "Starting at 5th level, your speed increases by 10 feet while you aren’t wearing heavy armor."),
	FERAL_INSTINCT			("Feral Instinct", 7, "barbarian", "By 7th level, your instincts are so honed that you have advantage on initiative rolls. Additionally, if you are surprised at the beginning of combat and aren’t incapacitated, you can act normally on your first turn, but only if you enter your rage before doing anything else on that turn."),
	BRUTAL_CRITICAL			("Brutal Critical", 9, "barbarian", "Beginning at 9th level, you can roll one additional weapon damage die when determining the extra damage for a critical hit with a melee attack. This increases to two additional dice at 13th level and three additional dice at 17th level."),
	RELENTLESS_RAGE			("Relentless Rage", 11, "barbarian", "Starting at 11th level, your rage can keep you fighting despite grievous wounds. If you drop to 0 hit points while you’re raging and don’t die outright, you can make a DC 10 Constitution saving throw. If you succeed, you drop to 1 hit point instead. sEach time you use this feature after the first, the DC increases by 5. When you finish a short or long rest, the DC resets to 10."),
	PERSISTENT_RAGE			("Persistent Rage", 15, "barbarian", "Beginning at 15th level, your rage is so fierce that it ends early only if you fall unconscious or if you choose to end it."),
	INDOMITABLE_MIGHT		("Indomitable Might", 18, "barbarian", "Beginning at 18th level, if your total for a Strength check is less than your Strength score, you can use that score in place of the total."),
	PRIMAL_CHAMPION			("Primal Chamption", 20, "barbarian", "At 20th level, you embody the power of the wilds. Your Strength and Constitution scores increase by 4. Your maximum for those scores is now 24."),
	FRENZY					("Frenzy", 3, "berserker", "Starting when you choose this path at 3rd level, you can go into a frenzy when you rage. If you do so, for the duration of your rage you can make a single melee weapon attack as a bonus action on each of your turns after this one. When your rage ends, you suffer one level of exhaustion"),
	MINDLESS_RAGE			("Mindless Rage", 6, "berserker", "Beginning at 6th level, you can’t be charmed or frightened while raging. If you are charmed or frightened when you enter your rage, the effect is suspended for the duration of the rage."),
	INTIMIDATING_PRESENCE	("Intimidating Presence", 10, "berserker", "Beginning at 10th level, you can use your action to frighten someone with your menacing presence. When you do so, choose one creature that you can see within 30 feet of you. If the creature can see or hear you, it must succeed on a Wisdom saving throw (DC equal to 8 + your proficiency bonus + your Charisma modifier) or be frightened of you until the end of your next turn. On subsequent turns, you can use your action to extend the duration of this effect on the frightened creature until the end of your next turn. This effect ends if the creature ends its turn out of line of sight or more than 60 feet away from you. If the creature succeeds on its saving throw, you can't use this feature on that creature again for 24 hours."),
	RETALIATION				("Retaliation", 14, "berserker", "Starting at 14th level, when you take damage from a creature that is within 5 feet of you. you can use your reaction to make a melee weapon attack against that creature."),
	SPIRIT_SEEKER			("Spirit Seeker", 3, "totem warrior", "Yours is a path that seeks attunement with the natural world, giving you a kinship with beasts. At 3rd level when you adopt this path, you gain the ability to cast the beast sense and speak with animals spells, but only as rituals."),
	TOTEM_SPIRIT			("Totem Spirit", 3, "totem warrior", "At 3rd level, when you adopt this path, you choose a totem spirit and gain its feature. You must make or acquire a physical totem object- an amulet or similar adornment—that incorporates fur or feathers, claws,	teeth, or bones of the totem animal. At your option, you also gain minor physical attributes that are reminiscent of your totem spirit. For example, if you have a bear totem spirit, you might be unusually hairy and thickskinned, or if your totem is the eagle, your eyes turn bright yellow.\nYour totem animal might be an animal related to those listed here but more appropriate to your homeland. For example, you could choose a hawk or vulture in place of an eagle.\nBear: While raging, you have resistance to all damage except psychic damage. The spirit of the bear makes you tough enough to stand up to any punishment.\nEagle: While you're raging and aren’t wearing heavy armor, other creatures have disadvantage on opportunity attack rolls against you, and you can use the Dash action as a bonus action on your turn. The spirit of the eagle makes you into a predator who can weave through the fray with ease.\nWolf: While you're raging, your friends have advantage on melee attack rolls against any creature within 5 feet of you that is hostile to you. The spirit of the wolf makes you a leader of hunters."),
	ASPECT_OF_THE_BEAST		("Aspect of the Beast", 6, "totem warrior", "At 6th level, you gain a m agical benefit based on the totem animal of your choice. You can choose the same animal you selected at 3rd level or a different one.\nBear: You gain the might of a bear. Your carrying capacity (including maximum load and maximum lift) is doubled, and you have advantage on Strength checks made to push, pull, lift, or break objects.\nEagle: You gain the eyesight of an eagle. You can see up to 1 mile away with no difficulty, able to discern even fine details as though looking at something no more than 100 feet away from you. Additionally, dim light doesn't impose disadvantage on your Wisdom (Perception) checks.\nWolf: You gain the hunting sensibilities of a wolf. You can track other creatures while traveling at a fast pace, and you can move stealthily while traveling at a normal pace."),
	SPIRIT_WALKER			("Spirit Walker", 10, "totem warrior", "At 10th level, you can cast the commune with nature spell, but only as a ritual. When you do so, a spiritual version of one of the animals you chose for Totem Spirit or Aspect of the Beast appears to you to convey the information you seek."),
	TOTEMIC_ATTUNEMENT		("Totemic Attunement", 14, "totem warrior", "At 14th level, you gain a magical benefit based on a totem animal of your choice. You can choose the same animal you selected previously or a different one.\nBear: While you’re raging, any creature within 5 feet of you that’s hostile to you has disadvantage on attack rolls against targets other than you or another character with this feature. An enemy is immune to this effect if it can’t see or hear you or if it can’t be frightened.\nEagle: While raging, you have a flying speed equal to your current walking speed. This benefit works only in short bursts; you fall if you end your turn in the air and nothing else is holding you aloft.\nWolf: While you’re raging, you can use a bonus action on your turn to knock a Large or smaller creature prone when you hit it with m elee weapon attack."),
	ANCESTRAL_PROTECTORS	("Ancestral Protectors", 3, "ancestral guardian", "At 3rd level, while you're raging, the first creature you hit with an attack on your turn becomes the target of spiritual warriors, which hinder its attacks. Until the start of your next turn, that target has disadvantage on any attack roll that isn't against you, and when the target hits a creature other than you with an attack, that creature has resistance to the damage dealt by the attack. The effect on the target ends early if your rage ends."),
	SPIRIT_SHIELD			("Spirit Shield", 6, "ancestral guardian", "Beginning at 6th level, if you are raging and another creature you can see within 30 feet of you takes damage, you can use your reaction to reduce that damage by 2d6.\nWhen you reach certain levels in this class, you can reduce the damage by more: by 3d6 at 10th level and by 4d6 at 14th level."),
	CONSULT_THE_SPIRITS		("Consult the Spirits", 10, "ancestral guardian", "At 10th level, you cast the Augury or Clairvoyance spell, without using a spell slot or material components. Rather than creating a spherical sensor, it invisibly summons one of your ancestral spirits to the chosen location. Wisdom is your spellcasting ability for these spells.\nAfter you cast either spell in this way, you can't use this feature again until you finish a short or long rest."),
	VENGEFUL_ANCESTORS		("Vengeful AncestorS", 14, "ancestral guardian", "At 14th level, when you use your Spirit Shield to reduce the damage of an attack, the attacker takes an amount of force damage equal to the damage that your Spirit Shield prevents. "),
	BATTLERAGER_ARMOR		("Battlerager Armor", 3, "battlerager", "At 3rd level, you gain the ability to use Spiked Armor as a weapon.\nWhile you are wearing spiked armor and are raging, you can use a bonus action to make one melee weapon attack with your armor spikes against a target within 5 feet of you. If the attack hits, the spikes deal 1d4 piercing damage. You use your Strength modifier for the attack and damage rolls.\nAdditionally, when you use the Attack action to grapple a creature, the target takes 3 piercing damage if your grapple check succeeds."),
	RECKLESS_ABANDON		("Reckless Abandon", 6, "battlerager", "Beginning at 6th level, when you use Reckless Attack while raging, you also gain temporary hit points equal to your Constitution modifier (minimum of 1). They vanish when your rage ends."),
	BATTLERAGER_CHARGE		("Battlerager Charge", 10, "battlerager", "Beginning at 10th level, you can take the Dash action as a bonus action while raging."),
	SPIKED_RETRIBUTION		("Spiked Retribution", 14, "battlerager", "Starting at 14th level, when a creature within 5 feet of you hits you with a melee attack, the attacker takes 3 piercing damage if you are raging, aren't incapacitated, and are wearing spiked armor."),
	STORM_AURA				("Storm Aura", 3, "storm herald", "Starting at 3rd level, you emanate an aura while you rage. The aura extends 10 feet from you in every direction, but not through total cover.\nYour aura has an effect that activates when you enter your rage, and you can activate the effect again on each of your turns as a bonus action. Choose desert, sea, or tundra. Your aura's effect depends on that chosen environment. You can change your environment choice whenever you gain a level in this class.\nIf your aura's effects require a saving throw, the DC equals 8 + your proficiency bonus + your Constitution modifier.\nDesert: All other creatures in your aura take 2 fire damage each. The damage increases when you reach certain levels in this class, increasing to 3 at 5th level, 4 at 10th level, 5 at 15th level, and 6 at 20th level.\nSea: You can choose one other creature you can see in your aura. The target must make a Dexterity saving throw. The target takes 1d6 lightning damage on a failed save, or half as much damage on a successful one. The damage increases when you reach certain levels in this class, increasing to 2d6 at 10th level, 3d6 at 15th level, and 4d6 at 20th level.\nTundra: Each creature of your choice in your aura gains 2 temporary hit points, as icy spirits inure it to suffering. The temporary hit points increase when you reach certain levels in this class, increasing to 3 at 5th level, 4 at 10th level, 5 at 15th level, and 6 at 20th level. "),
	STORM_SOUL				("Storm Soul", 6, "storm herald", "At 6th level, the storm grants you benefits even when your aura isn't active.\nDesert. You gain resistance to fire damage, and you don't suffer the effects of extreme heat. Moreover, as an action, you can touch a flammable object that isn't being worn or carried by anyone else and set it on fire.\nSea. You gain resistance to lightning damage, and you can breathe underwater. You also gain a swimming speed of 30 feet.\nTundra. You gain resistance to cold damage, and you don't suffer the effects of extreme cold. Moreover, as an action, you can touch water and turn a 5-foot cube of it into ice, which melts after 1 minute. This action fails if a creature is in the cube. "),
	SHIELDING_STORM			("Shielding Storm", 10, "storm herald", "At 10th level, each creature of your choice has the damage resistance you gained from the Storm Soul feature while the creature is in your Storm Aura. "),
	RAGING_STORM			("Raging Storm", 14, "storm herald", "At 14th level, the power of the storm grows mightier.\nDesert: Immediately after a creature in your aura hits you with an attack, you can use your reaction to force that creature to make a Dexterity saving throw. On a failed save, the creature takes fire damage equal to half your barbarian level.\nSea: When you hit a creature in your aura with an attack, you can use your reaction to force that creature to make a Strength saving throw. On a failed save, the creature is knocked prone, as if struck by a wave.\nTundra: Whenever the effect of your Storm Aura is activated, you can choose one creature you can see in the aura. That creature must succeed on a Strength saving throw, or its speed is reduced to 0 until the start of your next turn, as magical frost covers it."),
	DIVINE_FURY				("Divine Fury", 3, "zealot", "At 3rd level, while you're raging, the first creature you hit on each of your turns with a weapon attack takes extra damage equal to 1d6 + half your barbarian level. The extra damage is necrotic or radiant; you choose the type of damage when you gain this feature."),
	WARRIOR_OF_THE_GODS		("Warrior of the Gods", 3, "zealot", "At 3rd level, if a spell has the sole effect of restoring you to life (but not undeath), the caster doesn't need material components to cast the spell on you."),
	FANATICAL_FOCUS			("Fanatical Focus", 6, "zealot", "Starting at 6th level, if you fail a saving throw while you're raging, you can reroll it, and you must use the new roll. You can use this ability only once per rage."),
	ZEALOUS_PRESENCE		("Zealous Presence", 10, "zealot", "At 10th level, as a bonus action, you unleash a battle cry infused with divine energy. Up to ten other creatures of your choice within 60 feet of you that can hear you gain advantage on attack rolls and saving throws until the start of your next turn.\nOnce you use this feature, you can't use it again until you finish a long rest."),
	RAGE_BEYOND_DEATH		("Rage Beyond Death", 14, "zealot", "Beginning at 14th level, while you're raging, having 0 hit points doesn't knock you unconscious. You still must make death saving throws, and you suffer the normal effects of taking damage while at 0 hit points. However, if you would die due to failing death saving throws, you don't die until your rage ends, and you die then only if you still have 0 hit points."),
	
	
	
	
	
	
	;
	
	
	private final String name;
	private final int level;
	public final String type;
	private final String description;
	
	ClassFeature (String name, int level, String type, String description)
	{
		this.name = name;
		this.level = level;
		this.type = type;
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
	
	public String type()
	{
		return type;
	}
	
	public static ClassFeature[] type(String type)
	{
		ClassFeature[] values = new ClassFeature[100];
		int pointer = 0;
		ClassFeature[] all = ClassFeature.values();
		
		for(int i = 0; i < all.length; i++)
		{
			if (all[i].type().equals(type))
			{
				values[pointer] = all[i];
				pointer++;
			}
		}
		
		ClassFeature[] result = new ClassFeature[pointer];
		for (int i = 0; i < pointer; i++)
		{
			result[pointer] = values[pointer];
		}
		
		return result;
	}
	
	public static void main (String[] args)
	{
		System.out.println(ClassFeature.WONDROUS_INVENTION.description());
	}
	
}
