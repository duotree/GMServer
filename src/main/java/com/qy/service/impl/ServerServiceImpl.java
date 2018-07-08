package com.qy.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qy.bean.PageBean;
import com.qy.bean.ServerInfo;
import com.qy.dao.ServerDao;
import com.qy.service.IServerService;

@Service("serverService")
public class ServerServiceImpl implements IServerService {
	
	@Resource
	private ServerDao serverDao;

	public List<ServerInfo> getServerInfoByPage(PageBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ServerInfo> getAllServerInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public ServerInfo getServerInfoById(int serverId) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getVersion(Map<String, String> params) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateVersion(Map<String, String> params) {
		// TODO Auto-generated method stub
		return null;
	}

	public String modiChannel(Map<String, String> params) {
		// TODO Auto-generated method stub
		return null;
	}

	public String addChannel(Map<String, String> params) {
		// TODO Auto-generated method stub
		return null;
	}

	public String delSvrInfo(Map<String, String> params) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getAidList(Map<String, String> params) {
		// TODO Auto-generated method stub
		return null;
	}

}
