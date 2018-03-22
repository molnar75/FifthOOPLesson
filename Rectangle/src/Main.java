


public class Main {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(10, 5);
		Rectangle b = new Rectangle(15);
		Rectangle c = a;
		
		//a toSrting hívódik meg ebben az esetben, mivel stringként hivatkozunk az a-b-c-re.
		System.out.println("Elso kiiratas:\n" + a + "\n" + b + "\n" + c);

		a.setSides(5, 8);
		
		System.out.println("Masodik kiiratas:\n" + a + "\n" + b + "\n" + c);
		
		a.setSides(b.getaSide(),b.getbSide());
		
		System.out.println("(a == b): " + (a == b) + " \n(a == c): " + (a == c));
		
		System.out.println("a.hasTheSameSidesAs(b) method: " + a.hasTheSameSidesAs(b));
		
	}

}
