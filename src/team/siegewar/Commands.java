package team.siegewar;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class Commands implements Listener{
	SiegeWar siegeWar;
	public Commands(SiegeWar siegeWar) {
		this.siegeWar=siegeWar;
	}

	@EventHandler
	public void onPlayerCommand(PlayerCommandPreprocessEvent e){
		Player p=e.getPlayer();
		p.sendMessage(e.getMessage());
	}

}
