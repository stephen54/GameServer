package com.mmorpg.logic;

import java.util.concurrent.atomic.AtomicBoolean;

public class Player {
	//���id
	private int id;
	
	//������
	private int birthPoint;
	
	//�Ƿ��¼
	private AtomicBoolean isLogin =new AtomicBoolean(false);
	
	//�Ƿ��˳�
	private AtomicBoolean isExited =new AtomicBoolean(false);
	
	

}
