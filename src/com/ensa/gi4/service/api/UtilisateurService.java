package com.ensa.gi4.service.api;

import com.ensa.gi4.modele.Utilisateur;

public interface UtilisateurService {


    Utilisateur chercherUtilisateur(String username, String password);
}
