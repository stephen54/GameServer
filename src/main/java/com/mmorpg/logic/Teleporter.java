package com.mmorpg.logic;

public class Teleporter {
	
	private short targetScene;//���͵�����
	
	
	
	
	public short getTargetScene() {
		return targetScene;
	}




	public void setTargetScene(short targetScene) {
		this.targetScene = targetScene;
	}




	public void createObjPacket(Response response) {
		response.writeInt(getTargetScene());
		
	}
	

}
