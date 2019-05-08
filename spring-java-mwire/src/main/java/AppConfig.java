import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.otirdamas.repository.CustomerRepository;
import com.otirdamas.repository.HibernateCustomerRepositoryImpl;
import com.otirdamas.service.CustomerService;
import com.otirdamas.service.CustomerServiceImpl;

@Configuration
public class AppConfig {

	@Bean(name="customerService")
	public CustomerService getCustomerService() {
		
//		for setter-injection
//		CustomerServiceImpl service = new CustomerServiceImpl();
//		service.setCustomerRepository(getCustomerRepository());
		
//		for constructor-injection
		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository()); 
		
		return service;
	}
	
	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}
	
}
