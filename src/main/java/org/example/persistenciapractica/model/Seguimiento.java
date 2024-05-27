package org.example.persistenciapractica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.persistenciapractica.Persistente.Persistente;

import java.time.LocalDateTime;
@Entity
@Getter
@Setter
@Table(name = "consumidor")
@NoArgsConstructor
public class Seguimiento extends Persistente {
    @Column(name = "fecha_seguimiento")
    private LocalDateTime fechaSeguimiento;


    @ManyToOne
    private Perfil seguidor;

    @ManyToOne
    private Perfil seguido;
}
