package com.qy.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qy.service.IServerService;

@Controller
@RequestMapping("/server")
public class ServerController {

	@Resource
	private IServerService serverService;
	
	// TODO server��Ϣ�����redis�У������redis��Ⱥ�л�ȡ
//	public List<> getServerList(){
//		
//	}
}
