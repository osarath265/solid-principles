package solid.liskov;

public class StudentImpl implements Student{
    public String name;
    public int age;
    public float marks;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
