
package it.sensei.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="clienti")
@XmlRootElement
public class Clienti implements Serializable {
    
    @Id
    @Column(name = "cl_id")
    private Integer cl_id;
    
    @Column(name = "util_id")
    private Integer util_id;
    
    @Column(name = "cl_codice")
    private String cl_codice;
    
    @Column(name = "cl_attivita")
    private String cl_attivita;
    
    @Column(name = "cl_ragione_cognome")
    private String cl_ragione_cognome;
    
    @Column(name = "cl_nome")
    private String cl_nome;
    
    @Column(name = "cl_titolo")
    private String cl_titolo;
    
    @Column(name = "cl_indirizzo")
    private String cl_indirizzo;
    
    @Column(name = "cl_civico")
    private String cl_civico;
    
    @Column(name = "cl_citta")
    private String cl_citta;
    
    @Column(name = "cl_cap")
    private String cl_cap;
    
    @Column(name = "cl_provincia")
    private String cl_provincia;
    
    @Column(name = "cl_nazione")
    private String cl_nazione;
    
    @Column(name = "cl_codice_fiscale")
    private String cl_codice_fiscale;
    
    @Column(name = "cl_partita_iva")
    private String cl_partiva_iva;
    
    @Column(name = "cl_data_nascita")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date cl_data_nascita;
    
    @Column(name = "cl_citta_nascita")
    private String cl_citta_nascita;
    
    @Column(name = "cl_provincia_nascita")
    private String cl_provincia_nascita;
    
    @Column(name = "cl_nazione_nascita")
    private String cl_nazione_nascita;
    
    @Column(name = "cl_data_inserimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cl_data_inserimento;
    
    @Column(name = "cl_note")
    private String cl_note;
    
    @Column(name = "cl_op_ultima_mod")
    private String cl_op_ultima_mod;
    
    @Column(name = "cl_op_creazione")
    private String cl_op_creazione;
    
    @Column(name = "cl_note_fatturazione")
    private String cl_note_fatturazione;
    
    @Column(name = "cl_email")
    private String cl_email;
    
    @Column(name = "cl_data_ultima_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cl_data_ultima_mod;
    
    @Column(name = "cl_altri_rec_fatt")
    private String cl_altri_rec_fatt;
    
    @Column(name = "cl_altri_rec_gest")
    private String cl_altri_rec_gest;
    
    @Column(name = "cl_codice_iva")
    private String cl_codice_iva;
    
    @Column(name = "cl_utilizzatore")
    private String cl_utilizzatore;
    
    @Column(name = "cl_titolo_fattura")
    private String cl_titolo_fattura;
    
    @Column(name = "cl_esatto_eur")
    private String cl_esatto_eur;
    
    @Column(name = "cl_esatto_lis")
    private String cl_esatto_lis;
    
    @Column(name = "inm_id")
    private Integer inm_id;
    
    
    @Column(name = "cl_pagamento_consolidato")
    private String cl_pagamento_consolidato;
    

    @Column(name = "cl_provenienza")
    private String cl_provenienza;
    
    @Column(name = "cl_flaganagrafica")
    private boolean cl_flaganagrafica;
    
    @Column(name = "cl_consenso")
    private boolean cl_consenso;
    
    @OneToMany
    (mappedBy="cliente", fetch = FetchType.EAGER)
    private List<ClientiBanche> clienti_banche;
    
    @OneToMany
    (mappedBy="cliente2", fetch = FetchType.LAZY)
    private List<Smobili> smobile;
    
//    @OneToMany
//    (mappedBy="cliente3",fetch = FetchType.EAGER)
//    private List<Codici_fatturazione> fatturazione1;
    
    @OneToMany
    (mappedBy="cliente4",fetch = FetchType.EAGER)
    private List<Codici_fatturazione2> fatturazione2;

    public Clienti() {
    }

    public Clienti(Integer cl_id, Integer util_id, String cl_codice, String cl_attivita, String cl_ragione_cognome, String cl_nome, String cl_titolo, String cl_indirizzo, String cl_civico, String cl_citta, String cl_cap, String cl_provincia, String cl_nazione, String cl_codice_fiscale, String cl_partiva_iva, Date cl_data_nascita, String cl_citta_nascita, String cl_provincia_nascita, String cl_nazione_nascita, Date cl_data_inserimento, String cl_note, String cl_op_ultima_mod, String cl_op_creazione, String cl_note_fatturazione, String cl_email, Date cl_data_ultima_mod, String cl_altri_rec_fatt, String cl_altri_rec_gest, String cl_codice_iva, String cl_utilizzatore, String cl_titolo_fattura, String cl_esatto_eur, String cl_esatto_lis, Integer inm_id,String cl_pagamento_consolidato, String cl_provenienza, boolean cl_flaganagrafica, boolean cl_consenso) {
        this.cl_id = cl_id;
        this.util_id = util_id;
        this.cl_codice = cl_codice;
        this.cl_attivita = cl_attivita;
        this.cl_ragione_cognome = cl_ragione_cognome;
        this.cl_nome = cl_nome;
        this.cl_titolo = cl_titolo;
        this.cl_indirizzo = cl_indirizzo;
        this.cl_civico = cl_civico;
        this.cl_citta = cl_citta;
        this.cl_cap = cl_cap;
        this.cl_provincia = cl_provincia;
        this.cl_nazione = cl_nazione;
        this.cl_codice_fiscale = cl_codice_fiscale;
        this.cl_partiva_iva = cl_partiva_iva;
        this.cl_data_nascita = cl_data_nascita;
        this.cl_citta_nascita = cl_citta_nascita;
        this.cl_provincia_nascita = cl_provincia_nascita;
        this.cl_nazione_nascita = cl_nazione_nascita;
        this.cl_data_inserimento = cl_data_inserimento;
        this.cl_note = cl_note;
        this.cl_op_ultima_mod = cl_op_ultima_mod;
        this.cl_op_creazione = cl_op_creazione;
        this.cl_note_fatturazione = cl_note_fatturazione;
        this.cl_email = cl_email;
        this.cl_data_ultima_mod = cl_data_ultima_mod;
        this.cl_altri_rec_fatt = cl_altri_rec_fatt;
        this.cl_altri_rec_gest = cl_altri_rec_gest;
        this.cl_codice_iva = cl_codice_iva;
        this.cl_utilizzatore = cl_utilizzatore;
        this.cl_titolo_fattura = cl_titolo_fattura;
        this.cl_esatto_eur = cl_esatto_eur;
        this.cl_esatto_lis = cl_esatto_lis;
        this.inm_id = inm_id;
        this.cl_pagamento_consolidato = cl_pagamento_consolidato;
        this.cl_provenienza = cl_provenienza;
        this.cl_flaganagrafica = cl_flaganagrafica;
        this.cl_consenso = cl_consenso;
    }

    public Integer getCl_id() {
        return cl_id;
    }

    public void setCl_id(Integer cl_id) {
        this.cl_id = cl_id;
    }

    public Integer getUtil_id() {
        return util_id;
    }

    public void setUtil_id(Integer util_id) {
        this.util_id = util_id;
    }

    public String getCl_codice() {
        return cl_codice;
    }

    public void setCl_codice(String cl_codice) {
        this.cl_codice = cl_codice;
    }

    public String getCl_attivita() {
        return cl_attivita;
    }

    public void setCl_attivita(String cl_attivita) {
        this.cl_attivita = cl_attivita;
    }

    public String getCl_ragione_cognome() {
        return cl_ragione_cognome;
    }

    public void setCl_ragione_cognome(String cl_ragione_cognome) {
        this.cl_ragione_cognome = cl_ragione_cognome;
    }

    public String getCl_nome() {
        return cl_nome;
    }

    public void setCl_nome(String cl_nome) {
        this.cl_nome = cl_nome;
    }

    public String getCl_titolo() {
        return cl_titolo;
    }

    public void setCl_titolo(String cl_titolo) {
        this.cl_titolo = cl_titolo;
    }

    public String getCl_indirizzo() {
        return cl_indirizzo;
    }

    public void setCl_indirizzo(String cl_indirizzo) {
        this.cl_indirizzo = cl_indirizzo;
    }

    public String getCl_civico() {
        return cl_civico;
    }

    public void setCl_civico(String cl_civico) {
        this.cl_civico = cl_civico;
    }

    public String getCl_citta() {
        return cl_citta;
    }

    public void setCl_citta(String cl_citta) {
        this.cl_citta = cl_citta;
    }

    public String getCl_cap() {
        return cl_cap;
    }

    public void setCl_cap(String cl_cap) {
        this.cl_cap = cl_cap;
    }

    public String getCl_provincia() {
        return cl_provincia;
    }

    public void setCl_provincia(String cl_provincia) {
        this.cl_provincia = cl_provincia;
    }

    public String getCl_nazione() {
        return cl_nazione;
    }

    public void setCl_nazione(String cl_nazione) {
        this.cl_nazione = cl_nazione;
    }

    public String getCl_codice_fiscale() {
        return cl_codice_fiscale;
    }

    public void setCl_codice_fiscale(String cl_codice_fiscale) {
        this.cl_codice_fiscale = cl_codice_fiscale;
    }

    public String getCl_partiva_iva() {
        return cl_partiva_iva;
    }

    public void setCl_partiva_iva(String cl_partiva_iva) {
        this.cl_partiva_iva = cl_partiva_iva;
    }

    public Date getCl_data_nascita() {
        return cl_data_nascita;
    }

    public void setCl_data_nascita(Date cl_data_nascita) {
        this.cl_data_nascita = cl_data_nascita;
    }

    public String getCl_citta_nascita() {
        return cl_citta_nascita;
    }

    public void setCl_citta_nascita(String cl_citta_nascita) {
        this.cl_citta_nascita = cl_citta_nascita;
    }

    public String getCl_provincia_nascita() {
        return cl_provincia_nascita;
    }

    public void setCl_provincia_nascita(String cl_provincia_nascita) {
        this.cl_provincia_nascita = cl_provincia_nascita;
    }

    public String getCl_nazione_nascita() {
        return cl_nazione_nascita;
    }

    public void setCl_nazione_nascita(String cl_nazione_nascita) {
        this.cl_nazione_nascita = cl_nazione_nascita;
    }

    public Date getCl_data_inserimento() {
        return cl_data_inserimento;
    }

    public void setCl_data_inserimento(Date cl_data_inserimento) {
        this.cl_data_inserimento = cl_data_inserimento;
    }

    public String getCl_note() {
        return cl_note;
    }

    public void setCl_note(String cl_note) {
        this.cl_note = cl_note;
    }

    public String getCl_op_ultima_mod() {
        return cl_op_ultima_mod;
    }

    public void setCl_op_ultima_mod(String cl_op_ultima_mod) {
        this.cl_op_ultima_mod = cl_op_ultima_mod;
    }

    public String getCl_op_creazione() {
        return cl_op_creazione;
    }

    public void setCl_op_creazione(String cl_op_creazione) {
        this.cl_op_creazione = cl_op_creazione;
    }

    public String getCl_note_fatturazione() {
        return cl_note_fatturazione;
    }

    public void setCl_note_fatturazione(String cl_note_fatturazione) {
        this.cl_note_fatturazione = cl_note_fatturazione;
    }

    public String getCl_email() {
        return cl_email;
    }

    public void setCl_email(String cl_email) {
        this.cl_email = cl_email;
    }

    public Date getCl_data_ultima_mod() {
        return cl_data_ultima_mod;
    }

    public void setCl_data_ultima_mod(Date cl_data_ultima_mod) {
        this.cl_data_ultima_mod = cl_data_ultima_mod;
    }

    public String getCl_altri_rec_fatt() {
        return cl_altri_rec_fatt;
    }

    public void setCl_altri_rec_fatt(String cl_altri_rec_fatt) {
        this.cl_altri_rec_fatt = cl_altri_rec_fatt;
    }

    public String getCl_altri_rec_gest() {
        return cl_altri_rec_gest;
    }

    public void setCl_altri_rec_gest(String cl_altri_rec_gest) {
        this.cl_altri_rec_gest = cl_altri_rec_gest;
    }

    public String getCl_codice_iva() {
        return cl_codice_iva;
    }

    public void setCl_codice_iva(String cl_codice_iva) {
        this.cl_codice_iva = cl_codice_iva;
    }

    public String getCl_utilizzatore() {
        return cl_utilizzatore;
    }

    public void setCl_utilizzatore(String cl_utilizzatore) {
        this.cl_utilizzatore = cl_utilizzatore;
    }

    public String getCl_titolo_fattura() {
        return cl_titolo_fattura;
    }

    public void setCl_titolo_fattura(String cl_titolo_fattura) {
        this.cl_titolo_fattura = cl_titolo_fattura;
    }

    public String getCl_esatto_eur() {
        return cl_esatto_eur;
    }

    public void setCl_esatto_eur(String cl_esatto_eur) {
        this.cl_esatto_eur = cl_esatto_eur;
    }

    public String getCl_esatto_lis() {
        return cl_esatto_lis;
    }

    public void setCl_esatto_lis(String cl_esatto_lis) {
        this.cl_esatto_lis = cl_esatto_lis;
    }

    public Integer getInm_id() {
        return inm_id;
    }

    public void setInm_id(Integer inm_id) {
        this.inm_id = inm_id;
    }

    public String getCl_pagamento_consolidato() {
        return cl_pagamento_consolidato;
    }

    public void setCl_pagamento_consolidato(String cl_pagamento_consolidato) {
        this.cl_pagamento_consolidato = cl_pagamento_consolidato;
    }

    public String getCl_provenienza() {
        return cl_provenienza;
    }

    public void setCl_provenienza(String cl_provenienza) {
        this.cl_provenienza = cl_provenienza;
    }

    public boolean isCl_flaganagrafica() {
        return cl_flaganagrafica;
    }

    public void setCl_flaganagrafica(boolean cl_flaganagrafica) {
        this.cl_flaganagrafica = cl_flaganagrafica;
    }

    public boolean isCl_consenso() {
        return cl_consenso;
    }

    public void setCl_consenso(boolean cl_consenso) {
        this.cl_consenso = cl_consenso;
    }
    
    //@XmlTransient
    public List<ClientiBanche> getClienti_banche() {
        return clienti_banche;
    }

    public void setClienti_banche(List<ClientiBanche> clienti_banche) {
        this.clienti_banche = clienti_banche;
    }

    public List<Smobili> getSmobile() {
        return smobile;
    }

    public void setSmobile(List<Smobili> smobile) {
        this.smobile = smobile;
    }

//    public List<Codici_fatturazione> getFatturazione1() {
//        return fatturazione1;
//    }
//
//    public void setFatturazione1(List<Codici_fatturazione> fatturazione1) {
//        this.fatturazione1 = fatturazione1;
//    }

    public List<Codici_fatturazione2> getFatturazione2() {
        return fatturazione2;
    }

    public void setFatturazione2(List<Codici_fatturazione2> fatturazione2) {
        this.fatturazione2 = fatturazione2;
    }

    
    
    
    
}
