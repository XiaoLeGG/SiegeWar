package team.siegewar;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class SiegeWar extends JavaPlugin implements Listener{
	public void onEnable(){
		getLogger().info("����ս���ѿ���");
	}
	public void onLoad(){
		getLogger().info("����ս���Ѽ���");
	}
	public void onDisable(){
		getLogger().info("����ս���ѹر�");
	}
	
}
