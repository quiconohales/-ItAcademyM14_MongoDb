package com.init.jocDausMongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.init.jocDausMongo.dto.Player;



public interface IPlayerDAO extends MongoRepository <Player,Integer>{

}
