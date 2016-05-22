package team.siegewar.GameManager;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

public class Siege {
	List<Player> players = new ArrayList<Player>(); //玩家表
	int Players; //当前游戏中玩家总数
	int MaxPlayers; //最多玩家
	int MinPlayers; //最少玩家
	long RedDoorHealth; //红队门最大血量
	long BlueDoorHealth; //蓝队门最大血量
	public Siege(String name){ //初始化
		this.Players = 0;
		this.MaxPlayers = 16;
		this.MinPlayers = 2;
		this.RedDoorHealth = 1000;
		this.BlueDoorHealth = 1000;
	}
	public void setRedDoorHealth(long health){  //设置红队门最大血量
		this.RedDoorHealth = health;
	}
	public void setBlueDoorHealth(long health){ //设置蓝队门最大血量
		this.BlueDoorHealth = health;
	}
	public void setMaxPlayers(int ammout){ //设置最多玩家
		this.MaxPlayers = ammout;
	}
	public void setMinPlayers(int ammout){ //设置最少玩家
		this.MinPlayers = ammout;
	}
	public Integer getPlayers(){ //取当前游戏中玩家总数
		return this.Players;
	}
	public void joinPlayer(Player p){ //当玩家加入游戏
		addPlayer(p);
		boardcast("&a玩家 &b"+p.getName()+" &a加入了游戏"+" &e当前人数 &c"+String.valueOf(this.Players)+"&d/&c"+String.valueOf(this.MaxPlayers));
	}
	public void leavePlayer(Player p){ //当玩家离开游戏
		removePlayer(p);
		boardcast("&7玩家 &8"+p.getName()+" &7离开了游戏"+" &e当前人数 &c"+String.valueOf(this.Players)+"&d/&c"+String.valueOf(this.MaxPlayers));
	}
	public void addPlayer(Player p){ //添加玩家
		this.players.add(p);
		this.Players++;
	}
	public void removePlayer(Player p){ //删除玩家
		players.remove(p);
		this.Players--;
	}
	public void boardcast(String msg){ //发送全体游戏中玩家信息
		for (Player p : this.players){
			p.sendMessage(msg.replace("&", "§"));
		}
	}
}
