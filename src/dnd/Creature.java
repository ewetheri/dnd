package dnd;

public class Creature {

	private String name;
	private double weight;
	private Size size;
	private int speed;
	
	Creature (String name, double weight, Size size, int speed)
	{
		this.name = name;
		this.weight = weight;
		this.size = size;
		this.speed = speed;
	}
	
	public String name()
	{
		return name;
	}
	
	public double weight()
	{
		return weight;
	}
	
	public Size size()
	{
		return size;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public void setSize(Size size)
	{
		this.size = size;
	}
	
}
