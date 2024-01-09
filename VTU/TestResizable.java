// Define the Resizable interface
interface Resizable {
  void resizeWidth(int width);
  void resizeHeight(int height);
}

// Implement the Resizable interface in the Rectangle class
class Rectangle implements Resizable {

  private int width;
  private int height;

  // Constructor
  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  // Implement resizeWidth method
  @Override
  public void resizeWidth(int width) {
    this.width = width;
    System.out.println("Width resized to: " + width);
  }
  // Implement resizeHeight method
  @Override
  public void resizeHeight(int height) {
    this.height = height;
    System.out.println("Height resized to: " + height);
  }
  // Display the current dimensions of the rectangle
  public void displayDimensions() {
    System.out.println("Rectangle Dimensions - Width: " + width + ", Height: " + height);
  }
}

public class TestResizable {
  public static void main(String[] args) {
    // Create an instance of Rectangle
    Rectangle rectangle = new Rectangle(10, 5);
    // Display the initial dimensions
    System.out.println("Initial Dimensions:");
    rectangle.displayDimensions();
    // Resize the width and height
    rectangle.resizeWidth(15);
    rectangle.resizeHeight(8);
    // Display the dimensions after resizing
    System.out.println("\nDimensions After Resizing:");
    rectangle.displayDimensions();
  }
}
