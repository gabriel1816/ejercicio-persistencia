package org.example.persistenciapractica.model;

import java.math.BigDecimal;
import java.util.List;

public interface CalculadorDeInteres {
    BigDecimal calcularInteres(Perfil perfil, List<Like> likes);
}
