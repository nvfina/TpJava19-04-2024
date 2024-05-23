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
        
        String req="insert into patient (nom,prenom,age,sexe,adresse) values ('"+p.getNom()+"','"+p.getPrenom()+"','"+p.getAge()+"','"+p.getSexe()+"','"+p.getAdresse()+"')";
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
        String req="update patient set nom='"+p.getNom()+"',prenom='"+p.getPrenom()+"',age='"+p.getAge()+"',sexe='"+p.getSexe()+"',adresse='"+p.getAdresse()+"' where codeP='"+p.getCodeP()+"'";
        
        CB.st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(patient_action.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
    
public void patient_del(int codeP)
    
    {Connexion_Base CB=new Connexion_Base();
     CB.connect();
     String req="Delete from patient where codeP='"+codeP+"'";
        try {
            CB.st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(patient_action.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }

public patient_model patient_find  (int codeP)
    {patient_model pm=null;
    ResultSet rs=null;
     Connexion_Base CB=new Connexion_Base();
     CB.connect();
     String req="select*from patient where codeP='"+codeP+"'";
       
             try {
            rs=CB.st.executeQuery(req);
            if(rs.next())
            {
            pm.setCodeP(rs.getInt("codeP"));
            pm.setNom(rs.getString("nom"));
            pm.setPrenom(rs.getString("prenom"));
            pm.setAge(rs.getString("age"));
            pm.setSexe(rs.getString("sexe"));
            pm.setAdresse(rs.getString("adresse"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(patient_action.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return pm;
}


public ResultSet patient_liste()
     {ResultSet rs=null;
     patient_model pm=new patient_model();
      Connexion_Base CB=new Connexion_Base();
      CB.connect();
      String req="Select*from patient";
        try {
            rs=CB.st.executeQuery(req);
        } catch (SQLException ex) {
            Logger.getLogger(patient_action.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
}



}
