package com.std22049.cartes;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Environnement {
    private Carte carte;

    public List<Rue> obtenirRuesDisponibles(Lieu lieu){
        return lieu.getRuesConnectees();
    }
}
