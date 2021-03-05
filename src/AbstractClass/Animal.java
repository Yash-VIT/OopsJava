package AbstractClass;

abstract class Animal {
	abstract void bark();
}

class Dog extends Animal{

	@Override
	void bark() {
		// TODO Auto-generated method stub
		System.out.println("Bow Bow");
		
	}
	
}

class Cat extends Animal{

	@Override
	void bark() {
		// TODO Auto-generated method stub
		System.out.println("Meow Mewl");
		
	}
	
}
