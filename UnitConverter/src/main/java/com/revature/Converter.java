package com.revature;
import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		int menuSelection;
		do {
			printMainMenu();
			menuSelection=receiveMenuInput();
			switch(menuSelection) {
			case 1:
				//volumeConversionsMenu
				VolumeConversionsMenu();
				menuSelection=receiveMenuInput();
				switch(menuSelection) {
					case 1:
						//gallons to liters
						UserPrompt();
						galToLiter(collectQuantity());
						break;
					default:
						break;
				}
			case 2:
				//miles to kilometer
				miToKilometers(collectQuantity());
				break;
			case 3:
				//dollars to bitcoin
				dollarToBitcoin(collectQuantity());
				break;
			case 4:
				//quit
				break;
			default: 
				break;	
	        }
		}while(menuSelection != 4); 

	}
	public static void printMainMenu() {
		String mainMenu="\n"
				+ "Welcome to Angel's Unit Converter\n"
				+" Here are your options\n"
				+" 1. Volume Conversions\n"
				+" 2. Distance Conversions\n"
				+" 3. Currency Coversions\n"
				+" 4. Quit\n"
				+" Please type any one of the numbers 1 - 4";
		System.out.println(mainMenu);
	}
	public static void UserPrompt() {
		System.out.println("Please enter amount to be converted: \n");
	}
	public static void VolumeConversionsMenu() {
		String volumeSubMenu="\n"
				+" Here are your options\n"
				+" 1. Gallons to Liters\n"
				+" 2. DistanceConversions\n"
				+" 3. CurrencyCoversions\n"
				+" 4. Back to Main Menu\n"
				+" Please type any one of the numbers 1 - 4";
		System.out.println(volumeSubMenu);
	}
	
	public static void DistanceConversionsMenu() {
		String distanceSubMenu="\n"
				+" Here are your options\n"
				+" 1. Miles to Kilometers\n"
				+" 2. DistanceConversions\n"
				+" 3. CurrencyCoversions\n"
				+" 4. Back to Main Menu\n"
				+" Please type any one of the numbers 1 - 4";
		System.out.println(distanceSubMenu);
	}
	public static void CurrencyConversionsMenu() {
		String currencySubMenu="\n"
				+" Here are your options\n"
				+" 1. Miles to Kilometers\n"
				+" 2. DistanceConversions\n"
				+" 3. CurrencyCoversions\n"
				+" 4. Back to Main Menu\n"
				+" Please type any one of the numbers 1 - 4";
		System.out.println(currencySubMenu);
	}
	public static int receiveMenuInput() {
		Scanner input= new Scanner(System.in);
		return input.nextInt();
	}
	public static double collectQuantity() {
		Scanner input = new Scanner(System.in);
		return input.nextDouble();
	}
    public static void galToLiter(double gals) {
    	 double result= gals*3.7854;
    	 System.out.println(gals + "g is "+result+" liters");
    }
    public static void miToKilometers(double miles) {
    	 double result= miles*3.7854;
   	     System.out.println(miles+"mi is "+result+" km");
    }
    public static void dollarToBitcoin(double d) {
    	double result = d*0.00020;
    	System.out.println(d +"dollars is "+result+" bitcoin");
    }
}
