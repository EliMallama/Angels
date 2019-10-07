package model;

//class declaration
public class Candle {
	
	//declaration of attributes
	private String color="";
	private String essence="";
	private int luminance;
	private double height;
	private double wide;
	
	/** Default Constructor for Candle Class.
   * @param color
   * @param essence
   * @param luminance
   * @param height
   * @param wide 
	 */
	public Candle(String color, String essence, int luminance, double height, double wide) {
		this.color = color;
		this.essence = essence;
		this.luminance = luminance;
		this.height = height;
		this.wide = wide;
	}

  //getter and setters
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getEssence() {
		return essence;
	}


	public void setEssence(String essence) {
		this.essence = essence;
	}


	public int getLuminance() {
		return luminance;
	}


	public void setLuminance(int luminance) {
		this.luminance = luminance;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWide() {
		return wide;
	}


	public void setWide(double wide) {
		this.wide = wide;
	}


}