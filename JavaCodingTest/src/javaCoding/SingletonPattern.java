////Provide implementations for singleton design pattern
package javaCoding;

public class SingletonPattern {
public static void main(String[] args) {
	//singleton is not visible
	//Singleton singletonObject=new Singleton();
	
	//Both o and o1 refer to same object
	Singleton o=Singleton.getObject();
	System.out.println(o.hashCode());
	
	Singleton o1=Singleton.getObject();
	System.out.println(o1.hashCode());

	
	

}
}
