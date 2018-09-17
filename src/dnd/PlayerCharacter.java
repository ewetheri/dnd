package dnd;

import java.util.*;

public class PlayerCharacter extends Character {
	
	private String player;
	private String personality;
	private String ideals;
	private String bonds;
	private String flaws;
	
	PlayerCharacter(String name, String description, double weight, Size size, int speed, Race race, String player)
	{
		super(name, description, weight, size, speed, race);
		this.player = player;
		this.personality = "";
		this.ideals = "";
		this.bonds = "";
		this.flaws = "";
	}
	
	public String player()
	{
		return player;
	}
	
	public String personality()
	{
		return personality;
	}
	
	public String ideals()
	{
		return ideals;
	}
	
	public String bonds()
	{
		return bonds;
	}
	
	public String flaws()
	{
		return flaws;
	}
	
	public void setPersonality(String personality)
	{
		this.personality = personality;
	}
	
	public void setIdeals(String ideals)
	{
		this.ideals = ideals;
	}
	
	public void setBonds(String bonds)
	{
		this.bonds = bonds;
	}
	
	public void setFlaws(String flaws)
	{
		this.flaws = flaws;
	}

	
}
