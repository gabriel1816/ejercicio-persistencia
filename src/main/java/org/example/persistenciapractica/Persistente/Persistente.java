package org.example.persistenciapractica.Persistente;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@MappedSuperclass
public abstract class Persistente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "esta_activo")
    private boolean estaActivo;
}
