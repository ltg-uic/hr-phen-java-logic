package ltg.ps.phenomena.helioroom;

public class Planet {
	
	private String name = null;
	private String color = null;
	private String colorName = null;
	private int classOrbitalTime = -1;
	private double startPosition = 0;
	
	
	public Planet(String name, String color, String colorName, int classOrbitalTime, double startPosition) {
		this.name = name;
		this.color = color;
		this.colorName = colorName;
		this.classOrbitalTime = classOrbitalTime;
		this.startPosition = startPosition;
	}


	public String getName() {
		return name;
	}


	public String getColor() {
		return color;
	}
	
	
	public String getColorName() {
		return colorName;
	}


	public int getClassOrbitalTime() {
		return classOrbitalTime;
	}	

	
	public double getStartPosition() {
		return startPosition;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public void setColorName(String colorName) {
		this.colorName = colorName;
	}


	public void setClassOrbitalTime(int classOrbitalTime) {
		this.classOrbitalTime = classOrbitalTime;
	}


	public void setStartPosition(double startPosition) {
		this.startPosition = startPosition;
	}
	
	
	
}
