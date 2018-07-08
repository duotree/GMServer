package com.qy.dao;

import java.util.List;
import java.util.Map;

import com.qy.bean.PageBean;
import com.qy.bean.ServerInfo;

public interface ServerDao {

	// ��ȡ��������Ϣ --��ҳ
	public List<ServerInfo> getServerInfoByPage(PageBean bean);
	
	// ��ȡ���з�������Ϣ
	public List<ServerInfo> getAllServerInfo();
	
	// ���ݷ�����id��ȡ������
	public ServerInfo getServerInfoById(int serverId);
	
	// ��ȡ�汾��
	public String getVersion(Map<String, String> params);
	
	// �޸İ汾��
	public String updateVersion(Map<String, String> params);
	
	// �޸�����
	public String modiChannel(Map<String, String> params);
	
	// �޸ķ���Ϣ ���������Ӻ��޸ģ�
	public String addChannel(Map<String, String> params);
	
	// ɾ������Ϣ
	public String delSvrInfo(Map<String, String> params);
	
	// ��ȡ������
	public List<String> getAidList(Map<String, String> params);
	
	
}
