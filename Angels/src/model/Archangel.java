package model;


//class declaration
public class Archangel {
	
	//declaration of attributes
	private String name="";
	private String picture="";
	private String pray="";
	private int day;
	private String month;
	private String power="";
	private Candle candle;
	
	/** Default Constructor for Archangel Class.
   * @param name
   * @param picture
   * @param pray
   * @param day
   * @param month
   * @param power
   * @param candle	 
	 */
	public Archangel(String name, String picture, String pray, int day, String month, String power, Candle candle) {
		this.name=name;
		this.picture = picture;
		this.pray = pray;
		this.day = day;
		this.month = month;
		this.power = power;
		this.candle=candle;
	}
  //getter and setters
  public String getName() {
  	return name;
  }
  
  public void setName() {
  	this.name = name;
  }
	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getPray() {
		return pray;
	}

	public void setPray(String pray) {
		this.pray = pray;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

  /** This method keeps the information that will be displayed on screen for Archangel's method 
	*archangelByName()
	*/
	
	public String info() {
		String info="Nombre: " + name + '\n' + "foto: " + picture + '\n' + "oracion: " + pray + '\n' + "fecha de celebracion: " + month + " " + day +
            	'\n' + "poder: " + power + '\n' + "color de la vela: " + candle.getColor() + '\n' + "esencia: " + candle.getEssence() + '\n' + "grado de luminancia: "
           + candle.getLuminance() + '\n' + "alto de la vela: " + candle.getHeight() + '\n' + "ancho de la vela: " + candle.getWide();
		
		return info;

	    }
	
	 /** This method keeps the information that will be displayed on screen for Archangel's method 
	*archangelBypower()
	*/
	public String info2() {
		
		String info="Nombre: " + name + '\n' + "fecha de celebracion: " + day + '\n' + 
				"color de la vela: " + candle.getColor() + '\n' + "esencia: " + candle.getEssence();
		
		return info;
	}
	
	 /** This method keeps the information that will be displayed on screen for Archangel's method 
	*celebMonth()
	*/
	public String info3() {
		String info=name + ": " +  "fecha de celebracion: " + day + " " + "de" + " " + month + ", ";
		
		return info;
	}
}
	
