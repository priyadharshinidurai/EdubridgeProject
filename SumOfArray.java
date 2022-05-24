package simplemath;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfArray {

	

	private static final SumOfArray Sum = null;


	public static int total(int[] array) {
		// TODO Auto-generated method stub
 int output=0;
 //for(int i=0;i<array.length;i++) {
 //output+=array[i];
 
	//}
	for(int value: array) {
		output+=value;
		
	}
	return output;
	

}
	public static int getTotal(List<Integer>list) {
		// TODO Auto-generated method stub
		 int output=0;
		 //for(int i=0;i<array.length;i++) {
		 //output+=array[i];
		 
			//}
			for(int value:list) {
				output+=value;
			}
			return output;
	}
		

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the  Element  you want to give as input");
	int count=sc.nextInt();
	//int[] array=new int [count];
	List<Integer>list=new ArrayList<>(count);
	
	for (int i=0;i<count;i++) {
	list.add(sc.nextInt());
				
	}
	System.out.print(Sum.getTotal(list));
}
}

