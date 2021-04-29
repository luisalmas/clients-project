package io.github.luisalmas.clients.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Builder
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clientsId;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(nullable = false, length = 9)
    private String nif;

    @Column(name = "date_registered")
    private LocalDate dateRegistered;

    @PrePersist
    public void prePresist(){
        setDateRegistered(LocalDate.now());
    }

}
