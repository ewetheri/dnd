package classes;

public enum Specialization {

	ALCHEMIST			("Alchemist", "alchemist", "artificer",
							ClassFeature.type("alchemist")),
	GUNSMITH			("Gunsmith", "gunsmith", "artificer",
							ClassFeature.type("gunsmith")),
	BERSERKER			("Path of the Berserker", "berserker", "barbarian",
							ClassFeature.type("berserker")),
	TOTEM_WARRIOR		("Path of the Totem Warrior", "totem warrior", "barbarian",
							ClassFeature.type("totem warrior")),
	ANCESTRAL_GUARDIAN	("Path of the Ancestral Guardian", "ancestral guardian", "barbarian",
							ClassFeature.type("ancestral guardian")),
	BATTLERAGER			("Path of the Totem Warrior", "battlerager", "barbarian",
							ClassFeature.type("battlerager")),
	STORM_HERALD		("Path of the Totem Warrior", "storm herald", "barbarian",
							ClassFeature.type("storm herald")),
	ZEALOT				("Path of the Totem Warrior", "zealot", "barbarian",
							ClassFeature.type("zealot")),
	GLAMOUR				("College of Glamour", "glamour", "bard",
							ClassFeature.type("glamour")),
	LORE				("College of Lore", "lore", "bard",
							ClassFeature.type("lore")),
	SATIRE				("College of Satire", "satire", "bard",
							ClassFeature.type("satire")),
	SWORDS				("College of Swords", "swords", "bard",
							ClassFeature.type("swords")),
	VALOR				("College of Valor", "valor", "bard",
							ClassFeature.type("valor")),
	WHISPERS			("College of Whispers", "whispers", "bard",
							ClassFeature.type("whispers")),
	ARCANA				("Arcana Domain", "arcana", "cleric",
							ClassFeature.type("arcana")),
	AMBITION			("Ambition Domain", "ambition", "cleric",
							ClassFeature.type("ambition")),
	CITY				("City Domain", "city", "cleric",
							ClassFeature.type("city")),
	DEATH				("Death Domain", "death", "cleric",
							ClassFeature.type("death")),
	FORGE				("Forge Domain", "forge", "cleric",
							ClassFeature.type("forge")),
	GRAVE				("Grave Domain", "grave", "cleric",
							ClassFeature.type("grave")),
	KNOWLEDGE			("Knowledge Domain", "knowledge", "cleric",
							ClassFeature.type("knowledge")),
	LIFE				("Life Domain", "life", "cleric",
							ClassFeature.type("life")),
	LIGHT				("Light Domain", "light", "cleric",
							ClassFeature.type("light")),
	NATURE				("Nature Domain", "nature", "cleric",
							ClassFeature.type("nature")),
	ORDER				("Order Domain", "order", "cleric",
							ClassFeature.type("order")),
	PROTECTION			("Protection Domain", "protection", "cleric",
							ClassFeature.type("protection")),
	SOLIDARITY			("Solidarity Domain", "solidarity", "cleric",
							ClassFeature.type("solidarity")),
	STRENGTH			("Strength Domain", "strength", "cleric",
							ClassFeature.type("strength")),
	TEMPEST				("Tempest Domain", "tempest", "cleric",
							ClassFeature.type("tempest")),
	TRICKERY			("Trickery Domain", "trickery", "cleric",
							ClassFeature.type("trickery")),
	WAR					("War Domain", "war", "cleric",
							ClassFeature.type("war")),
	ZEAL				("Zeal Domain", "zeal", "cleric",
							ClassFeature.type("zeal")),
	DREAMS				("Circle of Dreams", "dreams", "druid",
							ClassFeature.type("dreams")),
	LAND				("Circle of the Land", "land", "druid",
							ClassFeature.type("land")),
	MOON				("Circle of the Moon", "moon", "druid",
							ClassFeature.type("moon")),
	SHEPHERD			("Circle of the Shepherd", "shepherd", "druid",
							ClassFeature.type("shepherd")),
	SPORES				("Circle of Spores", "spores", "druid",
							ClassFeature.type("spores")),
	TWILIGHT			("Circle of Twilight", "twilight", "druid",
							ClassFeature.type("twilight")),
	ARCANE_ARCHER		("Arcane Archer", "arcane archer", "fighter",
							ClassFeature.type("arcane archer")),
	BATTLE_MASTER		("Battle Master", "battle master", "fighter",
							ClassFeature.type("battle master")),
	BRUTE				("Brute", "brute", "fighter",
							ClassFeature.type("brute")),
	CAVALIER			("Cavalier", "cavalier", "fighter",
							ClassFeature.type("cavalier")),
	CHAMPION			("Champion", "champion", "fighter",
							ClassFeature.type("champion")),
	ELDRITCH_KNIGHT		("Eldritch Knight", "eldritch knight", "fighter",
							ClassFeature.type("eldritch knight")),
	MONSTER_HUNTER		("Monster Hunter", "monster hunter", "fighter",
							ClassFeature.type("monster hunter")),
	PURPLE_DRAGON_KNIGHT("Purple Dragon Knight", "purple dragon knight", "fighter",
							ClassFeature.type("purple dragon knight")),
	SAMURAI				("Samurai", "samurai", "fighter",
							ClassFeature.type("samurai")),
	FIGHTER_SCOUT				("Scout", "scout", "fighter",
							ClassFeature.type("scout")),
	DRUNKEN_MASTER		("Way of the Drunken Master", "drunken master", "monk",
							ClassFeature.type("drunken master")),
	FOUR_ELEMENTS		("Way of the Four Elements", "four elements", "monk",
							ClassFeature.type("four elements")),
	KENSEI				("Way of the Kensei", "kensei", "monk",
							ClassFeature.type("kensei")),
	LONG_DEATH			("Way of the Long Death", "long death", "monk",
							ClassFeature.type("long death")),
	OPEN_HAND			("Way of the Open Hand", "open hand", "monk",
							ClassFeature.type("open hand")),
	SHADOW				("Way of Shadow", "shadow", "monk",
							ClassFeature.type("shadow")),
	SUN_SOUL			("Way of the Sun Soul", "sun soul", "monk",
							ClassFeature.type("sun soul")),
	TRANQUILITY			("Way of Tranquility", "tranquility", "monk",
							ClassFeature.type("tranquility")),
	AVATAR				("Avatar Disciplines", "avatar", "mystic",
							ClassFeature.type("avatar")),
	AWAKENED			("Awakened Disciplines", "awakened", "mystic",
							ClassFeature.type("awakened")),
	IMMORTAL			("Immortal Disciplines", "immortal", "mystic",
							ClassFeature.type("immortal")),
	NOMAD				("Nomad Disciplines", "nomad", "mystic",
							ClassFeature.type("nomad")),
	WU_JEN				("Wu Jen Disciplines", "wu jen", "mystic",
							ClassFeature.type("wu jen")),
	ANCIENTS			("Oath of the Ancients", "ancients", "paladin",
							ClassFeature.type("ancients")),
	CONQUEST			("Oath of Conquest", "conquest", "paladin",
							ClassFeature.type("conquest")),
	CROWN				("Oath of the Crown", "crown", "paladin",
							ClassFeature.type("crown")),
	DEVOTION			("Oath of Devotion", "devotion", "paladin",
							ClassFeature.type("devotion")),
	REDEMPTION			("Oath of Redemption", "redemption", "paladin",
							ClassFeature.type("redemption")),
	VENGEANCE			("Oath of Vengeance", "vengeance", "paladin",
							ClassFeature.type("vengeance")),
	BEAST				("Beast Conclave", "beast", "ranger",
							ClassFeature.type("beast")),
	GLOOM_STALKER		("Gloom Stalker Conclave", "gloom stalker", "ranger",
							ClassFeature.type("gloom stalker")),
	HORIZON_WALKER		("Horizon Walker Conclave", "horizon walker", "ranger",
							ClassFeature.type("horizon walker")),
	HUNTER				("Hunter Conclave", "hunter", "ranger",
							ClassFeature.type("hunter")),
	MONSTER_SLAYER		("Monster Slayer Conclave", "monster slayer", "ranger",
							ClassFeature.type("monster slayer")),
	PRIMEVAL_GUARDIAN	("Primeval Guardian Conclave", "primeval guardian", "ranger",
							ClassFeature.type("primeval guardian")),
	ARCANE_TRICKSTER	("Arcane Trickster", "arcane trickster", "rogue",
							ClassFeature.type("scout")),
	ASSASSIN			("Assassin", "assassin", "rogue",
							ClassFeature.type("assassin")),
	INQUISITIVE			("Inquisitive", "inquisitive", "rogue",
							ClassFeature.type("inquisitive")),
	MASTERMIND			("Mastermind", "mastermind", "rogue",
							ClassFeature.type("mastermind")),
	ROGUE_SCOUT			("Scout", "scout", "rogue",
							ClassFeature.type("scout")),
	SWASHBUCKLER		("Swashbuckler", "swashbuckler", "rogue",
							ClassFeature.type("swashbuckler")),
	THIEF				("Thief", "thief", "rogue",
							ClassFeature.type("thief")),
	DIVINE_SOUL			("Divine Soul", "divine soul", "sorcerer",
							ClassFeature.type("divine soul")),
	DRACONIC_BLOODLINE	("Draconic Bloodline", "draconic bloodline", "sorcerer",
							ClassFeature.type("draconic bloodline")),
	GIANT_SOUL			("Giant Soul", "giant soul", "sorcerer",
							ClassFeature.type("giant soul")),
	PHEONIX_SORCERY		("Pheonix Sorcery", "pheonix sorcery", "sorcerer",
							ClassFeature.type("pheonix sorcery")),
	PYROMANCER			("Pyromancer", "pyromancer", "sorcerer",
							ClassFeature.type("pyromancer")),
	SEA_SORCERY			("Sea Sorcery", "sea sorcery", "sorcerer",
							ClassFeature.type("sea sorcery")),
	SHADOW_MAGIC		("Shadow Magic", "shadow magic", "sorcerer",
							ClassFeature.type("shadow magic")),
	STONE_SORCERY		("Stone Sorcery", "stone sorcery", "sorcerer",
							ClassFeature.type("stone sorcery")),
	STORM_SORCERY		("Storm Sorcery", "storm sorcery", "sorcerer",
							ClassFeature.type("storm sorcery")),
	WILD_MAGIC			("Wild Magic", "wild magic", "sorcerer",
							ClassFeature.type("wild magic")),
	ARCHFEY				("The Archfey", "archfey", "warlock",
							ClassFeature.type("archfey")),
	CELESTIAL			("The Celestial", "celestial", "warlock",
							ClassFeature.type("celestial")),
	FIEND				("The Fiend", "fiend", "warlock",
							ClassFeature.type("fiend")),
	GHOST_IN_THE_MACHINE("The Ghost in the Machine", "ghost in the machine", "warlock",
							ClassFeature.type("ghost in the machine")),
	GREAT_OLD_ONE		("The Great Old One", "great old one", "warlock",
							ClassFeature.type("great old one")),
	HEXBLADE			("The Hexblade", "hexblade", "warlock",
							ClassFeature.type("hexblade")),
	RAVEN_QUEEN			("The Raven Queen", "raven queen", "warlock",
							ClassFeature.type("raven queen")),
	SEEKER				("The Seeker", "seeker", "warlock",
							ClassFeature.type("seeker")),
	UNDYING				("The Undying", "undying", "warlock",
							ClassFeature.type("undying")),
	BLADESINGING		("Bladesinging", "bladesinging", "wizard",
							ClassFeature.type("bladesinging")),
	LORE_MASTERY		("Lore Mastery", "lore mastery", "wizard",
							ClassFeature.type("lore mastery")),
	ABJURATION			("School of Abjuration", "abjuration", "wizard",
							ClassFeature.type("abjuration")),
	CONJURATION			("School of Conjuration", "conjuration", "wizard",
							ClassFeature.type("conjuration")),
	DIVINATION			("School of Divination", "divination", "wizard",
							ClassFeature.type("divination")),
	ENCHANTMENT			("School of Enchantment", "enchantment", "wizard",
							ClassFeature.type("enchantment")),
	EVOCATION			("School of Evocation", "evocation", "wizard",
							ClassFeature.type("evocation")),
	ILLUSION			("School of Illusion", "illusion", "wizard",
							ClassFeature.type("illusion")),
	INVENTION			("School of Invention", "invention", "wizard",
							ClassFeature.type("invention")),
	NECROMANCY			("School of Necromancy", "necromancy", "wizard",
							ClassFeature.type("necromancy")),
	TRANSMUTATION		("School of Transmutation", "transumation", "wizard",
							ClassFeature.type("transumation")),
	THEURGY				("Theurgy", "theurgy", "wizard",
							ClassFeature.type("theurgy")),
	WAR_MAGIC			("War Magic", "war magic", "wizard",
							ClassFeature.type("war magic"))
	
	
	;
	
	
	
	private final String longhand;
	private final String shorthand;
	private final String type;
	private final ClassFeature[] features;
	
	Specialization(String longhand, String shorthand, String type, ClassFeature[] features)
	{
		this.longhand = longhand;
		this.shorthand = shorthand;
		this.type = type;
		this.features = features;
	}
	
	public String longhand()
	{
		return longhand;
	}
	
	public String shorthand()
	{
		return shorthand;
	}
	
	public ClassFeature[] features()
	{
		return features;
	}
	
	public String type()
	{
		return type;
	}
	
	public static Specialization[] type(String type)
	{
		Specialization[] values = new Specialization[20];
		int pointer = 0;
		Specialization[] all = Specialization.values();
		
		for(int i = 0; i < all.length; i++)
		{
			if (all[i].type().equals(type))
			{
				values[pointer] = all[i];
				pointer++;
			}
		}
		
		Specialization[] result = new Specialization[pointer];
		for (int i = 0; i < pointer; i++)
		{
			result[pointer] = values[pointer];
		}
		
		return result;
	}
	
}
