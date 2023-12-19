public class TestShapes {
  public static void main(String[] args) {
    // Create an array of Shape objects
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle();
    shapes[1] = new Triangle();
    shapes[2] = new Square();
    // Demonstrate polymorphism
    for (Shape shape : shapes) 
    {
      shape.draw();
      shape.erase();
      System.out.println(); // Add a newline for clarity
    }
  }
}