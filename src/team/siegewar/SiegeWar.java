package team.siegewar;

import java.io.File;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class SiegeWar extends JavaPlugin implements Listener{
	public void onEnable(){
		getLogger().info("����ս���ѿ���");
		this.getDataFolder().mkdirs();
		if (!new File(getDataFolder(),"config.yml").exists()) this.saveResource("config", false);
		new File(getDataFolder(),"\\Games").mkdirs();
	}
	public void onLoad(){
		getLogger().info("����ս���Ѽ���");
	}
	public void onDisable(){
		getLogger().info("����ս���ѹر�");
	}
	
}
