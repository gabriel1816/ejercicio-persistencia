package org.example.persistenciapractica.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class CalculadorPublicacionesLikes implements CalculadorDeInteres {
    private int ponderacionLikes;
    private int ponderacionPublicacion;

    @Override
    public BigDecimal calcularInteres(Perfil perfil, List<Like> likes) {
        return null;
    }
}
