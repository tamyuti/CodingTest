package javaCoding.AbstractFactoryPattern;

public class AnimalFactory extends AbstractFactory {

	@Override
	Animal getAnimal(String animal) {
		if(animal==null){
			return null;
		}
		
		else if(animal.equals("Cat")){
			return new Cat();
		}
		
		else if(animal.equals("Dog")){
			return new Dog();
		}
		return null;
	}

	@Override
	Bird getBird(String bird) {
		return null;
	}

}
