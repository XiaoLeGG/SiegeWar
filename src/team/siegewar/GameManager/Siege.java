package team.siegewar.GameManager;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

public class Siege {
	List<Player> players = new ArrayList<Player>(); //��ұ�
	int Players; //��ǰ��Ϸ���������
	int MaxPlayers; //������
	int MinPlayers; //�������
	long RedDoorHealth; //��������Ѫ��
	long BlueDoorHealth; //���������Ѫ��
	public Siege(String name){ //��ʼ��
		this.Players = 0;
		this.MaxPlayers = 16;
		this.MinPlayers = 2;
		this.RedDoorHealth = 1000;
		this.BlueDoorHealth = 1000;
	}
	public void setRedDoorHealth(long health){  //���ú�������Ѫ��
		this.RedDoorHealth = health;
	}
	public void setBlueDoorHealth(long health){ //�������������Ѫ��
		this.BlueDoorHealth = health;
	}
	public void setMaxPlayers(int ammout){ //����������
		this.MaxPlayers = ammout;
	}
	public void setMinPlayers(int ammout){ //�����������
		this.MinPlayers = ammout;
	}
	public Integer getPlayers(){ //ȡ��ǰ��Ϸ���������
		return this.Players;
	}
	public void joinPlayer(Player p){ //����Ҽ�����Ϸ
		addPlayer(p);
		boardcast("&a��� &b"+p.getName()+" &a��������Ϸ"+" &e��ǰ���� &c"+String.valueOf(this.Players)+"&d/&c"+String.valueOf(this.MaxPlayers));
	}
	public void leavePlayer(Player p){ //������뿪��Ϸ
		removePlayer(p);
		boardcast("&7��� &8"+p.getName()+" &7�뿪����Ϸ"+" &e��ǰ���� &c"+String.valueOf(this.Players)+"&d/&c"+String.valueOf(this.MaxPlayers));
	}
	public void addPlayer(Player p){ //������
		this.players.add(p);
		this.Players++;
	}
	public void removePlayer(Player p){ //ɾ�����
		players.remove(p);
		this.Players--;
	}
	public void boardcast(String msg){ //����ȫ����Ϸ�������Ϣ
		for (Player p : this.players){
			p.sendMessage(msg.replace("&", "��"));
		}
	}
}
