//Write a Java program to create a class called "Circle" with an instance variable "radius." Include a method to
//calculate the area of the circle and a method to calculate the circumference of the circle.

package Level1ClassAndObject;

public class Circle {
      double radius;
      public void setRadius(double r)
      {
    	  this.radius=r;
      }
      public double getRadius()
      {
    	  return this.radius;
      }
      public double Area()
      {
    	  double area=3.148*radius*radius;
    	  return area;
      }
      public double Circumference()
      {
    	  double cf=2*3.14*radius;
    	  return cf;
      }
      public static void main(String args[])
      {
    	  Circle c=new Circle();
    	  c.setRadius(4);
    	  c.getRadius();
    	  System.out.println("Area of circle is :"+c.Area());
    	  System.out.println("Circumference of the circle : "+c.Circumference());
      }
}
