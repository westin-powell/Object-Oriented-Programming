import java.util.Scanner;

public class inheritance_skill {

	public static void main(String[] args) {
		class GeometricObject {
			private String color = "white";
			private boolean filled;
			private java.util.Date dateCreated;
			public GeometricObject() {
				dateCreated = new java.util.Date();
			}
			public GeometricObject(String color, boolean filled) {
				dateCreated = new java.util.Date();
				this.color = color;
				this.filled = filled;
			}
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public boolean isFilled() {
				return filled;
			}
			public void setFilled(boolean filled) {
				this.filled = filled;
			}
			public java.util.Date dateCreated() {
				return dateCreated;
			}
			
		}
		class triangle extends GeometricObject {
			double side1 = 1.0;
			double side2 = 1.0;
			double side3 = 1.0;
			public triangle(){
			}
			public triangle(double side1, double side2, double side3) {
				this.side1 = side1;
				this.side2 = side2;
				this.side3 = side3;
			}
			public double getArea() {
				double s = (side1 + side2 + side3) / 2;
				double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
				return area;
			}
			public double getPerimeter() {
				double perimeter = side1 + side2 + side3;
				return perimeter;
			}
			public String toString() {
				return "triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
			}
		}
		Scanner input = new Scanner(System.in);
		System.out.print("enter length of sides seperated by a space: ");
		triangle triangle = new triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
		System.out.print("enter color: ");
		triangle.setColor(input.next());
		System.out.print("enter is filled: ");
		triangle.setFilled(input.nextBoolean());
		System.out.println(triangle.getArea());
		System.out.println(triangle.getPerimeter());
		System.out.println(triangle.getColor());
		System.out.println(triangle.dateCreated());
		System.out.println(triangle.isFilled());

	}

}
