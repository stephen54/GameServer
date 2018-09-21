package com.mmorpg.logic;

public class Npc extends GObject{
	//NpcID
	private int id;
	
	//ËùÔÚ³¡¾°id
	private int sceneId;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSceneId() {
		return sceneId;
	}

	public void setSceneId(int sceneId) {
		this.sceneId = sceneId;
	}

	public Npc(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + sceneId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Npc other = (Npc) obj;
		if (id != other.id)
			return false;
		if (sceneId != other.sceneId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Npc [id=" + id + ", sceneId=" + sceneId + "]";
	}
	
}
