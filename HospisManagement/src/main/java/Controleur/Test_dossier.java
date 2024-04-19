/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import DAO.Connexion_Base;
import Model.dossier_model;

/**
 *
 * @author yanaf
 */
public class Test_dossier 
{public static void main(String[]args)
{
    Connexion_Base CB=new Connexion_Base();
    CB.connect();
     
    dossier_model d=new dossier_model("niang","nafi","20","femme","benn tally");
    dossier_action da=new dossier_action();
    da.dossier_add(d);
  
}

    
}
