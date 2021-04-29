package io.github.luisalmas.clients.model.repository;

import io.github.luisalmas.clients.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
