package javaCoding.AbstractFactoryPattern;

public class BirdFactory extends AbstractFactory {

	@Override
	Bird getBird(String bird) {
		if(bird==null){
			return null;
		}
		
		else if(bird.equals("Duck")){
			return new Duck();
		}
		
		else if(bird.equals("Piegon")){
			return new Piegon();
		}
		
		return null;
	}
	
	@Override
	Animal getAnimal(String animal) {
		return null;
	}
}
