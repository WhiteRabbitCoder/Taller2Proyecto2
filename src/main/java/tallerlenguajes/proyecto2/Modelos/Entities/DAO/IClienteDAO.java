package tallerlenguajes.proyecto2.Modelos.Entities.DAO;

import tallerlenguajes.proyecto2.Modelos.Entities.Cliente;

import java.util.List;

public interface IClienteDAO {
    public List<Cliente> findAll();
}
