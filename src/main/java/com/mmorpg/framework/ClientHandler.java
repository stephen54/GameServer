package com.mmorpg.framework;

import java.time.LocalDateTime;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ClientHandler extends SimpleChannelInboundHandler<String>{

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
		System.out.println("client print,"+ctx.channel().remoteAddress()+"");
		System.out.println("client out:"+msg);
		ctx.channel().writeAndFlush("from"+ LocalDateTime.now());
	}
	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception{
		ctx.writeAndFlush("hello server, this is client");
	}
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx,Throwable cause)throws Exception{
		cause.printStackTrace();
		ctx.close();
		super.exceptionCaught(ctx, cause);
	}

}
