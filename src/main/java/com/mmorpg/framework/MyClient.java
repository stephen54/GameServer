package com.mmorpg.framework;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

public class MyClient {
	public static void main(String [] args){
		EventLoopGroup worker =new NioEventLoopGroup();
		try{
			Bootstrap bootstrap=new Bootstrap();
			bootstrap.group(worker)
			.channel(NioSocketChannel.class)
			.handler(new ClientInitializer());
			
			ChannelFuture cf=bootstrap.connect("localhost",8899).sync();
			cf.channel().closeFuture().sync();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			worker.shutdownGracefully();
		}
	}

}
