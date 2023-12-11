class Sphere extends Circle implements ThreeD
{
   public Sphere(){}
   
   public Sphere(double radius)
   {
      super(radius);
   }
   
   public void setRadius(double radius)
   {
      super.getRadius();
   }
   
   public double getRadius()
   {
      return super.getRadius();
   }
   
   public double getArea()
   {
      return 4 * super.getArea();
   }
   
   public double getVolume()
   {
      return (4/3) * 3.14 * (super.getRadius() * super.getRadius() * super.getRadius());
   }
   
   public String toString()
   {
      return "The area shape Sphere is " + super.getArea() + " and its volume is " + getVolume();
   }
   
   public boolean equals(Sphere s)
   {
      return super.getRadius() == s.getRadius();
   } 
   
}