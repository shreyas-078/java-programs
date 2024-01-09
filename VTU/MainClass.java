public class MainClass {
  public static void main(String[] args) {
    // Create an instance of the outer class
    Outer outer = new Outer();
    // Call the display method of the outer class
    outer.display();
    // Create an instance of the inner class using the outer class instance
    Outer.Inner inner = outer.new Inner();
    // Call the display method of the inner class
    inner.display();
  }
}

