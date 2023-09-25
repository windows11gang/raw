package javainterface;

public class MyClassone {

	    public int publicVar = 10;
	    private int privateVar = 20;
	    protected int protectedVar = 30;
	    int defaultVar = 40; // Default access modifier (package-private)

	    // Methods to access privateVar directly
	    public int getPrivateVar() {
	        return privateVar;
	    }

	    public void setPrivateVar(int value) {
	        privateVar = value;
	    }
	

	// Another class to demonstrate access
	
	    public static void main(String[] args) {
	        MyClassone myObj = new MyClassone();

	        // Accessing publicVar (public) from another class
	        System.out.println("Public variable: " + myObj.publicVar);

	        // Accessing privateVar (private) indirectly using a public method
	        myObj.setPrivateVar(25);
	        System.out.println("Private variable (indirect access): " + myObj.getPrivateVar());

	        // Accessing protectedVar (protected) from another class in the same package
	        System.out.println("Protected variable: " + myObj.protectedVar);

	        // Accessing defaultVar (default) from another class in the same package
	        System.out.println("Default variable: " + myObj.defaultVar);
	    }
	    
	
}

