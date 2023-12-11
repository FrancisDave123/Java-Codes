class Square extends Shape
{
   private double side;
   
   public Square(){}
   
   public Square(double side)
   {
      this.side = side;
   }
   
   public void setSide(double side)
   {
      this.side = side;
   }
   
   public double getSide()
   {
      return this.side;
   }
   
   public double getArea()
   {
      return side * side;
   }
   
   public String toString()
   {
      return super.toString() + "the shape Square is " + getArea();
   }
   
   public boolean equals(Square s)
   {
      return this.side == s.side;
   }
   
}