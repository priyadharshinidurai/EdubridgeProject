package simplemath;

import java.util.Scanner;

public class MaximumSum {
	static int sumOfEven  (int[] number,int size) {
		int sumOfEven=0;
		for (int i=0;i<size;i++)
		{
			if (number [i] %2==0)
			{
				sumOfEven +=number[i];
				}
			}
		return sumOfEven;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scanner =new Scanner(System.in);
  int n=scanner.nextInt();
  int[] arr =new int[n];
  for (int i=0;i<n;i++) {
	  arr[i]=scanner.nextInt();
  }
  //checking array
  int  result =0;
  for (int j=0;j<n;j++) {
	  if (arr[j] >=0 )  {
		  result++;
		  }else  {
			  result--;
			  
		  }
	  }
  if (n>0&&result ==n)  {
	  System.out.println(sumOfEven(arr,n));
  }else if (n<0) {
	  System.out.println("invalid array size");
  }else if (result !=n)   {
	  System.out.println("invalid value");
  }
	}

}
