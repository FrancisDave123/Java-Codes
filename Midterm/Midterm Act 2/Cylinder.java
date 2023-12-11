class Cylinder extends Circle implements ThreeD
{
   private double height;
   
   public Cylinder(){}
   
   public Cylinder(double radius, double height)
   {
      super(radius);
      this.height = height;
   }  
   
   public void setRadius(double radius)
   {
      super.setRadius(radius);
   }
   
   public double getRadius()
   {
      return super.getRadius();
   }
   
   public void setHeight(double height)
   {
      this.height = height;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public double getArea()
   {
      return 2 * 3.14 * getRadius() * (getRadius() + height);
   }
   
   public double getVolume()
   {
      return super.getArea() * height;
   }
   
   public String toString()
   {
      return super.toString() + " Cylinder is " + getArea() + " and its volume is " + getVolume();
   }
   
   public boolean equals(Cylinder c)
   {
      return this.height == c.height;
   }
}