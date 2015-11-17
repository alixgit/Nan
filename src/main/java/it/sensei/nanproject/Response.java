
package it.sensei.nanproject;

import java.util.List;


public class Response {
    
    
    List<Clientinucleo> listClientiNucleo;
    List<Contrattinucleo> listContrattiNucleo;

    String message;

    public List<Contrattinucleo> getListContrattiNucleo() {
        return listContrattiNucleo;
    }

    public void setListContrattiNucleo(List<Contrattinucleo> listContrattiNucleo) {
        this.listContrattiNucleo = listContrattiNucleo;
    }
    
    
       
    public List<Clientinucleo> getListClientiNucleo() {
        return listClientiNucleo;
    }

    public void setListClientiNucleo(List<Clientinucleo> listClientiNucleo) {
        this.listClientiNucleo = listClientiNucleo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }   
       
}
