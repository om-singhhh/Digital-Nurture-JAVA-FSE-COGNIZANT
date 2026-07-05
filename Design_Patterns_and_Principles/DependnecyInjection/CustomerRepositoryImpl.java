package Design_Patterns_and_Principles.DependnecyInjection;

// Concrete Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        return "Customer ID : " + id + " | Name : Om Singh";
    }
}