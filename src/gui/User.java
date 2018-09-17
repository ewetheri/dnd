package gui;

public class User {
	
	private String username;
	private String password;
	private boolean host;
	
	User(String username, String password)
	{
		this.username = username;
		this.password = password;
		this.host = false;
	}
	
	public String username()
	{
		return username;
	}
	
	public String password()
	{
		return password;
	}
	
	public boolean host()
	{
		return host;
	}
	
	public void setHost(boolean host)
	{
		this.host = host;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}

}
