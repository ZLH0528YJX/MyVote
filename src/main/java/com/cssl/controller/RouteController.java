package com.cssl.controller;

import com.cssl.entity.VoteUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @BelongProject: myvote
 * @BelongPackage: com.cssl.controller
 * @Author: yjx
 * @CreateTime: 2020-09-27 :34
 * @Description: 路由控制器
 */

@Controller
public class RouteController {

    @RequestMapping({"/","/index"})
    public String toIndex(){
        System.out.println("路由到首页");
        return "index";
    }

    @RequestMapping("/login")
    public String toLogin(){
        System.out.println("路由到登录页面");
        return "login";
    }

    @RequestMapping("/regist")
    public String toRegist(){
        System.out.println("路由到注册页面");
        return "regist";
    }

    @RequestMapping("/votelist")
    public String toVotelist(){
        System.out.println("路由到查询投票列表页面");
        return "votelist";
    }

    @RequestMapping("/voteview")
    public String toVoteview(){
        System.out.println("路由到查询投票详情页面");
        return "voteview";
    }

    @RequestMapping("/vote")
    public String toVote(){
        System.out.println("路由到投票页面");
        return "vote";
    }

    @RequestMapping("/add")
    public String toAdd(HttpServletRequest request){
        VoteUser user = (VoteUser) request.getSession().getAttribute("user");
        if(user.getVuStatus()==1){
            System.out.println("路由到新增投票页面");
            return "add";
        }else{
            System.out.println("没有权限");
            return "redirect:findAll.action";
        }

    }
}
