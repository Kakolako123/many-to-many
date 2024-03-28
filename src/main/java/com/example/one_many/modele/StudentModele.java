package com.example.one_many.modele;

import jakarta.persistence.*;

import java.util.List;

@Table(name="student")
@Entity
public class StudentModele {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String nom;
    private String prenom;
    private String niveau;

    public List<StudentModele> getStudents() {
        return students;
    }

    public void setStudents(List<StudentModele> students) {
        this.students = students;
    }

    @ManyToMany(mappedBy = "examen")
    private List<StudentModele> students;


    public StudentModele() {
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}
