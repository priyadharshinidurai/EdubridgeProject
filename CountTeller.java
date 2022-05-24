package simplemath;

import java.util.Scanner;

public class CountTeller {

	private static final int i = 0;
	public static int  countRepeater(int size,int[] array) {
		// TODO Auto-generated method stub
  int count =1;
  //list <Integer>list=new ArrayList <Integer>();
  for (int i=0; i < size ;i++) {
	  //array.sort(array);
	  for (int j=i+1;j<size;)  {
		  if (array[i] == array [j])  {
			  count++;
			  for (int k=j;k<size-1;k++)
				  array [k]=array[k+1];
			  size--;
		  }else 
			  j++;
		  
		  }
	  }
  
  return count ;
  
	  
  }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner =new Scanner (System.in);
			System.out.println ("Enter the size of array");
			int size=scanner.nextInt();
			int [] array = new  int [size];
			if (size <0) {
				System.out.println("invalid input");
			}else {
				
				for (int i=0;i<size;i++)
					array [i]=scanner.nextInt();
				if (array [i]<0)  {
					System.out.println ("invalid input");
					
				}
			}
			//for(int e:array) {
			//s.o.p(e)
			//}
			System.out.println("the repeated salary count "+CountTeller.countRepeater(size,array));

	}

}
