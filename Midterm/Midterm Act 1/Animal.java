public class Animal
{  
   private int lifeExpectancy;
   private int weight;
   private char gender;
   private String name;
   public String type;
   
   public Animal(int lifeExpectancy, int weight, char gender, String name, String type)
   {
      this.lifeExpectancy = lifeExpectancy;
      this.weight = weight;
      this.gender = gender;
      this.name = name;
      this.type = type;
   }
   
   public void PrintValues()
   {
      String sex = "";
      switch(gender)
      {
         case 'M':
            sex = "male"; break;
         case 'F':
            sex = "female"; break;
         case 'N':
            sex = "neutered male"; break;
         case 'S':
            sex = "spayed female"; break;
            
      }
      
      System.out.print("A " + sex + " " + type + " named " + name + 
                       " should live to be " + lifeExpectancy + " years and weigh " +
                       weight + " pounds.");
   } 
}