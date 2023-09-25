package javainterface;
interface MyInterface {
    int instanceVar = 42;      // This is implicitly public, static, and final
    static int staticVar = 100; // This is implicitly public, static, and final
    final int finalVar = 200;   // This is implicitly public, static, and final
}

// Create a class that implements the interface
public class Myclass implements MyInterface {
    // You can access the variables from the interface
    void printVariables() {
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
        System.out.println("Final variable: " + finalVar);
    }


//public class Myclass{
	
    public static void main(String[] args) {
        Myclass myObj = new Myclass();
        myObj.printVariables();
    }
}



	