package com.init.jocDausMongo.service;

import java.util.ArrayList;
import java.util.List;

import com.init.jocDausMongo.dto.Player;



public interface IPlayerService {
	
	public Player savePlayer(Player player); // Guarda una  tienda
	
	public List<Player> listPlayer();// Lista todos las tiendas

	public Player updatePlayer(Player player);

	public Player playerXID(Long id);

	public Player getPlayer(Long id);







}

