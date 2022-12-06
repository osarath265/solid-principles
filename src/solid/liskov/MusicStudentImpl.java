package solid.liskov;

public class MusicStudentImpl implements Student{
    public String name;
    public int age;
    public String instrument;


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setInstrument(String instrument){
        this.instrument = instrument;
    }
}
