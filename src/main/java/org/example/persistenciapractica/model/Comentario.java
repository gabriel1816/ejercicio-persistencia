package org.example.persistenciapractica.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.persistenciapractica.Persistente.Persistente;

import java.time.LocalDateTime;
@Setter
@Getter
@Entity
@Table
@NoArgsConstructor
public class Comentario extends Persistente {
    @Column
    private String texto;

    @Column(name = "fecha_comentario")
    private LocalDateTime fechaComentario;


    @ManyToOne
    @JoinColumn(name="perfil_id", referencedColumnName = "id")
    private Perfil comentador;

    @ManyToOne
    @JoinColumn(name="publicacion_id", referencedColumnName = "id")
    private Publicacion publicacion;

}
