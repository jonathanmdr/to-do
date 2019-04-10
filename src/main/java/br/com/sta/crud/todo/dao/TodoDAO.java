package br.com.sta.crud.todo.dao;

import br.com.sta.crud.todo.model.Todo;
import br.com.sta.crud.todo.factory.ManagerFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * Classe responsável pela comunicação com a base de dados realizando as operações CRUD.
 * @author Jonathan H. Medeiros
 */
public class TodoDAO {
    
    private final EntityManager entityManager;
    private final String TODO;

    /**
     * Método responsável por injetar as dependências necessárias da classe.
     * @author Jonathan H. Medeiros
     */
    public TodoDAO() {
        this.entityManager = ManagerFactory.getInstance().getEntityManager();
        this.TODO = Todo.class.getName();
    }
    
    /**
     * Método responsável por realizar consulta por ID.
     * @param id - ID do todo pesquisado.
     * @return model todo.
     * @author Jonathan H. Medeiros
     */
    public Todo findById(Long id) {
        Query query = entityManager.createQuery("From ".concat(TODO).concat(" Where id = ?1"));
        query.setParameter(1, id);
        return (Todo) query.getSingleResult();
    }
    
    /**
     * Método responsável por realizar a busca de todos os todo's.
     * @return - Lista de todo's.
     * @author Jonathan H. Medeiros
     */
    public List<Todo> findAll() {
        Query query = entityManager.createQuery("From ".concat(TODO));
        return (List<Todo>) query.getResultList();
    }

    /**
     * Método responsável por salvar um todo.
     * @param todo - model todo
     * @author Jonathan H. Medeiros
     */
    public void save(Todo todo) {
        entityManager.getTransaction().begin();
        entityManager.persist(todo);
        entityManager.getTransaction().commit();
    }
    
    /**
     * Método responsável por atualizar um todo.
     * @param todo - model todo
     * @author Jonathan H. Medeiros
     */
    public void update(Todo todo) {
        entityManager.getTransaction().begin();
        entityManager.merge(todo);
        entityManager.getTransaction().commit();
    }

    /**
     * Método responsável por excluir um todo.
     * @param todo - model todo
     * @author Jonathan H. Medeiros
     */
    public void delete(Todo todo) {
        entityManager.getTransaction().begin();
        entityManager.remove(todo);
        entityManager.getTransaction().commit();
    }
    
}
