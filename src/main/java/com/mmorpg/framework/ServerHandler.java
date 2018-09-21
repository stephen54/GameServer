package com.mmorpg.framework;

import java.util.UUID;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ServerHandler extends SimpleChannelInboundHandler<String>{

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
		System.out.println("server print,"+ctx.channel().remoteAddress()+","+msg);
		ctx.channel().writeAndFlush("from server:"+UUID.randomUUID());
	}
	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception{
		System.out.println("sever channel active");
		super.channelActive(ctx);
	}
	@Override
	public void channelRegistered(ChannelHandlerContext ctx) throws Exception{
		System.out.println("server register");
		super.channelRegistered(ctx);
	}
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable casue)throws Exception{
		casue.printStackTrace();
		ctx.close();
	}
	

}
