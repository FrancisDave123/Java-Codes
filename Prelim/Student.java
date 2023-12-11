public class Student
{
   private int idNum;
   private String lastname;
   private String firstname;
   private String course;
   private double finalGrade;
   
   public Student(int idNum, String lastname, String firstname, String course, double finalGrade)
   {
      this.idNum = idNum;
      this.lastname = lastname;
      this.firstname = firstname;
      this.course = course;
      this.finalGrade = finalGrade;
   }
   
   public int getIdNum()
   {
      return idNum;
   }
   public String getLname()
   {
      return lastname;
   }
   public String getFname()
   {
      return firstname;
   }
   public String getCourse()
   {
      return course;
   }
   public double getFgrade()
   {
      return finalGrade;
   }
}