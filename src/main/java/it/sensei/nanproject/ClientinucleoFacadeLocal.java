
package it.sensei.nanproject;

import it.sensei.entities.Banche;
import it.sensei.entities.Clienti;
import it.sensei.entities.ClientiBanche;
import it.sensei.entities.Codici_fatturazione;
import it.sensei.entities.Smobili;
import java.util.List;
import javax.ejb.Remote;


@Remote
public interface ClientinucleoFacadeLocal {
    
    List<Clienti> getLeftClientJoin(String data);
    
    List<Clienti> FatturazioneLeftClientJoin();
    
    List<Clienti> getClientTab2(int start);
    
    List<Clienti> getClientTab();
    
    List<Clienti> ClientSmobili();
    
    List<Banche> getBanche();
    
    List<Codici_fatturazione> getCodiciFatturazione();
    
    List<ClientiBanche> getClienti_bancheTab();
    
    List<Clienti> getAllClientJoin2() throws Exception;
    
    List<Clientinucleo> getAllClient();
    
    List<Smobili> getAllSmobili();
    
    List<Contrattinucleo> getAllContract();
    
    List<Clientinucleo> getClientByCode(String code);
    
    List<Contrattinucleo> getContrattoById(int code);
    
    List<Clientinucleo> getClientByDate(String data);
    
    List<Clientinucleo> getClientByName(String nome);
    
    List<Clientinucleo> getClientByLastName(String cognome);
    
    List<Clientinucleo> getClientList(String codici, String nome);
    
    List<Clientinucleo> getClientCodeDate(String codici, String date) throws Exception;
    
    List<Contrattinucleo> getAbbonamentiCodeDate(String codici, String date) throws Exception;
    
    List<Contrattinucleo> getAbbonamentiByDate(String data);
    
    List<Contrattinucleo> getAbbonamentoByCodeClient(String code);

    void create(Clientinucleo clientinucleo);

    void edit(Clientinucleo clientinucleo);

    void remove(Clientinucleo clientinucleo);

    Clientinucleo find(Object id);

    List<Clientinucleo> findAll();

    List<Clientinucleo> findRange(int[] range);

    int count();
    
}
