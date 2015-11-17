
package it.sensei.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(name="smobili")
@XmlRootElement
public class Smobili implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "smob_id")
    private Integer smob_id;
    
    @Column(name = "smob_code")
    private String smob_code;
    
    @Column(name = "smob_nome")
    private String smob_nome;
    
//    @Column(name = "cl_id")
//    private Integer cl_id;
    
    @Column(name = "pm_id")
    private Integer pm_id;
    
    @Column(name = "inm_id")
    private Integer inm_id;
    
    @Column(name = "mo_id")
    private Integer mo_id;
    
    @Column(name = "sm_id")
     private Integer sm_id;
    
    @Column(name = "ab_id")
    private Integer ab_id;
    
    @Column(name = "clba_id")
    private Integer clba_id;
    
    @Column(name = "smob_stato_sistema")
    private String smob_stato_sistema;
    
    @Column(name = "smob_stato_mobile")
    private String smob_stato_mobile;
    
    @Column(name = "smob_stato_abbon")
    private String smob_stato_abbon;
    
    @Column(name = "smob_stato_centrale")
    private String smob_stato_centrale;
    
    @Column(name = "smob_data_inserimento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date smob_data_inserimento;
    
    @Column(name = "smob_op_creazione")
    private String smob_op_creazione;
     
     
    @Column(name = "smob_data_collaudo")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date smob_data_collaudo ;
    
    @Column(name = "smob_note")
    private String smob_note;
    
    @Column(name = "smob_centrale")
    private String smob_centrale;
    
    
    @Column(name = "smob_data_ultima_mod")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date smob_data_ultima_mod;
    
    @Column(name = "smob_op_ultima_mod")
    private String smob_op_ultima_mod ;
    
    @Column(name = "smob_rif_contovendita")
    private String smob_rif_contovendita;
    
    @Column(name = "smob_attivo")
    private String smob_attivo;
    
    @Column(name = "smob_tipologia")
    private String smob_tipologia;
    
    @Column(name = "smob_certcoll")
    private Integer smob_certcoll;
    
    @Column(name = "smob_opwat")
    private String smob_opwat;
    
    
    @Column(name = "smob_timewat")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date smob_timewat ;
    
    @Column(name = "smob_masc")
    private String smob_masc;
    
    @Column(name = "smob_codice_iva")
    private String smob_codice_iva;
    
    @Column(name = "smob_ex_centrale")
    private String smob_ex_centrale;
    
    @Column(name = "smob_provenienza")
    private String smob_provenienza;
    
    @Column(name = "smob_flagcontratto")
    private boolean smob_flagcontratto;
    
    @Column(name = "cl_id_secondario")
    private Integer cl_id_secondario;
    
    
    @Column(name = "smob_con_hardware")
    private boolean smob_con_hardware;
    
    
    @Column(name = "smob_contratto")
    private String smob_contratto;
    
    
    @Column(name = "smob_dealer")
    private boolean smob_dealer;
    
    @ManyToOne
    @JoinColumn(name="CL_ID")
    private Clienti cliente2;

    public Smobili() {
    }

    public Smobili(Integer smob_id, String smob_code, String smob_nome, Integer pm_id, Integer inm_id, Integer mo_id, Integer sm_id, Integer ab_id, Integer clba_id, String smob_stato_sistema, String smob_stato_mobile, String smob_stato_abbon, String smob_stato_centrale, Date smob_data_inserimento, String smob_op_creazione, Date smob_data_collaudo, String smob_note, String smob_centrale, Date smob_data_ultima_mod, String smob_op_ultima_mod, String smob_rif_contovendita, String smob_attivo, String smob_tipologia, Integer smob_certcoll, String smob_opwat, Date smob_timewat, String smob_masc, String smob_codice_iva, String smob_ex_centrale, String smob_provenienza, boolean smob_flagcontratto, Integer cl_id_secondario, boolean smob_con_hardware, String smob_contratto, boolean smob_dealer) {
        this.smob_id = smob_id;
        this.smob_code = smob_code;
        this.smob_nome = smob_nome;
//        this.cl_id = cl_id;
        this.pm_id = pm_id;
        this.inm_id = inm_id;
        this.mo_id = mo_id;
        this.sm_id = sm_id;
        this.ab_id = ab_id;
        this.clba_id = clba_id;
        this.smob_stato_sistema = smob_stato_sistema;
        this.smob_stato_mobile = smob_stato_mobile;
        this.smob_stato_abbon = smob_stato_abbon;
        this.smob_stato_centrale = smob_stato_centrale;
        this.smob_data_inserimento = smob_data_inserimento;
        this.smob_op_creazione = smob_op_creazione;
        this.smob_data_collaudo = smob_data_collaudo;
        this.smob_note = smob_note;
        this.smob_centrale = smob_centrale;
        this.smob_data_ultima_mod = smob_data_ultima_mod;
        this.smob_op_ultima_mod = smob_op_ultima_mod;
        this.smob_rif_contovendita = smob_rif_contovendita;
        this.smob_attivo = smob_attivo;
        this.smob_tipologia = smob_tipologia;
        this.smob_certcoll = smob_certcoll;
        this.smob_opwat = smob_opwat;
        this.smob_timewat = smob_timewat;
        this.smob_masc = smob_masc;
        this.smob_codice_iva = smob_codice_iva;
        this.smob_ex_centrale = smob_ex_centrale;
        this.smob_provenienza = smob_provenienza;
        this.smob_flagcontratto = smob_flagcontratto;
        this.cl_id_secondario = cl_id_secondario;
        this.smob_con_hardware = smob_con_hardware;
        this.smob_contratto = smob_contratto;
        this.smob_dealer = smob_dealer;
    }

    public Integer getSmob_id() {
        return smob_id;
    }

    public void setSmob_id(Integer smob_id) {
        this.smob_id = smob_id;
    }

    public String getSmob_code() {
        return smob_code;
    }

    public void setSmob_code(String smob_code) {
        this.smob_code = smob_code;
    }

    public String getSmob_nome() {
        return smob_nome;
    }

    public void setSmob_nome(String smob_nome) {
        this.smob_nome = smob_nome;
    }

//    public Integer getCl_id() {
//        return cl_id;
//    }
//
//    public void setCl_id(Integer cl_id) {
//        this.cl_id = cl_id;
//    }

    public Integer getPm_id() {
        return pm_id;
    }

    public void setPm_id(Integer pm_id) {
        this.pm_id = pm_id;
    }

    public Integer getInm_id() {
        return inm_id;
    }

    public void setInm_id(Integer inm_id) {
        this.inm_id = inm_id;
    }

    public Integer getMo_id() {
        return mo_id;
    }

    public void setMo_id(Integer mo_id) {
        this.mo_id = mo_id;
    }

    public Integer getSm_id() {
        return sm_id;
    }

    public void setSm_id(Integer sm_id) {
        this.sm_id = sm_id;
    }

    public Integer getAb_id() {
        return ab_id;
    }

    public void setAb_id(Integer ab_id) {
        this.ab_id = ab_id;
    }

    public Integer getClba_id() {
        return clba_id;
    }

    public void setClba_id(Integer clba_id) {
        this.clba_id = clba_id;
    }

    public String getSmob_stato_sistema() {
        return smob_stato_sistema;
    }

    public void setSmob_stato_sistema(String smob_stato_sistema) {
        this.smob_stato_sistema = smob_stato_sistema;
    }

    public String getSmob_stato_mobile() {
        return smob_stato_mobile;
    }

    public void setSmob_stato_mobile(String smob_stato_mobile) {
        this.smob_stato_mobile = smob_stato_mobile;
    }

    public String getSmob_stato_abbon() {
        return smob_stato_abbon;
    }

    public void setSmob_stato_abbon(String smob_stato_abbon) {
        this.smob_stato_abbon = smob_stato_abbon;
    }

    public String getSmob_stato_centrale() {
        return smob_stato_centrale;
    }

    public void setSmob_stato_centrale(String smob_stato_centrale) {
        this.smob_stato_centrale = smob_stato_centrale;
    }

    public Date getSmob_data_inserimento() {
        return smob_data_inserimento;
    }

    public void setSmob_data_inserimento(Date smob_data_inserimento) {
        this.smob_data_inserimento = smob_data_inserimento;
    }

    public String getSmob_op_creazione() {
        return smob_op_creazione;
    }

    public void setSmob_op_creazione(String smob_op_creazione) {
        this.smob_op_creazione = smob_op_creazione;
    }

    public Date getSmob_data_collaudo() {
        return smob_data_collaudo;
    }

    public void setSmob_data_collaudo(Date smob_data_collaudo) {
        this.smob_data_collaudo = smob_data_collaudo;
    }

    public String getSmob_note() {
        return smob_note;
    }

    public void setSmob_note(String smob_note) {
        this.smob_note = smob_note;
    }

    public String getSmob_centrale() {
        return smob_centrale;
    }

    public void setSmob_centrale(String smob_centrale) {
        this.smob_centrale = smob_centrale;
    }

    public Date getSmob_data_ultima_mod() {
        return smob_data_ultima_mod;
    }

    public void setSmob_data_ultima_mod(Date smob_data_ultima_mod) {
        this.smob_data_ultima_mod = smob_data_ultima_mod;
    }

    public String getSmob_op_ultima_mod() {
        return smob_op_ultima_mod;
    }

    public void setSmob_op_ultima_mod(String smob_op_ultima_mod) {
        this.smob_op_ultima_mod = smob_op_ultima_mod;
    }

    public String getSmob_rif_contovendita() {
        return smob_rif_contovendita;
    }

    public void setSmob_rif_contovendita(String smob_rif_contovendita) {
        this.smob_rif_contovendita = smob_rif_contovendita;
    }

    public String getSmob_attivo() {
        return smob_attivo;
    }

    public void setSmob_attivo(String smob_attivo) {
        this.smob_attivo = smob_attivo;
    }

    public String getSmob_tipologia() {
        return smob_tipologia;
    }

    public void setSmob_tipologia(String smob_tipologia) {
        this.smob_tipologia = smob_tipologia;
    }

    public Integer getSmob_certcoll() {
        return smob_certcoll;
    }

    public void setSmob_certcoll(Integer smob_certcoll) {
        this.smob_certcoll = smob_certcoll;
    }

    public String getSmob_opwat() {
        return smob_opwat;
    }

    public void setSmob_opwat(String smob_opwat) {
        this.smob_opwat = smob_opwat;
    }

    public Date getSmob_timewat() {
        return smob_timewat;
    }

    public void setSmob_timewat(Date smob_timewat) {
        this.smob_timewat = smob_timewat;
    }

    public String getSmob_masc() {
        return smob_masc;
    }

    public void setSmob_masc(String smob_masc) {
        this.smob_masc = smob_masc;
    }

    public String getSmob_codice_iva() {
        return smob_codice_iva;
    }

    public void setSmob_codice_iva(String smob_codice_iva) {
        this.smob_codice_iva = smob_codice_iva;
    }

    public String getSmob_ex_centrale() {
        return smob_ex_centrale;
    }

    public void setSmob_ex_centrale(String smob_ex_centrale) {
        this.smob_ex_centrale = smob_ex_centrale;
    }

    public String getSmob_provenienza() {
        return smob_provenienza;
    }

    public void setSmob_provenienza(String smob_provenienza) {
        this.smob_provenienza = smob_provenienza;
    }

    public boolean isSmob_flagcontratto() {
        return smob_flagcontratto;
    }

    public void setSmob_flagcontratto(boolean smob_flagcontratto) {
        this.smob_flagcontratto = smob_flagcontratto;
    }

    public Integer getCl_id_secondario() {
        return cl_id_secondario;
    }

    public void setCl_id_secondario(Integer cl_id_secondario) {
        this.cl_id_secondario = cl_id_secondario;
    }

    public boolean isSmob_con_hardware() {
        return smob_con_hardware;
    }

    public void setSmob_con_hardware(boolean smob_con_hardware) {
        this.smob_con_hardware = smob_con_hardware;
    }

    public String getSmob_contratto() {
        return smob_contratto;
    }

    public void setSmob_contratto(String smob_contratto) {
        this.smob_contratto = smob_contratto;
    }

    public boolean isSmob_dealer() {
        return smob_dealer;
    }

    public void setSmob_dealer(boolean smob_dealer) {
        this.smob_dealer = smob_dealer;
    }

    @XmlTransient
    public Clienti getCliente2() {
        return cliente2;
    }

    public void setCliente2(Clienti cliente2) {
        this.cliente2 = cliente2;
    }
    
    
    
}
