package innerclasspack;

public class Objectchildclass {
	
	@Override
	public boolean equals(Object obj)


      {
    	  System.out.println("@Overriden");
    	  return true;
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Object object=new Objectchildclass();
      System.out.println(object.equals(new Object())); 
	}

}
