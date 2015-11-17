
package it.sensei.nanproject;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "clientinucleo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientinucleo.findAll", query = "SELECT c FROM Clientinucleo c"),
    @NamedQuery(name = "Clientinucleo.findByCodCliente", query = "SELECT c FROM Clientinucleo c WHERE c.codCliente = :codCliente"),
    @NamedQuery(name = "Clientinucleo.findByCap", query = "SELECT c FROM Clientinucleo c WHERE c.cap = :cap"),
    @NamedQuery(name = "Clientinucleo.findByCcCodFiscale", query = "SELECT c FROM Clientinucleo c WHERE c.ccCodFiscale = :ccCodFiscale"),
    @NamedQuery(name = "Clientinucleo.findByCcCognome", query = "SELECT c FROM Clientinucleo c WHERE c.ccCognome = :ccCognome"),
    @NamedQuery(name = "Clientinucleo.findByCcIban", query = "SELECT c FROM Clientinucleo c WHERE c.ccIban = :ccIban"),
    @NamedQuery(name = "Clientinucleo.findByCcIntestatario", query = "SELECT c FROM Clientinucleo c WHERE c.ccIntestatario = :ccIntestatario"),
    @NamedQuery(name = "Clientinucleo.findByCcNome", query = "SELECT c FROM Clientinucleo c WHERE c.ccNome = :ccNome"),
    @NamedQuery(name = "Clientinucleo.findByCellulare", query = "SELECT c FROM Clientinucleo c WHERE c.cellulare = :cellulare"),
    @NamedQuery(name = "Clientinucleo.findByCitta", query = "SELECT c FROM Clientinucleo c WHERE c.citta = :citta"),
    @NamedQuery(name = "Clientinucleo.findByCivico", query = "SELECT c FROM Clientinucleo c WHERE c.civico = :civico"),
    @NamedQuery(name = "Clientinucleo.findByClDataUltimaMod", query = "SELECT c FROM Clientinucleo c WHERE c.clDataUltimaMod = :clDataUltimaMod"),
    @NamedQuery(name = "Clientinucleo.findByCodFiscale", query = "SELECT c FROM Clientinucleo c WHERE c.codFiscale = :codFiscale"),
    @NamedQuery(name = "Clientinucleo.findByCodIva", query = "SELECT c FROM Clientinucleo c WHERE c.codIva = :codIva"),
    @NamedQuery(name = "Clientinucleo.findByCodPagamento", query = "SELECT c FROM Clientinucleo c WHERE c.codPagamento = :codPagamento"),
    @NamedQuery(name = "Clientinucleo.findByCognome", query = "SELECT c FROM Clientinucleo c WHERE c.cognome = :cognome"),
    @NamedQuery(name = "Clientinucleo.findByDscAgenzia", query = "SELECT c FROM Clientinucleo c WHERE c.dscAgenzia = :dscAgenzia"),
    @NamedQuery(name = "Clientinucleo.findByDscBanca", query = "SELECT c FROM Clientinucleo c WHERE c.dscBanca = :dscBanca"),
    @NamedQuery(name = "Clientinucleo.findByDscIva", query = "SELECT c FROM Clientinucleo c WHERE c.dscIva = :dscIva"),
    @NamedQuery(name = "Clientinucleo.findByDscPagamento", query = "SELECT c FROM Clientinucleo c WHERE c.dscPagamento = :dscPagamento"),
    @NamedQuery(name = "Clientinucleo.findByEmail", query = "SELECT c FROM Clientinucleo c WHERE c.email = :email"),
    @NamedQuery(name = "Clientinucleo.findByFgPersonaFisica", query = "SELECT c FROM Clientinucleo c WHERE c.fgPersonaFisica = :fgPersonaFisica"),
    @NamedQuery(name = "Clientinucleo.findByIndirizzo", query = "SELECT c FROM Clientinucleo c WHERE c.indirizzo = :indirizzo"),
    @NamedQuery(name = "Clientinucleo.findByNazione", query = "SELECT c FROM Clientinucleo c WHERE c.nazione = :nazione"),
    @NamedQuery(name = "Clientinucleo.findByNome", query = "SELECT c FROM Clientinucleo c WHERE c.nome = :nome"),
    @NamedQuery(name = "Clientinucleo.findByPartitaIva", query = "SELECT c FROM Clientinucleo c WHERE c.partitaIva = :partitaIva"),
    @NamedQuery(name = "Clientinucleo.findByProvincia", query = "SELECT c FROM Clientinucleo c WHERE c.provincia = :provincia"),
    @NamedQuery(name = "Clientinucleo.findByRagioneSociale", query = "SELECT c FROM Clientinucleo c WHERE c.ragioneSociale = :ragioneSociale"),
    @NamedQuery(name = "Clientinucleo.findByTitolo", query = "SELECT c FROM Clientinucleo c WHERE c.titolo = :titolo")})
public class Clientinucleo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cod_cliente")
    private String codCliente;
    @Size(max = 255)
    @Column(name = "cap")
    private String cap;
    @Size(max = 255)
    @Column(name = "cc_cod_fiscale")
    private String ccCodFiscale;
    @Size(max = 255)
    @Column(name = "cc_cognome")
    private String ccCognome;
    @Size(max = 255)
    @Column(name = "cc_iban")
    private String ccIban;
    @Size(max = 255)
    @Column(name = "cc_intestatario")
    private String ccIntestatario;
    @Size(max = 255)
    @Column(name = "cc_nome")
    private String ccNome;
    @Size(max = 255)
    @Column(name = "cellulare")
    private String cellulare;
    @Size(max = 255)
    @Column(name = "citta")
    private String citta;
    @Size(max = 255)
    @Column(name = "civico")
    private String civico;
    @Column(name = "cl_data_ultima_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clDataUltimaMod;
    @Size(max = 255)
    @Column(name = "cod_fiscale")
    private String codFiscale;
    @Size(max = 255)
    @Column(name = "cod_iva")
    private String codIva;
    @Size(max = 255)
    @Column(name = "cod_pagamento")
    private String codPagamento;
    @Size(max = 255)
    @Column(name = "cognome")
    private String cognome;
    @Size(max = 255)
    @Column(name = "dsc_agenzia")
    private String dscAgenzia;
    @Size(max = 255)
    @Column(name = "dsc_banca")
    private String dscBanca;
    @Size(max = 255)
    @Column(name = "dsc_iva")
    private String dscIva;
    @Size(max = 255)
    @Column(name = "dsc_pagamento")
    private String dscPagamento;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fg_persona_fisica")
    private int fgPersonaFisica;
    @Size(max = 255)
    @Column(name = "indirizzo")
    private String indirizzo;
    @Size(max = 255)
    @Column(name = "nazione")
    private String nazione;
    @Size(max = 255)
    @Column(name = "nome")
    private String nome;
    @Size(max = 255)
    @Column(name = "partita_iva")
    private String partitaIva;
    @Size(max = 255)
    @Column(name = "provincia")
    private String provincia;
    @Size(max = 255)
    @Column(name = "ragione_sociale")
    private String ragioneSociale;
    @Size(max = 255)
    @Column(name = "titolo")
    private String titolo;

    public Clientinucleo() {
    }

    public Clientinucleo(String codCliente) {
        this.codCliente = codCliente;
    }

    public Clientinucleo(String codCliente, int fgPersonaFisica) {
        this.codCliente = codCliente;
        this.fgPersonaFisica = fgPersonaFisica;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getCcCodFiscale() {
        return ccCodFiscale;
    }

    public void setCcCodFiscale(String ccCodFiscale) {
        this.ccCodFiscale = ccCodFiscale;
    }

    public String getCcCognome() {
        return ccCognome;
    }

    public void setCcCognome(String ccCognome) {
        this.ccCognome = ccCognome;
    }

    public String getCcIban() {
        return ccIban;
    }

    public void setCcIban(String ccIban) {
        this.ccIban = ccIban;
    }

    public String getCcIntestatario() {
        return ccIntestatario;
    }

    public void setCcIntestatario(String ccIntestatario) {
        this.ccIntestatario = ccIntestatario;
    }

    public String getCcNome() {
        return ccNome;
    }

    public void setCcNome(String ccNome) {
        this.ccNome = ccNome;
    }

    public String getCellulare() {
        return cellulare;
    }

    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getCivico() {
        return civico;
    }

    public void setCivico(String civico) {
        this.civico = civico;
    }

    public Date getClDataUltimaMod() {
        return clDataUltimaMod;
    }

    public void setClDataUltimaMod(Date clDataUltimaMod) {
        this.clDataUltimaMod = clDataUltimaMod;
    }

    public String getCodFiscale() {
        return codFiscale;
    }

    public void setCodFiscale(String codFiscale) {
        this.codFiscale = codFiscale;
    }

    public String getCodIva() {
        return codIva;
    }

    public void setCodIva(String codIva) {
        this.codIva = codIva;
    }

    public String getCodPagamento() {
        return codPagamento;
    }

    public void setCodPagamento(String codPagamento) {
        this.codPagamento = codPagamento;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDscAgenzia() {
        return dscAgenzia;
    }

    public void setDscAgenzia(String dscAgenzia) {
        this.dscAgenzia = dscAgenzia;
    }

    public String getDscBanca() {
        return dscBanca;
    }

    public void setDscBanca(String dscBanca) {
        this.dscBanca = dscBanca;
    }

    public String getDscIva() {
        return dscIva;
    }

    public void setDscIva(String dscIva) {
        this.dscIva = dscIva;
    }

    public String getDscPagamento() {
        return dscPagamento;
    }

    public void setDscPagamento(String dscPagamento) {
        this.dscPagamento = dscPagamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFgPersonaFisica() {
        return fgPersonaFisica;
    }

    public void setFgPersonaFisica(int fgPersonaFisica) {
        this.fgPersonaFisica = fgPersonaFisica;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getNazione() {
        return nazione;
    }

    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCliente != null ? codCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientinucleo)) {
            return false;
        }
        Clientinucleo other = (Clientinucleo) object;
        if ((this.codCliente == null && other.codCliente != null) || (this.codCliente != null && !this.codCliente.equals(other.codCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "it.sensei.nanproject.Clientinucleo[ codCliente=" + codCliente + " ]";
    }
    
}
