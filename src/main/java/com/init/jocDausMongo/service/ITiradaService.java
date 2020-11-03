package com.init.jocDausMongo.service;

import java.util.List;

import com.init.jocDausMongo.dto.Player;
import com.init.jocDausMongo.dto.Tirada;



public interface ITiradaService {
	
//	public Tirada saveThrow(Tirada tirada);
	public List<Tirada> listTirada();
	public void deleteTirada(Tirada tirada);
//	public List<Tirada> listPicturesbyShop(List<Tirada> player_id);
//	public void deleteAllPictureByShop(Player player);
//	
	public Tirada saveTirada(Tirada tirada);
	

}
