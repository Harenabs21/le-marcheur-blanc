package std22049;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.std22049.Marcheur;
import com.std22049.cartes.Carte;
import com.std22049.cartes.Environnement;
import com.std22049.cartes.Lieu;
import com.std22049.cartes.Rue;

public class MarcheurTest {
    
    @Test
    public void HEI_vers_ESTI(){
        // Créer les lieux
         Lieu HEI = new Lieu("HEI");
         Lieu Pullman = new Lieu("Pullman");
         Lieu Balancoire = new Lieu("Balancoire");
         Lieu ESTI = new Lieu("ESTI");
         Lieu NextA = new Lieu("NextA");
         Lieu Boulevard = new Lieu("Boulevard de l'europe");
         Lieu Marais = new Lieu("Marais");
         Lieu Sekolintsika = new Lieu("Sekolintsika");
 
         // Créer les rues
         Rue rue1 = new Rue("Andriatsihoarana", HEI, Pullman);
         Rue rue2 = new Rue("Ranaivo", Pullman, Balancoire);
         Rue rue3 = new Rue("Rue3", Balancoire, ESTI);
         Rue rue4 =  new Rue("rue4",Pullman,NextA);
         Rue rue5 = new Rue("Rue5",Balancoire,Boulevard);
         Rue rue6 = new Rue("Rue6",Boulevard,ESTI);
         Rue rue7 = new Rue("Rue7",HEI,Sekolintsika);
         Rue rue8 = new Rue("Rue8",Sekolintsika,Marais);
         Rue rue9 = new Rue("Rue9",HEI,Balancoire);
 
         // Créer la carte
         Carte carte = new Carte();
         carte.ajouterLieu(HEI);
         carte.ajouterLieu(Pullman);
         carte.ajouterLieu(Balancoire);
         carte.ajouterLieu(ESTI);
         carte.ajouterLieu(NextA);
         carte.ajouterLieu(Boulevard);
         carte.ajouterLieu(Sekolintsika);
         carte.ajouterLieu(Marais);
         carte.ajouterRue(rue1);
         carte.ajouterRue(rue2);
         carte.ajouterRue(rue3);
         carte.ajouterRue(rue4);
         carte.ajouterRue(rue5);
         carte.ajouterRue(rue6);
         carte.ajouterRue(rue7);
         carte.ajouterRue(rue8);
         carte.ajouterRue(rue9);

         // Créer l'environnement
         Environnement env = new Environnement(carte);
 
         // Créer le marcheur
         Marcheur bjarni = new Marcheur("Bjarni",env);
 
         // Faire marcher Bjarni vers ESTI
         List<Lieu> parcours = bjarni.marcherVersDestination(HEI,ESTI);
         // tester si la destination est ESTI
         Assertions.assertEquals(ESTI, new LinkedList<>(parcours).getLast());
         assertTrue(parcours.contains(Balancoire));
    }
}
