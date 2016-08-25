//Provide implementations for singleton design pattern
package javaCoding;

public class Singleton {
	
	//create private static singleton object
	private static Singleton obj=new Singleton();
	
	//create constructor as private
	private Singleton(){
	}
	
	//provide getter method
	public static Singleton getObject(){
		return obj;
	}
	
	
}
