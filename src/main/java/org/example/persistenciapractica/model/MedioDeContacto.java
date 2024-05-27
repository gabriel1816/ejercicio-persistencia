package org.example.persistenciapractica.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.persistenciapractica.Persistente.Persistente;

@Entity
@Getter
@Setter
@Table(name = "medio_de_contacto")
@NoArgsConstructor
public class MedioDeContacto extends Persistente {
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_contacto")
    private TipoContacto tipo;

    @Column
    private String valor;
}
