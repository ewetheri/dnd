package items;

public enum WeaponKeyword {

	AMMUNITION			("Ammunition", "This weapon requires ammunition to fire. When you fire it, you expend one piece of ammunition."),
	FINESSE				("Finesse", "You can use your dexterity modifier for attack and damage rolls with this weapon instead of your strength modifier."),
	HEAVY				("Heavy", "Small creatures have disadvantage using this weapon."),
	LIGHT				("Light", "This weapon is small and easy to handle, making it ideal for two-weapon fighting."),
	LOADING				("Loading", "Because you have to reload the ammunition in this weapon, you can only fire it once per action (no extra attacks)."),
	RANGE				("Range", "This weapon can attack at range."),
	REACH				("Reach", "When attacking with this weapon, you can hit targets 5 feet farther away."),
	THROWN				("Thrown", "You can throw this weapon, and you roll as though you were melee attacking with it."),
	TWO_HANDED			("Two-handed", "This weapon requires two hands to use."),
	VERSATILE			("Versatile", "This weapon can be used with one or two hands. It deals bonus damage when two hands are used."),
	SILVERED			("Silvered", "This weapon is coated in silver, making it more effective against certain monsters."),
	LANCE				("Lance", "This weapon is a lance. It requires two hands to use when you aren't mounted. When you use it against a target within 5 feet of you, you roll with disadvantage."),
	NET					("Net", "This weapon is a net. Large and smaller creatures hit with it are restrained until freed. A DC 10 Strength check or 5 slashing damage destroys the net."),
	DOUBLE_SCIMITAR		("Double-bladed Scimitar", "When you make a two-handed attack with this weapon, you can use a bonus action to make a melee attack with the other side of the blade. This attack uses the same ability modifier as the primary. The damage die is 1d4, and it deals slashing damage. This special attack can only be done if you take the Attack action.")
	
	;
	
	
	private final String name;
	private final String description;
	
	WeaponKeyword(String name, String description)
	{
		this.name = name;
		this.description = description;
	}
	
	public String shorthand()
	{
		return name;
	}
	
	public String longhand()
	{
		return name + ": " + description;
	}
	
	public String description()
	{
		return description;	
	}
}
