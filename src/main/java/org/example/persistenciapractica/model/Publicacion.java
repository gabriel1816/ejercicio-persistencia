package org.example.persistenciapractica.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.persistenciapractica.Persistente.Persistente;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "publicacion")
public class Publicacion extends Persistente {
    @Column
    private String contenido;

    @Column(name = "fecha_publicacion")
    private LocalDateTime fechaPublicacion;

    @Column
    private String ubicacion;

    @ManyToOne
    @JoinColumn(name = "Perfil", referencedColumnName = "id")
    private Perfil perfil;

    @Column
    @OneToMany(mappedBy="publicacion")
    private List<Comentario> comentarios;

    @Column(name = "estado_publicacion")
    @Enumerated(EnumType.STRING)
    private EstadoPublicacion estadoPublicacion;

    @Column
    @ManyToMany
    private List<Tag> tags;
}
