package br.com.sta.crud.todo.dao;

import br.com.sta.crud.todo.model.Todo;
import br.com.sta.crud.todo.factory.ManagerFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author jonat_000
 */
public class TodoDAO {
    
    private EntityManager entityManager;

    public TodoDAO() {
        this.entityManager = ManagerFactory.getInstance().getEntityManager();
    }
    
    public Todo findById(Long id) {
        Query query = entityManager.createQuery("From ".concat(Todo.class.getName()).concat(" Where id = ?1"));
        query.setParameter(1, id);
        return (Todo) query.getSingleResult();
    }
    
    public List<Todo> findAll() {
        Query query = entityManager.createQuery("From ".concat(Todo.class.getName()));
        return (List<Todo>) query.getResultList();
    }

    public void save(Todo todo) {
        entityManager.getTransaction().begin();
        entityManager.persist(todo);
        entityManager.getTransaction().commit();
    }
    
    public void update(Todo todo) {
        entityManager.getTransaction().begin();
        entityManager.merge(todo);
        entityManager.getTransaction().commit();
    }

    public void delete(Todo todo) {
        entityManager.getTransaction().begin();
        entityManager.remove(todo);
        entityManager.getTransaction().commit();
    }
    
}
