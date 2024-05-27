package org.example.persistenciapractica.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("comentario")
@NoArgsConstructor
public class LikeComentario extends Like {

    @ManyToOne
    private Comentario comentario;
}
