package org.example.persistenciapractica.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.persistenciapractica.Persistente.Persistente;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Perfil")
@Getter
@Setter
@NoArgsConstructor
public class Usuario extends Persistente {
    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @OneToMany
    @JoinColumn(name = "usuario_id")
    private List<MedioDeContacto> emails;

    @Column
    private String contrasenia;

    @Column
    private LocalDateTime fechaRegistro;
}
