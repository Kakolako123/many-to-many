package com.example.one_many.modele;

import jakarta.persistence.*;
import java.util.*;
@Table(name = "courses")
@Entity
public class CourseModele {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private int nbHeur;
    @ManyToMany(mappedBy = "examen")
    private List<CourseModele> courses;

    public List<CourseModele> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseModele> courses) {
        this.courses = courses;
    }

    public CourseModele() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHeur() {
        return nbHeur;
    }

    public void setNbHeur(int nbHeur) {
        this.nbHeur = nbHeur;
    }
}
