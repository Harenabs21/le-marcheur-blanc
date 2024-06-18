package com.std22049;

import lombok.Getter;

@Getter
public class Rue extends ElementCarte {

    private Lieu premierLieu;
    private Lieu deuxiemeLieu;

    public Rue(String nom, Lieu lieu1, Lieu lieu2) {
        super(nom);
        this.premierLieu = lieu1;
        this.deuxiemeLieu = lieu2;
    }

    public Rue(Lieu lieu1, Lieu lieu2){
        super("");
        this.premierLieu = lieu1;
        this.deuxiemeLieu = lieu2;
    }

    public Lieu obtenirAutreLieu(Lieu lieu) {
        if (lieu.equals(premierLieu)) {
            return deuxiemeLieu;
        } else if (lieu.equals(deuxiemeLieu)) {
            return premierLieu;
        } else {
            return null;
        }
    }
}
