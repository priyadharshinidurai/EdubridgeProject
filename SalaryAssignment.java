package simplemath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalaryAssignment {

	public static int calsalary(int salary,int shift) {
		double newsal;
		double add=shift * (salary *2/100);
		System.out.println (add);
		newsal=salary+add;
		System.out.println (add);
		salary =(int )(newsal-(salary/2));
		
		
		return salary;

	}
	public static void main (String[] args)throws IOException  {
	BufferedReader bufferReader = new BufferedReader (new InputStreamReader (System.in ));
	int salary = Integer.parseInt(bufferReader.readLine());
	int shift = Integer.parseInt(bufferReader.readLine());
	
	if(salary > 80000)  {
		System.out.println("salary is large");
	} else if (salary < 0) {
		System.out.println("salary is small");
    } else if (shift < 0) {
	System.out.println("shift is small");
    } else {
	System.out.println(calsalary(salary , shift));
	
		
	}
	

}
}
