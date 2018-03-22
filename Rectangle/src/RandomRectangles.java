import java.util.Random;
import java.util.Scanner;


public class RandomRectangles {

	public static void main(String[] args) {
		
		int min = 0, db = 0, index = 0;
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		Rectangle[] rectangleArray = new Rectangle[10];
		
		for(int i = 0; i < rectangleArray.length; i++){
			rectangleArray[i] = new Rectangle(random.nextInt(8)+2, random.nextInt(8)+2);
		}
		
		for(int i = 0; i < 10; i++){
			System.out.println((i+1) + ". rectangle: " + rectangleArray[i]);
		}
		
		for(int i=1; i < rectangleArray.length; i++){
			if(rectangleArray[i].getArea() < rectangleArray[min].getArea()){
				min = i;
			}
		}
		
		System.out.println("\nThe lowest area: " + rectangleArray[min]);
		
		Rectangle rectangle = new Rectangle(0, 0);
		System.out.println("\nPlease give the a side of your rectangle: ");
		int a = scanner.nextInt();
		System.out.println("Please give the b side of your rectangle: ");
		int b = scanner.nextInt();
		rectangle.setSides(a, b);
		
		for(int i=0; i < rectangleArray.length; i++){
			if(rectangleArray[i].getArea() < rectangle.getArea()){
				db++;
			}
		}
		
		System.out.println("\n" + db + " rectangle has lower area than " + rectangle);
		
		 
		for(int i=0; i < rectangleArray.length; i++){
			if(rectangleArray[i].hasTheSameSidesAs(rectangle) && (index == 0)){
				index = i+1;
			 }
		 }
		 
		if(index > 0){
			System.out.println("\n" + index + ". rectangle has the same sides as " + rectangle);
		}else {
			System.out.println("\nThere is no rectangle that has the same sides as " + rectangle);
		}
		
		scanner.close();
	}

}
