package Animalpolymorphism;

public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }


@Override
	public void makeSound() {
		System.out.println("The Cat meows. ");
	}

}
