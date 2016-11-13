package org.thomas.java.dto;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="USER_DETAILS")
public class UserDetails {
	@Id @GeneratedValue
	private int userId;	
	private String userName;
	private String userAdd1;
	private String userAdd2;
	private String userCountry;
	@Temporal (TemporalType.DATE)
	private Date userDOB;
	@Lob 
	private String userDesc;
	@Embedded
	@AttributeOverrides ({
		@AttributeOverride (name="street", column=@Column(name="HOME_STREET")),
		@AttributeOverride (name="block", column=@Column(name="HOME_BLOCK")),
		@AttributeOverride (name="city", column=@Column(name="HOME_CITY")),
		@AttributeOverride (name="state", column=@Column(name="HOME_STATE")),
		@AttributeOverride (name="country", column=@Column(name="HOME_COUNTRY")),
		@AttributeOverride (name="postalcode", column=@Column(name="HOME_POSTALCODE"))			
	})	
	private Address officeAddress;
	@Embedded
	private Address homeAddress;
	
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAdd1() {
		return userAdd1;
	}
	public void setUserAdd1(String userAdd1) {
		this.userAdd1 = userAdd1;
	}
	public String getUserAdd2() {
		return userAdd2;
	}
	public void setUserAdd2(String userAdd2) {
		this.userAdd2 = userAdd2;
	}
	public String getUserCountry() {
		return userCountry;
	}
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}
	public Date getUserDOB() {
		return userDOB;
	}
	public void setUserDOB(Date userDOB) {
		this.userDOB = userDOB;
	}
	public String getUserDesc() {
		return userDesc;
	}
	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	

}
