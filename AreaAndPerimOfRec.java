package GitHub_Work.AreaAndPerimeterOfARectangle;
import java.util.Scanner;

public class AreaAndPerimOfRec {
    public static void main(String[] args) {
		double width, height, Area, Perimeter; 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter the Width of a Rectangle: ");
		width = input.nextDouble();
		System.out.print("Please Enter the Height of a Rectangle: ");
		height = input.nextDouble();

        input.close();

		Area = width * height;
		Perimeter = 2 * (width + height);

		System.out.println("The Area of a Rectangle = %.2f\n" + Area);
		System.out.println("The Perimeter of a Rectangle: " + Perimeter);
	}
}   

