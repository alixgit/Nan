
package it.sensei.nanproject;

import it.sensei.entities.Banche;
import it.sensei.entities.Clienti;
import it.sensei.entities.ClientiBanche;
import it.sensei.entities.Codici_fatturazione;
import it.sensei.entities.Smobili;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
public class ClientinucleoFacade extends AbstractFacade<Clientinucleo> implements ClientinucleoFacadeLocal {
    @PersistenceContext(unitName = "it.sensei_NanProject_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClientinucleoFacade() {
        super(Clientinucleo.class);
    }

    @Override
    public List<Clientinucleo> getAllClient() {
        Query query = em.createNamedQuery("Clientinucleo.findAll");
        return query.getResultList();
    }

    @Override
    public List<Clientinucleo> getClientByCode(String codice) {
        Query req = em.createQuery("SELECT c FROM Clientinucleo c WHERE c.codCliente = :codCliente");    
        req.setParameter("codCliente", codice);
        return req.getResultList();
    }

    @Override
    public List<Clientinucleo> getClientByName(String nome) {
        Query req = em.createQuery("SELECT c FROM Clientinucleo c WHERE c.nome = :nome");
        req.setParameter("nome", nome);
        return req.getResultList();
    }

    @Override
    public List<Clientinucleo> getClientByLastName(String cognome) {
        Query req = em.createQuery("SELECT c FROM Clientinucleo c WHERE c.cognome = :cognome");
        req.setParameter("cognome", cognome);
        return req.getResultList();
    }

    @Override
    public List<Clientinucleo> getClientList(String codici, String nome) {
        String temp[] = codici.split(",");
        Query req = em.createQuery("SELECT c FROM Clientinucleo c WHERE c.codCliente in (?1) or nome = ?2");
        req.setParameter(1, Arrays.asList(temp));
        req.setParameter(2, nome);
        List<Clientinucleo> fields = req.getResultList();
        return fields;
    }

    @Override
    public List<Clientinucleo> getClientByDate(String data) {
      
        Query req = em.createQuery("SELECT c FROM Clientinucleo c WHERE c.clDataUltimaMod >= :clDataUltimaMod");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            
        Date utilDate = null;
        try {
            utilDate = (Date)format.parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(ClientinucleoFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        req.setParameter("clDataUltimaMod", utilDate);
        
        return req.getResultList();
            
    }
    
 
    @Override
    public List<Clientinucleo> getClientCodeDate  (String codici, String date) throws Exception{
        String temp[] = codici.split(",");
        Query req = em.createQuery("SELECT c FROM Clientinucleo c WHERE c.codCliente in (?1) or c.clDataUltimaMod >= ?2");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        
        Date utilDate = null;
        try {
            utilDate = (Date)format.parse(date);
        } catch (ParseException ex) {
            
            Logger.getLogger(ClientinucleoFacade.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception(ex.getMessage());
        }
        if(utilDate != null) {
                req.setParameter(1, Arrays.asList(temp));
                req.setParameter(2, utilDate);               
                List<Clientinucleo> fields = req.getResultList();
                return fields;            
        }
        
        return null;
                
    }

    @Override
    public List<Contrattinucleo> getAllContract() {
        Query query = em.createQuery("SELECT c FROM Contrattinucleo c");
        return query.getResultList();
    }

    @Override
    public List<Contrattinucleo> getContrattoById(int code) {
        Query req = em.createQuery("SELECT c FROM Contrattinucleo c WHERE c.id_contratto = :id_contratto");    
        req.setParameter("id_contratto", code);
        return req.getResultList();
    }

    @Override
    public List<Contrattinucleo> getAbbonamentiCodeDate (String codici, String date) throws Exception{
        String temp[] = codici.split(",");
        Query req = em.createQuery("SELECT c FROM Contrattinucleo c WHERE c.cod_contratto in (?1) or c.dt_fatturazione >= ?2");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        
        Date utilDate = null;
        try {
            utilDate = (Date)format.parse(date);
        } catch (ParseException ex) {
            
            Logger.getLogger(ClientinucleoFacade.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception(ex.getMessage());
        }
        if(utilDate != null) {
                req.setParameter(1, Arrays.asList(temp));
                req.setParameter(2, utilDate);               
                List<Contrattinucleo> fields = req.getResultList();
                return fields;            
        }
        
        return null;
                
    }

    @Override
    public List<Contrattinucleo> getAbbonamentiByDate(String data) {
        Query req = em.createQuery("SELECT c FROM Contrattinucleo c WHERE c.dt_fatturazione >= (?1)");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            
        Date utilDate = null;
        try {
            utilDate = (Date)format.parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(ClientinucleoFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        req.setParameter(1, utilDate);
        
        return req.getResultList();
    }

    
    @Override
    public List<Contrattinucleo> getAbbonamentoByCodeClient(String code) {
        Query req = em.createQuery("SELECT c FROM Contrattinucleo c WHERE c.cod_cliente = :cod_cliente");    
        req.setParameter("cod_cliente", code);
        return req.getResultList();
    }


    @Override
    public List<Clienti> getLeftClientJoin(String data) {

        Query query = em.createQuery("SELECT c FROM Clienti c LEFT JOIN c.clienti_banche b LEFT JOIN b.banca bc WHERE c.cl_id = b.cliente.cl_id  AND b.banca.ba_id = bc.ba_id AND (COALLESCE(c.cl_data_ultima_mod, c.cl_data_inserimento) >= (1?))");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            
        Date utilDate = null;
        try {
            utilDate = (Date)format.parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(ClientinucleoFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        query.setParameter(1, utilDate);
        query.setFirstResult(0);
        query.setMaxResults(50);
        return query.getResultList();

    }
    
    @Override
    public List<Clienti>getClientTab2(int start) {
  
        Query query1 = em.createQuery("SELECT count(c) FROM Clienti c");
        Long count = (Long)query1.getSingleResult();
        int maxRow = 10000;
        Query query = em.createQuery("SELECT c FROM Clienti c");
        query.setFirstResult((start-1)*maxRow);
        query.setMaxResults(maxRow * start);
    
        return query.getResultList();

    }

    @Override
    public List<ClientiBanche> getClienti_bancheTab() {
        Query query = em.createQuery("SELECT d FROM ClientiBanche d");
        return query.getResultList();
    }

    @Override
    public List<Banche> getBanche() {
        Query query = em.createQuery("SELECT b FROM Banche b");
        return query.getResultList();
    }

    @Override
    public List<Codici_fatturazione> getCodiciFatturazione() {
        Query query = em.createQuery("SELECT c FROM Codici_fatturazione c");
        return query.getResultList();
    }

    @Override
    public List<Clienti> getClientTab() {
        Query query = em.createQuery("SELECT c FROM Clienti c");
      
        return query.getResultList();
    }

    @Override
    public List<Clienti> getAllClientJoin2() throws Exception {
        Query query = em.createQuery("SELECT c FROM Clienti c LEFT JOIN c.clienti_banche b WHERE c.cl_id = b.cliente.cl_id ");
        query.setFirstResult(0);
        query.setMaxResults(50);
      
        return query.getResultList();
        
    }

    @Override
    public List<Smobili> getAllSmobili() {
        Query query = em.createQuery("SELECT s FROM Smobili s");
        query.setFirstResult(0);
        query.setMaxResults(50);
        return query.getResultList();
    }

    @Override
    public List<Clienti> ClientSmobili() {
        Query query = em.createQuery("SELECT c FROM Clienti c INNER JOIN c.smobile s WHERE c.cl_id = s.cliente2.cl_id");
        query.setFirstResult(0);
        query.setMaxResults(50);
        return query.getResultList();
    }

//    @Override
//    public List<Clienti> FatturazioneLeftClientJoin() {
//        Query query = em.createQuery("SELECT c FROM Clienti c LEFT JOIN c.fatturazione1 f  LEFT JOIN c.clienti_banche b LEFT JOIN b.banca bc WHERE c.cl_pagamento_consolidato = f.cliente3. AND  c.cl_id = b.cliente.cl_id  AND b.banca.ba_id = bc.ba_id ");
//        query.setFirstResult(0);
//        query.setMaxResults(50);
//        return query.getResultList();
//    }
//    
    
    @Override
    public List<Clienti> FatturazioneLeftClientJoin() {
        Query query = em.createNativeQuery("SELECT c FROM Clienti c LEFT JOIN codici_fatturazione f ON c.cl_pagamento_consolidato = f.cdft_descrizione ", Clienti.class);
        //Query query = em.createNamedQuery("SELECT c FROM Clienti c LEFT JOIN codici_fatturazione f ON c.cl_pagamento_consolidato = : f.cdft_descrizione ", Clienti.class);
        //Query query = em.createNativeQuery("SELECT c FROM Clienti c LEFT JOIN codici_fatturazione f ON c.cl_pagamento_consolidato = f.cdft_descrizione ");
        query.setFirstResult(0);
        query.setMaxResults(50);
        return query.getResultList();
    }
    
    
}
