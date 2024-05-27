package org.example.persistenciapractica.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.persistenciapractica.Persistente.Persistente;

import java.util.List;
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Perfil extends Persistente {
    @Column
    private String sitioWeb;

    @Column
    private String ubicacion;

    @Column
    private String urlFotoPerfil;

    @OneToOne
    @JoinColumn(name = "usuario", referencedColumnName = "nombre_usuario")
    private Usuario usuario;

    @OneToMany(mappedBy = "perfil")
    private List<Publicacion> publicaciones;

    @ManyToMany
    @JoinTable(
            name = "Perfil_Seguidores",
            joinColumns = @JoinColumn(name = "seguidor_id"),
            inverseJoinColumns = @JoinColumn(name = "perfil_id")
    )
    private List<Perfil> seguidores;

}
