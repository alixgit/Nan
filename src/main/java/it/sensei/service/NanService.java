
package it.sensei.service;

import it.sensei.entities.Banche;
import it.sensei.entities.Clienti;
import it.sensei.entities.ClientiBanche;
import it.sensei.entities.Codici_fatturazione;
import it.sensei.entities.Smobili;
import it.sensei.nanproject.Clientinucleo;
import it.sensei.nanproject.ClientinucleoFacadeLocal;
import it.sensei.nanproject.Contrattinucleo;
import it.sensei.nanproject.Response;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;



@Stateless
@WebService
public class NanService {
    
    @EJB
    
    private ClientinucleoFacadeLocal metier;
    
    @WebMethod
    public List<Clienti> LeftJoin(@WebParam(name="dataCol")String data){
        return metier.getLeftClientJoin(data);
    }
    
    @WebMethod
    public List<Clienti> FatturazioneJoin(){
        return metier.FatturazioneLeftClientJoin();
    }
    
    @WebMethod
    public List<Clienti> viewJoin() throws Exception{
        return metier.getAllClientJoin2();
    }
    
    @WebMethod
    public List<Clienti> ClientJoinSmobili(){
        return metier.ClientSmobili();
    }
    
    @WebMethod
    public List<Smobili> getSmobili(){
        return metier.getAllSmobili();
    }
    
    @WebMethod
    public List<Clienti> ClientTab2(@WebParam(name="numeroPagina")int page) {
        return metier.getClientTab2(page);
    }
    
    @WebMethod
    public List<Clienti> ClientTab() {
        return metier.getClientTab();
    }
    
    @WebMethod
    public List<Banche> BancheTab() {
        return metier.getBanche();
    }
    
    @WebMethod
    public List<Codici_fatturazione> Codici_fatturazioneTab() {
        return metier.getCodiciFatturazione();
    }
    
    @WebMethod
    public List<ClientiBanche> Clienti_banche_Tab() {
        return metier.getClienti_bancheTab();
    }
    
    @WebMethod
    public List<Clientinucleo> visualizzaClienti() {
        return metier.getAllClient();
    }
    
    @WebMethod
    public List<Contrattinucleo> visualizzaContratti() {
        return metier.getAllContract();
    }
    
    @WebMethod
    public List<Clientinucleo> TrovaClientePerCodice(@WebParam(name="codCliente") String codice) {
        return metier.getClientByCode(codice);
    }
    
    @WebMethod
    public List<Contrattinucleo> TrovaContratoPerCodice(@WebParam(name="idContratto")int id) {
        return metier.getContrattoById(id);
    }
    
    @WebMethod
    public List<Clientinucleo> TrovaPerNome(@WebParam(name="nome")String nome) {
        return metier.getClientByName(nome);
    }
    
    @WebMethod
    public List<Clientinucleo> TrovaPerCognome(@WebParam(name="cognome")String cognome) {
        return metier.getClientByLastName(cognome);
    }
    
    @WebMethod
    public List<Clientinucleo> TrovaListaClienti(@WebParam(name="Codici")String listaCodici,@WebParam(name="nome")String nome ) {
        return metier.getClientList(listaCodici, nome);
    }
    
 
    @WebMethod
    public Response ClientiCodiciData (@WebParam(name="Codici")String listaCodici, @XmlElement(required=true)@WebParam(name="clDataUltimaMod")String data )     {
        
        Response response = new Response();
        try {
 
            if(data.equals("")){
                response.setMessage("Parametri inseriti non corretti, data mancante");
            }else{
                response.setListClientiNucleo(metier.getClientCodeDate(listaCodici, data));
            }
           
        } catch (Exception ex) {
            
            Logger.getLogger(NanService.class.getName()).log(Level.SEVERE, null, ex);
            response.setMessage(ex.getMessage());
           
        }
        return response;
    }
    
//     @WebMethod
//     public Paginazione ViewClient() {
//         
//         Paginazione page = new Paginazione();
//         
//         
//         return null;
//     }
    
    
    @WebMethod
    public List<Clientinucleo> TrovaPerData(@WebParam(name="clDataUltimaMod")String data) {
        return metier.getClientByDate(data);
    }
    
    
    @WebMethod
    public Response ContrattiCodiciData (@WebParam(name="codiceContratto")String listaCodici, @XmlElement(required=true)@WebParam(name="dtFatturazione")String data )     {
        
        Response response = new Response();
        try {
 
            if(data.equals("")){
                response.setMessage("Parametri inseriti non corretti, data mancante");
            }else{
                response.setListContrattiNucleo(metier.getAbbonamentiCodeDate(listaCodici, data));
            }
           
        } catch (Exception ex) {
            
            Logger.getLogger(NanService.class.getName()).log(Level.SEVERE, null, ex);
            response.setMessage(ex.getMessage());
           
        }
        return response;
    }
    
    @WebMethod
    public List<Contrattinucleo> ContrattoPerData(@WebParam(name="dtFatturazione")String data) {
        return metier.getAbbonamentiByDate(data);
    }
    
    @WebMethod
    public List<Contrattinucleo> AbbonamentoPerCodiceCliente(@WebParam(name="codCliente")String code) {
        return metier.getAbbonamentoByCodeClient(code);
    }
    
}
