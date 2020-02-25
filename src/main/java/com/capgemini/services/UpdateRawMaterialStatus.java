package com.capgemini.services;

import java.util.Scanner;

import com.capemini.daos.RawMaterialRepository;
public class UpdateRawMaterialStatus {

	public static  String materialId(){
		RawMaterialRepository.list();
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter your raw material Id");
		int id=sc.nextInt();
		 
		 if(id==100) {
	    	  System.out.println("You choose MILK and your material Id is update successfully.\n");
	    	  }
	     else if(id==101){
	    	 System.out.println("You choose COFFEE and your material Id is update successfully.\n");
	    	  }
	     else if(id==102) {
	    	 System.out.println("You choose BISCUITS and your material Id is update successfully.\n");
	     }
	     else if(id==103) {
	    	 System.out.println("You choose TEA and your material Id is update successfully.\n");
	     }
	     else if(id==104) {
	    	 System.out.println("You choose FRIES and your material Id is update successfully.\n");
	     }
	     else if(id==105) {
	    	 System.out.println("You choose COLD DRINK and your material Id is update successfully.\n");
	     }
	     else if(id==106) {
	    	 System.out.println("You choose ICE CREAM and your material Id is update successfully.\n");
	     }
	     else {  System.out.println("ERROR !"
	     		+ "Invalid material id "
	    		 + "please enter valid material id");
	     }
	     RawMaterialDeliveryStatus.DeliveryStatus();
	 //    sc.close();
	
	           return "Successfully";
	                      }
                                  }

