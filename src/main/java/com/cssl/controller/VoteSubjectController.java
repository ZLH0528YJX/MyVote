package com.cssl.controller;

import com.cssl.entity.VoteOption;
import com.cssl.entity.VoteSubject;
import com.cssl.entity.VoteUser;
import com.cssl.service.VoteItemService;
import com.cssl.service.VoteSubjectService;
import com.cssl.vo.VoteView;
import com.github.pagehelper.PageInfo;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sound.midi.Soundbank;
import java.util.List;

/**
 * @BelongProject: myvote
 * @BelongPackage: com.cssl.controller
 * @Author: yjx
 * @CreateTime: 2020-09-28 :40
 * @Description: 主题类控制类
 */

@Controller
public class VoteSubjectController {

    @Resource
    VoteSubjectService  voteSubjectService;
    @Resource
    VoteItemService itemService;
    
    //查询投票列表
    @RequestMapping("/findAll.action")
    public String findAll(Integer page, Model model){
        if(page==null||page==0){
            page=1;
        }
        PageInfo pageInfo = voteSubjectService.pagefingAll(page);
        model.addAttribute("pageInfo",pageInfo);
        return "votelist";
    }

    //查看投票详情
    @RequestMapping("/findViewBySid.action")
    public String findByView(Integer id,Model model){
        VoteView viewBySid = voteSubjectService.findViewBySid(id);
        model.addAttribute("view",viewBySid);
        return "voteview";
    }

    //参与投票
    @RequestMapping("/findBySid.action")
    public String find(Integer id,Model model){
        VoteView viewBySid = voteSubjectService.findViewBySid(id);
        model.addAttribute("view",viewBySid);
        return "vote";
    }

    //投票
    @RequestMapping("/vote.action")
    public String find(@RequestParam(name = "options") Integer [] choose, Integer voteId, HttpServletRequest request){
        VoteUser user = (VoteUser) request.getSession().getAttribute("user");
        //循环添加item
        for(Integer i=0;i<choose.length;i++){
            itemService.addItem(user.getVuUserId(), choose[i], voteId);
        }
        return "redirect:findAll.action";
    }

    //新增投票
    @PostMapping("/addvote.action")
    public String addVote(HttpServletRequest request, @RequestParam("voOption") String[] voOption,Integer type){
        System.out.println("type:"+type);
        for(String str:voOption){
            System.out.println("str:"+str);
        }
        return "redirect:findAll.action";
    }
}
