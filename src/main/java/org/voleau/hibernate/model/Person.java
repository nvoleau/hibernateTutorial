package org.voleau.hibernate.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person
{
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer id;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private String nom;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    private String prenom;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
