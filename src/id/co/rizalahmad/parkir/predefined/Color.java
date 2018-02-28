package id.co.rizalahmad.parkir.predefined;

public enum Color 
{
	BLACK("Black"),
	WHITE("White"),
	RED("Red"),
	YELLOW("Yellow"),
	GREEN("Green"),
	BLUE("Blue"),
	PURPLE("Purple");
	
	private final String label;
	
	private Color(String color)
	{
		this.label = color;
	}
	
	public String getLabel()
	{
		return label;
	}
}