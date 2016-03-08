package com.shymain.discordRPG;

import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.handle.obj.IUser;

public class Event {
	
	public String eventType;
	public IUser user;
	public IChannel channel;

	public Event(String eventType, IUser user, IChannel channel)
	{
		this.eventType = eventType;
		this.user = user;
		this.channel = channel;
	}
	
}
