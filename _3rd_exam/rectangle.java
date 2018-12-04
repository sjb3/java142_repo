public class Rectangle {
  private double width;
  private double height;

  public Rectangle() {
    width = 1;
    height = 1;
  }
  public Rectangle(double w, double h) {
    width = w;
    height = h;
  }
  public double getWidth() {
    return width;
  }
  public double getHeight() {
    return height;
  }
  public double getArea() {
    return (width * height);
  }
  public double getPerimeter() {
    return 2*(width + height);
  }
  public String toString() {
    return (.....);
  }
  public boolean equals(Object o) {
    // if(o instanceof Rectangle) {
    //   Rectangle other = Rectangle o;
    //   return width == other.width && height == other.height;
    // } else {
    //   return false;
    // }

    if(this.width == rect.width && this.height == rect.height){
      return true;
    } else {
      return false;
    }
  }
}

public class MainRectangle {
  public static void main(String[] args) {
    Rectangle rect1 = new Rectangle(6, 20);
    Rectangle rect2 = new Rectangle(2.5, 3.9);

    System.out.println("The width is " + rect1.getWidth() + " The height is " + rect1.getHeight() + " . ");
  }
}