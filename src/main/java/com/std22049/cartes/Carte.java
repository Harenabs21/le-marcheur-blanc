package com.std22049.cartes;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Carte {
    private List<Lieu> lieux;
    private List<Rue> rues;

    public Carte(){
        this.lieux = new ArrayList<>();
        this.rues = new ArrayList<>();
    }
    public void ajouterLieu(Lieu lieu) {
        lieux.add(lieu);
    }

    public void ajouterRue(Rue rue) {
        rues.add(rue);
        rue.getPremierLieu().ajouterRue(rue);
        rue.getDeuxiemeLieu().ajouterRue(rue);
    }

    public List<Rue> obtenirRuesDisponible(Lieu lieu) {
        List<Rue> result = new ArrayList<>();
        for (Rue rue : rues) {
            if (rue.getPremierLieu().equals(lieu) || rue.getDeuxiemeLieu().equals(lieu)) {
                result.add(rue);
            }
        }
        return result;
    }
}
