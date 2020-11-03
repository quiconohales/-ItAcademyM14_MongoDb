package com.init.jocDausMongo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.init.jocDausMongo.dao.IPlayerDAO;
import com.init.jocDausMongo.dto.Player;


@Service
public class PlayerServiceImpl implements IPlayerService {
	
	@Autowired
	IPlayerDAO iplayerDAO;

	@Override
	public Player savePlayer(Player player) {
		return iplayerDAO.save(player);
	}
	
	@Override
	public Player updatePlayer(Player player) {
		return iplayerDAO.save(player);
	}

	@Override
	public List<Player> listPlayer() {
		return iplayerDAO.findAll();
	}
	
	@Override
	public Player playerXID(Integer id) {
		return iplayerDAO.findById(id).get();
	}
	
	// Get player by id

	@Override
	public Player getPlayer(Integer id) {
		return iplayerDAO.findById(id).get();
	}

}
