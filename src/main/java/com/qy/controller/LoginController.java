package com.qy.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qy.bean.GMUser;
import com.qy.service.ILoginService;
import com.qy.util.MD5;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	@Resource
	private ILoginService loginService;

	@RequestMapping("/encodeLogin.do")
	@ResponseBody
    public Map<String, String> encodeLogin(HttpServletRequest request, HttpServletResponse response) throws UnknownHostException{
		Map<String, String> resultMap = new HashMap<String, String>();
        String ip = InetAddress.getLocalHost().getHostAddress();
        
        long time = System.currentTimeMillis();
        String token = ip + time;
        request.getSession().setAttribute("token", token);
        String md5Token = MD5.getMD5(token);
        resultMap.put("token", md5Token);
        logger.info("md5 token: " + md5Token);
        return resultMap;
    } 
	
	@RequestMapping("/checkLogin.do")
	@ResponseBody
	public Map<String, String> checkLogin(HttpServletRequest request, HttpServletResponse response){
		Map<String, String> model = new HashMap<String, String>();
		String type = request.getParameter("type");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		if ("login".equals(type) && userName != null) {
			
			if (!userName.matches("[A-Za-z0-9]+")){
				model.put("rst", "用户名格式不正确");
			} else {
				
				GMUser user = loginService.getUserByName(userName);
				String token = (String)request.getSession().getAttribute("token");
				if (user != null && !StringUtils.isEmpty(token)) {
					
					String encodeToken = MD5.getMD5(token);
					String md5Pwd = MD5.getMD5(user.getPassword());
					String encodePwd = MD5.getMD5(encodeToken + md5Pwd);
					if (encodePwd.equalsIgnoreCase(password)) {
						model.put("rst", "success");
						request.getSession().setAttribute("user", user);
					} else {
						model.put("rst", "用户名或密码不正确");
					}
				} else {
					model.put("rst", "用户不存在");
					request.getSession().removeAttribute("user");
					request.getSession().removeAttribute("token");
				}
			}
		}else {
			model.put("rst", "logout");
		}
		logger.info("rst: " + model);
		
		return model;
	}
	
	
	@RequestMapping("/main.do")
	public String doLogin(HttpServletRequest request , HttpServletResponse response) {
		
		return "main";
	}

}
