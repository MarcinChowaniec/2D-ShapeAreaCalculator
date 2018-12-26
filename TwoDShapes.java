
public class TwoDShapes {
	
	private String shape;
	private double length;
	private double width;
	private double height;
	private double radius;
	
///////////////////////////////////////////////////////////////	  Constructors
	public TwoDShapes()
	{
		shape = "";
		length = 0.0;
		width = 0.0;
		height = 0.0;
		radius = 0.0;
	}

///////////////////////////////////////////////////////////// Set Methods
	public void setShape(String shape)
	{
		this.shape = shape;
	}
	
	public void setLength(double length)
	{
		this.length = length;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
//////////////////////////////////////////////////////////////////   Get methods
	
	public String getShape()
	{
		return shape;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
////////////////////////////////////////////////////////////////  Prints List of Shapes
	
	public void listOf2DShapes()
	{
		System.out.println();
		System.out.println("Please select from one of the following 2D - Shapes, and enter the number"
				+ " next to it to calculate that shape's area:");
		System.out.println();
		System.out.println("1. Circle");
		System.out.println("2. Right Triangle");
		System.out.println("3. Equilateral Triangle");
		System.out.println("4. Isosceles Triangle");
		System.out.println("5. Scalene Triangle");
		System.out.println("6. Square");
		System.out.println("7. Rectangle");
		System.out.println("8. Rhombus");
		System.out.println("9. Parallelogram");
		System.out.println("10. Trapezoid");
		System.out.println("11. Pentagon");
		System.out.println("12. Hexagon");
		System.out.println("13. Heptagon");
		System.out.println("14. Octagon");
		System.out.println("15. Nonagon");
		System.out.println("16. Decagon");
		System.out.println();
	}
	
//////////////////////////////////////////////////////////////// 2D Shape Area Calculation Methods (Some are reused)
	
	public double calcCircleArea() //Method utilized for calculating the area of a Circle
	{
		double area, areaRounded;
		area = Math.PI * Math.pow(radius, 2);
		 areaRounded = Math.round(area *100)/100.0;
	      return areaRounded;
	}
	
	public double calcRSTriangleArea() //Method utilized for calculating the area of Right and Scalene Triangles
	{
		double area, areaRounded;
		 area = (length * height) / 2;
		  areaRounded = Math.round(area *100)/100.0;
	       return areaRounded;
	}
	
	public double calcETriangleArea() //Method utilized for calculating the area of a Equilateral Triangle
	{
		double area,areaRounded;
		 area = Math.sqrt(3)/4 * (Math.pow(length, 2));
		  areaRounded = Math.round(area *100)/100.0;
	       return areaRounded;
	}
	
	public double calcITriangleArea() //Method utilized for calculating the area of an Isosceles Triangle
	{
		double area,areaRounded, temp1, temp2, temp3, temp4, temp5; //Calculates area of the Isosceles Triangle, if height is unknown													
		 temp1 = length / 2;                                        
		  temp2 = Math.pow(width, 2);
		   temp3 = Math.pow(temp1, 2);
		    temp4 = temp2 - temp3;
		     temp5 = Math.sqrt(temp4);
		      area =  temp1 * temp5;
		       areaRounded = Math.round(area *100)/100.0;
			     return areaRounded;  
	}
	
	
	public double calcShapeArea() //Method utilized for calculating the area of both Square and Rectangle
	{
		double area, areaRounded;
		area = length * width;
		areaRounded = Math.round(area *100)/100.0;
	     return areaRounded;
	}
	
	public double calcRhombusArea() //Method utilized for calculating the area of a Rhombus
	{
		double area, areaRounded;
		area = (length * width) / 2;
		areaRounded = Math.round(area *100)/100.0;
	     return areaRounded;
	}
	
	public double calcTrapezoidArea() //Method utilized for calculating the area of a Trapezoid
	{
		double area, areaRounded;
		 area = (length + width) / 2;
		  area = area * height;
		  areaRounded = Math.round(area *100)/100.0;
		     return areaRounded;
	}
	
	public double calcPentagonArea() //Method utilized for calculating the area of a Pentagon
	{
		 double area, areaRounded;
	      double temp1 = 5 * (5 + (2* Math.sqrt(5)));
	       double temp2 = Math.sqrt(temp1);
	        area = 0.25 * temp2 * Math.pow(length, 2.0);
	         areaRounded = Math.round(area *100)/100.0;
		      return areaRounded;
	} 
	
	public double calcHexagonArea() //Method utilized for calculating the area of a Hexagon
	{
		double area,areaRounded, temp1;
		 temp1 = (3* Math.sqrt(3)) /2;
		  area = temp1 * Math.pow(length, 2.0);
		   areaRounded = Math.round(area *100)/100.0;
		     return areaRounded;
	}
	
	public double calcHeptagonArea()  //Method utilized for calculating the area of a Heptagon
	{
		double area, areaRounded, cot, temp1;
		 temp1 = 1.75 * (Math.pow(length, 2));
		  cot = (1.0 / Math.tan(Math.PI/7));
		   area = temp1 * cot;
		    areaRounded = Math.round(area *100)/100.0;
		     return areaRounded;
		  
	}
	
	public double calcOctagonArea()  //Method utilized for calculating the area of a Octagon
	{
		double area,areaRounded, temp1;
		 temp1 = 2 * (1+ Math.sqrt(2)) * Math.pow(length, 2);
		  area = temp1;
		   areaRounded = Math.round(area *100)/100.0;
		     return areaRounded;
	}
	
	public double calcNonagonArea()  //Method utilized for calculating the area of a Nonagon
	{
		double area,areaRounded, cot, temp1;
		 temp1 = 2.25 * (Math.pow(length, 2));
		  cot = (1.0 / Math.tan(Math.PI/9));
		   area = temp1 * cot;
		   areaRounded = Math.round(area *100)/100.0;
		     return areaRounded;
	}
	
	public double calcDecagonArea()  //Method utilized for calculating the area of a Decagon
	{
		double area,areaRounded, temp1, temp2;
		 temp1 = 2.5 * (Math.pow(length, 2));
		  temp2 = Math.sqrt(5 + (2 * Math.sqrt(5)));
		   area = temp1 * temp2;
		   areaRounded = Math.round(area *100)/100.0;
		     return areaRounded;
	}

}
