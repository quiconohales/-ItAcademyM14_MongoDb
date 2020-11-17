package com.init.jocDausMongo.dto;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;
/**
* Esta clase define el objeto Player
* @author: Francesc Nohales
* @version: 1.0
*/
//@Entity
//@Table(name="player")
@Document(collection="player")
public class Player implements Serializable {

	
    @Id
	private long  id;
	
	@Indexed(unique = true)
	private String name;
	private Double success;
    private Date registDate;
    @Transient
    public static final String SEQUENCE_NAME = "players_sequence"; 
	@JsonIgnore 
	private List<Tirada> tirada;

	/**
	 * Constructor para la clase Player
	 * @param id
	 * @param name
	 * */
	
	public Player(String name, Double success, Date registDate,List<Tirada> tirada) {
		//super();
		//this.id = id;
		this.name = name;
		this.success = success;
		this.registDate = new Date();
		this.tirada= tirada;
	
	}

	public Player() {
	}


	// Getters & Setters
	public long  getId() {
		return id;
	}


	public void setId(long  id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public Double getSuccess() {
		return success;
	}


	public void setSuccess(Double success) {
		this.success = success;
	}


	public Date getRegistDate() {
		return registDate;
	}


	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}


	public List<Tirada> getTirada() {
		return tirada;
	}


	public void setTirada(List<Tirada> tirada) {
		this.tirada = tirada;
	}
	
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", success=" + success + ", registDate=" + registDate
				;
	}


	
}
