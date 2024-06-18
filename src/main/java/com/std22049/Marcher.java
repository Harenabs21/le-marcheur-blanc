package com.std22049;

import java.util.List;
import java.util.Random;

import com.std22049.cartes.Carte;
import com.std22049.cartes.Lieu;
import com.std22049.cartes.Rue;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Marcher {
    private Marcheur marcheur;
    private Carte carte;

    public List<Lieu> marcherVersDestination(Lieu depart,Lieu destination){
        Random random = new Random();
        while(!depart.equals(destination)){
            List<Rue> ruesDisponibles = carte.obtenirRuesDisponible(depart);
            Rue rueChoisie = ruesDisponibles.get(random.nextInt(ruesDisponibles.size()));
            depart = rueChoisie.obtenirAutreLieu(depart);
            marcheur.getLieuxDejaVisites().add(depart);
        }
        return marcheur.getLieuxDejaVisites();

    }
}
