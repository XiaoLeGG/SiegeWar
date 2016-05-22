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
				p.sendMessage("��c��l����ս�� ��e��l0.1_alpha:                    ");
				p.sendMessage("��e��o /siegewar   help �г�����                       ");
				p.sendMessage("��e��o /siegewar create [��Ϸ����] ����һ����Ϸ");
				p.sendMessage("��c��lby: ��a��l��oa_austin,Nodak_Lzc");
				return;
			}
			if(args[1].equals("help")){
				p.sendMessage("                ��c��l����ս��                         ");
				p.sendMessage("��e��o /siegewar   help �г�����                       ");
				p.sendMessage("��e��o /siegewar create [��Ϸ����] ����һ����Ϸ");
				p.sendMessage("��c��lby: ��a��l��oa_austin,Nodak_Lzc");
				return;
			}
			if(args[1].equals("create")){
				if(args.length<3||args.length>3){
					p.sendMessage("��b��l��ȷ�÷�: /siegewar create [��Ϸ����] ����һ����Ϸ");
					return;
				}else{
					String name=args[2];
					p.sendMessage("��6��l��ɹ���������Ϊ: ��b��l"+name+" ��6��l����Ϸ");
					return;
				}
			}
		}

	}
	

}
