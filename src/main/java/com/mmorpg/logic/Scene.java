package com.mmorpg.logic;

import java.util.HashMap;
import java.util.Map;


public class Scene {
	
	private static final int NPCID=1;
	
	private static final int PlayerId=2;
	
	private static final int PlayerId2=3; 
	
	//����ID
	private int sceneId;
	
	//����б�key���id value ��Ҷ���
	private Map<Long,Player> allPlayers=new HashMap<Long,Player>();
	
	//���͵�
	private Map<Long,Teleporter> teleporter=new HashMap<Long,Teleporter>(0);
	
	
	//Ĭ�ϳ�����
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
