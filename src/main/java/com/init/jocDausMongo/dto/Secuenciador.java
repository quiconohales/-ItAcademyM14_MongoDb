package com.init.jocDausMongo.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "secuenciador") 
public class Secuenciador {

	@Id
	 private String id; 
     private long seq;
    
 	// Constructores
     
     public Secuenciador() {
    	 
     }

//     public Secuenciador(Integer id, Integer seq) {
//		super();
//		this.id = id;
//		this.seq = seq;
//	}


	// Getters & Setters 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long   getSeq() {
		return seq;
	}
	public void setSeq(long   seq) {
		this.seq = seq;
	}

     
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
