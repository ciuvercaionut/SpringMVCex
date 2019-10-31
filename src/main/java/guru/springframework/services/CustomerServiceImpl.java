package guru.springframework.services;

import guru.springframework.domain.Customer;
import guru.springframework.domain.DomainObject;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CustomerServiceImpl extends AbstractMapService implements CustomerService{

    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public Customer getById(Integer id) {
        return (Customer) super.getById(id);
    }

    @Override
    public Customer saveOrUpdate(Customer domainObject) {
        return (Customer) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }


    @Override
    public void loadDomainObjects() {
       domainMap = new HashMap<>();

       Customer customer1 = new Customer();
       customer1.setId(1);
       customer1.setFirstName("Michael");
       customer1.setLastName("Weston");
       customer1.setAddressLine1("1 Main St");
       customer1.setCity("Miami");
       customer1.setState("Florida");
       customer1.setZipCode("33101");
       customer1.setEmail("michael@burnnotice.com");
       customer1.setPhoneNumber("305.333.0101");

       domainMap.put(1, customer1);

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setFirstName("Fiona");
        customer2.setLastName("Gleanne");
        customer2.setAddressLine1("1 Key Biscane Ave");
        customer2.setCity("Miami");
        customer2.setState("Florida");
        customer2.setZipCode("33202");
        customer2.setEmail("fionna@burnnotice.com");
        customer2.setPhoneNumber("305.333.0101");

        domainMap.put(2, customer2);

        Customer customer3 = new Customer();
        customer3.setId(3);
        customer3.setFirstName("Sam");
        customer3.setLastName("Axe");
        customer3.setAddressLine1("1 Little Cuba Road");
        customer3.setCity("Dallas");
        customer3.setState("Texas");
        customer3.setZipCode("42312");
        customer3.setEmail("samaxe@burnnotice.com");
        customer3.setPhoneNumber("305.444.2312");

        domainMap.put(3, customer3);

        Customer customer4 = new Customer();
        customer4.setId(4);
        customer4.setFirstName("Michael");
        customer4.setLastName("Weston");
        customer4.setAddressLine1("1 Main St");
        customer4.setCity("Miami");
        customer4.setState("Florida");
        customer4.setEmail("michael@burnnotice.com");
        customer4.setPhoneNumber("305.333.0101");

        domainMap.put(4, customer4);
    }
}
