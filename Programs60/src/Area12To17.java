import java.util.Scanner;

class Area {
	Scanner sc = new Scanner(System.in);

	void getInput() {
		int side, height, width;
		float radius;
		System.out.print("Enter the side of the square ");
		side = sc.nextInt();
		area(side);
		System.out.print("Enter the Width ");
		width = sc.nextInt();
		System.out.print("Enter the Height ");
		height = sc.nextInt();
		area(width, height);
		System.out.print("Enter the Radius ");
		radius = sc.nextInt();
		area(radius, height);
		polynomialEquation(side, width, height);
	}

	void area(int side) {

		System.out.println("Area of Square " + side * side);
	}

	void area(int weight, int height) {

		System.out.println("Area of Rectangle " + weight * height);
	}

	void area(float radius, int height) {

		System.out.println("Area of Cylinder " + 3.14 * (radius * radius) * height);
	}

	void spaceBetween2Circle() {
		System.out.println("Enter the the radius of two concentric circles :");
		int R = sc.nextInt(); // formulae Π(R²-r²)
		int r = sc.nextInt();
		double pi = 3.14;
		System.out.println("Area of the space between the two concentric circle = " + (pi * (R * R) - pi * (r * r)));
	}

	void floatValuePrint() {
		float number = (float) 7.50;
		System.out.println("Printing 7.50 value without using String %.2f " + number);
	}

	void polynomialEquation(int a, int b, int c) {
		double positiveInteger = (-b + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
		double negativeInteger = (-b - (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
		System.out.println("PolynomialEquation of this value " + a + " " + b + " " + c);
		System.out.println("X = " + positiveInteger);
		System.out.println("X = " + negativeInteger);
	}

}

public class Area12To17 {
	public static void main(String[] args) {
		Area a = new Area();
		a.getInput();
		a.spaceBetween2Circle();
		a.floatValuePrint();

	}

}
