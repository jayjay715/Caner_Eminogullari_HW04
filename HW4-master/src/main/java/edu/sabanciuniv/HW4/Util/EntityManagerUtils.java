package edu.sabanciuniv.HW4.Util;

import javax.persistence.*;

public class EntityManagerUtils {

    static EntityManagerFactory emf = null;

    public static EntityManager getEntityManager(String persistenceUnitName){
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        }
        return emf.createEntityManager();
    }

    public static void closeEntityManager(EntityManager em){
        em.clear();
        em.close();
    }
}