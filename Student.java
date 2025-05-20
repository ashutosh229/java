public class Student {
   public String name;
   public int id;
   public String className;

   Student(String name, int id, String className) {
      this.name = name;
      this.id = id;
      this.className = className;
   }

   public String getInformation() {
      String information = "Name: " + name + "\n" + "Class: " + className + "\n" + "ID: " + id;
      return information;
   }

   public static void main(String[] args) {
      Student student1 = new Student("Ashutosh", 12340390, "DSAI");
      System.out.println(student1.getInformation());
   }

}
