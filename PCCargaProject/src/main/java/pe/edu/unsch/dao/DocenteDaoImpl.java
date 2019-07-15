package pe.edu.unsch.dao;

import org.springframework.transaction.annotation.Transactional;

import pe.edu.unsch.entities.Docente;

import org.springframework.stereotype.Repository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
@Repository
public class DocenteDaoImpl implements DocenteDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Docente> listar() {
        return entityManager.createQuery("FROM Docente d").getResultList();
    }

}
