package it.sensei.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ClientiBanche.class)
public abstract class ClientiBanche_ {

	public static volatile SingularAttribute<ClientiBanche, String> clba_cognome;
	public static volatile SingularAttribute<ClientiBanche, Clienti> cliente;
	public static volatile SingularAttribute<ClientiBanche, Banche> banca;
	public static volatile SingularAttribute<ClientiBanche, String> clba_nome;
	public static volatile SingularAttribute<ClientiBanche, String> clba_forma_pagam2;
	public static volatile SingularAttribute<ClientiBanche, Integer> clba_id;
	public static volatile SingularAttribute<ClientiBanche, String> clba_forma_pagam1;
	public static volatile SingularAttribute<ClientiBanche, String> clba_cc;
	public static volatile SingularAttribute<ClientiBanche, String> clba_cin;
	public static volatile SingularAttribute<ClientiBanche, String> clba_iban;
	public static volatile SingularAttribute<ClientiBanche, String> clba_codice_fiscale;
	public static volatile SingularAttribute<ClientiBanche, String> clba_intestatario;

}

