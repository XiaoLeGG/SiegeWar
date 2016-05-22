package team.siegewar;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import team.siegewar.GameManager.GameLoad;

public class SiegeWar extends JavaPlugin implements Listener{
	FileConfiguration config;
	FileConfiguration games;
	GameLoad gameLoad;
	public void onEnable(){
		getLogger().info("攻城战争已开启");
		createFile();
		saveDefaultConfig();
		gameLoad = new GameLoad(this);
		getServer().getPluginManager().registerEvents(new Commands(this), this);
	}
	public void createFile(){
	}
	public void onLoad(){
		getLogger().info("攻城战争已加载");
	}
	public void onDisable(){
		getLogger().info("攻城战争已关闭");
	}
	public FileConfiguration getConfig(){ return getConfig(); }
	public FileConfiguration getGames(){ return this.games; }
}
