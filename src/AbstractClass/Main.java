package AbstractClass;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] animals = {new Cat(), new Dog()};
		for(Animal object:animals) {
			object.bark();
		}

	}

}
