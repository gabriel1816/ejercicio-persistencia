package org.example.persistenciapractica.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class CalculadorComentariosLikes implements CalculadorDeInteres {
    private int ponderacionComentarios;
    private int ponderacionLikes;

    @Override
    public BigDecimal calcularInteres(Perfil perfil, List<Like> likes) {
        return null;
    }
}
