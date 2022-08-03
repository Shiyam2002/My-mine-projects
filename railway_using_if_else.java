package corejava;

import java.util.Scanner;

public class railway_using_if_else {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("\t\tRAILWAY RESERVATION");
	Scanner obj = new Scanner(System.in);
	int gen=100,sclass=200,fclass=300,ac=500,slp=400,diff,bal;
	
	System.out.println("Enter your distination ");
	String distination = obj.nextLine();
	
	System.out.println("Enter your seating type");
	String type = obj.nextLine();
	
	System.out.println("Enter your affordable price");
	int price = obj.nextInt();
	
	if(distination.equals("chennai") || distination.equals("trichy")) {
		System.out.println("You have selected "+distination);
		if(type.equals("general")) {
			System.out.println("You have selected "+ type);
			System.out.println("Price for the seat      : 100");
			System.out.println("Your affordable amount  :"+price);
			if(price<gen) {
				diff=gen-price;
				System.out.println("You more need "+diff);
			}
			else if(price>gen) {
				bal=price-gen;
				System.out.println("Your balance amount will be : "+bal);
			}
			else {
				System.out.println("Reqiured and Affordable amount are equal");
			}
		}
		else if(type.equals("second class")) {
			System.out.println("You have selected "+ type);
			System.out.println("Price for the seat      : 200");
			System.out.println("Your affordable amount  :"+price);
			if(price<sclass) {
				diff=sclass-price;
				System.out.println("You more need "+diff);
			}
			else if(price>sclass) {
				bal=price-sclass;
				System.out.println("Your balance amount will be : "+bal);
			}
			else {
				System.out.println("Reqiured and Affordable amount are equal");
			}
		}
		else if(type.equals("first class")) {
			System.out.println("You have selected "+ type);
			System.out.println("Price for the seat      : 300");
			System.out.println("Your affordable amount  :"+price);
			if(price<fclass) {
				diff=fclass-price;
				System.out.println("You more need "+diff);
			}
			else if(price>fclass) {
				bal=price-fclass;
				System.out.println("Your balance amount will be : "+bal);
			}
			else {
				System.out.println("Reqiured and Affordable amount are equal");
			}
		}
		else if(type.equals("sleeper")) {
			System.out.println("You have selected "+ type);
			System.out.println("Price for the seat      : 400");
			System.out.println("Your affordable amount  :"+price);
			if(price<slp) {
				diff=slp-price;
				System.out.println("You more need "+diff);
			}
			else if(price>slp) {
				bal=price-slp;
				System.out.println("Your balance amount will be : "+bal);
			}
			else {
				System.out.println("Reqiured and Affordable amount are equal");
			}
		}
		if(type.equals("AC")) {
			System.out.println("You have selected "+ type);
			System.out.println("Price for the seat      : 500");
			System.out.println("Your affordable amount  :"+price);
			if(price<ac) {
				diff=ac-price;
				System.out.println("You more need "+diff);
			}
			else if(price>ac) {
				bal=price-ac;
				System.out.println("Your balance amount will be : "+bal);
			}
			else {
				System.out.println("Reqiured and Affordable amount are equal");
			}
		}
	}
	else {
		System.out.println("You have enter a place which is not available.. sorry!!");
	}
 }
}
