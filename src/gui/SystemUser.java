package gui;

public class SystemUser {
	
	private static User sys = null;
	
	SystemUser()
	{
		initialize();
	}
	
	public static void initialize()
	{
		if (sys == null)
		{
			sys = new User("System", "noonecaneverknowthissupersecretpassword");
		}
	}
	
	public static User get()
	{
		initialize();
		
		return sys;
	}
	
	public static String name()
	{
		initialize();
		
		return sys.username();
	}

}
