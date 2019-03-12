package br.com.sta.crud.todo.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import lombok.Getter;

/**
 *
 * @author jonat_000
 */
public class ManagerFactory {
    
    @Getter
    private final EntityManager entityManager;
    private static ManagerFactory instance = null;
    
    private ManagerFactory() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        entityManager = emf.createEntityManager();
    }
    
    public static ManagerFactory getInstance() {
        if (instance == null) {
            instance = new ManagerFactory();
        }
        
        return instance;
    }
    
}
