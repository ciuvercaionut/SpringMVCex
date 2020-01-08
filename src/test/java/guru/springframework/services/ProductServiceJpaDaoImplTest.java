package guru.springframework.services;


import guru.springframework.SpringmvcApplication;
import guru.springframework.config.JpaIntegrationConfig;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = JpaIntegrationConfig.class)
public class ProductServiceJpaDaoImplTest {
}
