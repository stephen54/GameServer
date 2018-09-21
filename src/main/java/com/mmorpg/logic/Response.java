package com.mmorpg.logic;

import io.netty.util.ReferenceCounted;

public interface Response extends ReferenceCounted{

	Response setPackectId(int packetId);
	
	Response writeByte(int value);
	
	Response writeShort(int value);
	
	Response writeInt(int value);
	
	Response writeLong(long value);
	
	
	
}
