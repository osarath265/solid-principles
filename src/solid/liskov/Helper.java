package solid.liskov;

public class Helper {
   public void createStudent(){
       // Subclass object is  assignable to super class object
       Student newStudent = new MusicStudentImpl();
       newStudent.setName("Krishna");
       System.out.println(newStudent.getName());
   }
}
