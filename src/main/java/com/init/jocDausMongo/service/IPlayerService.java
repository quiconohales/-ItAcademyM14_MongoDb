package com.init.jocDausMongo.service;


import java.util.List;

import com.init.jocDausMongo.dto.Player;

public interface IPlayerService {

	public Player savePlayer(Player player);

	public List<Player> listPlayer();

	public Player updatePlayer(Player player);

	public Player playerXID(Long id);

	public Player getPlayer(Long id);

}
