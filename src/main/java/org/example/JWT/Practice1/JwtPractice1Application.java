package org.example.JWT.Practice1;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Library APIS", version = "1.0", description = "JWT Practice"))
public class JwtPractice1Application {

	public static void main(String[] args) {
		SpringApplication.run(JwtPractice1Application.class, args);
	}

}
