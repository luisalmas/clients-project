package io.github.luisalmas.clients.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer servicesId;

    @Column(nullable = false, length = 255)
    private String description;

    @ManyToOne
    @JoinColumn(name = "clients_id")
    private Client client;

    @Column
    private BigDecimal cost;
}
