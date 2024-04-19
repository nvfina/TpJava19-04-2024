/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import DAO.Connexion_Base;
import Model.patient_model;
import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yanaf
 */
public class patient_action {
    public void patient_add (patient_model p)
    {   try {
        Connexion_Base CB=new Connexion_Base();
        CB.connect();
        
        String req="insert into patient (codeP,nom,prenom,age,sexe,adresse) values ('"+p.getCodeP()+"','"+p.getNom()+"','"+p.getPrenom()+"','"+p.getAge()+"','"+p.getSexe()+"','"+p.getAdresse()+"')";
        CB.st.executeUpdate(req);
        JOptionPane.showMessageDialog(null,"Enregistrement effectue avec succes");
        } catch (SQLException ex) {
            Logger.getLogger(patient_action.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
     }
   
    
public void patient_update(patient_model p)
    {   try {
        Connexion_Base CB=new Connexion_Base();
        CB.connect();
        String req="update patient set nom='"+p.getNom()+"',prenom='"+p.getPrenom()+"',age='"+p.getAge()+"',sexe='"+p.getSexe()+"',adresse='"+p.getAdresse()+"',where codeP='"+p.getCodeP()+"'";
        
        CB.st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(patient_action.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
    
public void patient_del(int codeP)
    
    {Connexion_Base CB=new Connexion_Base();
     CB.connect();
     String req="Delete from Utilisateur where codeP='"+codeP+"'";
        try {
            CB.st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(patient_action.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }

public void patient_find  (int codeP)
    {patient_model p=null;
     Connexion_Base CB=new Connexion_Base();
     CB.connect();
     String req="select*from Utilisateur where codeP='"+codeP+"'";
        try {
            CB.st.executeQuery(req);
        } catch (SQLException ex) {
            Logger.getLogger(patient_action.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}


public void patient_liste()
     {ResultSet rs=null;
      Connexion_Base CB=new Connexion_Base();
      CB.connect();
      String req="Select*from patient";
        try {
            CB.st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(patient_action.class.getName()).log(Level.SEVERE, null, ex);
        }
}


}
