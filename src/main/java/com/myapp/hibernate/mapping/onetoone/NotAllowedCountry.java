package com.myapp.hibernate.mapping.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "NOT_ALLOWED_COUNTRY")
public class NotAllowedCountry {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO) // for SINGLE_TABLE or JOINED
    //@GeneratedValue(strategy=GenerationType.TABLE) // for TABLE_PER_CLASS : If you got this error "Cannot use identity column key generation with <union-subclass> mapping" then uncomment this line
    @Column(name = "id")
    private int id;

	@Column(name = "not_allowed_register_country", nullable = false)
	private Boolean notAllowedRegisterCountry = false;

	@Column(name = "not_allowed_business_country", nullable = false)
	private Boolean notAllowedBusinessCountry = false;

	@Column(name = "not_Allowed_UBO", nullable = false)
	private Boolean notAllowedUBO = false;

	@Column(name = "not_Allowed_UBO_Citizenship", nullable = false)
	private Boolean notAllowedUBOCitizenship = false;

	@OneToOne(targetEntity = Country.class, optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id")
	private Country country;
	
	public Boolean getNotAllowedRegisterCountry() {
		return notAllowedRegisterCountry;
	}

	public void setNotAllowedRegisterCountry(Boolean notAllowedRegisterCountry) {
		this.notAllowedRegisterCountry = notAllowedRegisterCountry;
	}

	public Boolean getNotAllowedBusinessCountry() {
		return notAllowedBusinessCountry;
	}

	public void setNotAllowedBusinessCountry(Boolean notAllowedBusinessCountry) {
		this.notAllowedBusinessCountry = notAllowedBusinessCountry;
	}

	public Boolean getNotAllowedUBO() {
		return notAllowedUBO;
	}

	public void setNotAllowedUBO(Boolean notAllowedUBO) {
		this.notAllowedUBO = notAllowedUBO;
	}

	public Boolean getNotAllowedUBOCitizenship() {
		return notAllowedUBOCitizenship;
	}

	public void setNotAllowedUBOCitizenship(Boolean notAllowedUBOCitizenship) {
		this.notAllowedUBOCitizenship = notAllowedUBOCitizenship;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	
}
