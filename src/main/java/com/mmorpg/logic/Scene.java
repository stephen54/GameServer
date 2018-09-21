package com.mmorpg.logic;

import java.util.HashMap;
import java.util.Map;


public class Scene {
	
	private static final int NPCID=1;
	
	private static final int PlayerId=2;
	
	private static final int PlayerId2=3; 
	
	//场景ID
	private int sceneId;
	
	//玩家列表key玩家id value 玩家对象
	private Map<Long,Player> allPlayers=new HashMap<Long,Player>();
	
	//传送点
	private Map<Long,Teleporter> teleporter=new HashMap<Long,Teleporter>(0);
	
	
	//默认出生点
	private int defalutBirthpos=1;
	
	public Scene() {
		
	}
	public void loadNpc() {
		Npc npc=new Npc(sceneId);
	}
	
	protected void addObj2Map(GObject obj) {
		obj.setId(NPCID);
	}
	
	
	

}
