
package it.sensei.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(name="codici_fatturazione")
@XmlRootElement
public class Codici_fatturazione implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cdft_id")
    private Integer cdft_id;
    
    @Column(name = "cdft_descrizione")
    private String cdft_descrizione;
    
    @Column(name = "cdft_valore")
    private String cdft_valore;
    
    @Column(name = "cdft_cobra")
    private String cdft_cobra;
    
//    @ManyToOne
//    //@JoinTable(name="codici_fatturazione", joinColumns={@JoinColumn(name="cdft_descrizion", referencedColumnName="cl_pagamento_consolidato")}); , inverseJoinColumns = {@JoinColumn(name = "cl_pagamento_consolidato")}
//    @JoinTable (name="codici_fatturazione", joinColumns = {@JoinColumn(name = "cdft_descrizione", referencedColumnName= "cl_pagamento_consolidato")})
//    //@JoinColumn(name="cl_pagamento_consolidato")
//    private Clienti cliente3;
    

    public Codici_fatturazione() {
    }

    public Codici_fatturazione(Integer cdft_id,String cdft_descrizione, String cdft_valore, String cdft_cobra) {
        this.cdft_id = cdft_id;
        this.cdft_descrizione = cdft_descrizione;
        this.cdft_valore = cdft_valore;
        this.cdft_cobra = cdft_cobra;
    }

    public Integer getCdft_id() {
        return cdft_id;
    }

    public void setCdft_id(Integer cdft_id) {
        this.cdft_id = cdft_id;
    }

    public String getCdft_descrizione() {
        return cdft_descrizione;
    }

    public void setCdft_descrizione(String cdft_descrizione) {
        this.cdft_descrizione = cdft_descrizione;
    }

    public String getCdft_valore() {
        return cdft_valore;
    }

    public void setCdft_valore(String cdft_valore) {
        this.cdft_valore = cdft_valore;
    }

    public String getCdft_cobra() {
        return cdft_cobra;
    }

    public void setCdft_cobra(String cdft_cobra) {
        this.cdft_cobra = cdft_cobra;
    }
    
//    @XmlTransient
//    public Clienti getCliente3() {
//        return cliente3;
//    }
//
//    public void setCliente3(Clienti cliente3) {
//        this.cliente3 = cliente3;
//    }
    
}
