public class myPoint 
{
  private int x;
  private int y;
  // Default constructor
  public myPoint() 
  {
    this.x = 0;
    this.y = 0;
  }
  // Overloaded constructor
  public myPoint(int x, int y) 
  {
    this.x = x;
    this.y = y;
  }
  // Method to set both x and y
  public void setXY(int x, int y) 
  {
    this.x = x;
    this.y = y;
  }
  // Method to get x and y in a 2-element int array
  public int[] getXY() 
  {
    return new int[]{x, y};
  }
  // Method to get a string description of the instance @Override
  public String toString() 
  {
    return "(" + x + ", " + y + ")";
  }
  // Method to calculate the distance to another point at (x, y)
  public double distance(int x, int y) 
  {
    int xDiff = this.x - x;
    int yDiff = this.y - y;
    return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
  }
  // Overloaded method to calculate the distance to another MyPoint
  public double distance(myPoint another) 
  {
    int xDiff = this.x - another.x;
    int yDiff = this.y - another.y;
    return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
  }
  // Another overloaded method to calculate the distance to the origin (0, 0)
  public double distance() 
  {
    return Math.sqrt(x * x + y * y);
  }
}