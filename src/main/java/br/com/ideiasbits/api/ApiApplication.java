package br.com.ideiasbits.api;

import br.com.ideiasbits.api.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);

		//User user = new User(1, "Marcos Carvalho", "marcos@mail.com", "123");
	}

}
