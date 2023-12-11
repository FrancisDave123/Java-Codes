public class Pet extends Animal
{
   private String home;
   private boolean bites;
   
   public Pet(int lifeExpectancy, int weight, char gender, String name, String type, String home, boolean bites)
   {
      super(lifeExpectancy, weight, gender, name, type);
      this.home = home;
      this.bites = bites;
   }
   
   public void PrintValues()
   {
      super.PrintValues();
      
      String bite;
      
      if(!bites)
         bite = "does not";
      else
         bite = "does";
         
      System.out.print("\nYour " + super.type + " lives " + home + " and " + bite + " bite.");
   } 
}