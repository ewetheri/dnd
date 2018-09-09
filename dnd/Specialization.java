package dnd;

public enum Specialization {

	BERSERKER			("Path of the Berserker", "Berserker",
							new ClassFeature[] {ClassFeature.FRENZY, ClassFeature.MINDLESS_RAGE, ClassFeature.INTIMIDATING_PRESENCE, ClassFeature.RETALIATION}),
	TOTEM_WARRIOR		("Path of the Totem Warrior", "Totem Warrior",
							new ClassFeature[] {ClassFeature.SPIRIT_SEEKER, ClassFeature.TOTEM_SPIRIT, ClassFeature.ASPECT_OF_THE_BEAST, ClassFeature.SPIRIT_WALKER, ClassFeature.TOTEMIC_ATTUNEMENT}),
	
	
	;
	
	
	
	private final String longhand;
	private final String shorthand;
	private final ClassFeature[] features;
	
	Specialization(String longhand, String shorthand, ClassFeature[] features)
	{
		this.longhand = longhand;
		this.shorthand = shorthand;
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
	
}
