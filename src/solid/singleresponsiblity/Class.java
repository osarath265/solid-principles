package solid.singleresponsiblity;

import java.util.ArrayList;
import java.util.List;

// Here Class and Student classes have roles based on the actions they are performing
// Student class is solely used for student creation where Class is used for maintaing Students

public class Class  {
    private List<Student> students;

    public Class() {
        this.students = new ArrayList<>();
    }
    public Class(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student newStudent){
        this.students.add(newStudent);
    }

    public void removeStudent(Student student){
        this.students.remove(student);
    }



}
