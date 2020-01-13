package guru.springframework.bootsrap;

import guru.springframework.domain.Customer;
import guru.springframework.domain.Product;
import guru.springframework.services.CustomerService;
import guru.springframework.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;

@Component
public class SpringJPABootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private CustomerService customerService;
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        loadProducts();
        loadCustomers();
    }

    private void loadCustomers() {
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

        customerService.saveOrUpdate( customer1);

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

        customerService.saveOrUpdate(customer2);

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

        customerService.saveOrUpdate(customer3);

        Customer customer4 = new Customer();
        customer4.setId(4);
        customer4.setFirstName("Michael");
        customer4.setLastName("Weston");
        customer4.setAddressLine1("1 Main St");
        customer4.setCity("Miami");
        customer4.setState("Florida");
        customer4.setZipCode("432132");
        customer4.setEmail("michael@burnnotice.com");
        customer4.setPhoneNumber("305.333.0101");

        customerService.saveOrUpdate(customer4);
    }




    public void loadProducts(){

        Product product1 = new Product();
        product1.setDescription("Product 1");
        product1.setPrice(new BigDecimal("12.99"));
        product1.setImageUrl("http://example.com/product1");

        productService.saveOrUpdate(product1);

        Product product2 = new Product();
        product2.setDescription("Product 2");
        product2.setPrice(new BigDecimal("14.99"));
        product2.setImageUrl("http://example.com/product2");

        productService.saveOrUpdate(product2);

        Product product3 = new Product();
        product3.setDescription("Product 3");
        product3.setPrice(new BigDecimal("34.99"));
        product3.setImageUrl("http://example.com/product3");

        productService.saveOrUpdate(product3);

        Product product4 = new Product();
        product4.setDescription("Product 4");
        product4.setPrice(new BigDecimal("44.99"));
        product4.setImageUrl("http://example.com/product4");

        productService.saveOrUpdate(product4);
    }
}
