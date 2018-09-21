package com.mmorpg.logic;

import java.util.concurrent.atomic.AtomicBoolean;

public class Player {
	//玩家id
	private int id;
	
	//出生点
	private int birthPoint;
	
	//是否登录
	private AtomicBoolean isLogin =new AtomicBoolean(false);
	
	//是否退出
	private AtomicBoolean isExited =new AtomicBoolean(false);
	
	

}
