package com.qy.dao;

import java.util.List;
import java.util.Map;

import com.qy.bean.PageBean;
import com.qy.bean.ServerInfo;

public interface ServerDao {

	// 获取服务器信息 --分页
	public List<ServerInfo> getServerInfoByPage(PageBean bean);
	
	// 获取所有服务器信息
	public List<ServerInfo> getAllServerInfo();
	
	// 根据服务器id获取服务器
	public ServerInfo getServerInfoById(int serverId);
	
	// 获取版本号
	public String getVersion(Map<String, String> params);
	
	// 修改版本号
	public String updateVersion(Map<String, String> params);
	
	// 修改渠道
	public String modiChannel(Map<String, String> params);
	
	// 修改服信息 （包括增加和修改）
	public String addChannel(Map<String, String> params);
	
	// 删除服信息
	public String delSvrInfo(Map<String, String> params);
	
	// 获取白名单
	public List<String> getAidList(Map<String, String> params);
	
	
}
