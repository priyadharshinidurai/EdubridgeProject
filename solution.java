package simplemath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution {

	public static void main(String[] args)   throws  IOException  {
		// TODO Auto-generated method stub
     BufferedReader bufferedreader=new BufferedReader(new InputStreamReader(System.in));
     int N =Integer .parseInt(bufferedreader.readLine().trim());
     if(N>=2 && N<=20)
     {
    	 int i;
		  for( i=1;i<=10;i++)
    	 {
    		System.out.println(N+" X "+i+" = "+N*i);
    	 }
     }
     bufferedreader.close();
     
	}

	}

