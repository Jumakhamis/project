package kilimani.project.Controller;

import kilimani.project.Model.Customer;
import kilimani.project.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customers")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/customers")
    public List<Customer> fetchCustomerList(){
        return customerService.fetchCostomerlist();
    }

    @GetMapping("/customers{id}")
    public Customer fetchCustomerById(@PathVariable("id") Long customerId){
        return customerService.fetchCostomerById(customerId);
    }
}
