package com.myapp.hibernate.mapping.onetoone;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "COUNTRY")
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE) //Least normalisation strategy
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) //slightly more normalized1
//@Inheritance(strategy=InheritanceType.JOINED)//Highly normalized
public class Country {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) // for SINGLE_TABLE or JOINED
    //@GeneratedValue(strategy=GenerationType.TABLE) // for TABLE_PER_CLASS : If you got this error "Cannot use identity column key generation with <union-subclass> mapping" then uncomment this line
    @Column(name = "id")
    private int id;
	
	@Column(length = 70, nullable = false)
	private String name;

	@Column(name = "iso_alpha_3", length = 3)
	private String isoAlpha3;

	@Column(name = "iso_alpha_2", length = 2)
	private String isoAlpha2;

	@Column(name = "iso_numeric", length = 3)
	private String isoNumeric;

	
	@Column(name = "not_allowed", nullable = false)
	private Boolean notAllowed = false;

	//remove this mapping if you dont need inverse join
	@OneToOne(mappedBy="country")
	private NotAllowedCountry notAllowedCountry;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getIsoAlpha3() {
		return isoAlpha3;
	}


	public void setIsoAlpha3(String isoAlpha3) {
		this.isoAlpha3 = isoAlpha3;
	}


	public String getIsoAlpha2() {
		return isoAlpha2;
	}


	public void setIsoAlpha2(String isoAlpha2) {
		this.isoAlpha2 = isoAlpha2;
	}


	public String getIsoNumeric() {
		return isoNumeric;
	}


	public void setIsoNumeric(String isoNumeric) {
		this.isoNumeric = isoNumeric;
	}


	public Boolean getNotAllowed() {
		return notAllowed;
	}


	public void setNotAllowed(Boolean notAllowed) {
		this.notAllowed = notAllowed;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public NotAllowedCountry getNotAllowedCountry() {
		return notAllowedCountry;
	}


	public void setNotAllowedCountry(NotAllowedCountry notAllowedCountry) {
		this.notAllowedCountry = notAllowedCountry;
	}


}
