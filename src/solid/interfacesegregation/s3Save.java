package solid.interfacesegregation;


// here s3Save interface need not
public interface s3Save extends afterSegregateSave{
    public void connectToS3();

}
