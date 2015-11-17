
package it.sensei.nanproject;

import it.sensei.entities.Clienti;
import java.util.List;


public class Paginazione {
    
    private int indice;
    private int dimMax;
    private int sizeMax;
    private String message;
    private boolean risposta;
    
    List<Clienti> clienti;

    public Paginazione() {
    }

    public Paginazione(int indice, int dimMax, int sizeMax, String message, boolean risposta, List<Clienti> clienti) {
        this.indice = indice;
        this.dimMax = dimMax;
        this.sizeMax = sizeMax;
        this.message = message;
        this.risposta = risposta;
        this.clienti = clienti;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public int getDimMax() {
        return dimMax;
    }

    public void setDimMax(int dimMax) {
        this.dimMax = dimMax;
    }

    public int getSizeMax() {
        return sizeMax;
    }

    public void setSizeMax(int sizeMax) {
        this.sizeMax = sizeMax;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isRisposta() {
        return risposta;
    }

    public void setRisposta(boolean risposta) {
        this.risposta = risposta;
    }

    public List<Clienti> getClienti() {
        return clienti;
    }

    public void setClienti(List<Clienti> clienti) {
        this.clienti = clienti;
    }
    
    
    
}
