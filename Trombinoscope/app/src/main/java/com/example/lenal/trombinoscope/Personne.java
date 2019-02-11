package com.example.lenal.trombinoscope;

/**
 * Created by lenal on 11/02/2019.
 */

public class Personne {
    private String nom;
    private String prenom;
    public int couleur=000000;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void setCouleur(int couleur){
        this.couleur = couleur;
    }

    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public int getCouleur(){
        return couleur;
    }

    public Personne getPersonne(){
        return this;
    }
}



