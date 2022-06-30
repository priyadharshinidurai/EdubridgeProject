package CalculateElectricityBill;

import java.util.Scanner;

public class E_bill {
	   
	   
	    // main() method  start
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
	     String name;
		{
		System.out.println("Enter the id :");
		}
		{
		System.out.println("Enter the name :");
		
		}
		 

		// declare variable billpayment
		 int units;
		
			//create scanner class object to take input from user
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.println("Enter the number of units for calculating electricity bill :");
		
		
		
		id = scanner.nextInt();
		name = scanner.next();
		units = scanner.nextInt();
		
		//calculate billpayment
		 double Calculatebill = 0;
		 
		 //check  whether units are less than 100 
		if(units <100)
			
		{
			Calculatebill = units*1.20;
			
		}
		 //check  whether units are less than 300 
		else if (units < 300)
		{
			
			Calculatebill = 100*1.20+(units - 100)*2;
			
		}
		 //check  whether units are greater than 300 
		else if (units > 300)
		{
			
			Calculatebill = 100*1.20+200*2+(units - 300)*3;
			
		}
		
		
		//check whether units are  greater than 500
		else if(units > 500)
		{
			
			Calculatebill = 100*1.20 +300*3+(units - 500)*4;
			
		}
		
		System.out.println("The electricity bill for " + units  +  "is :" +  Calculatebill );
		
	}
	 
	
}
