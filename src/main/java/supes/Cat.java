package supes;

public class Cat extends Animal{
	
	public Cat(int x) {
		System.out.println("Creating a cat");
	}
	
	@Override
	public void sound() {
		super.sound();
		System.out.println("Moans and meows");
	}
}
