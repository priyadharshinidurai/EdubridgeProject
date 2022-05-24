package simplemath;

import java.util.Scanner;

public class ProductOfDigits {
	
	static int productofdigits (int in)  {
	int out =1;
	while (in >0)  {
		int rem =in%10;
		out*=rem;
		in=in/10;
		
	}
	return out;
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner =new Scanner (System.in);
	int in=scanner.nextInt();
	int product =productofdigits(in);
	if (in>0  && in<32767  &&  product  >=0)  {
		System.out.println(product);
	}else {
		

		System.out.println("invalid input");
		
	}

}
}
