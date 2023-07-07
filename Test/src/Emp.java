package model.societe;

import etu1847.annotation.Urls;
import etu1847.framework.ModelView;
import java.util.Vector;

public class Emp {
    String nom;

    // _ _ _ Constructors _ _ _

    public Emp(){

    }
    
    // _ _ _ Methods _ _ _

    public void embaucher(){}

    @Urls(url = "getAllPers")
    public ModelView getAll(){
        ModelView mv = new ModelView();
        
        // vue destinatrice
        mv.setView("pers-list.jsp");

        //elements de donnees a passer a la vue
        Vector<Emp> liste = new Vector<Emp>();
        Emp e = new Emp(),
            e2 =  new Emp(),
            e3 =  new Emp();
            
        e.setNom("Najaina");
        e2.setNom("Liantsoa");
        e3.setNom("Narindra");
        liste.add(e);
        liste.add(e2);
        liste.add(e3);

        // ajout de la liste aux donnees a passer
        mv.addItem("liste", liste);

        return mv;
    }

    //_ _ _ GET SET _ _ _

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
