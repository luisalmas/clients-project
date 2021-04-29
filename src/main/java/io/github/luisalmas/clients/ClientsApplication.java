package io.github.luisalmas.clients;

import io.github.luisalmas.clients.model.entity.Client;
import io.github.luisalmas.clients.model.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientsApplication {

    @Bean
    public CommandLineRunner run(@Autowired ClientRepository repository){
        return args -> {
            Client client = Client.builder()
                    .name("Pedro")
                    .nif("359647589")
                    .build();
            repository.save(client);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientsApplication.class, args);
    }

}
