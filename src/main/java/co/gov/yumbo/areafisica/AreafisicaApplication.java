package co.gov.yumbo.areafisica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "co.gov.yumbo")
public class AreafisicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AreafisicaApplication.class, args);
	}
}
