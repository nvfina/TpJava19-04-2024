/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author yanaf
 */
public class dossier_model 
{int Id;	
 String dateCreation;	
 String natureExamen;	
 String dateExamen;	
 String observations;
 String codeP;

    public dossier_model() {}

    public dossier_model(int Id, String dateCreation, String natureExamen, String dateExamen, String observations, String codeP) {
        this.Id = Id;
        this.dateCreation = dateCreation;
        this.natureExamen = natureExamen;
        this.dateExamen = dateExamen;
        this.observations = observations;
        this.codeP = codeP;
    }

    public dossier_model(String dateCreation, String natureExamen, String dateExamen, String observations, String codeP) {
        this.dateCreation = dateCreation;
        this.natureExamen = natureExamen;
        this.dateExamen = dateExamen;
        this.observations = observations;
        this.codeP = codeP;
    }

    public int getId() {
        return Id;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public String getNatureExamen() {
        return natureExamen;
    }

    public String getDateExamen() {
        return dateExamen;
    }

    public String getObservations() {
        return observations;
    }

    public String getCodeP() {
        return codeP;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setNatureExamen(String natureExamen) {
        this.natureExamen = natureExamen;
    }

    public void setDateExamen(String dateExamen) {
        this.dateExamen = dateExamen;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public void setCodeP(String codeP) {
        this.codeP = codeP;
    }
    

 
    
}
