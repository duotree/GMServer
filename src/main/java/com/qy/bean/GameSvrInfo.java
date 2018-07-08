package com.qy.bean;

public class GameSvrInfo {
	
	private int serverId;
	
	private String serverIp;
	
	private int httpport;// gm访问游戏服接口
	
	private String dbUrl;
	
	private String dbName;
	
	private String dbUser;
	
	private String dbPasswd;

	public int getServerId() {
		return serverId;
	}

	public void setServerId(int serverId) {
		this.serverId = serverId;
	}

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public int getHttpport() {
		return httpport;
	}

	public void setHttpport(int httpport) {
		this.httpport = httpport;
	}

	public String getDbUrl() {
		return dbUrl;
	}

	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbUser() {
		return dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public String getDbPasswd() {
		return dbPasswd;
	}

	public void setDbPasswd(String dbPasswd) {
		this.dbPasswd = dbPasswd;
	}
	

}
