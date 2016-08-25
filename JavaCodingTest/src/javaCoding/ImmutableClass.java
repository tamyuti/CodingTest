//2. create a immutable class
package javaCoding;

public final class ImmutableClass {
	
	final int id;
	
	public ImmutableClass(int id){
		this.id=id;
	}
	
	public int getId(){
		return id;
	}
	
	public static void main(String[] args) {
		
		ImmutableClass c=new ImmutableClass(5);
		System.out.println(c.getId());
		
		//The final field cannot be assigned
		//c.id=6; 
	}
}
