class Shape 
{
  // Member functions
  public void draw() 
  {
    System.out.println("Drawing a shape");
  }
  public void erase() 
  {
    System.out.println("Erasing a shape");
  }
}

class Circle extends Shape 
{
  // Override draw method for Circle 
  @Override
  public void draw() 
  {
    System.out.println("Drawing a circle");
  }
  // Override erase method for Circle
  @Override
  public void erase() 
  {
    System.out.println("Erasing a circle");
  }
}

class Triangle extends Shape 
{
  // Override draw method for Triangle
  @Override
  public void draw()
  {
    System.out.println("Drawing a triangle");
  }
  // Override erase method for Triangle
  @Override
  public void erase() 
  {
    System.out.println("Erasing a triangle");
  }
}

class Square extends Shape 
{
  // Override draw method for Square
  @Override
  public void draw() 
  {
  System.out.println("Drawing a square");
  }
  // Override erase method for Square
  @Override
  public void erase() 
  {
  System.out.println("Erasing a square");
  }
}
