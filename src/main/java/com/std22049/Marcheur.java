package com.std22049;

import java.util.ArrayList;
import java.util.List;

import com.std22049.cartes.Lieu;

import lombok.Data;

@Data
public class Marcheur {
    private String nom;
    private List<Lieu> lieuxDejaVisites;
    
    public Marcheur(String nom){
        this.nom = nom;
        this.lieuxDejaVisites = new ArrayList<>();
    }
}
