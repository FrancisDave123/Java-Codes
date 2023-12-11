class TestShape
{
   public static void main(String args[])
   {
      
      Shape square1 = new Square(5);
      System.out.println(square1.toString());
      Shape square2 = new Square(10);
      System.out.println(square2.toString());
      if(square1.equals(square2))
         System.out.println("Square 1 is equals to Square 2");
      else
         System.out.println("They are not equal\n");
      
      Cube cube = new Cube(5);
      System.out.println("The area of cube is: " + cube.getArea() +
                         "\nand the volume is: " + cube.getVolume() + "\n");
      
      Shape circle1 = new Circle(5);
      System.out.println(circle1.toString());
      Shape circle2 = new Circle(2);
      System.out.println(circle2.toString());
      if(circle1.equals(circle2))
         System.out.println("Circle 1 is equals to circle 2");
      else
         System.out.println("They are not equal\n");
         
         
      Sphere sphere1 = new Sphere(5); 
      System.out.println(sphere1.toString());  
      Sphere sphere2 = new Sphere(15); 
      System.out.println(sphere2.toString());    
      if(sphere1.equals(sphere2))
         System.out.println("sphere 1 is equals to sphere 2");
      else
         System.out.println("They are not equal\n");   
      
      Cylinder cylinder1 = new Cylinder(5,5);
      System.out.println(cylinder1.toString());
      Cylinder cylinder2 = new Cylinder(1,2);
      System.out.println(cylinder2.toString());
      if(cylinder1.equals(cylinder2))
         System.out.println("cylinder 1 is equals to cylinder 2");
      else
         System.out.println("They are not equal\n"); 
      
      
      
   }
}