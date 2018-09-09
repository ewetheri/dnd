package dnd;

public enum Armor {
	
	PADDED				(	//name
							"padded",
							//type
							"light",
							//weight
							8,
							//cost
							new Money(0, 0, 0, 5),
							//AC
							11,
							//Does the wearer add dex to AC?
							true,
							//Does the dex cap at 2?
							false,
							//What strength is required to use it?
							0, 
							//Does it give disadvantage to stealth rolls?
							true),
	
	LEATHER				(	//name
							"leather",
							//type
							"light",
							//weight
							10,
							//cost
							new Money(0, 0, 0, 10),
							//AC
							11,
							//Does the wearer add dex to AC?
							true,
							//Does the dex cap at 2?
							false,
							//What strength is required to use it?
							0, 
							//Does it give disadvantage to stealth rolls?
							false),
	
	STUDDED_LEATHER		(	//name
							"studded leather",
							//type
							"light",
							//weight
							13,
							//cost
							new Money(0, 0, 0, 45),
							//AC
							12,
							//Does the wearer add dex to AC?
							true,
							//Does the dex cap at 2?
							false,
							//What strength is required to use it?
							0, 
							//Does it give disadvantage to stealth rolls?
							false),
	
	HIDE				(	//name
							"hide",
							//type
							"medium",
							//weight
							12,
							//cost
							new Money(0, 0, 0, 10),
							//AC
							12,
							//Does the wearer add dex to AC?
							true,
							//Does the dex cap at 2?
							true,
							//What strength is required to use it?
							0, 
							//Does it give disadvantage to stealth rolls?
							false),
	
	CHAIN_SHIRT			(	//name
							"chain shirt",
							//type
							"medium",
							//weight
							20,
							//cost
							new Money(0, 0, 0, 50),
							//AC
							13,
							//Does the wearer add dex to AC?
							true,
							//Does the dex cap at 2?
							true,
							//What strength is required to use it?
							0, 
							//Does it give disadvantage to stealth rolls?
							false),
	
	SCALE_MAIL			(	//name
							"scale mail",
							//type
							"medium",
							//weight
							45,
							//cost
							new Money(0, 0, 0, 50),
							//AC
							14,
							//Does the wearer add dex to AC?
							true,
							//Does the dex cap at 2?
							true,
							//What strength is required to use it?
							0, 
							//Does it give disadvantage to stealth rolls?
							true),
	
	BREASTPLATE			(	//name
							"breastplate",
							//type
							"medium",
							//weight
							20,
							//cost
							new Money(0, 0, 0, 400),
							//AC
							14,
							//Does the wearer add dex to AC?
							true,
							//Does the dex cap at 2?
							true,
							//What strength is required to use it?
							0, 
							//Does it give disadvantage to stealth rolls?
							false),
	
	HALF_PLATE			(	//name
							"half plate",
							//type
							"medium",
							//weight
							40,
							//cost
							new Money(0, 0, 0, 750),
							//AC
							15,
							//Does the wearer add dex to AC?
							true,
							//Does the dex cap at 2?
							true,
							//What strength is required to use it?
							0, 
							//Does it give disadvantage to stealth rolls?
							true),
	
	RING_MAIL			(	//name
							"ring mail",
							//type
							"heavy",
							//weight
							8,
							//cost
							new Money(0, 0, 0, 5),
							//AC
							11,
							//Does the wearer add dex to AC?
							true,
							//Does the dex cap at 2?
							false,
							//What strength is required to use it?
							0, 
							//Does it give disadvantage to stealth rolls?
							true),
	
	CHAIN_MAIL			(	//name
							"chain mail",
							//type
							"heavy",
							//weight
							8,
							//cost
							new Money(0, 0, 0, 5),
							//AC
							11,
							//Does the wearer add dex to AC?
							true,
							//Does the dex cap at 2?
							false,
							//What strength is required to use it?
							0, 
							//Does it give disadvantage to stealth rolls?
							true),
	
	SPLINT				(	//name
							"splint",
							//type
							"heavy",
							//weight
							8,
							//cost
							new Money(0, 0, 0, 5),
							//AC
							11,
							//Does the wearer add dex to AC?
							true,
							//Does the dex cap at 2?
							false,
							//What strength is required to use it?
							0, 
							//Does it give disadvantage to stealth rolls?
							true),
	
	PLATE				(	//name
							"plate",
							//type
							"heavy",
							//weight
							8,
							//cost
							new Money(0, 0, 0, 5),
							//AC
							11,
							//Does the wearer add dex to AC?
							true,
							//Does the dex cap at 2?
							false,
							//What strength is required to use it?
							0, 
							//Does it give disadvantage to stealth rolls?
							true),
	
	SHIELDS				(	//name
							"padded armor",
							//type
							"light armor",
							//weight
							8,
							//cost
							new Money(0, 0, 0, 5),
							//AC
							11,
							//Does the wearer add dex to AC?
							true,
							//Does the dex cap at 2?
							false,
							//What strength is required to use it?
							0, 
							//Does it give disadvantage to stealth rolls?
							true)
	
	;
	
	private final String name;
	private final String type;
	private final double weight;
	private final Money cost;
	private final int AC;
	private final boolean addDex;
	private final boolean limitDex;
	private final int requiredStrength;
	private final boolean stealthDisadvantage;
	
	
	Armor (String name, String type, double weight, Money cost, int AC, boolean addDex, boolean limitDex, int requiredStrength, boolean stealthDisadvantage)
	{
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.cost = cost;
		this.AC = AC;
		this.addDex = addDex;
		this.limitDex = limitDex;
		this.requiredStrength = requiredStrength;
		this.stealthDisadvantage = stealthDisadvantage;
	}
	
}
