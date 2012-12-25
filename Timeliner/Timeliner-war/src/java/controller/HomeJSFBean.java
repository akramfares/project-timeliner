/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import EJB.UtilisateurEJBLocal;
import Entity.Status;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author akram
 */
public class HomeJSFBean{
    @EJB
    private UtilisateurEJBLocal userEJB;
    private String login;
    private String motdepasse;
    private String result;
       
    
    /**
     * Creates a new instance of HomeJSFBean
     */
    public HomeJSFBean() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    public String submitInscription(){
		result = "Merci "+this.login+" de vous être inscrit dans l'annuaire";
                userEJB.inscription(login, motdepasse);
		return "Success";
	}
        
    public String submitConnexion(){
            if(userEJB.connexion(login, motdepasse)){
                    result = "Bienvenue "+this.login+", vous êtes maintenant connecté ";
                    return "SuccessConnect";
		}
                else { 
                    result = "Identifiants incorrects";
                    return "Error"; 
            }
    }
    
    public boolean isConnected(){
        if(userEJB.getUserConnected() == null){
            return false;
        }
        else{
            return true;
        }
    }
    
    public List<Status> getMur(){
        return userEJB.getMur();
    }
    
}
