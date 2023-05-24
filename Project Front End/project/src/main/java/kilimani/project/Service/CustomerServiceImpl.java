package kilimani.project.Service;

import kilimani.project.Model.Customer;
import kilimani.project.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> fetchCostomerlist() {
        return customerRepository.findAll();
    }

    @Override
    public Customer fetchCostomerById(Long customerId) {
        return customerRepository.findById(customerId).get();
    }
}
