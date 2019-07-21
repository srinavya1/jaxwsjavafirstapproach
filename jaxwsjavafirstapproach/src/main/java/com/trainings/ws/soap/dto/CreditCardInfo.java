package com.trainings.ws.soap.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CreditCardInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditCardInfo {
@XmlElement(name="cardNumber" ,required =true)
	String cardNumber;
@XmlElement(name="expiryDate" ,required =true)
	private Date expiryDate;
@XmlElement(name="firstName" ,required =true)
	String firstName;
@XmlElement(name="lastName" ,required =true)
	String lastName;
@XmlElement(name="secCode" ,required =true)
	String secCode;
@XmlElement(name="Address" ,required =true)
	String Address;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSecCode() {
		return secCode;
	}

	public void setSecCode(String secCode) {
		this.secCode = secCode;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Date getExpirtyDate() {
		return expiryDate;
	}

	public void setExpirtyDate(Date expirtyDate) {
		this.expiryDate = expirtyDate;
	}

}
