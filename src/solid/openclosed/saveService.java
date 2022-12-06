package solid.openclosed;


// Here the class is closed for modification but open for extension
public class saveService implements saveInterface{
    @Override
    public String saveToS3(Object s) {
        //implementation detail
        return null;
    }
    @Override
    public Object saveToDataBase(Object s) {
        //implementation detail
        return null;
    }

    // Extended method
    public Object saveToH2(Object s){
        //implementation detail
        return null;
    }
}
