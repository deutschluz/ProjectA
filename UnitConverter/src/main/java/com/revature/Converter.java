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
					case 2:
						//liters to gallons
						UserPrompt();
						literToGallon(collectQuantity());
						break;
					case 3:
						//ccm to liters
						UserPrompt();
						ccmToLiter(collectQuantity());
						break;
					default:
						break;
				}
				break;
			case 2:
				//DistanceConversionsMenu
				DistanceConversionsMenu();
				menuSelection=receiveMenuInput();
				switch(menuSelection) {
					case 1:
						//miles to kilometer
						UserPrompt();
						miToKilometers(collectQuantity());
						break;
					case 2:
						//inches to cms
						UserPrompt();
						inToCm(collectQuantity());
						break;
					case 3:
						//km to miles
						UserPrompt();
						kmToMiles(collectQuantity());
						break;
					default:
						break;
				}			
				break;
			case 3:
				CurrencyConversionsMenu();
				menuSelection=receiveMenuInput();
				switch(menuSelection) {
					case 1:
						//dollars to bitcoin
						UserPrompt();
						dollarToBitcoin(collectQuantity());
						break;
					case 2:
						//bitcoins to dollars
						UserPrompt();
						bitcoinToDollar(collectQuantity());
						break;
					case 3:
						//dollars to Yen
						UserPrompt();
						dollarToYen(collectQuantity());
						break;
					default:
						break;
				}
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
				+" 2. Liters to Gallons\n"
				+" 3. cm^3 to Liters\n"
				+" 4. Back to Main Menu\n"
				+" Please type any one of the numbers 1 - 4";
		System.out.println(volumeSubMenu);
	}
	
	public static void DistanceConversionsMenu() {
		String distanceSubMenu="\n"
				+" Here are your options\n"
				+" 1. Miles to Kilometers\n"
				+" 2. inches to centimeters\n"
				+" 3. Km to Mi\n"
				+" 4. Back to Main Menu\n"
				+" Please type any one of the numbers 1 - 4";
		System.out.println(distanceSubMenu);
	}
	public static void CurrencyConversionsMenu() {
		String currencySubMenu="\n"
				+" Here are your options\n"
				+" 1. Dollars to Bitcoin\n"
				+" 2. Bitcoin to dollar\n"
				+" 3. Dollars to Yen\n"
				+" 4. Back to Main Menu\n"
				+" Please type any one of the numbers 1 - 4";
		System.out.println(currencySubMenu);
	}
	public static int receiveMenuInput() {
		Scanner input= new Scanner(System.in);
		int nextInt=input.nextInt();
		//input.close();
		return nextInt;
	}
	public static double collectQuantity() {
		Scanner input = new Scanner(System.in);
		double nextDouble=input.nextDouble();
		//input.close();
		return nextDouble;
	}
    public static void galToLiter(double gals) {
    	 double result= gals*3.7854;
    	 System.out.println(gals + " g is "+result+" liters");
    }
    public static void ccmToLiter(double ccm) {
   	 double result= ccm*0.001;
   	 System.out.println(ccm + " ccm is "+result+" liters");
   }
    public static void literToGallon(double lits) {
   	 double result= lits*0.264172;
   	 System.out.println(lits + " L is "+result+" gallons");
   }
    public static void miToKilometers(double miles) {
    	 double result= miles*3.7854;
   	     System.out.println(miles+" mi is "+result+" km");
    }
    public static void kmToMiles(double kms) {
   	 double result= kms*3.7854;
  	     System.out.println(kms+" km is "+result+" miles");
   }
    public static void inToCm(double ins) {
   	 double result= ins*2.54;
   	 System.out.println(ins + " in is "+result+" cm");
   }
    public static void dollarToBitcoin(double d) {
    	double result = d*0.00020;
    	System.out.println(d +" dollars is "+result+" bitcoin");
    }
    public static void bitcoinToDollar(double btc) {
    	double result = btc*49822.1;
    	System.out.println(btc +" bitcoin is "+result+" dollars");
    }
    public static void dollarToYen(double dols) {
    	double result = dols*109.36;
    	System.out.println(dols +" dollars is "+result+" yen");
    }
}
