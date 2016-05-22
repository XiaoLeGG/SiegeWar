package team.siegewar;

import java.io.File;
import java.io.IOException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import team.siegewar.GameManager.GameLoad;

public class SiegeWar extends JavaPlugin implements Listener{
	FileConfiguration config;
	FileConfiguration games;
	GameLoad gameLoad;
	public void onEnable(){
		getLogger().info("攻城战争已开启");
		this.getDataFolder().mkdirs();
		createFile();
		config = YamlConfiguration.loadConfiguration(new File(getDataFolder(),"config.yml"));
		gameLoad = new GameLoad(this);
		gameLoad.reload();
		getServer().getPluginManager().registerEvents(new Commands(this), this);
	}
	public void createFile(){
		if (!new File(getDataFolder(),"config.yml").exists()) this.saveResource("config", false);
		new File(getDataFolder(),"\\Games").mkdirs();
		new File(getDataFolder(),"\\PlayerData").mkdirs();
	}
	public void onLoad(){
		getLogger().info("攻城战争已加载");
	}
	public void onDisable(){
		getLogger().info("攻城战争已关闭");
	}
	public FileConfiguration getConfig(){ return this.config; }
	public FileConfiguration getGames(){ return this.games; }
}
