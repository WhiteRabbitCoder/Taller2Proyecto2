package tallerlenguajes.proyecto2.Modelos.Entities.DAO;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tallerlenguajes.proyecto2.Modelos.Entities.Cliente;

import java.util.List;

@Repository
public class ClienteDAOImp implements IClienteDAO{
    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    @Override
    public List<Cliente> findAll() {
        return em.createQuery("from Cliente").getResultList();
    }

}
