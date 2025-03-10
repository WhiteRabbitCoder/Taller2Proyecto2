package tallerlenguajes.proyecto2.Modelos.Entities.DAO;

import tallerlenguajes.proyecto2.Modelos.Entities.Cliente;

import java.util.List;

public interface IClienteDAO {
    public List<Cliente> findAll();
    public List<Cliente> findById(Long id);
    public void save(Cliente cliente);
    public void delete(Long id);

}
