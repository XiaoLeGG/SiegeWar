package team.siegewar.GameManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;

public class Siege {
	HashMap<Player, Integer> listAt = new HashMap<Player, Integer>();
	List<Player> players = new ArrayList<Player>();
	int Players;
	int MaxPlayers;
	int MinPlayers;
	long RedDoorHealth;
	long BlueDoorHealth;
	public Siege(String name){
		this.Players = 0;
		this.MaxPlayers = 16;
		this.MinPlayers = 2;
		this.RedDoorHealth = 1000;
		this.BlueDoorHealth = 1000;
	}
	public void setRedDoorHealth(long health){
		this.RedDoorHealth = health;
	}
	public void setBlueDoorHealth(long health){
		this.BlueDoorHealth = health;
	}
	public void setMaxPlayers(int ammout){
		this.MaxPlayers = ammout;
	}
	public void setMinPlayers(int ammout){
		this.MinPlayers = ammout;
	}
	public Integer getPlayers(){
		return this.Players;
	}
	public void joinPlayer(Player p){
		addPlayer(p);
		boardcast("&a玩家 &b"+p.getName()+" &a加入了游戏"+" &e当前人数 &c"+String.valueOf(this.Players)+"&d/&c"+String.valueOf(this.MaxPlayers));
	}
	public void leavePlayer(Player p){
		removePlayer(p);
		boardcast("&7玩家 &8"+p.getName()+" &7离开了游戏"+" &e当前人数 &c"+String.valueOf(this.Players)+"&d/&c"+String.valueOf(this.MaxPlayers));
	}
	public void addPlayer(Player p){
		this.players.add(p);
		this.Players++;
	}
	public void removePlayer(Player p){
		listAt.remove(p);
		this.Players--;
	}
	public void boardcast(String msg){
		for (Player p : this.players){
			p.sendMessage(msg.replace("&", "§"));
		}
	}
}
