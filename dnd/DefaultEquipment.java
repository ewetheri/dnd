package dnd;

public enum DefaultEquipment {

	
	//ARMOR			new armor  NAME					TYPE		WEIGHT	COST					DESC.	AC	REQSTR	STEALTHDIS.
	PADDED			(new Armor("padded", 			"light", 	8, 		new Money(0,0,0,5), 	null,	11, 0, 		true)),

	LEATHER			(new Armor("leather", 			"light", 	10, 	new Money(0,0,0,10), 	null,	11, 0, 		false)),
	
	STUDDED_LEATHER	(new Armor("studded leather", 	"light", 	13, 	new Money(0,0,0,45), 	null,	12, 0, 		false)),
	
	HIDE			(new Armor("hide",			 	"medium", 	12, 	new Money(0,0,0,10), 	null,	12, 0, 		false)),
	
	CHAIN_SHIRT		(new Armor("chain shirt",	 	"medium", 	20, 	new Money(0,0,0,50), 	null,	13, 0, 		false)),
	
	SCALE_MAIL		(new Armor("scale mail",	 	"medium", 	45, 	new Money(0,0,0,50), 	null,	14, 0, 		true)),
	
	BREASTPLATE		(new Armor("breastplate",	 	"medium", 	20, 	new Money(0,0,0,400), 	null,	14, 0, 		false)),
	
	HALF_PLATE		(new Armor("half plate",	 	"medium", 	40, 	new Money(0,0,0,750), 	null,	15, 0, 		true)),
	
	RING_MAIL		(new Armor("ring mail",		 	"heavy", 	40, 	new Money(0,0,0,30), 	null,	14, 0, 		true)),
	
	CHAIN_MAIL		(new Armor("chain mail",		"heavy", 	55, 	new Money(0,0,0,75), 	null,	16, 13, 	true)),
	
	SPLINT			(new Armor("splint",			"heavy", 	60, 	new Money(0,0,0,200), 	null,	17, 15, 	true)),
	
	PLATE			(new Armor("plate",				"heavy", 	65, 	new Money(0,0,0,1500), 	null,	18, 15, 	true)),
	
	SHIELD			(new Armor("shield",		 	"shield", 	6, 		new Money(0,0,0,10), 	null,	2,	0, 		false)),
	
	
	//WEAPON		new weapon	NAME				TYPE				WEIGHT	COST					DESC.	DAMAGE					DAMAGE TYPE					KEYWORDS										RANGE	RANGEMAX
	CLUB			(new Weapon("club",				"simple melee",		2,		new Money(0,1),			null,	new Dice(Die.D4),		DamageType.BLUDGEONING,		new WeaponKeyword[] {WeaponKeyword.LIGHT},		0,		0)),
	
	DAGGER			(new Weapon("dagger",			"simple melee",		1,		new Money(0,0,0,2),		null,	new Dice(Die.D4),		DamageType.PIERCING,		new WeaponKeyword[] {WeaponKeyword.LIGHT, WeaponKeyword.FINESSE, WeaponKeyword.THROWN},		20,		60)),
	
	GREATCLUB		(new Weapon("greatclub",		"simple melee",		10,		new Money(0,2),			null,	new Dice(Die.D8),		DamageType.BLUDGEONING,		new WeaponKeyword[] {WeaponKeyword.TWO_HANDED},		0,		0)),
	
	HANDAXE			(new Weapon("handaxe",			"simple melee",		2,		new Money(0,0,0,5),		null,	new Dice(Die.D6),		DamageType.SLASHING,		new WeaponKeyword[] {WeaponKeyword.LIGHT, WeaponKeyword.THROWN},		20,		60)),
	
	JAVELIN			(new Weapon("javelin",			"simple melee",		2,		new Money(0,5),			null,	new Dice(Die.D6),		DamageType.PIERCING,		new WeaponKeyword[] {WeaponKeyword.THROWN},		30,		120)),
	
	LIGHT_HAMMER	(new Weapon("light hammer",		"simple melee",		2,		new Money(0,0,0,2),		null,	new Dice(Die.D4),		DamageType.BLUDGEONING,		new WeaponKeyword[] {WeaponKeyword.LIGHT, WeaponKeyword.THROWN},		20,		60)),
	
	MACE			(new Weapon("mace",				"simple melee",		4,		new Money(0,0,0,5),		null,	new Dice(Die.D6),		DamageType.BLUDGEONING,		new WeaponKeyword[] {},		0,		0)),
	
	QUARTERSTAFF	(new Weapon("quarterstaff",		"simple melee",		4,		new Money(0,2),			null,	new Dice(Die.D6),		DamageType.BLUDGEONING,		new WeaponKeyword[] {WeaponKeyword.VERSATILE},		0,		0)),
	
	SICKLE			(new Weapon("sickle",			"simple melee",		2,		new Money(0,0,0,1),		null,	new Dice(Die.D4),		DamageType.SLASHING,		new WeaponKeyword[] {WeaponKeyword.LIGHT},		0,		0)),
	
	SPEAR			(new Weapon("spear",			"simple melee",		3,		new Money(0,0,0,1),		null,	new Dice(Die.D6),		DamageType.PIERCING,		new WeaponKeyword[] {WeaponKeyword.THROWN, WeaponKeyword.VERSATILE},		20,		60)),
	
	UNARMED			(new Weapon("unarmed",			"simple melee",		0,		new Money(0),			null,	new Dice(1),			DamageType.BLUDGEONING,		new WeaponKeyword[] {},		0,		0)),
	
	LIGHT_CROSSBOW	(new Weapon("light crossbow",	"simple ranged",	5,		new Money(0,0,0,25),	null,	new Dice(Die.D8),		DamageType.PIERCING,		new WeaponKeyword[] {WeaponKeyword.RANGE, WeaponKeyword.LOADING, WeaponKeyword.TWO_HANDED, WeaponKeyword.AMMUNITION},		80,		320)),
	
	DART			(new Weapon("dart",				"simple ranged",	0.25,	new Money(5),			null,	new Dice(Die.D4),		DamageType.PIERCING,		new WeaponKeyword[] {WeaponKeyword.RANGE, WeaponKeyword.FINESSE, WeaponKeyword.THROWN},		20,		60)),
	
	SHORTBOW		(new Weapon("shortbow",			"simple ranged",	2,		new Money(0,0,0,25),	null,	new Dice(Die.D6),		DamageType.PIERCING,		new WeaponKeyword[] {WeaponKeyword.RANGE, WeaponKeyword.TWO_HANDED, WeaponKeyword.AMMUNITION},		80,		320)),
	
	SLING			(new Weapon("sling",			"simple ranged",	0.1,	new Money(0,1),			null,	new Dice(Die.D4),		DamageType.BLUDGEONING,		new WeaponKeyword[] {WeaponKeyword.RANGE, WeaponKeyword.AMMUNITION},		30,		120)),
	
	BATTLEAXE		(new Weapon("battleaxe",		"martial melee",	4,		new Money(0,0,0,10),	null,	new Dice(Die.D8),		DamageType.SLASHING,		new WeaponKeyword[] {WeaponKeyword.VERSATILE},		0,		0)),
	
	FLAIL			(new Weapon("flail",			"martial melee",	2,		new Money(0,0,0,10),	null,	new Dice(Die.D8),		DamageType.BLUDGEONING,		new WeaponKeyword[] {},		0,		0)),
	
	GLAIVE			(new Weapon("glaive",			"martial melee",	6,		new Money(0,0,0,20),	null,	new Dice(Die.D10),		DamageType.SLASHING,		new WeaponKeyword[] {WeaponKeyword.HEAVY, WeaponKeyword.REACH, WeaponKeyword.TWO_HANDED},		0,		0)),
	
	GREATAXE		(new Weapon("greataxe",			"martial melee",	7,		new Money(0,0,0,30),	null,	new Dice(Die.D12),		DamageType.SLASHING,		new WeaponKeyword[] {WeaponKeyword.HEAVY, WeaponKeyword.TWO_HANDED},		0,		0)),
	
	GREATSWORD		(new Weapon("greatsword",		"martial melee",	6,		new Money(0,0,0,50),	null,	new Dice(Die.D6).addDie(Die.D6),		DamageType.SLASHING,		new WeaponKeyword[] {WeaponKeyword.HEAVY, WeaponKeyword.TWO_HANDED},		0,		0)),
	
	HALBERD			(new Weapon("halberd",			"martial melee",	6,		new Money(0,0,0,20),	null,	new Dice(Die.D10),		DamageType.SLASHING,		new WeaponKeyword[] {WeaponKeyword.HEAVY, WeaponKeyword.REACH, WeaponKeyword.TWO_HANDED},		0,		0)),
	
	LANCE			(new Weapon("lance",			"martial melee",	6,		new Money(0,0,0,10),	null,	new Dice(Die.D12),		DamageType.PIERCING,		new WeaponKeyword[] {WeaponKeyword.REACH, WeaponKeyword.LANCE},		0,		0)),
	
	LONGSWORD		(new Weapon("longsword",		"martial melee",	3,		new Money(0,0,0,15),	null,	new Dice(Die.D8),		DamageType.SLASHING,		new WeaponKeyword[] {WeaponKeyword.VERSATILE},		0,		0)),
	
	MAUL			(new Weapon("maul",				"martial melee",	10,		new Money(0,0,0,10),	null,	new Dice(Die.D6).addDie(Die.D6),		DamageType.BLUDGEONING,		new WeaponKeyword[] {WeaponKeyword.HEAVY, WeaponKeyword.TWO_HANDED},		0,		0)),
	
	MORNINGSTAR		(new Weapon("morningstar",		"martial melee",	4,		new Money(0,0,0,15),	null,	new Dice(Die.D8),		DamageType.PIERCING,		new WeaponKeyword[] {},		0,		0)),
	
	PIKE			(new Weapon("pike",				"martial melee",	18,		new Money(0,0,0,5),		null,	new Dice(Die.D10),		DamageType.PIERCING,		new WeaponKeyword[] {WeaponKeyword.HEAVY, WeaponKeyword.REACH, WeaponKeyword.TWO_HANDED},		0,		0)),
	
	RAPIER			(new Weapon("rapier",			"martial melee",	2,		new Money(0,0,0,25),	null,	new Dice(Die.D8),		DamageType.PIERCING,		new WeaponKeyword[] {WeaponKeyword.FINESSE},		0,		0)),
	
	SCIMITAR		(new Weapon("scimitar",			"martial melee",	3,		new Money(0,0,0,25),	null,	new Dice(Die.D6),		DamageType.SLASHING,		new WeaponKeyword[] {WeaponKeyword.FINESSE, WeaponKeyword.LIGHT},		0,		0)),
	
	SHORTSWORD		(new Weapon("shortsword",		"martial melee",	2,		new Money(0,0,0,10),	null,	new Dice(Die.D6),		DamageType.PIERCING,		new WeaponKeyword[] {WeaponKeyword.FINESSE, WeaponKeyword.LIGHT},		0,		0)),
	
	TRIDENT			(new Weapon("trident",			"martial melee",	4,		new Money(0,0,0,5),		null,	new Dice(Die.D6),		DamageType.PIERCING,		new WeaponKeyword[] {WeaponKeyword.THROWN, WeaponKeyword.VERSATILE},		20,		60)),
	
	WAR_PICK		(new Weapon("war pick",			"martial melee",	2,		new Money(0,0,0,5),		null,	new Dice(Die.D8),		DamageType.PIERCING,		new WeaponKeyword[] {},		0,		0)),
	
	WARHAMMER		(new Weapon("warhammer",		"martial melee",	2,		new Money(0,0,0,15),	null,	new Dice(Die.D8),		DamageType.BLUDGEONING,		new WeaponKeyword[] {WeaponKeyword.VERSATILE},		0,		0)),
	
	WHIP			(new Weapon("whip",				"martial melee",	3,		new Money(0,0,0,2),		null,	new Dice(Die.D4),		DamageType.SLASHING,		new WeaponKeyword[] {WeaponKeyword.FINESSE, WeaponKeyword.REACH},		0,		0)),
	
	BLOWGUN			(new Weapon("blowgun",			"martial ranged",	1,		new Money(0,0,0,10),	null,	new Dice(1),			DamageType.PIERCING,		new WeaponKeyword[] {WeaponKeyword.RANGE, WeaponKeyword.LOADING, WeaponKeyword.AMMUNITION},		25,		100)),
	
	HAND_CROSSBOW	(new Weapon("hand crossbow",	"martial ranged",	3,		new Money(0,0,0,75),	null,	new Dice(Die.D6),		DamageType.PIERCING,		new WeaponKeyword[] {WeaponKeyword.RANGE, WeaponKeyword.LIGHT, WeaponKeyword.LOADING, WeaponKeyword.AMMUNITION},		30,		120)),
	
	HEAVY_CROSSBOW	(new Weapon("heavy crossbow",	"martial ranged",	18,		new Money(0,0,0,50),	null,	new Dice(Die.D10),		DamageType.PIERCING,		new WeaponKeyword[] {WeaponKeyword.RANGE, WeaponKeyword.HEAVY, WeaponKeyword.LOADING, WeaponKeyword.AMMUNITION, WeaponKeyword.TWO_HANDED},		100,		400)),
	
	LONGBOW			(new Weapon("longbow",			"martial ranged",	2,		new Money(0,0,0,50),	null,	new Dice(Die.D8),		DamageType.PIERCING,		new WeaponKeyword[] {WeaponKeyword.RANGE, WeaponKeyword.HEAVY, WeaponKeyword.AMMUNITION, WeaponKeyword.TWO_HANDED},		150,		600)),
	
	NET				(new Weapon("net",				"martial ranged",	3,		new Money(0,0,0,1),		null,	new Dice(0),			DamageType.NONE,			new WeaponKeyword[] {WeaponKeyword.RANGE, WeaponKeyword.THROWN, WeaponKeyword.NET},		5,		15)),
	
	
	//OTHER
	ABACUS			(new Equipment("abacus",			"tool",			2,		new Money(0,0,0,2),		"Used for calculations.")),
	
	ACID			(new Equipment("acid vial",			"consumable",	1,		new Money(0,0,0,25),	"As an action, throw this vial up to 20 ft. as an improvised ranged attack. On a hit, the target takes 2d6 acid damage.")),
	
	ALCHEMISTS_FIRE	(new Equipment("alchemist's fire",	"consumable",	1,		new Money(0,0,0,50),	"As an action, throw this vial up to 20 ft. as an improvised ranged attack. On a hit, the target takes 1d4 fire damage at the beginning of each of its turns until it uses an action to pass a DC 10 dexterity saving throw.")),
	
	ARROW			(new Equipment("arrow",				"ammunition",	0.05,	new Money(5),			"Ammunition used for bows.")),
	
	BLOWGUN_NEEDLES	(new Equipment("blowgun needle",	"ammunition",	0.02,	new Money(2),			"Ammunition used for blowguns.")),
	
	CROSSBOW_BOLTS	(new Equipment("crossbow bolt",		"ammunition",	0.075,	new Money(5),			"Ammunition used for crossbows.")),
	
	SLING_BULLETS	(new Equipment("sling bullets",		"ammunition",	0.075,	new Money(1),			"Ammunition used for slings.")),
	
	ANTITOXIN		(new Equipment("antitoxin vial",	"consumable",	0.1,	new Money(0,0,0,50),	"The drinker has advantage on saving throws against poison for 1 hour. Does not work for undead or constructs.")),
	
	CRYSTAL			(new Equipment("crystal",			"arcane focus",	1,		new Money(0,0,0,10),	"A crystal specially designed to channel the power of arcane spells.")),
	
	ORB				(new Equipment("orb",				"arcane focus",	3,		new Money(0,0,0,20),	"An orb specially designed to channel the power of arcane spells.")),
	
	ROD				(new Equipment("rod",				"arcane focus",	2,		new Money(0,0,0,10),	"A rod specially designed to channel the power of arcane spells.")),
	
	STAFF			(new Equipment("staff",				"arcane focus",	4,		new Money(0,0,0,5),		"A staff specially designed to channel the power of arcane spells.")),
	
	WAND			(new Equipment("wand",				"arcane focus",	1,		new Money(0,0,0,10),	"A wand specially designed to channel the power of arcane spells.")),
	
	BACKPACK		(new Equipment("backpack",			"container",	5,		new Money(0,0,0,2),		"")),
	
	BALL_BEARINGS	(new Equipment("1000 ball bearings","consumable",	2,		new Money(0,0,0,1),		"As an action, cover a level area 10 ft. square in ball bearings. Creatures moving across the area must succeed on a DC 10 dexterity saving throw or fall prone. Creatures moving at half speed do not need to make the saving throw.")),
	
	BARREL			(new Equipment("barrel",			"container",	70,		new Money(0,0,0,2),		"")),
	
	BASKET			(new Equipment("basket",			"container",	2,		new Money(0,4),			"")),
	
	BEDROLL			(new Equipment("bedroll",			"miscellaneous",7,		new Money(0,0,0,1),		"")),
	
	BELL			(new Equipment("bell",				"tool",			0.1,	new Money(0,0,0,1),		"")),
	
	BLANKET			(new Equipment("blanket",			"miscellaneous",3,		new Money(0,5),			"")),
	
	BLOCK_AND_TACKLE(new Equipment("block and tackle",	"tool",			5,		new Money(0,0,0,1),		"A set of pulleys and cable. When attached to a wall/ceiling, can be used to hoist up to four times normal weight.")),
	
	BOOK			(new Equipment("book",				"tool",			5,		new Money(0,0,0,25),	"Might contain poetry, history, lore, or diagrams. If you speak the language of the book, you gain advantage on intelligence checks of the subject the book is on.")),
	
	BOTTLE			(new Equipment("glass bottle",		"miscellaneous",3,		new Money(0,0,0,20),	"")),
	
	BUCKET			(new Equipment("container",			"container",	2,		new Money(5),			"")),
	
	CALTROPS		(new Equipment("caltrops bag",		"tool",			2,		new Money(0,0,0,1),		"As an action, you can spread this bag to cover an area 5 ft. square. Creatures that enter the area must suceed on a DC 15 dexterity saving throw or stop moving and take 1 piercing damage. Until the creature regains at least 1 hit point, it's walking speed is reduced by 10 ft. Creatures moving at half speed do not need to make the saving throw.")),
	
	CANDLE			(new Equipment("candle",			"tool",			0.1,	new Money(1),			"When lit, sheds bright light in a 5 ft. radius and dim light 5 ft. beyond that. Lasts 1 hour.")),
	
	CASE			(new Equipment("small case",		"container",	1,		new Money(0,0,0,1),		"A small case. Could be used to store and protect up to 20 crossbow bolts, up to 5 scrolls, or something else small and cylindrical.")),
	
	CHAIN			(new Equipment("10 ft. chain",		"tool",			10,		new Money(0,0,0,5),		"Can be used for binding or climbing. Can be burst with a DC 20 strength check or upon taking 10 damage.")),
	
	CHALK			(new Equipment("piece of chalk",	"tool",			0.05,	new Money(1),			"")),
	
	CHEST			(new Equipment("chest",				"container",	25,		new Money(0,0,0,5),		"")),
	
	CLIMBERS_KIT	(new Equipment("climber's kit",		"tool",			12,		new Money(0,0,0,25),	"Includes special pitons, boot tips, gloves, and a harness. Can be used to anchor oneself. When anchored, you cannot move more than 25 feet from the anchor (including falling) unless the anchor is removed.")),
	
	COMMON_CLOTHES	(new Equipment("common clothes",	"clothes",		3,		new Money(0,5),			"")),
	
	COSTUME_CLOTHES	(new Equipment("costume",			"clothes",		4,		new Money(0,0,0,5),		"")),
	
	FINE_CLOTHES	(new Equipment("fine clothes",		"clothes",		6,		new Money(0,0,0,15),	"")),
	
	TRAVELERS_CLOTHES(new Equipment("traveler's clothes","clothes",		4,		new Money(0,0,0,2),		"")),
	
	COMPONENT_POUCH	(new Equipment("component pouch",	"container",	2,		new Money(0,0,0,25),	"A watertight leather belt pouch that can be used to safely store material components for spells.")),
	
	CROWBAR			(new Equipment("crowbar",			"tool",			5,		new Money(0,0,0,2),		"Grants advantage to strength checks where a crowbar would be useful.")),
	
	SPRIG_MISTLETOE	(new Equipment("sprig of mistletoe","druidic focus",0.05,	new Money(0,0,0,1),		"A sprig of mistletoe used for channeling natural magics.")),
	
	TOTEM			(new Equipment("totem",				"druidic focus",0.1,	new Money(0,0,0,1),		"A totem used for channeling natural magics.")),
	
	WOODEN_STAFF	(new Equipment("wooden staff",		"druidic focus",4,		new Money(0,0,0,5),		"A wooden staff used for channeling natural magics.")),
	
	YEW_WAND		(new Equipment("yew wand",			"druidic focus",1,		new Money(0,0,0,10),	"A yew wand used for channeling natural magics.")),
	
	FISHING_TACKLE	(new Equipment("fishing tackle",	"tool",			4,		new Money(0,0,0,1),		"A kit including a wooden rod, silken line, corkwood bobbers, steel hoocks, lead sinkers, velvet lures, and narrow netting.")),
	
	FLASK			(new Equipment("flask",				"container",	1,		new Money(2),			"")),
	
	TANKARD			(new Equipment("tankard",			"container",	1,		new Money(2),			"")),
	
	GRAPPLING_HOOK	(new Equipment("grappling hook",	"tool",			4,		new Money(0,0,0,2),		"")),
	
	HAMMER			(new Equipment("hammer",			"tool",			3,		new Money(0,0,0,1),		"")),
	
	SLEDGEHAMMER	(new Equipment("sledgehammer",		"tool",			10,		new Money(0,0,0,2),		"")),
	
	HEALERS_KIT		(new Equipment("healer's kit",		"tool",			3,		new Money(0,0,0,5),		"A kit including bandages, salves, and splints. Grants advantage on Wisdom (medicine) checks to stabilize dying creatures.")),
	
	AMULET			(new Equipment("amulet",			"holy symbol",	1,		new Money(0,0,0,5),		"An amulet representative of a god, pantheon, or ideal. Used for channeling holy magics.")),
	
	EMBLEM			(new Equipment("emblem",			"holy symbol",	0.05,	new Money(0,0,0,5),		"An emblem representative of a god, pantheon, or ideal. Used for channeling holy magics.")),
	
	RELIQUARY		(new Equipment("reliquary",			"holy symbol",	2,		new Money(0,0,0,5),		"A reliquary representative of a god, pantheon, or ideal. Used for channeling holy magics.")),
	
	TORC			(new Equipment("torc",				"holy symbol",	0.1,	new Money(0,0,0,5),		"A torc representative of a god, pantheon, or ideal. Used for channeling holy magics.")),
	
	CENSER			(new Equipment("censer",			"holy symbol",	3,		new Money(0,0,0,5),		"A censer representative of a god, pantheon, or ideal. Used for channeling holy magics.")),
	
	RELIC			(new Equipment("relic",				"holy symbol",	1,		new Money(0,0,0,5),		"A relic representative of a god, pantheon, or ideal. Used for channeling holy magics.")),
	
	HOLY_WATER		(new Equipment("holy water flask",	"consumable",	1,		new Money(0,0,0,25),	"As an action, throw this vial up to 20 ft. as an improvised ranged attack. On a hit aginst a fiendish or undead creature, the target takes 2d6 radiant damage.")),
	
	HOURGLASS		(new Equipment("hourglass",			"tool",			1,		new Money(0,0,0,25),	"")),
	
	HUNTING_TRAP	(new Equipment("hunting trap",		"tool",			25,		new Money(0,0,0,5),		"Use an action to set. The next creature that steps on the pressure plate must succeed on a DC 13 dexterity saving throw or take 1d4 piercing damage and stop moving. Until the creature is freed, they cannot move. A DC 13 strength check frees the creature, but a failed check deals 1 piercing damage to the creature.")),
	
	INK				(new Equipment("1 oz. ink bottle",	"consumable",	0.05,	new Money(0,0,0,10),	"")),
	
	INK_PEN			(new Equipment("ink pen",			"tool",			0.05,	new Money(0,0,0,25),	"")),
	
	JUG				(new Equipment("jug",				"container",	4,		new Money(2),			"")),
	
	PITCHER			(new Equipment("pitcher",			"container",	4,		new Money(2),			"")),
	
	LADDER			(new Equipment("10 ft. ladder",		"tool",			25,		new Money(0,1),			"")),
	
	LAMP			(new Equipment("lamp",				"tool",			1,		new Money(0,5),			"Casts bright light in a 15 ft. radius and dim light for an additional 30 ft. Once lit, it burns for 6 hours on a flask of oil.")),
	
	BULLSEYE_LANTERN(new Equipment("bullseye lantern",	"tool",			2,		new Money(0,0,0,10),	"Casts bright light in a 60 ft. cone and dim light for an additional 60 ft. Once lit, it burns for 6 hours on a flask of oil.")),
	
	HOODED_LANTERN	(new Equipment("hooded lantern",	"tool",			2,		new Money(0,0,0,5),		"Casts bright light in a 30 ft. radius and dim light for an additional 30 ft. Once lit, it burns for 6 hours on a flask of oil. As an action, its hood can be lowered, reducing its light to a 5 ft. radius of dim light.")),
	
	LOCK			(new Equipment("lock",				"tool",			1,		new Money(0,0,0,10),	"Comes with a key. Can be opened by the key, or a creature proficient in thieves tools that succeeds on a DC 15 dexterity check. ")),
	
	ADVANCED_LOCK	(new Equipment("advanced lock",		"tool",			1,		new Money(0,0,0,10),	"Comes with a key. Can be opened by the key, or a creature proficient in thieves tools that succeeds on a DC 20 dexterity check. ")),
	
	INTRICATE_LOCK	(new Equipment("intricate lock",	"tool",			1,		new Money(0,0,0,10),	"Comes with a key. Can be opened by the key, or a creature proficient in thieves tools that succeeds on a DC 25 dexterity check. ")),
	
	MAGNIFYING_GLASS(new Equipment("magnifying glass",	"tool",			0.1,	new Money(0,0,0,100),	"Grants advantage on any ability check made to appraise or inspect a small or highly detailed item. Can also be used to start fires given a light as bright as sunlight, tinder, and five minutes consistent focus.")),
	
	MANACLES		(new Equipment("manacles",			"tool",			6,		new Money(0,0,0,2),		"Comes with a key. Can be used to bind a small or medium creature. Escaping requires a DC 20 dexterity check, and breaking the manacles requires a DC 20 strength check. Another creature proficient in thieves tools can pick the lock with a DC 15 dexterity check. Manacles have 15 hit points.")),
	
	MESS_KIT		(new Equipment("mess kit",			"tool",			1,		new Money(0,2),			"Tin box with cup and cutlery. Can be sealed or broken apart to use as cooking pan and plate/bowl.")),
	
	MIRROR			(new Equipment("steel mirror",		"tool",			0.5,	new Money(0,0,0,5),		"Ooooh, shiny.")),
	
	OIL				(new Equipment("oil flask",			"consumable",	1,		new Money(0,1),			"As an action, throw this vial up to 20 ft. as an improvised ranged attack. On a hit the target is covered in oil, which will dry in 1 minute. If a target covered in oil takes fire damage, they take an additional 5 fire damage. You can also pour the oil into a 5 ft. square level area. If the oil is lit it burns for 2 rounds and deals 5 fire damage to any creature that enters the area or ends its turn in the area. Oil can also be used to fuel lamps and other contraptions.")),
	
	PAPER			(new Equipment("sheet of paper",	"tool",			0.01,	new Money(0,2),			"")),
	
	PARCHMENT		(new Equipment("sheet of parchment","tool",			0.01,	new Money(0,1),			"")),
	
	PERFUME			(new Equipment("perfume vial",		"consumable",	0.1,	new Money(0,0,0,5),		"")),
	
	MINERS_PICK		(new Equipment("miner's pick",		"tool",			10,		new Money(0,0,0,2),		"")),
	
	PITON			(new Equipment("piton",				"tool",			0.25,	new Money(5),			"")),
	
	BASIC_POISON	(new Equipment("basic poison vial",	"consumable",	0.1,	new Money(0,0,0,100),	"As an action, coat one slashing or piercing weapon or three pieces of ammunition in the poison. A creature hit with a poisoned weapon (or who otherwise imbibes the poison) makes a DC 10 constitution saving throw or takes 1d4 poison damage. This poison dries in 1 minute.")),
	
	POLE			(new Equipment("10 ft. pole",		"tool",			7,		new Money(5),			"")),
	
	POT				(new Equipment("iron pot",			"container",	10,		new Money(0,0,0,2),		"")),
	
	HEALING_POTION	(new Equipment("potion of healing",	"consumable",	0.5,	new Money(0,0,0,50),	"As an action, drink or administer this potion. A creature that drinks this potion regains 2d4 + 2 hit points.")),
	
	POUCH			(new Equipment("pouch",				"container",	1,		new Money(0,5),			"Can hold up to 20 sling bullets or 50 blowgun needles, among other things.")),
	
	QUIVER			(new Equipment("quiver",			"container",	1,		new Money(0,0,0,1),		"Can hold up to 20 arrows.")),
	
	RAM				(new Equipment("portable ram",		"tool",			35,		new Money(0,0,0,4),		"When you use this ram to break down doors, you gain a +4 bonus on the strength check. Another creature can help you use the ram, giving you advantage on the roll.")),
	
	RATIONS			(new Equipment("1 day of rations",	"consumable",	2,		new Money(0,5),			"Dry foods suitable for extended travel.")),
	
	ROBES			(new Equipment("robes",				"clothes",		4,		new Money(0,0,0,1),		"")),
	
	HEMPEN_ROPE		(new Equipment("50 ft. of hempen rope","tool",		10,		new Money(0,0,0,1),		"")),
	
	SILK_ROPE		(new Equipment("50 ft. of silk rope","tool",		5,		new Money(0,0,0,10),	"")),
	
	SACK			(new Equipment("sack",				"container",	0.5,	new Money(1),			"")),
	
	SCALE			(new Equipment("scale",				"tool",			3,		new Money(0,0,0,5),		"A small balance, pans, and assortment of weights up to 2 lbs. With it, you can measure the exact weight of small objects.")),
	
	WAX				(new Equipment("sealing wax",		"tool",			0.5,	new Money(0,5),			"")),
	
	SHOVEL			(new Equipment("shovel",			"tool",			5,		new Money(0,0,0,2),		"")),
	
	WHISTLE			(new Equipment("whistle",			"tool",			0.01,	new Money(5),			"")),
	
	RING			(new Equipment("ring",				"clothes",		0.01,	new Money(0,0,0,5),		"")),
	
	SOAP			(new Equipment("soap",				"tool",			0.05,	new Money(2),			"")),
	
	SPELLBOOK		(new Equipment("spellbook",			"spellbook",	3,		new Money(0,0,0,50),	"Essential for wizards, a spellbook is a leatherbound tome with 100 blank vellum pages suitable for recording spells.")),
	
	SPIKES			(new Equipment("iron spikes",		"tool",			5,		new Money(0,0,0,1),		"")),
	
	SPYGLASS		(new Equipment("spyglass",			"tool",			1,		new Money(0,0,0,0,100),	"Objects viewed through the spyglass are magnified to thrice their size.")),
	
	TENT			(new Equipment("tent",				"tool",			20,		new Money(0,0,0,2),		"Simple and portable canvas shelter, sleeps two.")),
	
	TINDERBOX		(new Equipment("tinderbox",			"tool",			1,		new Money(0,5),			"A container holding flint, fire steel, and tinder, for lighting fires. Using it to light anything w/ abundant fuel takes an action. Using it to light anything else flammable takes 1 minute.")),
	
	TORCH			(new Equipment("torch",				"tool",			1,		new Money(1),			"Once lit, it burns for 1 hour, providing bright light in a 20 ft. radius and dim light for an additional 20 ft. If you make a melee attack with a burning torch, it deals 1 fire damage.")),
	
	VIAL			(new Equipment("empty vial",		"container",	0.05,	new Money(0,0,0,1),		"")),
	
	WATERSKIN		(new Equipment("waterskin",			"container",	5,		new Money(0,2),			"")),
	
	WHETSTONE		(new Equipment("whetstone",			"tool",			1,		new Money(1),			"")),
	
	
	
	
	
	;
	
	
	private final Equipment equipment;
	
	DefaultEquipment(Equipment equipment)
	{
		this.equipment = equipment;
	}
	
	
}
