package com.cssl.controller;

import com.cssl.entity.VoteUser;
import com.cssl.service.VoteUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @BelongProject: myvote
 * @BelongPackage: com.cssl.controller
 * @Author: yjx
 * @CreateTime: 2020-09-27 :36
 * @Description: 用户控制类
 */

@Controller
public class VoteUserController {

    @Resource
    VoteUserService voteUserService;

    //登录
    @RequestMapping("/login.action")
    public String login(String userName, String password, HttpServletRequest request){
        int id=0;
        int id2=1;	
       int zzh = 3;
       int  lhh=4;
        VoteUser user =new VoteUser();
        user.setVuUserName(userName);
        user.setVuPassword(password);
        VoteUser login = voteUserService.login(user);
        if(login!=null){
            request.getSession().setAttribute("user", login);
            return "redirect:findAll.action";
        }
        return "redirect:login";
    }

    //注销
    @RequestMapping("/quit.action")
    public String quit(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return "login";
    }

    //注册
    @RequestMapping("/regist.action")
    public String regist(String userName,String password){
        VoteUser user =new VoteUser();
        user.setVuUserName(userName);
        user.setVuPassword(password);
        if(voteUserService.regist(user)>0){
            return "login";
        }
        return "regist";
    }

    //重名检查
    @RequestMapping("/checkReName.action")
    @ResponseBody
    public String checkReName(String name){
        String msg ="";
        Integer reName = voteUserService.checkReName(name);
        if(reName>0){
            msg="已经存在该名字";
        }else {
            msg="用户名合法";
        }
        return  msg;
    }
}
