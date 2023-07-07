package model;

import etu1847.annotation.Urls;
import etu1847.framework.ModelView;

public class Pers {
    @Urls(url = "inscrire-pers")
    public ModelView Inscrire(){
        ModelView mv = new ModelView();
        mv.setView("pers-list.jsp");
        return mv;
    }   
    
    public void desinscrire(){
        
    }

}
