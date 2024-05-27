package org.example.persistenciapractica.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("publicacion")
@NoArgsConstructor
public class LikePublicacion extends Like {
    @ManyToOne
    private Publicacion publicacion;

    @Column
    private String motivo;
}
