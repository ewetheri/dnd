package gui;

public class CurrentUser {

	private static User currentUser = null;
	
	
	CurrentUser(User user)
	{
		currentUser = user; 
	}
	
	public static boolean loggedIn()
	{
		if (currentUser == null)
		{
			return false;
		}
		
		return true;
	}
	
	public static void logOut()
	{
		currentUser = null;
	}
	
	public static void logIn(User user)
	{
		currentUser = user; 
	}
	
	public static String name()
	{
		return currentUser.username();
	}
	
	public static User get()
	{
		return currentUser;
	}
	
	public static String password()
	{
		return currentUser.password();
	}
	
	public static boolean host()
	{
		return currentUser.host();
	}
	
	public static void seName(String name)
	{
		currentUser.setUsername(name);
	}
	
	public static void setPassword(String password)
	{
		currentUser.setPassword(password);
	}
	
	public static void setHost(boolean host)
	{
		currentUser.setHost(host);
	}
	
}
