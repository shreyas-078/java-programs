public class TestMyPoint 
{
  public static void main(String[] args) 
  {
    // Create instances of MyPoint
    myPoint point1 = new myPoint();
    myPoint point2 = new myPoint(3, 4);
    // Display points
    System.out.println("Point 1: " + point1.toString());
    System.out.println("Point 2: " + point2.toString());
    // Set new coordinates for point1
    point1.setXY(1, 2);
    // Display updated point1
    System.out.println("Point 1 (after setXY): " + point1.toString());
    // Get coordinates of point1
    int[] coordinates = point1.getXY();
    System.out.println("Coordinates of Point 1: (" + coordinates[0] + ", " + coordinates[1] + ")");
    // Calculate distance between point1 and point2
    double distance1 = point1.distance(point2);
    System.out.println("Distance between Point 1 and Point 2: " + distance1);
    // Calculate distance of point1 to the origin
    double distance2 = point1.distance();
    System.out.println("Distance from Point 1 to the Origin: " + distance2);
  }
}