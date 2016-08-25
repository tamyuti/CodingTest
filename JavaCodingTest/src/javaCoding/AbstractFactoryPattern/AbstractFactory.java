package javaCoding.AbstractFactoryPattern;

public abstract class AbstractFactory  {
	
	abstract Animal getAnimal(String animal);
	abstract Bird getBird(String bird);

}
