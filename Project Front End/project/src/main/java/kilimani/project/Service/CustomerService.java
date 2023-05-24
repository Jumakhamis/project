package kilimani.project.Service;

import kilimani.project.Model.Customer;

import java.util.List;

public interface CustomerService {
   public Customer saveCustomer(Customer customer);

  public List<Customer> fetchCostomerlist();

   public Customer fetchCostomerById(Long customerId);
}
