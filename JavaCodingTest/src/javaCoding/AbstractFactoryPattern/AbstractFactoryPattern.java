package javaCoding.AbstractFactoryPattern;

public class AbstractFactoryPattern {
	public static void main(String[] args) {
		
		//get animal factory
	      AbstractFactory animalFactory = Factory.getFactory("Animal");
	      
	      //get an object of Animal Dog
	      Animal a= animalFactory.getAnimal("Dog");
	      a.speak();
		
	      //get an object of Animal Cat
	      Animal a1= animalFactory.getAnimal("Cat");
	      a1.speak();
	      
	    //get Bird factory
	      AbstractFactory BirdFactory = Factory.getFactory("Bird");
	      
	    //get an object of Bird Duck
	      Bird b= BirdFactory.getBird("Duck");
	      b.chirp();
		
	      //get an object of Bird Piegon
	     Bird b1= BirdFactory.getBird("Piegon");
	      b1.chirp();
	      
		
		
	}

}
