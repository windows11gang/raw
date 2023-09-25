package javainterface;
interface Waterbottleinterface{
	String colour= "black";
	
	void fillup();
	
}



public class Interfaceexample implements Waterbottleinterface {

	public static void main(String[] args) {
	

		System.out.println(colour);
		
		Interfaceexample g = new Interfaceexample();
		g.fillup();
	}

	@Override
	public void fillup() {
		System.out.println("it is filled");
		

	}
}

