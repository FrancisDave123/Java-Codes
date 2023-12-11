class Cube extends Square implements ThreeD
{
   public Cube(){}
   
   public Cube(double side)
   {
      super(side);
   }
   
   public void setSide(double side)
   {
      super.setSide(side);
   }
   
   public double getSide()
   {
      return super.getSide();
   }
   
   public double getArea()
   {
      return 6 * (super.getArea());
   }
   
   public double getVolume()
   {
      return super.getSide() * super.getSide() * super.getSide();
   }
}