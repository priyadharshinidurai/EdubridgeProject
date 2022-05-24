package simplemath;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int num =sc.nextInt();
int sum =0;
int temp =num;
while (num >0) {
	int rem =num %10;
	sum =(sum*10)+rem;
	num =num/10;
	
}
//System.out.println("do u want to continue press y else press n");
	
	System.out.println(temp);
	if (temp==sum) {
		System.out.println("its a palindrome");
	}else  {
		System.out.println("not  palindrome");
		
	}
	//System.out.println("do u want to continue press y else press n");
	}
	}

