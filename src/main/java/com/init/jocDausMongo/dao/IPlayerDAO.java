package com.init.jocDausMongo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.jocDausMongo.dto.Player;



public interface IPlayerDAO extends JpaRepository <Player,Integer>{

}
