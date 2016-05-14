package team.siegewar;

import java.io.File;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class SiegeWar extends JavaPlugin implements Listener{
	public void onEnable(){
		getLogger().info("攻城战争已开启");
		this.getDataFolder().mkdirs();
		if (!new File(getDataFolder(),"config.yml").exists()) this.saveResource("config", false);
		new File(getDataFolder(),"\\Games").mkdirs();
	}
	public void onLoad(){
		getLogger().info("攻城战争已加载");
	}
	public void onDisable(){
		getLogger().info("攻城战争已关闭");
	}
	
}
