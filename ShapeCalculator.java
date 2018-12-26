import java.util.*; //2D - Shape Area Calculator, Marcin Chowaniec
public class ShapeCalculator 
{

	public static void main (String [] args) {
		
		System.out.println("Welcome to the  2D - Shape Area Calculator!");
		
        Scanner input = new Scanner(System.in);
        
        System.out.println();
		
            int choice;
            
			do
			{
			TwoDShapes twoDShapes = new TwoDShapes();
			twoDShapes.listOf2DShapes();
			
			System.out.print("Shape Number: ");
			int shapeNumber = input.nextInt();
			System.out.println();
			
			
			switch (shapeNumber) 
			{
			case 1:
				System.out.print("Enter the radius: ");
				double radius = input.nextDouble();
				twoDShapes.setRadius(radius);
				System.out.println();
				
				System.out.println("The total area for the Circle is: " + twoDShapes.calcCircleArea());
				break;
				
			case 2:
				System.out.print("Enter the base: ");
				double length2 = input.nextDouble();
				twoDShapes.setLength(length2);
				System.out.println();
				
				System.out.print("Enter the height: ");
				double height2 = input.nextDouble();
				twoDShapes.setHeight(height2);
				System.out.println();
				
				System.out.println("The total area for the Right Triangle is: " + twoDShapes.calcRSTriangleArea());
				break;
				
			case 3:
				System.out.print("Enter the side: ");
				double length3 = input.nextDouble();
				twoDShapes.setLength(length3);
				System.out.println();
				
				System.out.println("The total area for the Equilateral Triangle is: " + twoDShapes.calcETriangleArea());
				break;
				
			case 4:
				System.out.println("*Only calculates the area if the height is unknown*");
				System.out.println();
				System.out.print("Enter the base: ");
				double length4 = input.nextDouble();
				twoDShapes.setLength(length4);
				System.out.println();
				
				System.out.print("Enter the side: ");
				double width4 = input.nextDouble();
				twoDShapes.setWidth(width4);
				System.out.println();
			
				System.out.println("The total area for the Isosceles Triangle is: " + twoDShapes.calcITriangleArea());
				break;
				
			case 5:
				System.out.print("Enter the base: ");
				double length5 = input.nextDouble();
				twoDShapes.setLength(length5);
				System.out.println();
				
				System.out.print("Enter the height: ");
				double height5 = input.nextDouble();
				twoDShapes.setHeight(height5);
				System.out.println();
				
				System.out.println("The total area for the Scalene Triangle is: " + twoDShapes.calcRSTriangleArea());
				break;
				
			case 6:
				System.out.print("Enter the length: ");
				double length6 = input.nextDouble();
				twoDShapes.setLength(length6);
				System.out.println();
				
				System.out.print("Enter the width: ");
				double width6 = input.nextDouble();
				twoDShapes.setWidth(width6);
				System.out.println();
				
				System.out.println("The total area for the Square is: " + twoDShapes.calcShapeArea());
				break;
				
			case 7:
				System.out.print("Enter the length: ");
				double length7 = input.nextDouble();
				twoDShapes.setLength(length7);
				System.out.println();
				
				System.out.print("Enter the width: ");
				double width7 = input.nextDouble();
				twoDShapes.setWidth(width7);
				System.out.println();
				
				System.out.println("The total area for the Rectangle is: " + twoDShapes.calcShapeArea());
				break;
				
			case 8:
				System.out.print("Enter the first diagonal: ");
				double length8 = input.nextDouble();
				twoDShapes.setLength(length8);
				System.out.println();
				
				System.out.print("Enter the second diagonal: ");
				double width8 = input.nextDouble();
				twoDShapes.setWidth(width8);
				System.out.println();
				
				System.out.println("The total area for the Rhombus is: " + twoDShapes.calcRhombusArea());
				break;
				
			case 9:
				System.out.print("Enter the base: ");
				double length9 = input.nextDouble();
				twoDShapes.setLength(length9);
				System.out.println();
				
				System.out.print("Enter the height: ");
				double width9 = input.nextDouble();
				twoDShapes.setWidth(width9);
				System.out.println();
				
				System.out.println("The total area for the Parallelogram is: " + twoDShapes.calcShapeArea());
				break;
				
			case 10:
				System.out.print("Enter the first base: ");
				double length10 = input.nextDouble();
				twoDShapes.setLength(length10);
				System.out.println();
				
				System.out.print("Enter the second base: ");
				double width10 = input.nextDouble();
				twoDShapes.setWidth(width10);
				System.out.println();
				
				System.out.print("Enter the height: ");
				double height10 = input.nextDouble();
				twoDShapes.setHeight(height10);
				System.out.println();
				
				System.out.println("The total area for the Trapezoid is: " + twoDShapes.calcTrapezoidArea());
				break;
				
			case 11:
				System.out.print("Enter the side: ");
				double length11 = input.nextDouble();
				twoDShapes.setLength(length11);
				System.out.println();
				
				System.out.println("The total area for the Pentagon is: " + twoDShapes.calcPentagonArea());
				break;
				
			case 12:
				System.out.print("Enter the side: ");
				double length12 = input.nextDouble();
				twoDShapes.setLength(length12);
				System.out.println();
				
				System.out.println("The total area for the Hecagon is: " + twoDShapes.calcHexagonArea());
				break;
				
			case 13:
				System.out.print("Enter the side: ");
				double length13 = input.nextDouble();
				twoDShapes.setLength(length13);
				System.out.println();
				
				System.out.println("The total area for the Heptagon is: " + twoDShapes.calcHeptagonArea());
				break;
				
			case 14:
				System.out.print("Enter the side: ");
				double length14 = input.nextDouble();
				twoDShapes.setLength(length14);
				System.out.println();
				
				System.out.println("The total area for the Octagon is: " + twoDShapes.calcOctagonArea());
				break;
				
			case 15:
				System.out.print("Enter the side: ");
				double length15 = input.nextDouble();
				twoDShapes.setLength(length15);
				System.out.println();
				
				System.out.println("The total area for the Nonagon is: " + twoDShapes.calcNonagonArea());
				break;
				
			case 16:
				System.out.print("Enter the side: ");
				double length16 = input.nextDouble();
				twoDShapes.setLength(length16);
				System.out.println();
				
				System.out.println("The total area for the Decagon is: " + twoDShapes.calcDecagonArea());
				break;
				
			default:
				System.out.println("You typed in a number that was not on the list, please re-enter your selection.");
			}
			
			System.out.println();
			System.out.println("Would you like to calculate another 2D Shape?");
			System.out.print("If yes, type \"1\", if no type \"0\": ");
			choice = input.nextInt();
			
		}while(choice == 1); //Do-while loop condition
			
			if(choice == 0);
			{
				System.out.println();
				System.out.println("Thanks for using the 2-D Shape Calculator, see you next time! :D");
				input.close();
			}
	}
	
}
