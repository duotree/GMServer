package com.qy.bean;

import java.util.ArrayList;
import java.util.List;

public class ServerInfo {
	
	private int id;
	
	private String regionName;
	
	/** 1:¿ÕÏÐ, 2:Á¼ºÃ, 3:·±Ã¦, 4:±¬Âú, 5:Î¬»¤£¨SA·µ»Ø£©*/
	private int memStatus = 1;
	
	private int svrStatus;
	
	private String displayName;
	
	private String host;
	
	private int port;
	
	private transient List<String> channels = new ArrayList<String>();
	
	private transient List<String> exceptChannels =  new ArrayList<String>();
	
	private String openDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public int getMemStatus() {
		return memStatus;
	}

	public void setMemStatus(int memStatus) {
		this.memStatus = memStatus;
	}

	public int getSvrStatus() {
		return svrStatus;
	}

	public void setSvrStatus(int svrStatus) {
		this.svrStatus = svrStatus;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public List<String> getChannels() {
		return channels;
	}

	public void setChannels(List<String> channels) {
		this.channels = channels;
	}

	public List<String> getExceptChannels() {
		return exceptChannels;
	}

	public void setExceptChannels(List<String> exceptChannels) {
		this.exceptChannels = exceptChannels;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}
	
	
}
