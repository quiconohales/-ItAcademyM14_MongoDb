package com.init.jocDausMongo.dao;




import org.springframework.data.mongodb.repository.MongoRepository;

import com.init.jocDausMongo.dto.Tirada;


public interface ITiradaDAO extends MongoRepository <Tirada,Integer>{

	

	

}
