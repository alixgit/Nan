
package it.sensei.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name="banche")
@XmlRootElement
public class Banche implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ba_id")
    private Integer ba_id;
    
    @Column(name = "ba_code")
    private String ba_code;
    
    @Column(name = "ba_flag_a")
    private String ba_flag_a;
    
    @Column(name = "ba_numerico1")
    private String ba_numerico1;
    
    @Column(name = "ba_numerico2")
    private String ba_numerico2;
    
    @Column(name = "ba_abi")
    private String ba_abi;
    
    @Column(name = "ba_cab")
    private String ba_cab;
    
    @Column(name = "ba_nome")
    private String ba_nome;
    
    @Column(name = "ba_agenzia")
    private String ba_agenzia;
    
    @Column(name = "ba_indirizzo")
    private String ba_indirizzo;
    
    @Column(name = "ba_citta")
    private String ba_citta;
    
    @Column(name = "ba_cap")
    private String ba_cap;
    
    @Column(name = "ba_testo1")
    private String ba_testo1;
    
    @Column(name = "ba_nuovo")
    private String ba_nuovo;
    
    @Column(name = "ba_provincia")
    private String ba_provincia;
    
    @Column(name = "ba_cin")
    private String ba_cin;
    
    @OneToMany
    (mappedBy="banca", fetch = FetchType.EAGER)
    private List<ClientiBanche> clienti_banca;
    

    public Banche() {
    }

    public Banche(Integer ba_id, String ba_code, String ba_flag_a, String ba_numerico1, String ba_numerico2, String ba_abi, String ba_cab, String ba_nome, String ba_agenzia, String ba_indirizzo, String ba_citta, String ba_cap, String ba_testo1, String ba_nuovo, String ba_provincia, String ba_cin) {
        this.ba_id = ba_id;
        this.ba_code = ba_code;
        this.ba_flag_a = ba_flag_a;
        this.ba_numerico1 = ba_numerico1;
        this.ba_numerico2 = ba_numerico2;
        this.ba_abi = ba_abi;
        this.ba_cab = ba_cab;
        this.ba_nome = ba_nome;
        this.ba_agenzia = ba_agenzia;
        this.ba_indirizzo = ba_indirizzo;
        this.ba_citta = ba_citta;
        this.ba_cap = ba_cap;
        this.ba_testo1 = ba_testo1;
        this.ba_nuovo = ba_nuovo;
        this.ba_provincia = ba_provincia;
        this.ba_cin = ba_cin;
    }

    public Integer getBa_id() {
        return ba_id;
    }

    public void setBa_id(Integer ba_id) {
        this.ba_id = ba_id;
    }

    public String getBa_code() {
        return ba_code;
    }

    public void setBa_code(String ba_code) {
        this.ba_code = ba_code;
    }

    public String getBa_flag_a() {
        return ba_flag_a;
    }

    public void setBa_flag_a(String ba_flag_a) {
        this.ba_flag_a = ba_flag_a;
    }

    public String getBa_numerico1() {
        return ba_numerico1;
    }

    public void setBa_numerico1(String ba_numerico1) {
        this.ba_numerico1 = ba_numerico1;
    }

    public String getBa_numerico2() {
        return ba_numerico2;
    }

    public void setBa_numerico2(String ba_numerico2) {
        this.ba_numerico2 = ba_numerico2;
    }

    public String getBa_abi() {
        return ba_abi;
    }

    public void setBa_abi(String ba_abi) {
        this.ba_abi = ba_abi;
    }

    public String getBa_cab() {
        return ba_cab;
    }

    public void setBa_cab(String ba_cab) {
        this.ba_cab = ba_cab;
    }

    public String getBa_nome() {
        return ba_nome;
    }

    public void setBa_nome(String ba_nome) {
        this.ba_nome = ba_nome;
    }

    public String getBa_agenzia() {
        return ba_agenzia;
    }

    public void setBa_agenzia(String ba_agenzia) {
        this.ba_agenzia = ba_agenzia;
    }

    public String getBa_indirizzo() {
        return ba_indirizzo;
    }

    public void setBa_indirizzo(String ba_indirizzo) {
        this.ba_indirizzo = ba_indirizzo;
    }

    public String getBa_citta() {
        return ba_citta;
    }

    public void setBa_citta(String ba_citta) {
        this.ba_citta = ba_citta;
    }

    public String getBa_cap() {
        return ba_cap;
    }

    public void setBa_cap(String ba_cap) {
        this.ba_cap = ba_cap;
    }

    public String getBa_testo1() {
        return ba_testo1;
    }

    public void setBa_testo1(String ba_testo1) {
        this.ba_testo1 = ba_testo1;
    }

    public String getBa_nuovo() {
        return ba_nuovo;
    }

    public void setBa_nuovo(String ba_nuovo) {
        this.ba_nuovo = ba_nuovo;
    }

    public String getBa_provincia() {
        return ba_provincia;
    }

    public void setBa_provincia(String ba_provincia) {
        this.ba_provincia = ba_provincia;
    }

    public String getBa_cin() {
        return ba_cin;
    }

    public void setBa_cin(String ba_cin) {
        this.ba_cin = ba_cin;
    }
    
    @XmlTransient
    public List<ClientiBanche> getClienti_banca() {
        return clienti_banca;
    }

    public void setClienti_banca(List<ClientiBanche> clienti_banca) {
        this.clienti_banca = clienti_banca;
    }

    
}
