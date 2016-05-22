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
		if(e.getMessage().startsWith("/siegewar")||e.getMessage().startsWith("/sw")){
			String msg=e.getMessage();
			String[] args=msg.split(" ");
			if(args.length==1){
				p.sendMessage("§c§l攻城战争 §e§l0.1_alpha:                    ");
				p.sendMessage("§e§o /siegewar   help 列出帮助                       ");
				p.sendMessage("§e§o /siegewar create [游戏名字] 创建一个游戏");
				p.sendMessage("§c§lby: §a§l§oa_austin,Nodak_Lzc");
				return;
			}
			if(args[1].equals("help")){
				p.sendMessage("                §c§l攻城战争                         ");
				p.sendMessage("§e§o /siegewar   help 列出帮助                       ");
				p.sendMessage("§e§o /siegewar create [游戏名字] 创建一个游戏");
				p.sendMessage("§c§lby: §a§l§oa_austin,Nodak_Lzc");
				return;
			}
			if(args[1].equals("create")){
				if(args.length<3||args.length>3){
					p.sendMessage("§b§l正确用法: /siegewar create [游戏名字] 创建一个游戏");
					return;
				}else{
					String name=args[2];
					p.sendMessage("§6§l你成功创建了名为: §b§l"+name+" §6§l的游戏");
					return;
				}
			}
		}

	}
	

}
