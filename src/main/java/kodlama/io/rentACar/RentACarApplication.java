package kodlama.io.rentACar;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RentACarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentACarApplication.class, args);
	}
    
	@Bean // uygullama oluşur oluşma bir modelmapper manager için bir modelmapper nesnesi  oluşturulcak.
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}
