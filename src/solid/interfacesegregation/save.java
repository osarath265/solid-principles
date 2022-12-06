package solid.interfacesegregation;


//before interface segregation
public interface save {
    public void connectToDB();
    public void connectToS3();
    public void save();
}
