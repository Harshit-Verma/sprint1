package com.capgemini.services;
import java.util.Date;
import java.util.Scanner;
public class RawMaterialDeliveryStatus {

	public static void DeliveryStatus() {
		String str1="Yes";
		String str2="No";
		Scanner sc=new Scanner(System.in);
		boolean checkcase=true;
		
		Date d=new Date();
		System.out.println("Do you want to know your delivery status(Yes or No)?\n");
		while(true) {
		String str =sc.nextLine();
			if(str.equalsIgnoreCase(str1)) {
			System.out.println("Your status of delivery=> Your order is ready to dispatched.\n" +("Time ")+d+"\n");
			checkcase=false;
			}
		else if (str.equalsIgnoreCase(str2)){
		//	System.out.println("*****Thank you for using our service*****");
			checkcase=false;
			}
		System.out.println("Do you want to add another product(yes/no)");
			String s=sc.nextLine();
			if(s.equalsIgnoreCase(str1)) {
				UpdateRawMaterialStatus.materialId();
				}
			else {
				System.out.println("*****Thank you for using our service*****");
				System.exit(0);
		 }
	 }
	
  }
	
	
}
