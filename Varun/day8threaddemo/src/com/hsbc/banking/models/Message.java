package com.hsbc.banking.models;

public class Message {

	protected int messageId;
	protected String payload;
	public Message(int messageId, String payload) {
		super();
		this.messageId = messageId;
		this.payload = payload;
	}
	
	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", payload=" + payload + "]";
	}
	
}
