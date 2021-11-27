package com.practice.domain;

import javax.persistence.*;

@Entity
public class Xerador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String lastName;

    @ManyToOne
   private Saco saco;

    public Xerador() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "xerador{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Xerador xerador = (Xerador) o;

        return id.equals(xerador.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
