package io.github.luisalmas.clients.rest;

import io.github.luisalmas.clients.model.entity.Client;
import io.github.luisalmas.clients.model.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(Client client){
        return repository.save(client);
    }

}
