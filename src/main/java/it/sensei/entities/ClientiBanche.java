
package it.sensei.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name="clienti_banche")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClientiBanche.findAll", query = "SELECT c FROM ClientiBanche c")})
public class ClientiBanche implements Serializable {
    
    
    @Id
    @Column(name = "clba_id")
    private Integer clba_id;

    @Column(name = "clba_cc")
    private String clba_cc;
    
    @Column(name = "clba_forma_pagam1")
    private String clba_forma_pagam1;
    
    @Column(name = "clba_forma_pagam2")
    private String clba_forma_pagam2;
    
    @Column(name = "clba_cin")
    private String clba_cin;
    
    @Column(name = "clba_iban")
    private String clba_iban;
    
    @Column(name = "clba_intestatario")
    private String clba_intestatario;
    
    @Column(name = "clba_nome")
    private String clba_nome;
    
    @Column(name = "clba_cognome")
    private String clba_cognome;
    
    @Column(name = "clba_codice_fiscale")
    private String clba_codice_fiscale;
    
    @ManyToOne
    @JoinColumn(name="CL_ID")
    private Clienti cliente;
    
    @ManyToOne
    @JoinColumn(name="BA_ID")
    private Banche banca;
    
    

    public ClientiBanche() {
    }

    public ClientiBanche(Integer clba_id, String clba_cc, String clba_forma_pagam1, String clba_forma_pagam2, String clba_cin, String clba_iban, String clba_intestatario, String clba_nome, String clba_cognome, String clba_codice_fiscale) {
        this.clba_id = clba_id;
        this.clba_cc = clba_cc;
        this.clba_forma_pagam1 = clba_forma_pagam1;
        this.clba_forma_pagam2 = clba_forma_pagam2;
        this.clba_cin = clba_cin;
        this.clba_iban = clba_iban;
        this.clba_intestatario = clba_intestatario;
        this.clba_nome = clba_nome;
        this.clba_cognome = clba_cognome;
        this.clba_codice_fiscale = clba_codice_fiscale;
    }

    public Integer getClba_id() {
        return clba_id;
    }

    public void setClba_id(Integer clba_id) {
        this.clba_id = clba_id;
    }

    public String getClba_cc() {
        return clba_cc;
    }

    public void setClba_cc(String clba_cc) {
        this.clba_cc = clba_cc;
    }

    public String getClba_forma_pagam1() {
        return clba_forma_pagam1;
    }

    public void setClba_forma_pagam1(String clba_forma_pagam1) {
        this.clba_forma_pagam1 = clba_forma_pagam1;
    }

    public String getClba_forma_pagam2() {
        return clba_forma_pagam2;
    }

    public void setClba_forma_pagam2(String clba_forma_pagam2) {
        this.clba_forma_pagam2 = clba_forma_pagam2;
    }

    public String getClba_cin() {
        return clba_cin;
    }

    public void setClba_cin(String clba_cin) {
        this.clba_cin = clba_cin;
    }

    public String getClba_iban() {
        return clba_iban;
    }

    public void setClba_iban(String clba_iban) {
        this.clba_iban = clba_iban;
    }

    public String getClba_intestatario() {
        return clba_intestatario;
    }

    public void setClba_intestatario(String clba_intestatario) {
        this.clba_intestatario = clba_intestatario;
    }

    public String getClba_nome() {
        return clba_nome;
    }

    public void setClba_nome(String clba_nome) {
        this.clba_nome = clba_nome;
    }

    public String getClba_cognome() {
        return clba_cognome;
    }

    public void setClba_cognome(String clba_cognome) {
        this.clba_cognome = clba_cognome;
    }

    public String getClba_codice_fiscale() {
        return clba_codice_fiscale;
    }

    public void setClba_codice_fiscale(String clba_codice_fiscale) {
        this.clba_codice_fiscale = clba_codice_fiscale;
    }

    @XmlTransient
    public Clienti getCliente() {
        return cliente;
    }

    public void setCliente(Clienti cliente) {
        this.cliente = cliente;
    }

    
    public Banche getBanca() {
        return banca;
    }

    public void setBanca(Banche banca) {
        this.banca = banca;
    }

    
}
