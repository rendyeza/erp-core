package id.nexbyte.erp.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ErpCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpCoreApplication.class, args);
	}

}
