package io.github.luisalmas.clients.model.repository;

import io.github.luisalmas.clients.model.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Integer> {

}
