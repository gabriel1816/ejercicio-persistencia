package org.example.persistenciapractica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import org.example.persistenciapractica.Persistente.Persistente;

@Entity
@Table(name="tag")
@NoArgsConstructor
public class Tag extends Persistente {
    @Column
    private String nombre;
}
