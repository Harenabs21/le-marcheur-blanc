package com.std22049;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import java.util.Random;
import java.util.Set;

import com.std22049.cartes.Environnement;
import com.std22049.cartes.Lieu;
import com.std22049.cartes.Rue;

import lombok.Data;

@Data
public class Marcheur {
    private String nom;
    private Environnement environnement;
    private List<Lieu> lieuxDejaVisites;
    private Set<Lieu> lieuxConnus;
    
    public Marcheur(String nom, Environnement environnement){
        this.nom = nom;
        this.environnement = environnement;
        this.lieuxDejaVisites = new ArrayList<>();
        this.lieuxConnus = new HashSet<>();
    }

    public List<Lieu> marcherVersDestination(Lieu depart,Lieu destination){
        Random random = new Random();
        lieuxConnus.add(depart);
        lieuxDejaVisites.add(depart);
        while(!depart.equals(destination)){
            List<Rue> ruesDisponibles = environnement.obtenirRuesDisponibles(depart);
            Rue rueChoisie = ruesDisponibles.get(random.nextInt(ruesDisponibles.size()));
            Lieu prochainLieu = rueChoisie.obtenirAutreLieu(depart);
            depart = prochainLieu;
            lieuxConnus.add(depart);
            lieuxDejaVisites.add(depart);   
        }
        return lieuxDejaVisites;

    }
}
