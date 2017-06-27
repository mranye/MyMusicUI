package com.android.mymusicui.entity;

import java.io.Serializable;

public class MyMessage implements Serializable {

	private String messageName;// 发信息的人的名字
	private String messageContext;// 消息内容
	private String messageTime;// 消息时间

	public MyMessage() {
		super();
	}

	public MyMessage(String messageName, String messageContext,
			String messageTime) {
		super();
		this.messageName = messageName;
		this.messageContext = messageContext;
		this.messageTime = messageTime;
	}

	public String getMessageName() {
		return messageName;
	}

	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}

	public String getMessageContext() {
		return messageContext;
	}

	public void setMessageContext(String messageContext) {
		this.messageContext = messageContext;
	}

	public String getMessageTime() {
		return messageTime;
	}

	public void setMessageTime(String messageTime) {
		this.messageTime = messageTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((messageContext == null) ? 0 : messageContext.hashCode());
		result = prime * result
				+ ((messageName == null) ? 0 : messageName.hashCode());
		result = prime * result
				+ ((messageTime == null) ? 0 : messageTime.hashCode());
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
		MyMessage other = (MyMessage) obj;
		if (messageContext == null) {
			if (other.messageContext != null)
				return false;
		} else if (!messageContext.equals(other.messageContext))
			return false;
		if (messageName == null) {
			if (other.messageName != null)
				return false;
		} else if (!messageName.equals(other.messageName))
			return false;
		if (messageTime == null) {
			if (other.messageTime != null)
				return false;
		} else if (!messageTime.equals(other.messageTime))
			return false;
		return true;
	}

}
