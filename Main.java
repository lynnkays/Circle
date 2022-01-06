import java.util.Scanner;
import java.lang.*;
import java.text.DecimalFormat;

public class Main {
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.0");
		final int MAX = 2;
		Circle [] circleArray = new Circle[3];

    for(int i = 0; i < circleArray.length; i++){
      System.out.print("Enter a color: ");
      String color = s.nextLine();

      System.out.print("Enter the radius: ");
		  double radius = Double.parseDouble(s.nextLine());
      circleArray[i] = new Circle(radius, color);
    }

    for (int i = 0; i < circleArray.length; i++){
      System.out.print(circleArray[i].toString());
    }
		
		System.out.print("\nCheck if Circle is in List\nEnter in Color for another Circle: ");
		String color = s.nextLine();
		System.out.print("Enter in the Radius for another Circle: ");
		double radius = Double.parseDouble(s.nextLine());
		
		Circle checkCircle = new Circle(radius,color);
		
		for (int i = 0; i < circleArray.length; i++){
			if (circleArray[i].equals(checkCircle)== true){
				System.out.println("Entered circle equals a created object in the array");
				break;
			}else {
				System.out.println("Entered circle does NOT equal a created object in the array");
				break;
			}
		}	
	}
}