package com.ensa.gi4.service.impl;

import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;
import org.springframework.beans.factory.SmartInitializingSingleton;

import java.util.ArrayList;

public class GestionLivreServiceImpl implements GestionMaterielService, SmartInitializingSingleton {
    @Override
    public void init() {
        System.out.println("inititialisation du service");
    }

    @Override
    public void listerMateriel() {
        System.out.println("Liste de matériel :\n 3 Livres \n 4 chaises");
    }

    @Override
    public void ajouterNouveauMateriel(String materielName, String materielType, String materielCode) {

    }

    @Override
    public void supprimerMateriel(String materielName, String materielCode) {

    }

    @Override
    public Materiel chercherMateriel(String code) {
     return null;
    }

    @Override
    public void modifierMateriel(String materielCode,String materielName,String materielType,String materielAvailable) {

    }

    @Override
    public void modifierAvailable(String materielCode,String materielEtat) {

    }


/*    @Override
    public void ajouterNouveauMateriel(Materiel materiel) {

        System.out.println("L'ajout du matériel " + materiel.getName() + " effectué avec succès !");
    } */

    @Override
    public void afterSingletonsInstantiated() {
       // System.out.println("toto");

    }
}
