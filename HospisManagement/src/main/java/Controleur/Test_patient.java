/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import DAO.Connexion_Base;
import Model.patient_model;

/**
 *
 * @author yanaf
 */
public class Test_patient {
public static void main(String[]args)
{
    Connexion_Base CB=new Connexion_Base();
    CB.connect();
     
    patient_model p=new patient_model("niang","nafi","20","femme","benn tally");
    patient_action pa=new patient_action();
    pa.patient_add(p);
  
}
}