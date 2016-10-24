package com.protocal.zhangxuefeng.po;

import java.io.IOException;

import com.sun.xml.internal.ws.util.Pool.Marshaller;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class MarshallingEncoder {
	private static final byte[] LENGTH_PLACEHOLDER = new byte[4];
	
	Marshaller marshaller;
	
	public MarshallingEncoder()throws IOException{
		
	}
	
	public void ecode()throws IOException{
		ByteBuf bf = Unpooled.copiedBuffer("^ .*&\\ $".getBytes());
		
		bf.setLong(1, 2l);
		bf.setShort(2, 3);
		bf.setChar(3, 3);
		
		bf.writeInt(33);
		bf.writeLong(22);
		
		bf.writeByte(3322);
		//zab协议 实现的  在分布式的环境中保证数据的一直性  分布式的管理和协调  顺序的一致性 会
		/**
		 * 
		 * 有个顺序的一致性
		 * 单一视图
		 * 可靠性
		 * 实时性
		 * 
		 * 原子消息广播协议
		 * 
		 * 分布式的概念  服务发现
		 * 
		 * 同步算法：分布式系统中 网络闪断重连  最难做的 数据同步   同步的效率 可靠性 原子性
		 * 
		 * 
		 * 
		 * 
		 */
		
		
	}
}
