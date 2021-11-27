package com.practice.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Saco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String type;
    private int grams;

    @OneToMany(mappedBy = "saco")
    @JoinTable(name = "xerador_saco", joinColumns = @JoinColumn(name = "saco_id"),
    inverseJoinColumns = @JoinColumn(name = "xerador_id"))
    private Set<Xerador> xerador = new HashSet<>();

    public Saco() {
    }

    public Saco(Long id, String type, int grams, Set<Xerador> xerador) {
        this.id = id;
        this.type = type;
        this.grams = grams;
        this.xerador = xerador;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }

    public Set<Xerador> getXerador() {
        return xerador;
    }

    public void setXerador(Set<Xerador> xerador) {
        this.xerador = xerador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Saco saco = (Saco) o;

        return id.equals(saco.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Saco{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", grams=" + grams +
                ", xerador=" + xerador +
                '}';
    }
}
