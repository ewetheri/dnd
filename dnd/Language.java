package dnd;

public enum Language {
	
	ABYSSAL			("Infernal"),
	AQUAN			("Elven"),
	AURAN			("Draconic"),
	CELESTIAL		("Celestial"),
	COMMON			("Common"),
	DEEP_SPEECH		("None"),
	DRACONIC		("Draconic"),
	DRUIDIC			("Druidic"),
	DWARVISH		("Dwarvish"),
	ELVISH			("Elvish"),
	GIANT			("Dwarvish"),
	GNOMISH			("Dwarvish"),
	GOBLIN			("Dwarvish"),
	GNOLL			("Common"),
	HALFLING		("Common"),
	IGNAN			("Draconic"),
	INFERNAL		("Infernal"),
	ORC				("Dwarvish"),
	PRIMORDIAL		("Dwarvish"),
	SYLVAN			("Elvish"),
	TERRAN			("Dwarvish"),
	UNDERCOMMON		("Elvish");
	
	private final String script;
	
	Language (String script)
	{
		this.script = script;
	}
	
	public String script()
	{
		return script;
	}
}
