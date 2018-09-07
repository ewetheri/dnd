package dnd;

import java.util.ArrayList;

public enum Race {
	
	HILL_DWARF			(new Attributes(0,0,0,0,0,0),
							25,
							Vision.DARKVISION,
							new ArrayList<String>("d","")),
	MOUNTAIN_DWARF		(),
	ELF					(),
	HALFLING			(),
	HUMAN				(),
	DRAGONBORN			(),
	GNOME				(),
	HALF_ELF			(),
	HALF_ORC			(),
	TIEFLING			()
	
	private final Attributes attributes; //racial attribute modifiers
	private final int speed;
	private final Vision vision;
	private final ArrayList<String> abilities;
	private final ArrayList<String> proficiencies;
	private final ArrayList<String> languages;
	
	
	Race(Attributes attributes, int speed, Vision vision, ArrayList<String> abilities, ArrayList<String> proficiences, ArrayList<String> languages)
	{
		this.attributes = attributes;
		this.speed = speed;
		this.vision = vision;
		this.abilities = abilities;
		this.proficiencies = proficiencies;
		this.languages = languages;
	}

}
