package org.example.persistenciapractica.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.persistenciapractica.Persistente.Persistente;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "like_perfil")
@DiscriminatorColumn(name = "tipo_like")
@NoArgsConstructor
public class Like extends Persistente {
    @Column(name="fecha_megusta")
    private LocalDateTime fechaMeGusta;

    @ManyToOne
    private Perfil likeador;

    @Column
    private Boolean activo;
}
