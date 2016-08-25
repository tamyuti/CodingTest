package javaCoding.AbstractFactoryPattern;

public class Factory {
	public static AbstractFactory getFactory(String choose){
		   
	      if(choose.equals("Animal")){
	         return new AnimalFactory();
	         
	      }
	      else if(choose.equals("Bird")){
	         return new BirdFactory();
	      }
	      
	      return null;
	   }

}
