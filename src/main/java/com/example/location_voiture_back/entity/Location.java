package com.example.location_voiture_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom_location;

    private String design_voiture;

    private int nbr_jours;

    private double taux;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_location() {
        return nom_location;
    }

    public void setNom_location(String nom_location) {
        this.nom_location = nom_location;
    }

    public String getDesign_voiture() {
        return design_voiture;
    }

    public void setDesign_voiture(String design_voiture) {
        this.design_voiture = design_voiture;
    }

    public int getNbr_jours() {
        return nbr_jours;
    }

    public void setNbr_jours(int nbr_jours) {
        this.nbr_jours = nbr_jours;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public double getMontant() {
        return taux*nbr_jours;
    }
}
