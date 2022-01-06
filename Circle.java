/*******************************************************************
* <Kaylynn Diaz-Schott>
*
*<Adds characteristics of a circle to an Array of objects and compares another object
*with objects in the array>
*******************************************************************/
public class Circle {
	public String color = "blue";
	public double radius = 1.0;
	public final double PI = 3.14159;
	
	Circle() {}
	
	public Circle(double newRadius, String newColor){
		color = newColor;
		radius = newRadius;	
	}
	
	public String getColor(){
		return color;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setColor(String newColor){
		color = newColor;	
	}

	public void setRadius(double newRadius){
		radius = newRadius;
	}
	public double findArea () {
		double area = (getRadius()* getRadius())* PI;
		return area;
	}
	public String toString() {
    return "\nColor: " + this.color + "\nRadius: " + this.radius + "\nArea: " +
    Double.toString(findArea());
	}
	
	public boolean equals (Circle c2){	
		if (color.equals(c2.color)&& radius == c2.radius){
			return true;
		} else {
			return false;
		}
	
	}

}
