public interface Shape {
  public double getArea();
  public double getPerimeter();
  public boolean equals();
}

public class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }
  public double getArea() {
    return Math.PI * radius * radius;
  }
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }
  public boolean equals(double radius2) {
    if (this.radius == radius2) {
      return true;
    } else {
      return false;
    }
  }
}
public class Triangle implements Shape {
  private double a;
  private double b;
  private double c;

  public Triangle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  public double getArea() {
    double s = (a+b+c)/2.0;
    return Math.sqrt(s(s-a)*(s-b)*(s-c));
  }
  public double getPerimeter() {
    return a+b+c;
  }
  public boolean equals(double d, double e, double f) {
    if ((this.a == d && this.b == e && this.c == f) ||
       (this.a == d && this.c == f && this.b == e) ||
       (this.a == e && this.b == d && this.c == f) ||
       (this.a == e && this.b == f && this.c == d) ||
       (this.a == f && this.b == d && this.c == e) ||
       (this.a == f && this.b == e && this.c == d)) {
      return true;
    } else {
      return false;
    }
  }
}
public class Rectangle implements Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height){
    this.width = width;
    this.height = height;
  }
  public double getArea() {
    return width * height;
  }
  public double getPerimeter() {
    return 2.0*(width + height);
  }
  public boolean equals(double width2, double height2) {
    if ((this.width == width2) && (this.height == height2)) {
      return true;
    } else {
      return false;
    }
  }
}