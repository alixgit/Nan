package it.sensei.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Clienti.class)
public abstract class Clienti_ {

	public static volatile SingularAttribute<Clienti, String> cl_altri_rec_gest;
	public static volatile SingularAttribute<Clienti, String> cl_partiva_iva;
	public static volatile SingularAttribute<Clienti, String> cl_pagamento_consolidato;
	public static volatile SingularAttribute<Clienti, String> cl_codice;
	public static volatile SingularAttribute<Clienti, String> cl_ragione_cognome;
	public static volatile SingularAttribute<Clienti, String> cl_nazione;
	public static volatile SingularAttribute<Clienti, String> cl_esatto_lis;
	public static volatile SingularAttribute<Clienti, String> cl_titolo;
	public static volatile SingularAttribute<Clienti, String> cl_nazione_nascita;
	public static volatile SingularAttribute<Clienti, String> cl_codice_fiscale;
	public static volatile SingularAttribute<Clienti, String> cl_provincia;
	public static volatile SingularAttribute<Clienti, String> cl_altri_rec_fatt;
	public static volatile SingularAttribute<Clienti, String> cl_email;
	public static volatile SingularAttribute<Clienti, String> cl_provenienza;
	public static volatile SingularAttribute<Clienti, String> cl_indirizzo;
	public static volatile SingularAttribute<Clienti, Date> cl_data_nascita;
	public static volatile SingularAttribute<Clienti, Date> cl_data_inserimento;
	public static volatile SingularAttribute<Clienti, Boolean> cl_consenso;
	public static volatile SingularAttribute<Clienti, Integer> inm_id;
	public static volatile SingularAttribute<Clienti, String> cl_codice_iva;
	public static volatile ListAttribute<Clienti, ClientiBanche> clienti_banche;
	public static volatile SingularAttribute<Clienti, String> cl_citta;
	public static volatile SingularAttribute<Clienti, String> cl_attivita;
	public static volatile SingularAttribute<Clienti, String> cl_utilizzatore;
	public static volatile SingularAttribute<Clienti, String> cl_op_creazione;
	public static volatile SingularAttribute<Clienti, String> cl_civico;
	public static volatile SingularAttribute<Clienti, String> cl_citta_nascita;
	public static volatile SingularAttribute<Clienti, Integer> util_id;
	public static volatile SingularAttribute<Clienti, String> cl_note;
	public static volatile SingularAttribute<Clienti, String> cl_cap;
	public static volatile SingularAttribute<Clienti, Integer> cl_id;
	public static volatile SingularAttribute<Clienti, String> cl_provincia_nascita;
	public static volatile SingularAttribute<Clienti, Boolean> cl_flaganagrafica;
	public static volatile SingularAttribute<Clienti, String> cl_titolo_fattura;
	public static volatile SingularAttribute<Clienti, String> cl_op_ultima_mod;
	public static volatile SingularAttribute<Clienti, String> cl_esatto_eur;
	public static volatile SingularAttribute<Clienti, String> cl_note_fatturazione;
	public static volatile ListAttribute<Clienti, Codici_fatturazione2> fatturazione2;
	public static volatile SingularAttribute<Clienti, Date> cl_data_ultima_mod;
	public static volatile ListAttribute<Clienti, Smobili> smobile;
	public static volatile SingularAttribute<Clienti, String> cl_nome;

}

