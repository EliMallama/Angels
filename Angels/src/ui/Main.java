package ui;
import java.util.Scanner;
import model.*;
/** This class is where the interaction with the user is made
 * @author Eli Mallama
 *
 */

public class Main {
	
	/** The method launch the application
     * @param args
     */
	public static void main (String args[]) {

		Scanner in=new Scanner(System.in);
		TopMaximun legion=new TopMaximun();
		boolean exit=false;
		
		
		do {
			System.out.println("");
		System.out.println("Menu");
		System.out.println("");
		System.out.println("Por favor seleccione una opcion");
		System.out.println("");
		System.out.println("1. Ingresar arcangel");
		System.out.println("2. Contar arcangeles ingresados");
		System.out.println("3. Ver informacion de un arcangel por su nombre");
		System.out.println("4. Ver informacion de arcangel por su poder");
		System.out.println("5. Ver las celebraciones a realizar en un mes");
		System.out.println("6. ver todas las celebraciones");
		System.out.println("7. salir");
		int option=in.nextInt();
		in.nextLine();
		
		switch(option) {
		
		case 1: System.out.println("ingrese el nombre del arcangel");
		String name=in.nextLine();
		System.out.println("nombre: "+name);
		int size=name.length();
		if(size>=2 && name.charAt(size-1)=='l' && name.charAt(size-2)=='e' && legion.verifyArchangel(name)==false) {
		System.out.println("ingrese la foto del arcangel");
		String picture=in.nextLine();
		System.out.println("Ingrese la oracion correspondiente al arcangel");
		String pray=in.nextLine();
		System.out.println("ingrese dia de celebracion (solo el dia)");
		int day=in.nextInt();
		in.nextLine();
		System.out.println("ingrese el mes de celebracion (no es en numeros)");
		String month=in.nextLine();
		if(legion.validateMonth(month)==true) {
		in.nextLine();
		System.out.println("ingrese poder del arcangel");
		System.out.println("excepto: "+ legion.noPowers());
		String power=in.nextLine();
		in.nextLine();
		if(legion.verifyPower(power)==false) {
		System.out.println("ingrese el color de la vela correspondiente al arcangel");
		String color=in.nextLine();
		in.nextLine();
		System.out.println("ingrese la esencia de la vela");
		String essence=in.nextLine();
		in.nextLine();
		System.out.println("ingrese el grado de iluminancia de la vela");
		int luminance=in.nextInt();
		in.nextLine();
		System.out.println("ingrese el alto de la vela");
		double height=in.nextDouble();
		in.nextLine();
		System.out.println("ingrese el ancho de la vela");
		double wide=in.nextDouble();
		in.nextLine();
		Candle candle=new Candle(color, essence, luminance, height, wide);
		Archangel archangel=new Archangel(name, picture, pray, day, month, power, candle);
		legion.addArchangel(archangel);
		}else {
			System.out.println("poder ocupado");
		}
		
		}else {
			
			System.out.println("mes no valido");
		}
		
		}else {
			System.out.println("nombre ocupado o invalido");
			System.out.println("asegurese de que el nombre del arcangel termine en la silaba -el-");
			
		}
		
		break;
		
		case 2: System.out.println("El numero de arcangeles agregados hasta el momento es: " + legion.manyArchangels());
		
		break;
		
		case 3: System.out.println("Digite el nombre del arcangel");
		String nameAr=in.nextLine();
		System.out.println(legion.archangelByName(nameAr));
		
		break;
		
		case 4: System.out.println("Digite el poder del arcangel");
		String powerAr=in.nextLine();
		System.out.println(legion.archangelByPower(powerAr));
		
		break;
		
		case 5:System.out.println("Digite un mes");
		String monthC=in.nextLine();
		if(legion.validateMonth(monthC)==true) {
			System.out.println(legion.CelebMonth(monthC));
		}
		
		break;
		
		case 6: System.out.println(legion.allCaleb());
		
		break;
		
		case 7: exit=true;
		
		break;
		
		default: System.out.println("opcion no valida");
		
		break;
		}
		
		}while(exit==false);
	}		
}