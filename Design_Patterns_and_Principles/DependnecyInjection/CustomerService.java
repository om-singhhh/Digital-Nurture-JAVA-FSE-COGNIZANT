package Design_Patterns_and_Principles.DependnecyInjection;

// Service Class
public class CustomerService {

    // Dependency
    private CustomerRepository customerRepository;

    // Constructor Injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void getCustomer(int id) {

        String customer = customerRepository.findCustomerById(id);

        System.out.println(customer);
    }
}