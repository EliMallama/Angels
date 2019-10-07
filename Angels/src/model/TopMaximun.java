package model;

import java.util.ArrayList;

//class declaration
public class TopMaximun {
	
	//Archangel arraylist attribute
	private ArrayList <Archangel> archangels=new ArrayList<Archangel>();

  //Default Constructor for TopMaximun Class
	public TopMaximun() {
		
	}
  //getters and setters
	public ArrayList<Archangel> getArchangels() {
		return archangels;
	}

	public void setArchangels(ArrayList<Archangel> archangels) {
		this.archangels = archangels;
	}
	
	/** This method allows to add an archangel to archangel's arraylist
	 *with their default attributes
	 * @param archangel
	 */
	public void addArchangel(Archangel archangel) {

		archangels.add(archangel);

	}
	
	/** This methos allows to verify that the name entered by the user is not repeated
	 * @param name
	 * @return true or false
	 */
	public boolean verifyArchangel(String name) {
		boolean index=false;
		for(Archangel archangel:archangels){
			if(archangel.getName().equalsIgnoreCase(name)) 
			{
				index=true;
				
			}
			
			}

		return index;
	}
	
	/** This methos allows to verify that the power entered by the user is not repeated
	 * @param power
	 * @return true or false
	 */
	public boolean verifyPower(String power) {
		boolean index=false;		
		for(Archangel archangel:archangels){
			if(archangel.getPower().equalsIgnoreCase(power)) 
			{
				index=true;
			}
			
			}

		return index;
	}
	
	/** This method is to show the user the repeated powers and
	 * should not reuse them
	 * @return var with used powers
	 */
public String noPowers() 
{ String var="";

for(Archangel archangel:archangels) {
	var+=archangel.getPower()+","+" ";
}
return var;	
}

  /** this method is for counting the archangels 
	 * that have been entered
	 * @return number of angels that have been added
	 */
public int manyArchangels() {
	
	int archangelsN;
	
archangelsN=archangels.size();

return archangelsN;
}

  /** this method allows to dysplay an archangel information
	 * by writing the name only
	 * @param name archangel's name
	 * @return info which contains the information used before
	 * to create an archangel
	 */
public String archangelByName(String name) {
	
	String info="";
	
	for(Archangel archangel:archangels) {
		if(archangel.getName().equalsIgnoreCase(name)) {
		info=archangel.info();
		}
	}
	return info ;
}

  /** this method allows to dysplay an archangel information
	 * by writing the name only
	 * @param power archangel's power
	 * @return info which contains the information used before
	 * to create an archangel
	 */
public String archangelByPower(String power) {
	
	String info="";
	
	for(Archangel archangel:archangels) {
		if(archangel.getPower().equalsIgnoreCase(power)) {
		info=archangel.info();
		} else {
			info="poder no registrado";
		}
	}
	return info ;
}

  /** This method limits the options the user can write,
	 * so the usser can only write the months and not
	 * any other information.
	 * The months can only be written in Spanish
	 * @param month
	 * @return ture or false
	 */
public boolean validateMonth(String month) {
	
	boolean val=false;
	
	if(month.equalsIgnoreCase("enero") || month.equalsIgnoreCase("febrero") || 
	month.equalsIgnoreCase("marzo") || month.equalsIgnoreCase("abril") || month.equalsIgnoreCase("mayo") || 
	month.equalsIgnoreCase("junio") || month.equalsIgnoreCase("julio") || month.equalsIgnoreCase("agosto") || 
	month.equalsIgnoreCase("septiembre") || month.equalsIgnoreCase("octubre") || 
	month.equalsIgnoreCase("noviembre") || month.equalsIgnoreCase("diciembre")) {
		
		val=true;
	}
	
	return val;
	
}

  /** this methos allows to display al the celebrations
	 * in a month given by the usser
	 * @param month
	 * @return info contains archangel's name, celebration date,
	 * candle colos an candle essence
	 */
public String CelebMonth(String month) {
	
	String info="";
	
	for(Archangel archangel:archangels) {
		if(archangel.getMonth().equalsIgnoreCase(month)) {
			info=archangel.info2();
		} else {
			info="mes no registrado";
		}
			
	}
	
	return info;

}

  /** This methos allows to display all the celebration dates
	 * concatenated with the name of each archangel
	 * @return info archangel's celebration date and name
	 */
public String allCaleb() {
	
	String info="";
	
	for(Archangel archangel:archangels) {
		info+=archangel.info3() + " ,";
	}
	return info;
}
	
}
