package it.sensei.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Banche.class)
public abstract class Banche_ {

	public static volatile SingularAttribute<Banche, String> ba_flag_a;
	public static volatile SingularAttribute<Banche, String> ba_abi;
	public static volatile SingularAttribute<Banche, String> ba_numerico1;
	public static volatile SingularAttribute<Banche, Integer> ba_id;
	public static volatile SingularAttribute<Banche, String> ba_cab;
	public static volatile SingularAttribute<Banche, String> ba_testo1;
	public static volatile SingularAttribute<Banche, String> ba_indirizzo;
	public static volatile SingularAttribute<Banche, String> ba_provincia;
	public static volatile SingularAttribute<Banche, String> ba_code;
	public static volatile SingularAttribute<Banche, String> ba_numerico2;
	public static volatile SingularAttribute<Banche, String> ba_agenzia;
	public static volatile SingularAttribute<Banche, String> ba_citta;
	public static volatile SingularAttribute<Banche, String> ba_cap;
	public static volatile SingularAttribute<Banche, String> ba_nuovo;
	public static volatile ListAttribute<Banche, ClientiBanche> clienti_banca;
	public static volatile SingularAttribute<Banche, String> ba_cin;
	public static volatile SingularAttribute<Banche, String> ba_nome;

}

