package dnd;

public enum Class {
	
	ARTIFICER		,
	BARBARIAN		,
	BARD			,
	BLOOD_HUNTER	,
	CLERIC			,
	DRUID			,
	FIGHTER			,
	MONK			,
	MYSTIC			,
	PALADIN			,
	RANGER			,
	ROGUE			,
	SORCERER		,
	WARLOCK			,
	WIZARD			;
	
	private final String name;
	private final Dice hitDice;
	private final String[] proficiencies;
	private final Attribute[] savingThrows;
	private final int numSkills;
	private final Skill[] skills;
	
	public int hitPointLevelUpRandom()
	{
		return hitDice.roll();
	}
	
	public int hitPointLevelUpSet()
	{
		return hitDice.sides()/2 + 1;
	}
	
}
