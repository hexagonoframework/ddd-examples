package ddd.transportecarga.dominio.transporte;

import java.util.UUID;

public class RastreamentoId {

    private final UUID valor;

    public RastreamentoId() {
        this(UUID.randomUUID());
    }

    public RastreamentoId(UUID valor) {
        this.valor = valor;
    }

    public UUID getValor() {
        return valor;
    }
}
