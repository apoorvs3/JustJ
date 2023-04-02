package supes;

public class Persian extends Cat{
	public Persian() {
		//  useful when parent constructor is overloaded
		super(5);
		System.out.println("Creating a persian cat");
	}
	public void sound() {
		System.out.println("Looks quite cute");
	}
}
