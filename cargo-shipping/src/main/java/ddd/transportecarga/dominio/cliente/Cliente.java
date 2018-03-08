package ddd.transportecarga.dominio.cliente;

public class Cliente {

    private final ClienteId id;
    
    public Cliente(ClienteId id) {
        this.id = id;
    }
    
    public ClienteId getId() {
        return id;
    }
    
}
