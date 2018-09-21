package com.mmorpg.framework;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class MyServer {
	public static void main(String[] args){
		EventLoopGroup boss=new NioEventLoopGroup();
		EventLoopGroup worker =new NioEventLoopGroup();
		
		try{
			ServerBootstrap bootstrap =new ServerBootstrap();
			bootstrap.group(boss,worker)
			.channel(NioServerSocketChannel.class)
			.childHandler(new ServerInitializer());
			ChannelFuture channelFuture =bootstrap.bind(8899).sync();
			channelFuture.channel().closeFuture().sync();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			boss.shutdownGracefully();
			worker.shutdownGracefully();
		}
	}


}
