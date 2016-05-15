package team.siegewar.GameManager;

import org.bukkit.event.Listener;

import team.siegewar.SiegeWar;

public class GameLoad implements Listener{
	SiegeWar siegeWar;
	public GameLoad(SiegeWar siegeWar){
		this.siegeWar = siegeWar;
	}
	public void reload(){
		for (String s:this.siegeWar.getGames().getKeys(true)){
			if (!s.contains(".")){
				
			}
		}
	}
}
