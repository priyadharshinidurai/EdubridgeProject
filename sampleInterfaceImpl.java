package innerclasspacktest;

public class sampleInterfaceImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SampleInterface  sampleInterface =new SampleInterface()
				{
			public void  sample()
			{
				System.out.println("implemented thorough anonymous class");
			}
				};
				sampleInterface.sample();
	}

}
