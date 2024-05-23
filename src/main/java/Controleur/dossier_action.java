/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import DAO.Connexion_Base;
import Model.dossier_model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yanaf
 */
public class dossier_action 
{
public void dossier_add(dossier_model d)
      {Connexion_Base CB=new Connexion_Base();
       CB.connect();
       String req="insert into dossier (dateCreation,natureExamen,dateExamen,observations,codeP) values ('"+d.getDateCreation()+"','"+d.getNatureExamen()+"','"+d.getDateExamen()+"','"+d.getObservations()+"','"+d.getCodeP()+"')";
    try {
        CB.st.executeUpdate(req);
        
        JOptionPane.showMessageDialog(null,"Enregistrement effectue avec succes");
    } catch (SQLException ex) {
        Logger.getLogger(dossier_action.class.getName()).log(Level.SEVERE, null, ex);
    }
    
      }
 
public void dossier_update (dossier_model d)
{
      {Connexion_Base CB=new Connexion_Base();
       CB.connect();
       String req="update dossier set dateCreation='"+d.getDateCreation()+"',natureExamen='"+d.getNatureExamen()+"',dateExamen='"+d.getDateExamen()+"',observations='"+d.getObservations()+"',adresse='"+d.getCodeP()+"', where id='"+d.getId()+"'";   
          try {
              CB.st.executeUpdate(req);
          } catch (SQLException ex) {
              Logger.getLogger(dossier_action.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
    
}
public void dossier_del(int id)
    
      {Connexion_Base CB=new Connexion_Base();
       CB.connect();
       String req="Delete from dossier where id='"+id+"'";
    try {
        CB.st.executeUpdate(req);
    } catch (SQLException ex) {
        Logger.getLogger(dossier_action.class.getName()).log(Level.SEVERE, null, ex);
    }
      }

public void dossier_find  (int id)
      {dossier_model d=null;
       Connexion_Base CB=new Connexion_Base();
       CB.connect();
       String req="select*from dossier where id='"+id+"'";
    try {
        CB.st.executeQuery(req);
        
    } catch (SQLException ex) {
        Logger.getLogger(dossier_action.class.getName()).log(Level.SEVERE, null, ex);
    }
      }


public ResultSet dossier_liste()
      {ResultSet rs=null;
       Connexion_Base CB=new Connexion_Base();
       CB.connect();
       String req="Select*from dossier";
    try {
        rs=CB.st.executeQuery(req);
    } catch (SQLException ex) {
        Logger.getLogger(dossier_action.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return rs;
      }


}