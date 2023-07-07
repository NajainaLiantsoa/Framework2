package etu1847.framework.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontServletTest extends HttpServlet {
    

    protected void processRequest(HttpServletRequest req,
    HttpServletResponse res) throws IOException, ServletException{
        try{
            PrintWriter out = res.getWriter();
            // parcour de mappingUrls et affichage du contenu
            
                out.println("TEST OK");
                       

            
        }catch( Exception e ){
            e.printStackTrace();
        }
        
    }

    public void doGet(HttpServletRequest req,
                      HttpServletResponse res)
        throws IOException, ServletException{
        processRequest(req, res);
    }

    public void doPost(HttpServletRequest req,
                      HttpServletResponse res)
        throws IOException, ServletException{
        processRequest(req, res);
    }
}

