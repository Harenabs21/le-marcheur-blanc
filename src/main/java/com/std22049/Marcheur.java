package com.std22049;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import lombok.Data;

@Data
public class Marcheur {
    private List<Lieu> lieuxDejaVisites;
    private Carte carte;
    
    public Marcheur(Carte carte){
        this.carte = carte;
        this.lieuxDejaVisites = new ArrayList<>();
    }

    public List<Lieu> marcherVersDestination(Lieu depart,Lieu destination){
        Random random = new Random();
        System.out.println("Départ à "+depart.getNom());
        while(!depart.equals(destination)){
            List<Rue> ruesDisponibles = carte.obtenirRuesDisponible(depart);
            Rue rueChoisie = ruesDisponibles.get(random.nextInt(ruesDisponibles.size()));
            depart = rueChoisie.obtenirAutreLieu(depart);
            lieuxDejaVisites.add(depart);
        }
        System.out.println("Arrivé à:"+destination.getNom());
        return lieuxDejaVisites;

    }
}
