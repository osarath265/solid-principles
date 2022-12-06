package solid.di;

public class Service {
    private Repo repository;

    // Here the dependency repository is not depending on any concrete class instead its dependent on an abstraction
    // Here service can be instantiated with either of two repos available

    public Service(Repo repository){
        this.repository = repository;
    }
}
