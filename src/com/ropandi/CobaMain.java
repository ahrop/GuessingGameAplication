/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ropandi;

import com.ropandi.model.Category;
import com.ropandi.model.WordModel;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class CobaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GuessingGameApplicationV2PU");
        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        Category hewan = new Category();
//        hewan.setCategoryName("Hewan");
//        WordModel model = new WordModel();
//        model.setKataDasar("Sapi");
//        model.setHint("Hewan yang dagingya enak");
//        em.persist(hewan);
//        model.setCategory(hewan);
//        em.persist(model);
//        em.getTransaction().commit();
//        List<Category> object = em.createQuery("Select c from Category c").getResultList();
List<Category> object = em.createQuery("Select c from Category c").getResultList();
    for (Category wordModel : object) {
//        modelCombo.addElement(wordModel.getCategoryName());
        System.out.println(wordModel.getCategoryName());
//        modelCombo.getSelectedItem();
      
    }
      em.close();
        emf.close();
    }  
}
