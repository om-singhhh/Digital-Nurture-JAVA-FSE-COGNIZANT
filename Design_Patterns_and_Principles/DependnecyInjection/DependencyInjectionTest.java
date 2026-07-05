package Design_Patterns_and_Principles.DependnecyInjection;

public class DependencyInjectionTest {

    public static void main(String[] args) {

        // Create Repository Object
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject Repository into Service
        CustomerService service = new CustomerService(repository);

        // Use Service
        service.getCustomer(101);

    }
}