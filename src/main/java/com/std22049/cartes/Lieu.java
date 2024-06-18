package com.std22049.cartes;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Lieu extends ElementCarte {

    private List<Rue> ruesConnectees;

    public Lieu(String nom){
        super(nom);
        this.ruesConnectees = new ArrayList<>();
    }

    public void ajouterRue(Rue rue) {
        ruesConnectees.add(rue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lieu lieu = (Lieu) o;
        return nom.equals(lieu.nom);
    }

    @Override
    public int hashCode() {
        return nom.hashCode();
    }
    
}
