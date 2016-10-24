package com.protocal.zhangxuefeng.po;

import java.io.IOException;
import java.util.List;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.handler.codec.marshalling.MarshallingEncoder;

public class NettyMessageEncorder extends MessageToMessageEncoder<NettyMessage>{
	
	private MarshallingEncoder marshallingEncoder;
	
	 public NettyMessageEncorder()throws IOException {
		this.marshallingEncoder = new MarshallingEncoder(null);
	}
	
	@Override
	protected void encode(ChannelHandlerContext ctx, NettyMessage msg, List<Object> out) throws Exception {
		
	}

}
