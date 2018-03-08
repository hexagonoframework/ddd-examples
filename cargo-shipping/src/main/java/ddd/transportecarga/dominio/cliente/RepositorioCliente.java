package ddd.transportecarga.dominio.cliente;

public interface RepositorioCliente {

    Cliente buscarPorClienteId(ClienteId id);
    
}
