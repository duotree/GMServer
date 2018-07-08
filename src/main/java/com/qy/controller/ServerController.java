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
	
	// TODO server信息存放在redis中，如果从redis集群中获取
//	public List<> getServerList(){
//		
//	}
}
