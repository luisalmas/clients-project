package io.github.luisalmas.clients.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clientsId;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(nullable = false, length = 9)
    private String nif;

    @Column
    private LocalDate dateRegistered;

}
