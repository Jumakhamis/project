package kilimani.project.Model;

import jakarta.persistence.Entity;

@Entity
public class Customer {
    private Long customerId;
    private String customerName;
    private String customerEmail;

}
