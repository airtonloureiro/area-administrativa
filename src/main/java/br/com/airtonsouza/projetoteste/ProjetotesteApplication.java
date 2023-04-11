package br.com.airtonsouza.projetoteste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("br.com.airtonsouza.*")
@ComponentScan(basePackages = { "br.com.airtonsouza.*"})
@EntityScan("br.com.airtonsouza.*")
@SpringBootApplication
public class ProjetotesteApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProjetotesteApplication.class, args);
	}

}
